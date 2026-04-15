pipeline {
    agent any

    stages {

        stage('Build Java') {
            steps {
                bat 'javac *.java'
            }
        }

        stage('Run Test') {
            steps {
                bat 'java BookShop'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t bookshop-app .'
            }
        }
    }
}