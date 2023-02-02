How to run:
```
   mvn clean install
   java --module-path "./app/target/app-1.0.jar;./api/target/api-1.0.jar;<MODULES TO INCLUDE ; SEPARATED>>" --module app/rnd.serverless.Handler
   
   // Factorial, Fibonacci, RSA
   java --module-path "./app/target/app-1.0.jar;./api/target/api-1.0.jar;./factorial/target/factorial-1.0.jar;./fibonacci/target/fibonacci-1.0.jar;./rsa/target/rsa-1.0.jar" --module app/rnd.serverless.Handler
```
