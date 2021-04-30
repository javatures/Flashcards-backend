pipeline {
  agent any
  stages {
    stage('diagnostics') {
      steps {
        sh '''whoami
pwd
ls -al'''
      }
    }

    stage('setup') {
      steps {
        sh '''chmod +x gradlew
'''
      }
    }

    stage('build') {
      steps {
        sh './gradlew clean build'
      }
    }

  }
}