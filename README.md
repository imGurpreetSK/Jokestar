# Jokestar

In this project, the task was to create an app with multiple flavors that uses multiple libraries and Google Cloud Endpoints.
The finished app consists of four modules:

* A Java library that provides jokes
* A Google Cloud Endpoints (GCE) project that serves those jokes
* An Android Library containing an activity for displaying jokes
* An Android app that fetches jokes from the GCE module and passes them to the Android Library for display

# Images

## App flow:
![alt tag](https://raw.githubusercontent.com/GurpreetSK95/Jokestar/master/screenshots/flow.png)

<p align="center">
  <img src="/screenshots/device-2016-10-27-223257.png" width="250"/>
  <img src="/screenshots/device-2016-10-27-223420.png" width="250"/>
  <img src="/screenshots/device-2016-10-27-223323.png" width="250"/>
</p>

# What I learned
* Add free and paid flavors to an app, and set up your build to share code between them
* Factor reusable functionality into a Java library
* Factor reusable Android functionality into an Android library
* Configure a multi-project build to compile your libraries and app
* Use the Gradle App Engine plugin to deploy a backend
* Configure an integration test suite that runs against the local App Engine development server
