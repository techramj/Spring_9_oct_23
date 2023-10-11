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


  

  # git command
    git branch -M main
    git remote add origin https://github.com/techramj/Spring_9_oct_23.git
    git push -u origin main