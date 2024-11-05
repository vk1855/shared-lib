def (Map config = [:]){
  sh 'echo My name is ${config.name} and today is ${config.day}'
}
