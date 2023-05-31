job('latif-Via-DSL') { 
    description('My first job DSL')
    scm {
        // github('https://github.com/latifyildirim/Jenkins_hands_on.git')        // Burada  5-Java-tomcat-sample-main-and-Deployment-jenkins/pom.xml   dosyam alt dizinde olmadigi icin calistiramadim, sonra bakacagim.
        // git('https://github.com/clarusway-aws-devops/java-tomcat-sample-main.git', 'main')
        git('https://github.com/latifyildirim/Jenkins_hands_on.git', 'main')    // Bu sekilde calistiii Alt Klasörlerden de yol verebiliyoruz:D:D:D:D:D
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
            rootPOM('5-Java-tomcat-sample-main-and-Deployment-jenkins/pom.xml')  // yukaridaki 4. satir ile baglantili #### Ve calistiii :D:D:D:D:D
            // rootPOM('pom.xml')
        }
    }
    publishers {
        archiveArtifacts('**/*.jar')
        // archiveJunit('**/target/surefire-reports/*.xml')
    }
}
// Buradan aldik
// https://jenkinsci.github.io/job-dsl-plugin/#path/job
