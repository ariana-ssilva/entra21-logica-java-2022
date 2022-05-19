# Variables and Datatypes in Java

# Variables

> Variable in Java is a data container that saves the data values during Java program execution. Every variable is assigned a data type that designates the type and quantity of value it can hold. Variable is a memory location name of the data.
A variable is a name given to a memory location. It is the basic unit of storage in a program.

- The value stored in a variable can be changed during program execution;
- A variable is only a name given to a memory location, all the operations done on the variable effects that memory location;
- In Java, all the variables must be declared before use. 


## How to declare variables ?

First, it' important to pay attention on some rules :

- It can contain letters, numbers, and the underscore character (_), but cannot begin with a number;
- Must be declared in lowercase. If they are compound names, the first letter of all words, except the first, must be capitalized (Camel Case);
- Java is a case sensitive language. So numberOne is different from numberone.

## How to initialize variables?
 It can be perceived with the help of 3 components that are as follows:It can be perceived with the help of 3 components that are as follows:

 - datatype: Type of data that can be stored in this variable.
 - variable_name: Name given to the variable.
 - value: It is the initial value stored in the variable.

<br>

<center>

![Multidimensional Array Example](/gif_img/datatype.png)

</center>

```java
// Declaring float variable
float simpleInterest; 

// Declaring and Initializing integer variable
int time = 10, speed = 20; 

// Declaring and Initializing character variable
char var = 'h'; 
```
<br>

# DataTypes

>Data types are different sizes and values that can be stored in the variable that is made as per convenience and circumstances to cover up all test cases.

<br> 

### Types Of Primitive Data Types

Primitive data are only single values and have no special capabilities. There are 8 primitive data types. 


| Type   |Defaut         | Size    | Range of Values                                  |
| :----: |:-------------:|:-------:| :----------------------------------------------: |
| byte   | 0             | 8 bits  | -128 to 127                                      |
| short  | 0             | 16 bits |-32.768 to 32.767                                 |   
| int    | 0             | 32 bits |-2147483648 to 2147483647                         |
| long   | 0             | 64 bits |-922337203685477808 to 922337203685477807         | 
| char   | \u0000        | 16 bits |character representation of ASCII values 0 to 255 | 
| float  | 0.0           | 32 bits | up to 7 decimal digits                           |    
| double | 0.0           | 64 bits | up to 16 decimal digits                          | 
| boolean| true or false | 1 bit   |true, false                                       |


