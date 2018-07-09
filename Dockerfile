FROM maven:latest
MAINTAINER uttamjaiswal86
COPY . /opt/poc/
WORKDIR /opt/poc/
RUN mvn clean install && chmod +x target/poc-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","target/poc-0.0.1-SNAPSHOT.jar" ]