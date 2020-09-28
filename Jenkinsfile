pipeline {
    agent any
    stages{
         stage('Maven clean'){
            steps{
                echo 'Project cleaning stage'
                bat label: 'cleaning target',script:'''mvn clean'''
            }
        }
        stage('Maven compile'){
            steps{
                echo 'Project compile stage'
                bat label: 'compilation running',script:'''mvn compile'''
            }
        }
        stage('Unit test'){
            steps{
                echo 'Project Testing stage'
                bat label: 'test running', script: '''mvn test'''
            }
        }
        stage('maven package'){
            steps{
                echo 'Project packaging stage'
                bat label: 'project packaging', script: '''mvn package'''
            }
        }
    }
}
