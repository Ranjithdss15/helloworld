node("master"){
    
    stage("test 1"){
        sh "docker images"
    }
}