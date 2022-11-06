FROM tomcat:8.5.12-jre8-alpine
COPY target/demo-1.0.0.war /usr/local/tomcat/webapps/
EXPOSE 8080/tcp
CMD ["catalina.sh","run"]
CMD cd /usr/local/tomcat/webapps/employee-producer-0.0.1-SNAPSHOT/WEB-INF
CMD ["java","-jar", "com.example.demo.Application"]


 # 