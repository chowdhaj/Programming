# This is a sample Dockerfile
# Only for educational purposes

FROM golang

WORKDIR /home/

COPY main.go ./
COPY go.mod ./
RUN go build -o myapp

ENTRYPOINT ["./myapp"]