FROM openjdk:17

WORKDIR /app

COPY . .

RUN find . -name "*.java" > sources.txt && javac @sources.txt

CMD ["java", "Main"]
