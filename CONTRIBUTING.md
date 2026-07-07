# Contribution Guidelines

## How to contribute

**DO NOT IMPORT THIS REPO INTO YOUR IDE BEFORE THE GUIDE TELLS YOU TO!!!**

* Prepare your machine for developing with OpenCL if you haven't done that
* Fork this repo (branch `main`)
* Clone [my Cleanroom fork unless this gets merged](https://github.com/Kuba663/Cleanroom) (branch `feature/physics`)
* Set your fork as the submodule in `.gitmodules`
* ```
  git submodule init
  git submodule update
  ```
* Proceed as you would normally do with Cleanroom

## Style guidelines

* As with Kirino but I will permit no-bracket ifs.
* Try to not use Java streams.
* If your line is too long, split it.
* Use enum singletons
* If there is a snippet in your code that repeats multiple times, split it into a separate function.
* Do not invoke OpenCL outside the OpenCL zone.
* If it means reducing repeatable code, use generics.
