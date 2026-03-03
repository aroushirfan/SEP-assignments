pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/aroushirfan/SEP-assignments.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean verify'
            }
        }

        stage('Coverage') {
            steps {
                jacoco execPattern: '**/target/**/*.exec',
                       classPattern: '**/target/classes',
                       sourcePattern: '**/src/main/java'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/site/jacoco/*', fingerprint: true
        }
    }
}