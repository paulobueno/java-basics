## Modifiers
There are two different types of modifiers: `Access` and `Non-Access`  
Note: `void` is not a modifier but a return type
### Access Modifiers
`public`:   
`private`:   
`protected`:   
`default`:   
### Non-Access Modifiers
`static`:   
`final`:   
`volatile`: Ensure that a modification in a given variable is reflected in the memory that all threads can read, once each thread has its own cache and modifications might not be available to all others right after the modification is done  
`abstract`:   
`synchronized`:   
`transient`:   
`strictfp`:   

## Special Types
`var`: Used to avoid boilerplate annotations, such as the following:
```java
String myVar = "ABC";
```
is the same as 
```java
var myVar = "ABC";
```
It also checks method's output, to figure out what type should be returned.
```java
public int returnTen() {
    return 10;
}
```
referring in other part of the code, it would infer that `var` is `int` type
```java
var myValue = returnTen();
```
Important notes: (1) It works only in local variables, such as in methods, for loops, etc. Not in class member variables.

## Arguments Vs Parameters
Parameters: Named variables that are defined as part of a method/class
Arguments: The actual value passed to be attributed to the parameters of a method/class

## Pass By Value VS Pass By Reference
In methods, you have two types of ways to pass information into it so it can use the input value from the parameter (the argument).  
Java, differently from what most people think, is only `pass by value`.  
The reason is that even when an object is passed as argument, its address is copied and assigned to the method's parameter. Inside the method, you do can modify the referenced object but in fact it is using the stored address and not the actual instance object.
Example of languages that use `pass by reference` are `Python`, `C++` and `C#`.  

## Method Overloading
Inside a class, you can define many methods with equal name.
To that work, all must have different parameter combinations, such as quantity, order and type.
