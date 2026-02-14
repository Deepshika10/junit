pipeline {
    agent any 

    tools {
        // This must match the name defined in: 
        // Manage Jenkins -> Global Tool Configuration -> Maven
        maven 'Maven' 
    }

    stages {
        stage('Checkout') {
            steps {
                // Pulls the code from your GitHub repo
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // Using 'bat' for Windows Command Prompt
                // 'clean' deletes old builds, 'test' runs JUnit
                bat 'mvn clean test'
            }
            post {
                always {
                    // This captures your JUnit XML results for the Jenkins UI
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
