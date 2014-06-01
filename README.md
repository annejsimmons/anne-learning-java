This repo is following my journey of ramping up onto a java project coming from a .Net world. Starting with the basic intelliJ project and then adding in all of the different elements.

Prerequisites

- Homebrew
<pre> <code>
> ruby -e "$(curl -fsSL https://raw.github.com/Homebrew/homebrew/go/install)"
</code> </pre>

- Gradle
<pre> <code>
> brew install gradle
</code> </pre>

- Java JDK
<pre> <code>
> brew install caskroom/cask/brew-cask
> brew cask install java

> /usr/libexec/java_home -V
> export JAVA_HOME=$(/usr/libexec/java_home)
> echo $JAVA_HOME
</code> </pre>

- IntelliJ


Download source code

From the command line:
To generate all the IntelliJ files needed:
<pre> <code>
> gradle idea
</code> </pre>

To compile and run tests
<pre>  <code>
> gradle build
</code> </pre>

To see which task are available
<pre>   <code>
> gradle tasks
</code> </pre>