# step  1 : download maven
    url: https://maven.apache.org/download.cgi
    download:Binary zip archive
    download link: https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.zip

# step 2: set up in system enviroment variable
    M2_HOME=<path of maven folder (parent of bin folder)>
    eg: C:\apache-maven-3.9.5

    edit the path variable, click on new button, the add the below path
    %M2_HOME%\bin

    after the env setup, test with below command
        cmd mvn -version

# step 3: create maven project
     new-> maven-project,  select the checkbok at the top (create the simple project)
     then fill the below field
     group id => organization name eg: com.seed
     artifact_id => name_of_project
     and keep rest as default.


# step 4: add dependencies in pom.xml
    <properties>
		<spring.version>5.1.1.RELEASE</spring.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.version}</version>
		</dependency>

	</dependencies>


# step 5: add compiler plugin in pom.xml
    <build>
		<sourceDirectory>src/main/java</sourceDirectory>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.5.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
		</plugins>
	</build>

# step 6: update the maven project

# step 7: create spring.xml configuration file
## create the file spring.xml in resources folder and add the below text

        <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:context="http://www.springframework.org/schema/context"
        xsi:schemaLocation="
            http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
            http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd
            http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd">

    

        </beans>



# **setup for spring mvc**
## step 1: 
    create the dynamice web project.
    Include web.xml while creating the project

## step 2: convert the project to mavn project
    click on project -> configure -> convert to maven project

## step 3: add the dependencies 
        <dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${spring.version}</version>
		</dependency>


		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>${spring.version}</version>
		</dependency>

		<!--Servlet-->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>servlet-api</artifactId>
			<version>2.5</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.servlet.jsp</groupId>
			<artifactId>jsp-api</artifactId>
			<version>2.2</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>

	</dependencies>

## step 4: update the maven project
    right click on pom.xml -> maven -> update project

## step 5: add the front controller (DispatcherServlet)
    <servlet>
		<servlet-name>spring</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>/WEB-INF/spring-servlet.xml</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>

	<servlet-mapping>
		<servlet-name>spring</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
            
## step 6: create spring config xml file (spring-servlet.xml)
    path: parallel to  web.xml file


# step 7: add the schema to xml file
        <?xml version="1.0" encoding="UTF-8"?>
        <beans xmlns="http://www.springframework.org/schema/beans"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:context="http://www.springframework.org/schema/context"
            xmlns:mvc="http://www.springframework.org/schema/mvc"
            xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/mvc
        http://www.springframework.org/schema/mvc/spring-mvc.xsd">


        </beans>


## step 8: enable the handler mapping (annotation-based)
    add the below line in spring-servlet.xml file

    <!-- enabling handler mapping -->
	<mvc:annotation-driven />

## step 9: add controller
### create controller class eg: LoginController
        package com.seed.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

        @Controller
        public class LoginController {
            
            @RequestMapping(path = "/login")
            public String login() {
                return "success";
            }

        }

### add the component-scan in spring config file
        <context:component-scan base-package="com.seed" />


## step 10: add the jsp file.
     create the folder in web-inf(eg: WEB-INF/views)
     add few jsp file

## step 11: configure view resolver

    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/views/" />
		<property name="suffix" value=".jsp" />
	</bean>


