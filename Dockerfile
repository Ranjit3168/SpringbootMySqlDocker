FROM openjdk:21

ADD src/main/resources/JRTP-Proj34-DockerizigSBMysql-0.0.1-SNAPSHOT.jar   /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","JRTP-Proj34-DockerizigSBMysql-0.0.1-SNAPSHOT.jar"]