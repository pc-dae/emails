# Email service POC

This is a proof of concept implementation of an email service that exposes a POST rest API method
to receive html/mustache template files via a json payload.

## Setup
```
git clone https://github.com/pc-dae/emails.git
cd emails
```

## Compile
To compile and build jar...
```
./mvnw clean package
```
## Build
To build docker image...
```
./build.sh --version <semver>
```
Note that at present this is hard coded to use paulcarltondae docker hub repositories.

## Deploy
Deployed to my Daemon MacBook by Gitops, see https://github.com/pc-dae-gitops/paul-mba.
