## When method is called, what is pushed onto the top of the stack?
The answer is the activation record of the given method. It contains all necessary information to call a method, such as:  
- Method parameters
- Local variables
- Retrun address (where to go back when the method finishes)
# Why are wrapper classes needed when working with ArrayList in Java?
Collections only work with referenced type variables, once they are designed to manipulate and store objects and not primitive values.  
There are some benefits of using wrapped classes, such as it's methods, allow of `null` values and locking and syncronization.
# What are the three control statements in Java?
1. Sequential
2. Selection (Decision such as if-else)
3. Repetitio (Loops such as while)
# What does Java use for parameter passing in methods?
It only uses pass-by-value, once it copies the value fo the given variable (its value, if is a primitive variable, or its address, if it is a reference variable).  
If the value of the primitive variable is modified, it wont modify the value outside the method. On the other hand, modifying the value of a referenced variable will modify it's value, but not it's addres (such as in C# and C++).
# In Java, what is the maximum allowed number of dimensions for an array?
While the number of elementes in a single array is limited to the maximum number of an int (~2.1 billion), the maximum number of dimansions is 255 (limited by JVM defaults).  
Example of 3 dimension array:  
```
[
    [1, 2, 3]
    [2, 3, 4]
    [6, 7, 8]
]
```
