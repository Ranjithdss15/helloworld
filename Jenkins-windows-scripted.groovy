node {
   stage("Prepare"){
    bat "git scm"
  }
  stage("Build"){
    bat "npm install"
  }
  stage("Deploy"){
    bat "set PORT=9090"
    bat "npm start"
  }
}
