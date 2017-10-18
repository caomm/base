注意：
 1.使用外部tomcat 需要先package 然后在启动tomcat
 2.使用maven tomcat plugin 需要做以步骤：
   1.pom文件将packaging改为war
   2.增加一下jar包
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <!--<version>1.3.0.RELEASE</version>-->
            <scope>provided</scope>
        </dependency>
   3.配置maven tomcat plugin
 3.修改application.java
       /**
        * 通过maven tomcat 插件启动方式
        */
       @SpringBootApplication
       @ComponentScan("com.moafmoar.*")
       public class SpringbootdemoApplication extends SpringBootServletInitializer {
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(SpringbootdemoApplication.class);
        }
       
        public static void main(String[] args) {
            SpringApplication.run(SpringbootdemoApplication.class, args);
        }
       }
 4.如果application.java 的位置发生变化，则需要添加该注解：
   @ComponentScan("com.moafmoar.*")  扫面类
   
 5.Swagger2需要使用spring-boot:run才能看到效果，目前还没有验证war是否生效
 