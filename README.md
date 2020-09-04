# Project Structure

1. Model for Product table. Defined as Entity and given table name. Primary key is auto-generated.
2. Repository interface for employees. It extends the JPA repository so all methods are there.
3. Service - Injected the repository to call the CRUD methods. To be used by the controller.
4. Controller - Request mapping for all APIs. Injected the Service 
5. Swagger - Implemented Swagger API documentation. **_springfox-swagger2_**. Swagger Config is difined along with @EnableSwagger2 and @SwaggerDefinition

# Database
1. DB used is MySQL. I used a docker container to connect. Docker command 
	- **_docker run --name db-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=Password mysql_**.
2. The above command runs a docker container from the image and publishes the port to 3306 on host. Default DB user is root.
3. New DB created with below SQL from MySQL workbench
4. When the project runs JPA creates the table. (Product)

		create database testdb;
		use testdb;

# Swagger
1. Use this url to see the JSON in postman - http://localhost:5151/v2/api-docs.
2. Use this url to access the swagger UI - http://localhost:5151/swagger-ui.html
3. Dependency used:

         <dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.4.0</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.4.0</version>
		</dependency>

