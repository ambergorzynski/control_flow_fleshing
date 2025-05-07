FROM ubuntu:22.04

WORKDIR /data/dev/fuzzflesh

COPY . .

RUN apt-get update
RUN apt-get -y install wget
RUN apt-get -y install curl
RUN apt-get -y install unzip
RUN apt-get -y install zip
RUN apt-get -y install openjdk-11-jdk
RUN apt-get -y install openjdk-17-jdk
RUN apt-get -y install maven
RUN apt-get -y install python3.10
RUN apt-get -y install pip
RUN apt-get clean

WORKDIR /data/dev/fuzzflesh/external/gradle
RUN wget https://services.gradle.org/distributions/gradle-8.10-bin.zip
RUN unzip gradle-8.10-bin.zip 
ENV PATH=$PATH:/data/dev/fuzzflesh/external/gradle/gradle-8.10/bin

WORKDIR /data/dev/fuzzflesh/external/jadx
RUN wget https://github.com/skylot/jadx/releases/download/v1.5.1/jadx-1.5.1.zip
RUN unzip jadx-1.5.1.zip -d jadx
RUN rm -rf jadx-1.5.1.zip

WORKDIR /data/dev/fuzzflesh/external/jadx
RUN wget https://github.com/ambergorzynski/jadx_cov/archive/refs/heads/master.zip
RUN unzip master.zip
RUN rm -rf master.zip

ENV MAVEN_HOME=/usr/share/maven
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64

WORKDIR /data/dev/fuzzflesh/external/cfr
RUN wget https://github.com/leibnitz27/cfr/archive/refs/heads/master.zip
RUN unzip master.zip
RUN rm -rf master.zip
RUN mv cfr-master cfr
WORKDIR /data/dev/fuzzflesh/external/cfr/cfr
RUN mvn compile

WORKDIR /data/dev/fuzzflesh/external/cfr
RUN wget https://github.com/ambergorzynski/cfr_cov/archive/refs/heads/master.zip
RUN unzip master.zip
RUN rm -rf master.zip

ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64

WORKDIR /data/dev/fuzzflesh/external/fernflower
RUN wget https://github.com/ambergorzynski/intellij-community-cov/archive/refs/heads/master.zip
RUN unzip master.zip
RUN cp -r intellij-community-cov-master/plugins/java-decompiler/engine fernflower_cov/
RUN rm -rf intellij-community-cov-master

WORKDIR /data/dev/fuzzflesh/external/ghidra
RUN wget https://github.com/NationalSecurityAgency/ghidra/releases/download/Ghidra_11.0.3_build/ghidra_11.0.3_PUBLIC_20240410.zip
RUN unzip ghidra_11.0.3_PUBLIC_20240410.zip

WORKDIR /data/dev/fuzzflesh/external/ghidra
RUN wget https://github.com/ambergorzynski/ghidra_cov/archive/refs/heads/ghidra1103release.zip
RUN unzip ghidra1103release.zip
WORKDIR /data/dev/fuzzflesh/external/ghidra/ghidra_cov-ghidra1103release
RUN gradle -I gradle/support/fetchDependencies.gradle
RUN gradle buildGhidra

WORKDIR /data/dev/fuzzflesh/src 
RUN pip install -e .
RUN pip install -r requirements.txt

WORKDIR /data/dev/fuzzflesh
CMD ["./scripts/evaluation/02_run_fuzzflesh.sh"]