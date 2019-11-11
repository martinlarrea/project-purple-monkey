pipeline {
    agent any
    stages {
        stage{'PMD'} {
            steps {
                sh 'alias pmd="$HOME/Downloads\/PMD/pmd-bin-6.17.0/bin/run.sh pmd"'
                sh 'pmd -d'        
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