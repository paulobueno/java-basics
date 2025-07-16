# Java Knowledge Base
Repository to recap Java basics

## Data Types

### Primitive Vs Reference Types
Primitive types (e.g., int, bool), hold the actual value, while reference types hold the address og the object of interest.

### Primitive Types
There are eight primitive types  
```text
| Data Type |   Size  | Min Value | Max Value |
|-----------|---------|-----------|-----------|
| byte      | 1 bytes | -128      | 127       |
| int       | 2 bytes |    -      |    -      |
| short     | 4 bytes |    -      |    -      |
| long      | 8 bytes |    -      |    -      |
| float     | 4 bytes |    -      |    -      |
| double    | 8 bytes |    -      |    -      |
| char      | 2 bytes |    -      |    -      |
| boolean   | 1 bit   |    -      |    -      |
```
`float` and `double` types holds real numbers, with decimals, while other types of numbers are integers

### Numbers
By default, when assigning a number like 3.14, it will be read as double, even if the user assigns as another type, such as long
```java
// that's ok
double myVar = 3.14;
// IDE's will raise an error, once it is expecting a double
float myVar = 3.14; 
```
The reason is that you might be losing information, once double holds more bytes (total of 8) than float (total of 4).  
To explicitly attribute a float number, 'f' or 'F' should follow the given number
```java
float myVar = 3.14f;
float myVar2 = 3.14F;
```

## Operators
There are mainly 3 different types of operators.  
1. Arithmetic
2. Relational
3. Logical

### 1. Arithmetic Operators
Operators in java are mostly the same as Python (+, -, *, /, %)  
In Java, there is no `//` as in Python operator, once it already truncate values considering number's type, such as int.  
```python
a = 15 / 10 
# a = 1.5

b = 15 // 10
# b = 1
```
```java
int a = 15 / 10;
// a = 1
double b = 15.0 / 10.0;
// b = 1.5;
```
As default, numbers with decimals are considered double.
`%` is the modulus sign, so `10%15 = 10`  
In the operation `a + b = 10`, `a` and `b` are the ***operands*** while `+` is the ***operator***
Unlike Python, Java has the following operators: `++` and `--`, appended at the end of variables.  
This kind of operation is also called ***unary*** operator, once it only takes one ***operand***  
It is a shortcut for the operator `+=1` and `-=1`, e.g.:
```java
int a = 10;
a++;
// now a = 11
```
### 2. Relational Operators
Similar to Python, Java has the following operators: <, >, <=, >=, ==, !=  
When comparing two String values (or any other Reference Type), using `==` will compare their addresses and not their values  
So, to properly compare two Strings, you should use `.equals()` method to compare.  
```java
String fristString = new String("a");
String secondString = new String("a");
firstString.equals(secondString) // = true
firstString == secondString // = false
```
**if `new String()` is not used, both `firstString` and `secondString` would end up with the same address, due to String interning (optimization on compile time)*
Differently from Java, Python has a slightly different behaviour when doing String Interning, once it checks if there is any spaces or special characters before attributing the same address. There are other rules not worthy to detail here in this document.  

### 3. Logical Operators
```text
| Operator | Symbol |
|----------|--------|
| AND      | `&&`   |
| OR       | `||`   |
| NOT      | `!`    |
```
Some examples:
```java
boolean value1 = true;
boolean value2 = false;

System.out.println(value1 && value2); // false
System.out.println(value1 || value2); // true
System.out.println(!value1); // false
```

## Libraries

By default, `java.lang` is imported automatically. That is where classes like `String` live.  

## Control Statements
### Sequential (Sequence)
Like in C, that is an imperative programming language, it executes line-by-line.
### Selection (Decision)
Examples are `if`, `else`, `switch`
### Repetition (Loops)
Examples are `while`, `for`, `do-while`  
There are two types: (1) Counter-controlled (2) Sentinel-controlled

## Arrays
There are two types of arrays:
1. Array
2. ArrayList  

### Array
You have to declare the size of the array as the following:
```java
int[] myArray = new int[10];
```
To get a given element: `myArray[i]`  
To get its size: `myArray.lenght`

### ArrayList
Unlike `Array`, `ArrayList` can have its size changed.  
```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
```
You can find it in `java.util` library.  
To get its size, you can do `myArray.size()`  
It is an entity of type known as generic, which can only store reference variables.  
Just to remember, here are some examples of reference variables: `String`, `HashMap`, `Object`  
To overcome this limitation, there are Wrapper classes that literally wraps primitive variables,  
transforming it into a reference type variable.

## Wrapper classes
Wrapper classes are classes that wrap primitive type variables into reference type variables.  
They are useful to be able to use classes that only receive reference type variables, such as `ArrayList`  
The list of Wrapper classes are the following:  
`Byte`, `Short`, `Long`, `Integer`, `Float`, `Double`, `Character`, `Boolean`  
Taking advantage of a process called ***auto-unbox***, this type of class receives the primitive value and transforms it into the final value type.  
This process also deals with unboxing of variables, once you can cast an `Int` into `int`.

