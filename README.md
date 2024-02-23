# B1-JWT-authentication-Spring-Security-MongoDB
Spring Boot / Postman / MongoDB / Java


Spring Security with JWT authentication, along with MySQL DB integration, enables custom authentication and authorization workflows. Tools like IntelliJ IDEA and Postman ensure seamless integration and efficient debugging. Customizing workflows allows for fine-tuning access controls, including role-based access control (RBAC), and enhancing application security. Integrating additional security layers like HTTPS, CSRF protection, and rate limiting provides comprehensive protection against security threats.

Setup MySQL Database Integration: Configure Spring Security to authenticate users against Mongo database credentials.

Implement JWT Authentication: Develop authentication logic to generate JWT tokens based on username and password stored in MongoDB. For ADMIN or MANAGER roles, include access to endpoints like /log and /search. For USER role, restrict access to only /log.

Fine-tune Access Controls: Utilize Spring Security's configuration to define role-based access controls (RBAC), ensuring that each role has appropriate permissions.

Tool Integration for Development: Utilize IntelliJ IDEA for efficient development and debugging, and Postman for testing API endpoints and JWT token validation.

Additional Security Layers: Enhance security with HTTPS to encrypt communication, CSRF protection to prevent cross-site request forgery attacks, and rate limiting to mitigate against brute-force and DoS attacks.


1. **JWT Token Generation**: Users authenticate using their username and password stored in MongoDB. Upon successful authentication, a JWT token is generated.

2. **Role-based Access**: There are three roles: ADMIN, MANAGER, and USER. 
   - ADMIN and MANAGER roles have access to endpoints `/log` and `/search`.
   - USER role is limited to accessing only `/log`.

3. **MongoDB Integration**: User credentials are stored in a Mongo database, ensuring secure storage and retrieval during authentication.


#The "B1-JWT-authentication-Spring-Security-MongoDB" and "B1-JWT-authentication-Spring-Security-MySQL" repository projects are similar, with "MongoDB" and "MySQL" .
                        
   showcasing the project's ability to adapt to different environments while maintaining core functionality and security features.

"ObjectId" is typically used in MongoDB for unique identifiers as "int"

JpaRepository and MongoRepository, which are interfaces provided by Spring Data JPA and Spring Data MongoDB, respectively.
 
@Entity , @GeneratedValue --->  @Document(collection = "users") MongoDB 
