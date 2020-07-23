# desafiocast
Desafio técnico Cast Group

- Características:
  Spring version: 2.3.1.RELEASE
  Maven version: 3.6.2
  Java JDK: 1.8.0_191




Retorno dos testes unitários:


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.1.RELEASE)

2020-07-22 21:40:46.495  INFO 12034 --- [           main] b.c.c.C.DocumentoControllerTest          : Starting DocumentoControllerTest on SRVPLINIO01 with PID 12034 (started by plinio in /media/plinio/Dados/Softwares/BACK/workshop/desafiocast)
2020-07-22 21:40:46.498  INFO 12034 --- [           main] b.c.c.C.DocumentoControllerTest          : No active profile set, falling back to default profiles: default
2020-07-22 21:40:49.710  INFO 12034 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFERRED mode.
2020-07-22 21:40:49.921  INFO 12034 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 179ms. Found 1 JPA repository interfaces.
2020-07-22 21:40:53.199  INFO 12034 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2020-07-22 21:40:53.234  INFO 12034 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-07-22 21:40:53.237  INFO 12034 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.36]
2020-07-22 21:40:53.516  INFO 12034 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-07-22 21:40:53.516  INFO 12034 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 6826 ms
2020-07-22 21:40:54.056  INFO 12034 --- [           main] o.f.c.internal.license.VersionPrinter    : Flyway Community Edition 6.4.4 by Redgate
2020-07-22 21:40:54.074  INFO 12034 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-07-22 21:40:54.651  INFO 12034 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-07-22 21:40:54.716  INFO 12034 --- [           main] o.f.c.internal.database.DatabaseFactory  : Database: jdbc:h2:mem:mydb (H2 1.4)
2020-07-22 21:40:54.912  INFO 12034 --- [           main] o.f.core.internal.command.DbValidate     : Successfully validated 1 migration (execution time 00:00.055s)
2020-07-22 21:40:54.940  INFO 12034 --- [           main] o.f.c.i.s.JdbcTableSchemaHistory         : Creating Schema History table "PUBLIC"."flyway_schema_history" ...
2020-07-22 21:40:55.049  INFO 12034 --- [           main] o.f.core.internal.command.DbMigrate      : Current version of schema "PUBLIC": << Empty Schema >>
2020-07-22 21:40:55.060  INFO 12034 --- [           main] o.f.core.internal.command.DbMigrate      : Migrating schema "PUBLIC" to version 01.01 - banco
2020-07-22 21:40:55.109  INFO 12034 --- [           main] o.f.core.internal.command.DbMigrate      : Successfully applied 1 migration to schema "PUBLIC" (execution time 00:00.076s)
2020-07-22 21:40:55.321  INFO 12034 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-07-22 21:40:55.474  INFO 12034 --- [         task-1] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-07-22 21:40:55.626  WARN 12034 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-07-22 21:40:55.683  INFO 12034 --- [         task-1] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.17.Final
2020-07-22 21:40:55.864  INFO 12034 --- [         task-1] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-07-22 21:40:56.352  INFO 12034 --- [         task-1] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2020-07-22 21:40:57.385  INFO 12034 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring TestDispatcherServlet ''
2020-07-22 21:40:57.385  INFO 12034 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2020-07-22 21:40:57.418  INFO 12034 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 32 ms
2020-07-22 21:40:57.593  INFO 12034 --- [         task-1] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-07-22 21:40:57.615  INFO 12034 --- [         task-1] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-07-22 21:40:57.624  INFO 12034 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 39075 (http) with context path ''
2020-07-22 21:40:57.631  INFO 12034 --- [           main] DeferredRepositoryInitializationListener : Triggering deferred initialization of Spring Data repositories…
2020-07-22 21:40:57.632  INFO 12034 --- [           main] DeferredRepositoryInitializationListener : Spring Data repositories initialized!
2020-07-22 21:40:57.656  INFO 12034 --- [           main] b.c.c.C.DocumentoControllerTest          : Started DocumentoControllerTest in 12.341 seconds (JVM running for 15.875)
br.com.cast.Model.Documento@142918a0
br.com.cast.Model.Documento@6212ea52
Retorno: Documentos Com Tamanhos Diferentes.
Retorno: Posição de divergência: 16
Retorno: Documentos Idênticos.
2020-07-22 21:40:58.212  INFO 12034 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-07-22 21:40:58.216  INFO 12034 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-22 21:40:58.217  INFO 12034 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-07-22 21:40:58.240  INFO 12034 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
