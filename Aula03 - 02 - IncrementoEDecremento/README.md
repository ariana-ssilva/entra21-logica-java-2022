# Increment and Decrement Operators

An increment unary operator increases the value of the variable by one while the decrement unary operator decreases the value of the variable by one. The operand required should be a variable that is not constant. The increment and decrement unary operators have two forms, which are, prefix and postfix.

<br>

# Pre-Increment and Pre-Decrement Operators

In the prefix form, the increment and decrement unary operators appear before
the operand.While using the prefix form, we first update the value of the operand and then we use the new value in the expression.

## Pre-increment operator

When placed before the variable name, the operand’s value is incremented instantly.

Syntax: 

```java
++num
```

#### Example using the pre-increment :

```java
int add = 1;
++add; // add = 2
int number = ++add; // add = 3, number =3

```

## Pre-decrement operator

When placed before the variable name, the operand’s value is decremented instantly. 

Syntax: 

```java
--num
```


#### Example using the pre-decrement :

```java
int add = 2
-- add; // add = 2
int number = --add; // add = 0, number = 0;

```

# Post-Increment and Post-Decrement Operators

In the postfix form, the operator appears after the operand. While using the postfix form, we first use the value of the operand in the expression and then update it.

<br>

## Post-increment operator

When placed after the variable name, the value of the operand is incremented but the previous value is retained temporarily until the execution of this statement and it gets updated before the execution of the next statement. 

Syntax: 

```java
num++
```

#### Example using the post-increment

```java
int add = 1;
add++; // add = 2
int number = add++; // add = 3, number = 2
```

## Post-decrement operator

When placed after the variable name, the value of the operand is decremented but the previous values is retained temporarily until the execution of this statement and it gets updated before the execution of the next statement. 

Syntax: 
```java
num--
```

#### Example using the post-decrement:

```java
int add = 2;
add--; // add = 1
int number = add--; // add = 0, number= 1
```








