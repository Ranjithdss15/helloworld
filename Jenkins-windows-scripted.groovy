node {
   stage("Prepare"){
    git url: "https://github.com/Ranjithdss15/helloworld.git"
  }
  stage("Build"){
    bat "npm install"
  }
  stage("Deploy"){
    bat "start /B npm start"
  }
}
