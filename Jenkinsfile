pipeline{
    agent any

    stages{
        stage("Build"){
            steps{
                echo "Building Swak"
                sh 'mvn -X compile'
            }
        }
    }
}