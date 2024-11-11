pipeline{
    agent any
    stages{
        stage("Checkout"){
            steps{
                sh "echo checkcout"
            }
        }

        stage("Permission"){
            steps{
                sh "chmod +x ./gradlew"
            }
        }

        stage("Compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }
    }
}