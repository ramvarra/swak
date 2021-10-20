pipeline{
    agent any

    stages{
        stage("Build"){
            steps{
                echo "Building & Packaging Swak"
                sh 'mvn package'
            }
        }
        stage("Test"){
            steps{
                echo "Testing Swak"
                sh 'mvn test'
                archiveArtifacts(artifacts: 'target/swak-1.0-SNAPSHOT.jar', fingerprint: true)
            }
        }
    }

}