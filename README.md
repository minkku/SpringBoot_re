<h1>Understanding SpringBoot</h1>

SpringBoot 자동설정

- @SpringBootApplication

  - 어노테이션을 사용해서 자동으로 스프링부트를 불러온다.
  - 만약 자동설정을 사용하기 싫으면 exclude를 사용하면 된다.

- @springBootApplication 은 3개의 어노테이션을 포함
  - @EnableAutoConfiguration
  - @ComponentScan
  - @SpringBootConfiguration (@Configuration 에서 추가 bean을 등록할 수 있게 한다.)
- Componet, Service, Repository, Controller 등…

---

<h3>Database</h3>

- Using Database for this project
  - Using tool Docker
    - h2, MariaDB, PostgresSQL

1. Setting for dependencies

- When make project setting in "start.spring.io"
- Add dependencies
  - Spring Data JPA
  - H2 Database
    - Check connection to H2
     1. Starting Server and connect to "http://localhost:8080/h2-console" as set in application.yml
     2. put img
     3. put img
    * Occured error for "unable to store UUID in H2 with hibernate"
     - model/post.java에 @GeneratedValue(strategy = GenerationType.IDENTITY) 으로 설정하니 UUID를 읽지 못해 테이블 생성이 불가!
     - 해결방법
      - @GeneratedValue(generator = "UUID") 로 바꿔서 다시 실행하니까 정상적으로 테이블이 만들어졌음!
  - MariaDB Driver
  - PostgreSQL Driver
  - MyBatis Framework
  * if you already have a project set in build.gradle
- Settings
  - src/main/resources/application.properties
  - src/main/resources/application.yml
    '원하는 방식으로 세팅하면 된다.'  
    'yml 방식은 띄어쓰기 중요!!'
  - ddl-auto
    - none : default for database
    - update : schema for changed
    - validate : check the schema for updates if y finish the Application 'use in real server'
    - create : drop the schema when starting the application
    - create-drop : when start application drop all

2. Entity && JPARepository

3. Seperate profiles

4. MyBatis

5. Paging && Search
