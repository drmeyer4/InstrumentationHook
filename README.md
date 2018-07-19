# InstrumentationHook
This repo creates a jar for getting the Instrumentation object out of the JVM at runtime.

I found out about the Instrumentation object from a StackOverflow post:

https://stackoverflow.com/questions/2681459/how-can-i-list-all-classes-loaded-in-a-specific-class-loader

INSTRUCTIONS:

After cloning, compile the class

<code>javac local/instruments/InstrumentationHook.java</code>

Then build the jar with the manifest

<code>jar cvmf manifest.txt InstrumentationLib.jar local/instruments/InstrumentationHook.class</code>

Finally, you will have to add the <code>-javaagent</code> flag when you run the project, specifying this jar:

<code>-javaagent:/path/to/this/lib/InstrumentationLib.jar</code>

If you are using and IDE, you will, in all likelihood, also have to reference the jar from inside the IDE.

I did not write this code. Credit goes to finnw, https://stackoverflow.com/users/12048/finnw
