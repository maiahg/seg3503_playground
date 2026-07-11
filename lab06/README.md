# SEG3503 Lab 06

| Outline   | Value                 |
| --------- | --------------------- |
| Course    | SEG 3503              |
| Date      | Summer 2026           |
| Name      | Mai Anh Hoang         |
| Professor | Dr. Mouhcine Guennoun |
| TA        | Mohamed Nefsi         |

output of `mvn --version`
![mvn --version](assets/mvn_version.png)

output of `mvn compile`
![mvn compile](assets/mvn_compile.png)

output of `mvn package -DskipTests`
![mvn package](assets/mvn_package.png)

## Running the application
output of `java -jar ./target/BookstoreApp-0.1.0.jar`
![java -jar ./target/BookstoreApp-0.1.0.jar](assets/run_app.png)

Application running on http://localhost:8080/
![Application running on http://localhost:8080/](assets/bookstore_app.png)

Application running on http://localhost:8080/admin
![Application running on http://localhost:8080/admin](assets/bookstore_admin.png)

Log into admin page
![Log into admin page](assets/bookstore_admin_login.png)

## Running the tests
output of `mvn test`
![mvn test](assets/mvn_test_1.png)

adding one addtional selenium webdriver test
![adding one addtional selenium webdriver test](assets/new_test.png)

output of `mvn test` after adding one addtional selenium webdriver test
![mvn test](assets/mvn_test_2.png)