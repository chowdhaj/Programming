# This is a sample Dockerfile
# Only for educational purposes

# Download the ``golang`` image from Docker Hub
# This is the base image file
FROM golang

# Set the working directory
WORKDIR /home/

# Copy files from host (i.e. local machine) to the docker container
COPY main.go ./
COPY go.mod ./

# Command to execute when docker container starts up.
# These arguments are fed to ``ENTRYPOINT``
RUN go build -o myapp

# This command will always be executed when the container starts
ENTRYPOINT ["./myapp"]