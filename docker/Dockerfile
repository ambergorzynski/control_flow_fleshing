FROM ubuntu:22.04

WORKDIR /data/dev/fuzzflesh

COPY . .

RUN apt-get update
RUN apt-get -y install openjdk-11-jdk
RUN apt-get -y install openjdk-17-jdk
RUN apt-get -y install maven
RUN apt-get -y install python3.10
RUN apt-get -y install pip
RUN pip install -r requirements.txt

ENV MAVEN_HOME=/usr/share/maven
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64

WORKDIR /data/dev/fuzzflesh/external/cfr/cfr
RUN mvn compile

WORKDIR /data/dev/fuzzflesh/src 
RUN pip install -e .

WORKDIR /data/dev/fuzzflesh
CMD ["./scripts/evaluation/run_evaluation.sh"]