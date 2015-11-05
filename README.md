# vertx-fileresolver-test-case
```
mvn package
java -jar target/vertx-file-test-0.0.1-SNAPSHOT.jar  
```

You'll then see:
```
java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:53)
	at java.lang.Thread.run(Thread.java:745)
Caused by: io.vertx.core.VertxException: java.io.FileNotFoundException: /Users/rworsnop/repositories/filetest/target/vertx-file-test-0.0.1-SNAPSHOT.jar!/lib/vertx-core-3.2.0-SNAPSHOT.jar (No such file or directory)
	at io.vertx.core.impl.FileResolver.unpackFromJarURL(FileResolver.java:194)
	at io.vertx.core.impl.FileResolver.resolveFile(FileResolver.java:118)
	at filetest.FileTest.main(FileTest.java:15)
	... 6 more
Caused by: java.io.FileNotFoundException: /Users/rworsnop/repositories/filetest/target/vertx-file-test-0.0.1-SNAPSHOT.jar!/lib/vertx-core-3.2.0-SNAPSHOT.jar (No such file or directory)
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:220)
	at java.util.zip.ZipFile.<init>(ZipFile.java:150)
	at java.util.zip.ZipFile.<init>(ZipFile.java:121)
	at io.vertx.core.impl.FileResolver.unpackFromJarURL(FileResolver.java:170)
	... 8 more
```
