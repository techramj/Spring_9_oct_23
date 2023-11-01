# **setup for spring mvc using spring boot**
## step 1: create mvc project using spring intializer
		spring web
		devtool[optional]
		lombok[optional]
		jpa
		h2/oracle/mysql

	Database
	    h2 
		  In memory db(no persistent data)
		  file based (persistent data)



## step 2: add the below dependencies

        <dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>

	
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>


## step 3: create the controller
		package com.seed.controller;

		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;
		import org.springframework.stereotype.Controller;
		import org.springframework.web.bind.annotation.RequestMapping;

		@Controller
		public class LoginController {
			
			private static Logger logger = LoggerFactory.getLogger(LoginController.class);
			
			@RequestMapping(path = {"/login","/})
			public String loginPage() {
				logger.info("login page called!!!!!!!!!!!!!");
				return "loginPage";
			}
	
		}


## step 4: create the loginPage.jsp
		create folder WEB-INF inside webaap
		create views folder inside WEB-INF

## step 4: add the view resolver prefix and suffix properties
		spring.mvc.view.prefix=/WEB-INF/views/
		spring.mvc.view.suffix=.jsp

## step 5: test the login page
			localhost:{portnumber}/login
