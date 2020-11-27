FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/projetateliergl-1.0-SNAPSHOT.jar
ARG JAR_LIB_FILE=target/lib/

# cd / usr / local / runme
WORKDIR /usr/local/runme

##copier target /find-links.jar/usr/local/runme/app.jar
COPY ${JAR_FILE} app.jar




# copier les dépendances du projet
# cp -rf cible / lib / / usr / local / runme / lib
##AJOUTER
ADD ${JAR_LIB_FILE} lib/

#java -jar /usr/local/runme/app.jar
ENTRYPOINT [ "java" , "-jar" , "app.jar" ]
