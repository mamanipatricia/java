# learning java from scratch

1. compile
`javac hello-world.java`
2. run
`java Hello`


- variables
- data types
1. primitive
    - Integer -> byte, short, int, long
        int -> 4 bytes -> 
        long -> 8 bytes ->
        short -> 2 bytes -> 
        byte -> 1 byte -> -2^7  to 2^7 - 1

    - Float -> double, float
        float -> 4 bytes
        double -> 8 bytes
    - Character
        char -> 2 bytes
        UNICODE
        char c = 'k' // char name = 'p'; // chars accept single quotes
    - Boolean
        boolean -> true or false
        boolean b = true;
        boolean b = false;
2. ?

--
## Type conversion and Casting
```
java

byte b = 127;
int a = 12;
b = a -> b = (byte)a; // casting
a = b; // conversion

float f = 5.6f;
int x = (int)f; // x = 5


```

- max number of a byte is 127;

- CASTING = explicit conversion
- CONVERSION = implicit conversion

## type promotions
```
byte a = 10;
byte b = 30;

int result = a * b;
System.out.println(result);

```

shorthand

```
int num1 = 7;
num1 += 1; OR num1++;

// what is the difference?
++num1; // pre increment
num++; // post increment

// this 2 operation will behave differently when you try to fetch a value

// example:
int result = num++; // fetch the value and then increment
int result = ++num; // increment and then fetch the value

System.out.println(result);

```
## Arithmetical operators
<, >, =,

==, !==, <=, >=

## Logical Operators
AND = &, OR = |, NOT = !

> | is called pipe

- short circuit
