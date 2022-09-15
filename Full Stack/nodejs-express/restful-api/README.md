# CRUD REST(ful) API with Node.js, Express, & PostgreSQL

The application in this directory is my attempt at creating a backend in Node.js (Express) that can handle CRUD operations. The database used is PostgreSQL, also known as Postgre.

- Framework: Express
- Database: PostgreSQL

## Preliminary Information

The following subsections contain basic information about CRUD operations, REST APIs, frameworks, Node, etc. These are my notes on these topics, and are formatted so that I may quickly review them in the future. For in-depth explanations, please reference Wikipedia or a similar source.

## RESTful API

The term REST API is broken down into REST and API. REST stands for *Representational State Transfer* and API stands for *Application Programming Interface*. REST defines a set of standards for web services. An API is an interface that applications use to communicate with each other. Therefore, a RESTful API is an application programming interface that conforms to the REST architectural style and constraints. REST systems are stateless, scalable, cacheable, and have a uniform interface.

## CRUD API

When building a model, it should provide 4 basic functionalities:
- **C**reate
- **R**ead
- **U**pdate
- **D**elete
RESTful APIs utilize HTTP requests. The most common ones, that correspond to the above, are:
- GET *(Create)*
- POST *(Read)*
- PUT *(Update)*
- DELETE *(Delete)*

## Express

Express is one of the most popular frameworks for Node.js. It fast and minimalist, yet flexible. You can use it to address almost any task or problem imaginable.

## PostgreSQL

Also known as Postgre, it is a free, open source relational database management system. Similar database systems are:
- MySQL
- Microsoft SQL Server
- MariaDB
PostgreSQL is a popular choice for developers and companies because it is stable, extensible, and complies with standards.

# Installation

1. Make sure you run `npm install` before executing anything.

2. Execute `node index.js`

3. Navigate to `localhost:3000` in your favorite browser
