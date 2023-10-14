### Running Locally
For development purposes it is convenient to be able to run the code locally,
without the need of a Spark cluster. This can be done with `sbt run`, just like
with any other regular application. The only requirement is that the `master`
property of Spark is set, as seen below:

```sbt run "-Dspark.master=local[*]"```

### Building JAR file for spark-submit
In order to run your Spark application on a Spark cluster, you need to build
a JAR file containing your code and any additional dependencies you might have.
To achieve this, we use the [sbt-assembly plugin](https://github.com/sbt/sbt-assembly):

```sbt assembly```

The JAR file can be found in the `target` directory.