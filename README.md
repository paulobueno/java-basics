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

