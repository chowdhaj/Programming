## Notes For Docker Tutorial By HowCode

The following notes are based off of [Learn Docker In 5 Minutes](https://www.youtube.com/watch?v=Oni3qxZ4a-w), by HowCode.

# Notes

- A container is a lightweight way of packaging software with all of its dependencies. This allows you to run your software anywhere!

- The `docker` command is how you can create images, start containers, etc.

- A docker image is a file that stores the program and all of its dependencies. This is the container.

- The `Dockerfile` is a special file that docker needs to create an image.

- To start a container, a `Dockerfile` is needed.

- To build a container, a `Dockerfile` is needed.

- Docker images are made up reusable layers.

- The first line in the `Dockerfile` specifies the base docker image. The image contains all of the dependencies to build the program.

- The `WORKDIR` command sets the working directory.

- The `COPY` command copies files from the local machine into the image.

- The `RUN` command can build the binary.

- The `ENTRYPOINT` command is used to specify the entry point.

- To build an image, type: `docker build DIRECTORY`.

- Use `docker run IMAGE_ID` to run the image.

- Docker containers are not virtual machines; there is no actual virtualization happening when you run a docker container. Instead you are running the process with limited permissions.

- To map a port from the host computer to the container, use the `-p` flag, and specify the ports (i.e. `-p 80:80`).

- Docker images are large in size because they contain all of the dependencies the software requires to run.

- To combat large sizes, Docker uses multi-stage builds.

- In a multi-stage build, the `FROM` command can be used more than once.

- Adding tags to images gives docker images a smaller name (i.e. `docker tag  IMAGE_ID NEW_NAME`).

- Docker hub is a public repository where people can upload and download containers (i.e. `docker push IMAGE_ID`).

- To fetch a container from Docker hub, use `docker pull IMAGE_ID`.

- To find containers, visit Docker Hub.

- Running software in a container "just works".
