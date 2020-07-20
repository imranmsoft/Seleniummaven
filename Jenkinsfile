pipeline {
    agent any

    stages {
        stage('Hello') {
            def mvnhome=tool name: 'maven-3', type: 'maven'
            steps {
                
                sh ${mvnhome}/bin/mvn package
            }
        }
    }
}
