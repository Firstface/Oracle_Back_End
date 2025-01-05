# Backend Application

## Project Overview

This is a REST service for calculating the minimum number of coins needed to make up a target amount, implemented using Java and Dropwizard.

## Project Structure

. ├── Dockerfile ├── pom.xml └── src └── main └── java └── Configuration └── ApplicationStart.java


## Build and Run

### Build the Project

1. Ensure you are in the project's root directory.
2. Run the following command to build the project:

    ```sh
    mvn clean package
    ```

### Using Docker

#### Build Docker Image

1. Ensure you are in the project's root directory.
2. Run the following command to build the Docker image:

    ```sh
    docker build -t backend-app .
    ```

#### Run Docker Container

1. Run the following command to start the Docker container:

    ```sh
    docker run -p 8080:8080 backend-app
    ```

2. Your backend service should now be accessible at `http://localhost:8080`.