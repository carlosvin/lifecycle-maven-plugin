# Custom Maven plugin example

Following [example](./example) demonstrates how to create a custom Maven plugin to override [default Maven build lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html).

Here I wrote an article explaining with other example how to create a custom maven plugin: https://carlosvin.github.io/posts/creating-custom-maven-plugin/


# Archetype 

You don't need to clone the repo, you can easily create a new Maven project using following archetype:

`mvn archetype:generate -DarchetypeGroupId=com.github.carlosvin.archetype -DartifactId=lifecycle-maven-plugin-archetype -DarchetypeVersion=0.6`