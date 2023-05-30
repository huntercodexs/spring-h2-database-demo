
# SPRING H2 DATABASE DEMO

- Tip

> To use more easily this project you can use together the Docker Series from https://github.com/huntercodexs/docker-series 
> h2-database path (self-containers/h2-database)

- Charge database

Use the sql scripts schema.sql and data.sql to charge database initializing data to tests. It is possible to use the 
H2 Database in the embedding mode or in the server mode, to use in server mode set up the application properties as 
showed bellow:

<pre>
## DATASOURCE
# -------------------------------------------------------------------------------------------------------------------
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driverClassName=org.h2.Driver
# REMOTE CONNECTION (Server)
#spring.datasource.url=jdbc:h2:tcp://localhost:39095/~/db-h2-test
#spring.datasource.jdbcUrl=jdbc:h2:tcp://localhost:39095/~/db-h2-test
# REMOTE CONNECTION (Server with database charge)
spring.datasource.url=jdbc:h2:tcp://localhost:39095/~/db-h2-test;INIT=RUNSCRIPT FROM '~/db-init.sql'
spring.datasource.jdbcUrl=jdbc:h2:tcp://localhost:39095/~/db-h2-test;INIT=RUNSCRIPT FROM '~/db-init.sql'
</pre>