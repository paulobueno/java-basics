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