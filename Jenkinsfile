pipeline {
  agent any
  stages {
    stage('diagnostics') {
      steps {
        sh '''pwd
ls -al'''
      }
    }

    stage('build') {
      steps {
        sh 'gradle clean build'
      }
    }

  }
}