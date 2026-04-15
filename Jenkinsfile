pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/YOUR-USERNAME/bookshop-ci-cd.git'
            }
        }

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