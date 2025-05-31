pipeline {
    agent any
    tools {
        maven 'Maven3.9.9' // Set in Jenkins > Global Tool Configuration
    }
    stages {
        stage('Clone') {
            steps {
                echo 'Hello world'
            }
        }
        stage('Build') {
            steps {
                echo 'Hello world'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello world'
            }
        }
    }
    post {
        success {
            echo "Build successful!"
        }
        failure {
            echo "Build failed!"
        }
    }
}
