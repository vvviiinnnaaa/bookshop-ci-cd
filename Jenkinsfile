pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build Java') {
            steps {
                bat 'javac Book.java BookShop.java'
            }
        }

        stage('Run Application') {
            steps {
                bat 'java BookShop'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t bookshop-app .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                bat 'docker tag bookshop-app vinaibrahim/bookshop-app:latest'
                bat 'docker push vinaibrahim/bookshop-app:latest'
            }
        }
    }
}