pipeline {
    agent any
    def posh(cmd) {
                    bat 'powershell.exe -NoProfile -ExecutionPolicy Bypass -Command "& ' + cmd + '"'
                   }  
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
          stage('Run myscript') {
            steps {
       
    posh './Test.ps1'

            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
