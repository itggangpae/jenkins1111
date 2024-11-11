pipeline{
    agent any
    stages{
        stage("Checkout"){
            steps{
                sh "echo checkcout"
            }
        }

        stage("Compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }
    }
}