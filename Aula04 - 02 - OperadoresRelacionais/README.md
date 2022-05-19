# Relational operator

>Java Relational Operators are a bunch of binary operators used to check for relations between two operands, including equality, greater than, less than, etc. They return a boolean result after the comparison and are extensively used in looping statements as well as conditional if-else statements and so on. The general format of representing relational operator is: 

<br>

```java
variable1 relation_operator variable2
```
<br>

>Operator 1: ‘Equal to’ operator (==)

This operator is used to check whether the two given operands are equal or not. The operator returns true if the operand at the left-hand side is equal to the right-hand side, else false. 

Syntax:

```java
var1 == var2
```

Example:

```java
public static void main(String[] args){
        // Initializing variables
        int var1 = 5, var2 = 10, var3 = 5;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 == var2: "
                           + (var1 == var2));
 
        // Comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var1 == var3: " + (var1 == var3));
    }
```
<br>

> Operator 2: ‘Not equal to’ Operator(!=)

This operator is used to check whether the two given operands are equal or not. It functions opposite to that of the equal-to-operator. It returns true if the operand at the left-hand side is not equal the right-hand side, else false. 

Syntax: 

```java
var1 != var2
```

Example:

```java
 public static void main(String[] args){
        // Initializing variables
        int var1 = 5, var2 = 10, var3 = 5;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 == var2: "
                           + (var1 != var2));
 
        // Comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var1 == var3: " + (var1 != var3));
    }
```
<br>

> Operator 3: ‘Greater than’ operator(>)

This checks whether the first operand is greater than the second operand or not. The operator returns true when the operand at the left-hand side is greater than the right-hand side. 

Syntax: 

```java
var1 > var2
```

Example:

```java
 public static void main(String[] args){
        // Initializing variables
        int var1 = 30, var2 = 20, var3 = 5;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 > var2: " + (var1 > var2));
 
        // Comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var3 > var1: " + (var3 >= var1));
    }
```

<br>

> Operator 4: ‘Less than’ Operator(<)

This checks whether the first operand is less than the second operand or not. The operator returns true when the operand at the left-hand side is less than the right-hand side. It functions opposite to that of the greater-than operator. 

Syntax: 

```java
var1 < var2
```

Example:

```java
public static void main(String[] args){
        // Initializing variables
        int var1 = 10, var2 = 20, var3 = 5;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 < var2: " + (var1 < var2));
 
        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 < var3: " + (var2 < var3));
    }
```
<br>

> Operator 5: Greater than or equal to (>=)

This checks whether the first operand is greater than or equal to the second operand or not. The operator returns true when the operand at the left-hand side is greater than or equal to the right-hand side. 

Syntax: 

```java
var1 >= vapre>
```

Example:

```java
public static void main(String[] args){
        // Initializing variables
        int var1 = 20, var2 = 20, var3 = 10;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 >= var2: "
                           + (var1 >= var2));
 
        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 >= var3: " + (var3 >= var1));
    }
```

<br>

> Operator 6: Less than or equal to (<=)

This checks whether the first operand is less than or equal to the second operand or not. The operator returns true when the operand at the left-hand side is less than or equal to the right-hand side. 

Syntax: 

```java
var1 <= var2
```

Example:

```java
public static void main(String[] args){
        // Initializing variables
        int var1 = 10, var2 = 10, var3 = 9;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 <= var2: "
                           + (var1 <= var2));
 
        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 <= var3: " + (var2 <= var3));
    }
```