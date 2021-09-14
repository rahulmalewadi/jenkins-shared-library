def buildfunction () {
	bat "mvn clean"
	bat "mvn install"
	bat "mvn test"
	bat "mvn package"
	bat "echo build successful!"
}