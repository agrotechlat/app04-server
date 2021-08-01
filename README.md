<p align="center">
    <a href="https://cloud.ibm.com">
        <img src="https://i.postimg.cc/QML33b54/e-Greens-logo.png" height="100" alt="Logo">
    </a>
</p>


<p align="center">
    <a href="https://cloud.ibm.com">
    <img src="https://img.shields.io/badge/IBM%20Cloud-powered-blue.svg" alt="IBM Cloud">
    </a>
    <a href="https://www.ibm.com/developerworks/learn/java/">
    <img src="https://img.shields.io/badge/platform-java-lightgrey.svg?style=flat" alt="platform">
    </a>
    <img src="https://img.shields.io/badge/license-Apache2-blue.svg?style=flat" alt="Apache 2">
</p>

## What is Egreens? ##

eGreens, is a hydroponic system to produce fast growing food through the use of technology and automation. With eGreens people will be able to grow their own food, on their own land, regardless of the weather conditions, without the need for agrochemicals, and with the use of the latest cloud technology, recipes of cultivation and artificial intelligence to maximize their production.

## Contents 

01. [Description](#Description)
02. [Demo Video](#Demo-Video)
03. [Solution Architecture](#Solution-Architecture)
04. [Project Roadmap](#Project-Roadmap)
05. [Getting Started](#Getting-Started)
06. [Live Demo](#Live-Demo)
07. [Authors](#Authors)
08. [License](License)

## Description <a name="Description"></a>

eGreens is made up of a mobile application, a cloud server, and a local server. The web application allows you to interact with eGreens using any device. The application in IBM Cloud supports all the necessary communication between the web app and the local server. The latter is responsible for being the bridge between the sensors and actuators. All this forms an IoT network, the foundations to enter Industry 4.0, digital twins, and a preparation to enter the world of big data and Artificial Intelligence.

Our subscription model allows  to use it as part of a healthy life or start a business, we will establish alliances with companies and NGOs that join this fight against hunger. We will monetize the app through subscription and advertisements that offer various services related to cultivation.

There are few similar solutions in the market and we will be the solution that helps you make better decisions and intelligently manage your crops.

To make our solution a reality, we have already made the first prototype and will soon be launching it on the market.

At eGreens we believe that ending hunger in Latin America and the world through smart technology is possible, so we invite you to join the project and collaborate to achieve the goal of zero hunger in the world.


## Demo Video <a name="Demo-Video"></a>
[![Demo Video](https://imgur.com/1arEPXm.png)](https://www.youtube.com/watch?v=l_jXrAoHCAs&ab_channel=eGreens "DEMO VIDEO")


## Solution Architecture <a name="Solution-Architecture"></a>
![Solution Architecture 1](https://imgur.com/bm05pnF.png)

![Solution Architecture 2](https://imgur.com/mcFHNY8.png)

## Project Roadmap <a name="Project-Roadmap"></a>

You can learn a little more about Greens and see the Roadmap from the following document

[![Project Roadmap](https://imgur.com/NsSYMSh.png)](https://drive.google.com/file/d/1qD3RxIvPAh29LkDErEJ0FXtV82ebh9W0/view?usp=sharing "Project Roadmap")

# Create and deploy a basic Java Spring application <a name="Getting-Started"></a>

> We have applications available for [Node.js Express](https://github.com/IBM/node-express-app), [Go Gin](https://github.com/IBM/go-gin-app), [Python Flask](https://github.com/IBM/python-flask-app), [Python Django](https://github.com/IBM/python-django-app), [Java Spring](https://github.com/IBM/java-spring-app), [Java Liberty](https://github.com/IBM/java-liberty-app), [Swift Kitura](https://github.com/IBM/swift-kitura-app), [Android](https://github.com/IBM/android-app), and [iOS](https://github.com/IBM/ios-app).

In this sample application, you will create a basic Java cloud application using Spring. This provides a good starting point for creating Java microservice applications running on [Spring](https://spring.io/). It contains no default application code, but comes with standard best practices, including a health check.

Capabilities are provided through dependencies in the `pom.xml` file. The ports are set to the defaults of `8080` for http and `8443` for https and are exposed to the CLI in the `cli-config.yml` file. The ports are set in the `pom.xml` file and exposed to the CLI in the `cli-config.yml` file.

The application exposes the following endpoints:
* Health endpoint: `<host>:<port>/health` e.g. http://localhost:8080/health
* Web content: `<host>:<port>`

## Steps

You can [deploy this application to IBM Cloud](https://cloud.ibm.com/developer/appservice/starter-kits/java-spring-app) or [build it locally](#building-locally) by cloning this repo first. Once your app is live, you can access the `/health` endpoint to build out your cloud native application.

### Deploying to IBM Cloud

<p align="center">
    <a href="https://cloud.ibm.com/developer/appservice/starter-kits/java-spring-app">
    <img src="https://cloud.ibm.com/devops/setup/deploy/button_x2.png" alt="Deploy to IBM Cloud">
    </a>
</p>

Click **Deploy to IBM Cloud** to deploy this same application to IBM Cloud. This option creates a deployment pipeline, complete with a hosted GitLab project and a DevOps toolchain. You can deploy your app to Cloud Foundry, a Kubernetes cluster, or a Red Hat OpenShift cluster. OpenShift is available only through a standard cluster, which requires you to have a billable account.

[IBM Cloud DevOps](https://www.ibm.com/cloud/devops) services provides toolchains as a set of tool integrations that support development, deployment, and operations tasks inside IBM Cloud.

### Building Locally

To get started building this application locally, you can either run the application natively or use the [IBM Cloud Developer Tools](https://cloud.ibm.com/docs/cli?topic=cloud-cli-getting-started) for containerization and easy deployment to IBM Cloud.

#### Native Application Development

* [Maven](https://maven.apache.org/install.html)
* Java 8: Any compliant JVM should work.
  * [Java 8 JDK from Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
  * [Java 8 JDK from IBM (AIX, Linux, z/OS, IBM i)](http://www.ibm.com/developerworks/java/jdk/),
    or [Download a Liberty server package](https://developer.ibm.com/assets/wasdev/#filter/assetTypeFilters=PRODUCT)
    that contains the IBM JDK (Windows, Linux)

To build and run an application:

1. `mvn install`
2. `java -jar ./target/javaspringapp-1.0-SNAPSHOT.jar`

To run an application in Docker use the Docker file called `Dockerfile`. If you do not want to install Maven locally you can use `Dockerfile-tools` to build a container with Maven installed.

You can verify the state of your locally running application using the Selenium UI test script included in the `scripts` directory.

#### IBM Cloud Developer Tools

Install [IBM Cloud Developer Tools](https://cloud.ibm.com/docs/cli?topic=cloud-cli-getting-started) on your machine by running the following command:
```
curl -sL https://ibm.biz/idt-installer | bash
```

Create an application on IBM Cloud by running:

```bash
ibmcloud dev create
```

This will create and download a starter application with the necessary files needed for local development and deployment.

Your application will be compiled with Docker containers. To compile and run your app, run:

```bash
ibmcloud dev build
ibmcloud dev run
```

This will launch your application locally. When you are ready to deploy to IBM Cloud on Cloud Foundry or Kubernetes, run one of the following commands:

```bash
ibmcloud dev deploy -t buildpack // to Cloud Foundry
ibmcloud dev deploy -t container // to K8s cluster
```

You can build and debug your app locally with:

```bash
ibmcloud dev build --debug
ibmcloud dev debug
```

## Next Steps
* Learn more about augmenting your Java applications on IBM Cloud with the [Java Programming Guide](https://cloud.ibm.com/docs/java?topic=java-getting-started).
* Explore other [sample applications](https://cloud.ibm.com/developer/appservice/starter-kits) on IBM Cloud.

## Live Demo <a name="Live-Demo"></a>

You can find a running system to test at http://egreensapp.mybluemix.net/

## Authors <a name="Authors"></a>

We are proud to be a diverse team, we are all from different countries: Argentina, Uruguay, Peru, Mexico and Venezuela!

![Authors](https://imgur.com/8p3DiO5.png)

## License <a name="License"></a>

This sample application is licensed under the Apache License, Version 2. Separate third-party code objects invoked within this code pattern are licensed by their respective providers pursuant to their own separate licenses. Contributions are subject to the [Developer Certificate of Origin, Version 1.1](https://developercertificate.org/) and the [Apache License, Version 2](https://www.apache.org/licenses/LICENSE-2.0.txt).

[Apache License FAQ](https://www.apache.org/foundation/license-faq.html#WhatDoesItMEAN)
