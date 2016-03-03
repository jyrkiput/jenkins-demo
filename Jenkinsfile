stage 'Build'
node('master') {
	git url: 'https://github.com/jyrkiput/jenkins-demo'
	sh "./gradlew build"
}
stage 'Test'
node {
	git url: 'https://github.com/jyrkiput/jenkins-demo'
	sh "./gradlew test"
}
stage 'Package'
node('remote') {
	git url: 'https://github.com/jyrkiput/jenkins-demo'
	sh "./gradlew jar"
}