pipeline {
    agent any
    tools {
        maven 'Maven3.9.9' // Set in Jenkins > Global Tool Configuration
    }
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/mahendra-k1/hello-java.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
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
