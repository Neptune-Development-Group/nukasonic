# Nukasonic


## Building

Run the datagen task before doing anything, and then you can either build or run client after that

If for some reason you can't get neptunelib, go [here](https://jitpack.io/#Neptune-Development-Group/neptunelib) and make sure to press GET IT on the latest release, that should build the latest release on jitpack, which is a fallback for builds.

Any actual members of Neptune Development must go through the other method.

To be able to build the project, you'll need to set up some things manually in your global gradle.properties

## Building for Contributors

This is a global gradle.properties file, you'll need to find your .gradle folder, for Windows it's in your user directory by default (The folder before AppData)

If you don't already have a gradle.properties file there, then create one

You'll need a [personal access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) and your username for this next step

```properties
gpr.user = USERNAME
gpr.key = PERSONAL_ACCESS_TOKEN
```

Just make sure reload your gradle after that

This isn't really required, but if some reason you need to test an experimental version of neptunelib, this is the fastest way to test it.