- By running this (licensing-service2) without any properties set, the licensing server will automatically attempt to connect to 
	the Spring Cloud configuration server using the endpoint (http://localhost:8888) and the active profile (default) defined in 
	the bootstrap.yml file of the licensing service.

Notes
	- Nothing is specified in the application.yml file
	- The licensing-service2 will contact confsvr for the details
	- e.g.,
		- server:
   			port: 9001
		- example:
  			property: I AM IN THE DEFAULT
  	
  	 The above values will be picked from confsvr and will be available in licensing-service2. Even server.port is configured in
  	 	confsvr for licensing-service2 (default profile)
  	 	
  	 Try (bootstarp.yml containing profile default)
  	 	- http://localhost:9001/v1/organizations/
  	 	
  	 Try (bootstarp.yml containing profile dev)
  	 	- http://localhost:9001/v1/organizations/
  	 	
- http://localhost:9001/env
	- The /env endpoint will provide a complete list of the configuration information about the service, including the properties 
		and endpoints the service has booted with.  	 	