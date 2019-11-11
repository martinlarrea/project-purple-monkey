pipeline {
    agent any
    stages {
    
   		 stage('PMD') {
     	 agent any

     	 steps {
       		 sh 'alias pmd="$HOME/Downloads/PMD/pmd-bin-6.17.0/bin/run.sh pmd"'
       		 sh 'pmd -d'
     		 }
   		 }
    
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