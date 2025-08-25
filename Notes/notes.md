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

## Methods calls And Recursion
Methods can call other methods or itself. When calling itself, the operation is named `recursion`.  
To successfully create a `recursion`, it have to have at least one base case and one recursion.  
The `base case` is necessary so you don't end up with an infinite recursion calls.

## 2D, 3D, xD arrays
2D arrays are also named `matrix`, where you can store values for columns and rows in the same object (array inside another array).  
The generalization of `matrix` (2D or more dimensions), is named `tensor`.  
This name has influenced the name of `tensorflow`, a library that make `matrix` computation efficient.  

## Method Overloading and Method Signature
When creating method overload, you have to create diferent signatures with the same method's name. A method signature is compose by:
- Method's name
- Parameters types
- Parameters orders

## Constructors
As constructors doesn't return value, it doesn't allow any modifier, even `void`.  
### Calling Setters in constructors
In general, it doesn't use setters to set values when instantiating for these reasons:
- Performance: Direct assignment is faster that calling setters
- Simplicity and Clarity
- Avoid issues with inheritance (overwriting a method can lead to unexpected behaviours)
But if there are validation or data transformation, you might use setters in your constructor

## Usefull commands

Compile a .java file into .class
```bash
javac <FileName>.java
```

Execute the compiled file
```bash
java <FileName>
```
It doesn't nees the extension `.class` when executing it.  
Also, remove `package` definition from `.java` file, so you can execute it from the given folder.  

## Terms
Stale Data --> Diferent variables storing the same data in the same entity. Such as `area` while you have `length` and `width` in the same object. `area` can be calculated but if you have a variable called `area`, you should be very carefull to ensure that the data is consistent, such as `area` is always equals to `length` * `width`.  
