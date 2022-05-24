# Assignment Operator  ( = )
 Assignment operator is used to assign a value to any variable. It has a right to left associativity, i.e. value given on the right-hand side of the operator is assigned to the variable on the left, and therefore right-hand side value must be declared before using it or should be a constant.

The general format of the assignment operator is:

```java
variable = value;
```
<br>

## Types of Assignment Operators in Java

The Assignment Operator is generally of two types. They are:

1. Simple Assignment Operator: The Simple Assignment Operator is used with the “=” sign where the left side consists of the operand and the right side consists of a value. The value of the right side must be of the same data type that has been defined on the left side.

1. Compound Assignment Operator: The Compound Operator is used where +,-,*, and / is used along with the = operator.

<br>
<br>

> In many cases, the assignment operator can be combined with other operators to build a shorter version of the statement called a Compound Statement. For example, instead of a = a+5, we can write a += 5. 

1. += : for adding left operand with right operand and then assigning it to the variable on the left.

```java
a += 10  //a = a + 10
```

   
2. -= : for subtracting right operand from left operand and then assigning it to the variable on the left.

```java
a -= 10  //a = a - 10
```

3. *= : for multiplying left operand with right operand and then assigning it to the variable on the left.

```java
a *= 10  //a = a * 10
```

4. /= : for dividing left operand by right operand and then assigning it to the variable on the left.

```java
a /= 10  //a = a / 10
``` 

5. %= : for assigning modulo of left operand by right operand and then assigning it to the variable on the left.

```java
a %= 10  //a = a % 10
```

#### Tip :

>  == to compare equality (= it's to assing, == it's to compare);

<br>

```java
ageA = 10;
ageB = 10;
		
result = ageA == ageB;

```