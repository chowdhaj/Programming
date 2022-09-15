# Notes For Docker Compose

The following notes are based off of [Docker Compose In 12 Minutes](https://www.youtube.com/watch?v=Qw9zlE3t8Ko) by Jake Wright.

## Notes

- An image is a template for the environment that you want to run.

- A running image is called a container.

- Typically, websites are one big application. Developers are now spliting everything into micro-services. This makes the website minimal.

- Each container should provide a single service; one process per container.

- Micro-services are independent of one another, which allows them to be written in different languages. However, they need to be able to talk to each other.

- The `requirements.txt` file is a list of dependencies that Python can use to install everything. This not specific to Docker, this is for Python.

- In a `Dockerfile`, the first line needs to use the FROM keyword. This specifies a base image that everything will be built on top of.

- The `onbuild` portion automatically installs requirements from the `requirements.txt` file.

- The `COPY` keyword is used to copy directories into the image.

- Using `docker build` and `docker run` is tedious when dealing with lots of containers.

- `docker-compose` defines all configurations in a single file. And with a single command it will create and/or run all the required containers.

- The extension for the `docker-compose` file is `yaml`; it is a YAML file.

- The compose file is started off by specifying the version. Docker continues to change how compose files need to be written. There are subtle differences between each version.

- The services name can be anything you want.

- Directories are relative to where the `docker-compose` file is.

- `Volumes`, `Ports` are specified as a list.

- `Port` mapping is done as `HOST:DOCKER`.

- Mapping to port 80 on the host machine might clash with something else.

- The configuration file contains all docker commands that you would have to type on the terminal, but in a nicer, easier to read format.

- To run the compose file, type: `docker-compose up`.

- Make sure you are in the same directory as the `docker-compose` file, before running it.

- On your machine, open up the browser and navigate to `localhost:PORT`.

- Mounting a volume allows Docker to see the changes in real-time.

- Docker compose creates a virtual network for all of the containers.

- By default, each container can access all of the other containers defined in the configuration file. And their hostnames match the service name.

- The `depends_on` property tells `docker-compose` what a container depends on.

- `docker-compose` allows for detached mode. It will run the containers in the background (e.g. `docker-compose up -d`).

- To see a list of running docker containers, type `docker ps`.

- To stop docker containers, type `docker-compose stop`.
