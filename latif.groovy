job('latif-Via-DSL') { 
    description('My first job DSL')
    scm {
        github('https://github.com/latifyildirim/Jenkins_hands_on.git')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        // shell('echo START')
        // gradle('check')
        maven {
            goals('clean')
            goals('package')
            // mavenOpts('-Xms256m')
            // mavenOpts('-Xmx512m')
            // localRepository(LocalRepositoryLocation.LOCAL_TO_WORKSPACE)
            // properties(skipTests: true)
            mavenInstallation('maven-3.9.2')  // Bunu 'Global Tool Configuration' daki Maven Name ile ayni olmali
            // providedSettings('central-mirror')
            rootPOM('5-Java-tomcat-sample-main-and-Deployment-jenkins\pom.xml')
        }
    }
}
// Buradan aldik
// https://jenkinsci.github.io/job-dsl-plugin/#path/job