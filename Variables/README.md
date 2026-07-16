# INTRO TO VARIABLES
Variables are used to store info (Kind of like memory)  
To specify the type of info, we use **Primitive data types** (Java's most basic data types)

-> Int, Double, Boolean,   
NOT A PRIMITIVE DATA TYPE!! - (String (For phrases and words))  
**EX**  
> int yearCodeAcademyWasFounded = 2011;  
INTS - STORES A WHOLE NUMBER  
to use - put int before the variable name as seen above  

##### *Also, remember to print out the variable value:   
##### "_System.out.println(yearCodeAcademyWasFounded);_"
---
## DOUBLES.  
- Doubles hold **decimals** as well as **very small and large numbers**  
(Mostly used to store prices)  
**EX**  
>  public class MarketShare {  
>  public static void main(String[] args){  
>  double androidShare = 81.7;      - _Defining Variable_  
>  System.out.println(androidShare);  

>  }    
>  }  

---
## BOOLEANS.  
- Booleans are used to determine **TRUE** or **FALSE**  
**EX**  
>public class Booleans {  
>public static void main(String[] args){  
>boolean intsCanHoldDecimals = false;  
System.out.println(intsCanHoldDecimals);    
}   
}  

This will return FALSE  
---
## CHAR.  
- This can hold any **character** like a letter, space, or punctuation mark  
##### **Must be surrounded by single quotes  

**EX**
> char grade = 'A';  
> char firstLetter = 'P';  
> char punctuation = '!';
---   
## STRING.  
- Strings are **objects** that hold sequences of characters.  
A String literal is any sequence of characters enclosed in double-quotes (""). Like primitive-type variables, we declare a String variable by specifying the type first.  

There are two ways to create a String object: using a String literal or calling the String class to create a new String object.  



**EX of String literal**  
> String greeting = "Hello World!";  

**EX of String object**  
> String salutations = new String("Hello World");  

---
### STATIC CHECKING  
- Static typing in Java means every variable has a fixed, declared type, and the compiler checks that the assigned value matches that type.  
- If the types don’t match—like assigning a String to an int—Java refuses to compile the program and reports a type error. Catching these mistakes early prevents runtime errors, which can crash the program.   

- static typing makes Java code safer and helps programmers avoid bugs before the program even runs.
---
### NAMING  
- Naming _variables_ according to convention leads to clear, readable, and maintainable code. When someone else, or our future self, reads the code, there is no confusion about the purpose of a variable.


---
## REVIEW!!  
 creating and filling variables are powerful concept that allows us to keep track of all kinds of data in our program.  

Java’s most basic data types are known as primitive data types and are in the system by default.  

**We covered:**  

_int_, which stores whole numbers.  

_double_, which stores bigger whole numbers and decimal numbers.  

_boolean_, which stores true and false.  

_char_, which stores single characters using single quotes.  

_String_, which stores multiple characters using double quotes.  

Static typing, which is one of the safety features of Java.  

Variable naming conventions.

---
# MANIPULATING VARIABLES  
- Java has built-in arithmetic operations that perform calculations on numeric values. The data type of a variable plays a large role in the operations we can use to manipulate it. We can think of a data type as a combination of a set of values, and a set of operations on those values.  

** remember - The data type of an expression is determined by the resulting value. For example, an expression that uses two int values will evaluate to an int value. If an expression contains a double value, then the resulting value will also be type double.  

## ADDITION AND SUBTRACTION  
there is a **(-)** operater for _subtraction_ and a **(+)** operater for _addition_

-> When we append ++ to a number-based variable, it increases the value by 1. We also have the decrement operator, --, which decreases the value by 1  

**EX**   

In our bank account example from the last exercise, we used the + operator to add the values balance and depositAmount:  

_double balance = 20000.99;_  
_double depositAmount = 1000.0;_  
_balance = balance + depositAmount;_  
_// balance now holds 21000.99_

- If we wanted to withdraw from the balance, we would use the - operator: 

_double withdrawAmount = 500;_  
_balance = balance - withdrawAmount;_  
_// balance now holds 20500.99_  

## MULTIPLICATION AND DIVISION  

there is a **(/)** operater for _division_ and a **(*)** operater for _multiplication_
  
** remember - Division has different results with integers. The / operator does **integer division**, which means that any remainder is lost.  

**EX**  

_int evenlyDivided = 10 / 5;_  
_//evenlyDivided holds 2, because 10 divided by 5 is 2_  
_int unevenlyDivided = 10 / 4;_   
_//unevenlyDivided holds 2, because 10 divided by 4 is 2.5_

  
- evenlyDivided stores what you expect, but unevenlyDivided holds 2 because ints cannot store decimals! It’s important to note that the int doesn’t round the decimal, but floors it. Java removes the 0.5 to fit the result into an int type!  

It’s important to note that if we try to divide any number by 0, we will get an 
**ArithmeticException** (which occurs when an arithmetic operation yields an error).

---  
## MODULO  
The modulo operator **%**, gives us the remainder after two numbers are divided.
  
**EX**    
Imagine we need to know whether a number is even or odd. An even number is divisible by 2.  

Modulo can help! Dividing an even number by 2 will have a remainder of 0. Dividing an odd number by 2 will have a remainder of 1.

_public class Modulo {_  
	_public static void main(String[] args){_    
_7 % 2_  
_// 1, odd!_  
_8 % 2_  
_// 0, even!_  
_9 % 2_  
_// 1, odd!_  
   _}_  
_}_

## COMPOUND ASSIGNMENT OPERATORS  
- Compound assignment operators perform an arithmetic operation on a variable and then reassigns its value.  

**EX**  
_int numCupcakes = 12;_    
_numCupcakes = numCupcakes + 8; // Value is now 20_ 

- While this method works just fine, we had to write our variable numCupcakes twice. We can shorten this syntax by using a compound assignment operator.  

_numCupcakes += 8; // Value is now 20_  

**REVIEW:**  
Addition (+=) 
Subtraction (-=)  
Multiplication (*=)  
Division (/=)  
Modulo (%=)  

---  
## ORDER OF OPERATIONS  
- The order of operations dictates the order in which an expression (like the preceding one) is evaluated.  

_The order is as follows:_   

1.Parentheses   
2.Exponents    
3.Modulo/Multiplication/Division    
4.Addition/Subtraction  

**EX**  
_12 / (10 - 4) + 4 * 2_

- we would first look at (10-4) since it's in parenthesis so that would be 6.  
so it would be...  

_12 / 6 + 4 * 2_  

- we would go down the list and since there is no exponents, we must look at division.  
so it would be...  

_2 + 4 * 2_  

- Now we would look at the multiplication. so it would be...  

_2 + 8_ which equals... **10**.  

--- 
## GREATER THAN LESS THAN  
- Java has relational operators for numeric datatypes that make _boolean comparisons_. These include **less than (<)** and **greater than (>)**.  

**EX**  
_double myBalance = 200.05;_  
_double costOfBuyingNewLaptop = 1000.05;_  
_boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;_  
_//canBuyLaptop is false, since 200.05 is not more than 1000.05_  

 
## EQUALS AND NOT EQUALS  

- We can use another relational operator **==** to tell us if two variables are equal:  
**Notice the difference**: Notice that the equality check is two equal signs, instead of one. One equal sign, =, is how we assign values to variables!  

**EX**  
_double paycheckAmount = 620;_  
_double calculatedPaycheck = 15.50 * 40;_  
_System.out.print(paycheckAmount == calculatedPaycheck);_  
_// This will print true, since paycheckAmount equals calculatedPaycheck_  

## GREATER THAN EQUAL TO / LESS THAN EQUAL TO  

- Greater than or equal to, **>=**, or less than or equal to, **<=**.  
**EX**  
_double paycheckAmount = 620;_  
_double calculatedPaycheck = 15.50 * 40;_  
_System.out.println(paycheckAmount >= calculatedPaycheck);_  
_//this will print true, since paycheckAmount equals calculatedPaycheck_  

---  
## .EQUALS()  
When working with objects in Java—like Strings, you can’t use == to check if they’re equal the way you do with primitive types. Instead, you must use the **.equals()** method, which correctly compares the values stored in the objects. Using == sometimes appears to work, but only because of how Java stores objects in memory, so relying on it is unsafe.  
- It is good practice to always use .equals() when comparing objects.  

**EX**  
_String person1 = "Paul";_
_String person2 = "John";_
_String person3 = "Paul";_

_System.out.println(person1.equals(person2));_
_// Prints false, since "Paul" is not "John"_

_System.out.println(person1.equals(person3));_
_// Prints true, since "Paul" is "Paul"_  

---  

## STRING CONCATENATION  
- Let’s say we want to print out a variable, and we want to describe it as we print it out. There are 2 ways:  

**EX No. 1**  
The **+ operator**, which we used for adding numbers together, can be used to concatenate Strings. In other words, we can use it to join two Strings together!  

_String username = "PrinceNelson";_  
_System.out.println("Your username is: " + username);_  

**This code will print:**
**Your username is: PrinceNelson**  

**EX No. 2**  
We can even use a primitive datatype as the second variable to concatenate, and Java will intelligently make it a String first:  

_int balance = 10000;_  
_String message = "Your balance is: " + balance;_  
_System.out.println(message);_  

**This code will print:**  
**Your balance is: 10000**

--- 

## FINAL KEYWORD  
- What should we do with a variable that's value should not be altered?     
- To declare a variable with a value that cannot be manipulated, we need to use the final keyword. To use the final keyword, prepend final to a variable declaration like so:  
**EX**  
_final int yearBorn = 1968;_

#### When we declare a variable using final, the value cannot be changed; any attempts at doing so will cause an error to occur  

### ---  
## REVIEW  
### What we have done so far:  
- Addition and subtraction, using + and -
- Multiplication and division, using * and /
- The modulo operator for finding remainders, %
- Compound assignment operators +=, -=, *=, /=, and %=.
-The order of operations: parentheses -> exponents -> multiplication, division, modulo -> addition, subtraction
- Greater than, >, and less than, <
- Equal to, ==, and not equal to, !=
- Greater than or equal to, >=, and less than or equal to, <=
- equals() for comparing Strings and other objects
- Using + to concatenate Strings
- The final keyword which makes variables unchangeable  

### ---















