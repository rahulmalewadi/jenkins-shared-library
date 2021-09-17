def call () {
  withSonarQubeEnv('sonar-localost') {
                 bat "mvn clean package sonar:sonar"
              }


}
