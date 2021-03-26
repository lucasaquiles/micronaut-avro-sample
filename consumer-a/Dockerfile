FROM openjdk:14-alpine
COPY build/libs/consumer-a-*-all.jar consumer-a.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "consumer-a.jar"]