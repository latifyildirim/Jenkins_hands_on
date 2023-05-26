// pipeline {
//     agent any
//     stages {
//         stage('build') {
//             steps {
//                 echo "Clarusway_Way to Reinvent Yourself"
//                 sh 'echo using shell within Jenkinsfile'    # 1. Task
//                 echo 'not using shell in the Jenkinsfile'
//             }
//         }
//     }
// }

// pipeline {
//     agent any
//     stages {
//         stage('build') {   # 2. Task
//             steps {
//                 echo 'Clarusway_Way to Reinvent Yourself'
//                 sh 'echo Integrating Jenkins Pipeline with GitHub Webhook using Jenkinsfile'
//             }
//         }
//     }
// }

// pipeline {
//     agent any
//     stages {
//         stage('run') {
//             steps {
//                 echo 'Part 4 de Her dakikada tetiletecegiz'
//                 sh 'python3 --version'        #4.  Task 
//                 sh 'python3 pipeline.py'
//             }
//         }
//     }
// }

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Compiling the java source code'
                sh 'javac Hello.java'
            }
        }
        stage('run') {
            steps {
                echo 'Running the compiled java code.'
                sh 'java Hello'
            }
        }
    }
}