FROM ubuntu:22.04

WORKDIR /data/dev/fuzzflesh

COPY . .

RUN apt-get update
RUN apt-get -y install wget
RUN apt-get -y install unzip
RUN apt-get -y install zip

RUN apt-get -y install openjdk-11-jdk
RUN apt-get -y install openjdk-17-jdk
RUN apt-get -y install openjdk-19-jdk
RUN apt-get -y install gradle
RUN apt-get -y install maven
RUN apt-get -y install python3.10
RUN apt-get -y install pip

WORKDIR /data/dev/fuzzflesh/external/ghidra
RUN wget https://github.com/NationalSecurityAgency/ghidra/releases/download/Ghidra_11.1.2_build/ghidra_11.1.2_PUBLIC_20240709.zip
RUN unzip ghidra_11.1.2_PUBLIC_20240709.zip

WORKDIR /data/dev/fuzzflesh/external/jdtester
RUN wget https://github.com/AIRTEspresso/DecompilerStudy/releases/download/V1.1/JD-Tester-V1.1.zip
RUN unzip JD-Tester-V1.1.zip

WORKDIR /data/dev/fuzzflesh

RUN pip install -r requirements.txt

ENV MAVEN_HOME=/usr/share/maven
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64

WORKDIR /data/dev/fuzzflesh/src 
RUN pip install -e .

WORKDIR /data/dev/fuzzflesh/external/cfr/cfr
RUN mvn compile
WORKDIR /data/dev/fuzzflesh/external/cfr/cfr_fix1
RUN mvn compile
WORKDIR /data/dev/fuzzflesh/external/jadx/jadx
RUN ./gradlew dist
WORKDIR /data/dev/fuzzflesh/data/head2head_results/cfr
RUN unzip cfr_pre_ff_fix_commit.zip -d cfr_pre_ff_fix_commit
WORKDIR /data/dev/fuzzflesh/data/head2head_results/jadx
RUN unzip jadx_pre_ff_fix_commit.zip -d jadx_pre_ff_fix_commit

WORKDIR /data/dev/fuzzflesh
CMD ["./scripts/evaluation/run_evaluation.sh"]