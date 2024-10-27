node('JDK8'){
	stage('source code'){

	git branch: '*/sprint1_develop', url: 'https://github.com/dhushyadav/game-of-life.git'

        }   
	stage {'buidl the code'){

	sh 'mvn package'
	
	}

	stage('archive the reports and tet results'){

	archiveArtifacts artifacts: 'gameoflife-web/target/*.war', followSymlinks: false
	junit stdioRetention: '', testResults: 'gameoflife-web/target/surefire-reports/*.xml'

	}






}


