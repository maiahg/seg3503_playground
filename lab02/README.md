# SEG3503 Lab 02

| Outline | Value |
| --- | --- |
| Course | SEG 3503 |
| Date | Summer 2026 |
| Name | Mai Anh Hoang |
| Professor | Dr. Mouhcine Guennoun |
| TA | Mohamed Nefsi |

## Exercice 1

| Cas de test | Résultats escomptés | Résultats actuels | Verdict |
| --- | --- | --- | --- |
| 1 | Accepted | All fields are valid, application is accepted. ![Valid registration form](assets/image1-1.png) ![Accepted registration result](assets/image1-2.png) | Success |
| 2 | Wrong UserName format | UserName has a special character (@) => Wrong UserName format error message is displayed. ![Wrong username format](assets/image2.png) | Success |
| 3 | Size of UserName must be between 6 and 12 | Size of UserName = 4 => Size of UserName must be between 6 and 12 error message is displayed. ![Username size validation](assets/image3.png) | Success |
| 4 | Wrong FirstName format | FirstName has numbers => Wrong FirstName format error message is displayed. ![Wrong first name format](assets/image4.png) | Success |
| 5 | Wrong LastName format | LastName has a special character (@) => Wrong LastName format error message is displayed. ![Wrong last name format](assets/image5.png) | Success |
| 6 | Wrong Email format | Email does not contain @ => Wrong Email format error message is displayed. ![Wrong email format](assets/image6.png) | Success |
| 7 | Age must be less than or equal to 64 | Age = 1000000 => Age must be less than or equal to 64 error message is displayed. ![Age maximum validation](assets/image7.png) | Success |
| 8 | Age must be greater than or equal to 18 | Age = -111 => Age must be greater than or equal to 18 error message is displayed. ![Age minimum validation](assets/image8.png) | Success |
| 9 | Age must be an integer | Age is a string => Failed to convert property value of type java.lang.String to required type java.lang.Integer for property age; nested exception is java.lang.NumberFormatException: For input string: "aaa". ![Age integer validation](assets/image9.png) | Success |
| 10 | Wrong Postal Code format | Postal Code does not follow the format A1A1A1 => Wrong Postal Code format error message is displayed. ![Wrong postal code format](assets/image10.png) | Success |

## Exercice 2
### Execution of the provided tests

First, I executed the tests provided in the project ecs to ensure that the tests can compile and execute successfully.

![Tests provided in the project ecs](assets/image11.png)

### Tests implementation

I implemented the 20 test cases provided at [`./ecs/test/DateTest.java`](./ecs/test/DateTest.java) .

The first 15 cases verify that the nextDate method returns the correct next day.  
The last 5 cases verify that invalid dates produce an IllegalArgumentException.

I then implemented the parameterized tests for valid dates at [`./ecs/test/DateNextDateOkTest.java`](./ecs/test/DateNextDateOkTest.java) . 

And the parameterized tests for exceptions at [`./ecs/test/DateNextDateExceptionTest.java`](./ecs/test/DateNextDateExceptionTest.java) .

These tests are executed successfully.

![Tests execution results](assets/image12.png)