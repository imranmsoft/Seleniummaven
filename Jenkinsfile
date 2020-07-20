pipeline {
    agent any

    stages {
        stage('Hello') {
            def mvnhome=tool name: 'maven-3', type: 'maven'
            steps {
                
                bat C:\Program Files\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin\mvn package
            }
        }
    }
}
