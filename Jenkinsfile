pipeline {
    agent any
    stages {
    
        stage('Say Hello') {
     	 agent any

     	 steps {
       		 sh 'echo Awesome Student!'
     		 }
   		 }
            
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}