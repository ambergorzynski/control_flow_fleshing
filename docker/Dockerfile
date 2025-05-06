FROM ubuntu:22.04

WORKDIR /data/dev/fuzzflesh

COPY . .

RUN apt-get update
RUN apt-get -y install wget
RUN apt-get -y install unzip
RUN apt-get -y install openjdk-11-jdk
RUN apt-get -y install openjdk-17-jdk
RUN apt-get -y install gradle
RUN apt-get -y install maven
RUN apt-get -y install python3.10
RUN apt-get -y install pip
RUN apt-get clean

WORKDIR /data/dev/fuzzflesh/src 
RUN pip install -e .
RUN pip install -r requirements.txt

WORKDIR /data/dev/fuzzflesh/external/ghidra
RUN wget https://github.com/NationalSecurityAgency/ghidra/releases/download/Ghidra_11.1.2_build/ghidra_11.1.2_PUBLIC_20240709.zip
RUN unzip ghidra_11.1.2_PUBLIC_20240709.zip

WORKDIR /data/dev/fuzzflesh
CMD ["./scripts/evaluation/02_run_fuzzflesh.sh"]