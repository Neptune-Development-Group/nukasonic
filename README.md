# Nukasonic


## Building

To be able to build the project, you'll need to setup some things manually in your global gradle.properties


This is a global gradle.properties file, you'll need to find your .gradle folder, for Windows it's in your user directory by default (The folder before AppData)

If you don't already have a gradle.properties file there, then create one

You'll need a [personal access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) and your username for this next step

```properties
gpr.user = USERNAME
gpr.key = PERSONAL_ACCESS_TOKEN
```