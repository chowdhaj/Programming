# Docker Notes

The following notes are based off of [Learn Docker In 12 Minutes](https://www.youtube.com/watch?v=YFl2mCHdv24) by Jake Wright.

## Notes

- Docker is a tool for running applications in an isolated environment.

- The advantages are similar to running an application inside a virtual machine. For example:
    - The application always runs inside the same environment to avoid inconsistencies in its behaviour.
    - Projects are sandboxed; this is good for security and eliminates potential conflicts between different projects.
    - From dependencies to execution, it just works.

- The code and environment are all inside a container.

- Containers are not full virtual machines.

- In a virtual machine, each machine gets its own full operating system and kernel.

- The kernel is like the core of the OS; the bit that controls the low level stuff.

- Virtual machines are resource heavy on host machines.

- All docker containers use the host machine's kernel. But everything after is separated/isolated and unique.

- All Linux distributions are built on the same kernel.

- The docker sandbox is not quite as extreme, but the compromise is acceptable due to the massive gains in speed and performance.

- Containers are quick, efficient, and take up less space than virtual machines.

- A container is a running instance of an image.

- An image is a template for creating the environment you want. It is a snapshot of the system at a particular time.

- The image contains the required software and application in a file.

- Images are defined via `Dockerfiles`.

- A `Dockerfile` is a text file with a list of steps to perform to create the image.

- Building the `Dockerfile` creates an image, which can be executed to create containers.

- Docker toolbox is the older way to run on a Mac or PC.

- Apache is web server software.

- Docker Hub contains a lot of existing images.

- The best images on Docker Hub are the official ones.

- Variations of images are called tags.

- Define the base image using the `FROM` keyword.

- Use the `COPY` keyword to copy the files inside the image.

- The `EXPOSE` keyword is to expose ports. This allows the container to listen on a specified port. By default it ignores all incoming requests.

- To build an image, type: `docker build -t NAME DIR/`.

- The first time you build an image, it needs to download all of the layers that make up the image.

- To run the image, type: `docker run -p 80:80 NAME`. The `-p 80:80` portion forwards the ports from the host to the container. When the host machine gets a request, then Docker will forward it to the container.

- Navigating to `localhost` in your browser on the host machine will open up the webpage.

- Changing the source code will not update the website. This is because the image needs to be rebuilt and a new container needs to be created.

- There are 2 types of volumes:
    1. Persist and share data between containers
    2. Share folders between host and container

- You can mount a local directory on your host, inside the container. Then the container will be able to see the source files on the host machine.

- To mount a volume, add the following option to the command: `-v HOST_PATH/:DOCKER_PATH/`. This gives the container a live view of the folder, rather than copying it. This is very useful during development. However, make sure you rebuild image to get an updated copy.

- Volumes give running containers the ability to see files on the host machine's file system. But they do NOT change the image.

- Containers will stop by themselves when the main process exits.

- Containers can be setup with short running tasks (e.g. containers running tests).

- You should endeavour to have one process per container, because the life of a container is directly tied to the process.

- Since containers are lightweight, you can run loads of them, simultaneously, on your computer.
