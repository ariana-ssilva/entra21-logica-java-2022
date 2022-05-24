# Switch case

> The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. 

<br>

<center>

![Flow Diagram of Switch-Case Statement ](/gif_img/switch-statement-flowchart-in-java.jpg)

</center>

<br>

```java
switch (expression){
  case value1:
    statement1;
    break;

  case value2:
    statement2;
    break;

  case valueN:
    statementN;
    break;

  default:
    statementDefault;
}
```

- The expression can be of type byte, short, int char, or an enumeration. 
- Beginning with JDK7, expression can also be of type String.
- Duplicate case values are not allowed.
- The default statement is optional.
- The break statement is used inside the switch to terminate a statement sequence.
- The break statement is optional. If omitted, execution will continue on into the next case.
  

##  Nested Switch Case statements

We can use a switch as part of the statement sequence of an outer switch. This is called a nested switch. Since a switch statement defines its own block, no conflicts arise between the case constants in the inner switch and those in the outer switch. 