node{
  stage ('Build') {

    git url: 'https://github.com/svbabu/RestExample.git'

    withMaven(
        // Maven installation declared in the Jenkins "Global Tool Configuration"
       // maven: 'maven-3'
        // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
        // We recommend to define Maven settings.xml globally at the folder level using 
        // navigating to the folder configuration in the section "Pipeline Maven Configuration / Override global Maven configuration"
        // or globally to the entire master navigating to  "Manage Jenkins / Global Tools Configuration"
      globalMavenSettingsConfig: 'MyGlobalSettings') {

      // Run the maven build
      bat "mvn clean install"

    //} // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs & SpotBugs reports...
  }
}
