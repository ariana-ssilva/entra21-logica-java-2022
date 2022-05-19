# Constants in Java

> A constant is a variable whose value cannot change once it has been assigned. Java doesn't have built-in support for constants, but the variable modifiers static and final can be used to effectively create one.
Constants can make your program more easily read and understood by others. In addition, a constant is cached by the JVM as well as your application, so using a constant can improve performance.

## Constant Modifiers

### Final Modifier

The final modifier means that the variable's value cannot change. Once the value is assigned, it cannot be reassigned. 

Primitive data types (i.e., int, short, long, byte, char, float, double, boolean) can be made immutable/unchangeable using the final modifier.

Together, these modifiers create a constant variable.

```java
static final int DAYS_IN_WEEK = 7;
```

>> Note that we declared DAYS_IN_WEEK in all caps once we added the final modifier. It's a long-standing practice among Java programmers to define constant variables in all caps, as well as to separate words with underscores.Java doesn't require this formatting but it makes it easier for anyone reading the code to immediately identify a constant. 