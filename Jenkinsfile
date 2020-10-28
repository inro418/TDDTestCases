
node{

  stage('SCM Checkout'){
  git 'https://github.com/inro418/TDDTestCases.git'
  }
  stage('Compile-Package'){
  //Get maven home path
  tool name: 'MAVEN_HOME', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
  }
}
