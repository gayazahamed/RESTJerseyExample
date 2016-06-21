Eclipse mars with 1.7
RESTJerseyExample




http://localhost:8080/RESTJerseyExample%2D0.0.1%2DSNAPSHOT/rest/ctofservice
http://localhost:8080/RESTJerseyExample/rest/ctofservice

http://localhost:8080/RESTJerseyExample/rest/ctofservice/21

http://localhost:8080/RESTJerseyExample/rest/ftocservice

http://localhost:8080/RESTJerseyExample/rest/ftocservice/70

http://localhost:8080/RESTJerseyExample/rest/employeecurdxml
http://localhost:8080/RESTJerseyExample/rest/employeecurdxml/1




http://localhost:8080/RESTJerseyExample/rest/employeecurdjson
http://localhost:8080/RESTJerseyExample/rest/employeecurdjson/1

mvn clean install -U 
will generate war which we can deploy to tomcat

or 

if run as is giving error 
generate war and open it and get the jars and put in project lib folder and then run


there are marshaling and unmarshaling classes






Json
<dependency>
		<groupId>org.codehaus.jackson</groupId>
		<artifactId>jackson-mapper-asl</artifactId>
		<version>1.9.13</version>
	</dependency>
	
	