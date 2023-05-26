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

pipeline {
    agent any
    stages {
        stage('run') {
            steps {
                echo 'Clarusway_Way to Reinvent Yourself'
                sh 'python3 --version'
                sh 'python3 pipeline.py'
            }
        }
    }
}