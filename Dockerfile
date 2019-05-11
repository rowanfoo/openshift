FROM openjdk:8
ADD target/openshift-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /openshift-0.0.1-SNAPSHOT.jar'
EXPOSE 8085
ENTRYPOINT ["java","-jar","openshift-0.0.1-SNAPSHOT.jar"]
