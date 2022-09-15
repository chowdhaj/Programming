# Docker Notes

The following notes are based off of [Learn Docker In 10 Minutes](https://www.youtube.com/watch?v=e-qLraE_MV8), by Yours Truly.

## Notes

- Docker allows programmers to create independent environments, called containers. These containers can be run on any machine, including Windows, Linux, macOS, etc.

- Containers remove problems related to dependency and compilation, because each container is built from the same files, regardless of the system.

- A docker container/image is a lightweight, standalone, executable package of software that includes everything needed to run an application (i.e. code, runtime, system tools, system libraries and settings).

- Required software and dependencies are defined in the `Dockerfile`.

- Running the `Dockerfile` sets up the environment to execute the program.

- With Docker, you can have multiple independent containers for applications.

- Containers do not conflict with each other, because their environments are separate.

- Even thought it looks like a virtual machine (VM), Docker is not a VM.

- Virtual machines include a full copy of an OS, and work independently.

- Docker only shares the resources of the host machine to run its environment.

- Compared to VMs, Docker images are lightweight.

- Container images take less space than virtual machine images.

- Docker is fast, and can start/stop an application in seconds.

- To run multiple VMs, a hypervisor is needed,

- Docker is installed on top of the host operating system, and then manages each container.

- In a VM, each one has its own OS. But with docker, all containers share the host OS.

- Compared to VMs, Docker is less resource intensive.

- Docker is multi-platform, and can be launched on any system.

- You can setup multiple working environments that work independently of each other. You can delete/modify a container without affecting the others.

- Docker makes deployment on a server much easier.

- When running a container, you are not responsible for installing the dependencies - Docker is.

- To check the docker version, type: `docker -v`.

- To see more commands, type: `docker --help`.

- To run a docker container, type: `docker -run CONTAINER`.

- The `Dockerfile` does not have any extension.

- It is not necessary for you to install the dependencies on your system. When running a container, docker will fetch everything for you.

- The `Dockerfile` is always prefaced with importing the base image. Use the `FROM` keyword (i.e. `FROM baseImage`).

- Base images can be found and fetched from Docker hub (i.e. `FROM node:latest`).

- To import the code into the image, use the COPY keyword (i.e. `COPY file dir/`).

- To define which command to run in the container, use the CMD keyword (i.e. `CMD ["node", "app.js"]`).

- To build an image, type: `docker build -t NAME_OF_IMAGE PATH_TO_FILES`.

- To run a container, type: `docker run NAME_OF_IMAGE`.

- After editing the source file, you need to rebuild the image.
