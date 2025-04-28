FROM python:3.10

WORKDIR /data/dev/fuzzflesh

COPY . .

RUN pip install -r requirements.txt

CMD ["./scripts/evaluation/run_evaluation.sh"]