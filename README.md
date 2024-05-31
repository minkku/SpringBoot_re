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

<h3>Database</h3>

- Using Database for this project
  - Using tool Docker
    - h2, MariaDB, PostgresSQL
