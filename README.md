# Words App

This project converts the Words Application to use Fragments instead of Activities to create a user Interface.

![Fragments and Adapters Screenshot ](https://user-images.githubusercontent.com/92341925/201746429-962bf305-4154-476b-acec-3b11ea0c1caf.png)
![nav_graph Screenshot](https://user-images.githubusercontent.com/92341925/201746439-e1bc65bc-fa12-4ba5-b06c-a72b645d6cb9.png)


# Introduction
Words app allows you to select a letter and use Intents to navigate to a Activity that
presents a number of words starting with that letter. Each word can be looked up via a web search.

Words app contains a scrollable list of 26 letters A to Z in a RecyclerView. The orientation
of the RecyclerView can be changed between a vertical list or a grid of items.

The app demonstrates the use of Intents in two ways:
* to navigate inside an app by specifying an explicit destination, and,
* allowing Android to service the Intent using the apps and resources present on the device.



Learning Objectives:
--------------

- How the fragment lifecycle differs from the activity lifecycle.
- How to convert an existing activity into a fragment.
- How to add destinations to a navigation graph, and pass data between fragments while using the Safe Args plugin.
- Fragment Lifecycle States
- Fragment Lifecycle Methods
- Implementing the Navigation Graph for virtual mapping of app's navigation
- Using NavHost to display destinations
- Using Navcontroller to control Navigation between destinations
- Use an explicit intent to navigate to a specific fragment.
- Use an implicit intent to navigate to content in another app.
- Add menu options to add buttons to the app bar.
- How to override lifecycle callback methods to perform operations at different times in the activity lifecycle.


Skills displayed in project:
---------------

    * Using Adapters 
    * Importing libraries
    * Project-level build.gradle Dependency modification
    * App-level build.gradle Dependency and plugin modification
    * Creating Layouts and callbacks
    * Creating Resource files 
    * Working with collections
    * Calling and importing methods
    * Using conditional statements
    * Using Fragments and Destinations
    * Using logs in log cat
