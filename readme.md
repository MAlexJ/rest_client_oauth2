### Spring Security 6.4: RestClient Support for OAuth2

This project demonstrates a complete OAuth2 setup with an authorization server, resource server, and client
applications.

In particular this application is showing off the new RestClient support for OAuth2 in Spring Security 6.4.

link: https://spring.io/blog/2024/10/28/restclient-support-for-oauth2-in-spring-security-6-4

#### Project Overview

The project consists of three main components:

1. Authorization Server (Port 9000) - Handles authentication and issues OAuth2 tokens
2. Resource Server (Port 8081) - Provides protected golf lesson endpoints
3. Client Applications:
   * OAuth2 Client (Spring Security implementation)
   * No-Auth Client (RestClient without Authorization)

link: https://www.youtube.com/watch?v=nFKcJDpUuZ8&t=428s

#### Project Requirements

Java 23
Spring Boot 3.3.5+
Gradle 8.10+
Spring Security 6.4+

#### Key Features

* OAuth2 Authorization Server implementation
* JWT token-based authentication
* Resource server with protected endpoints
* Client credential flow implementation
* RestClient with OAuth2 support

