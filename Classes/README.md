Programming Questions and Exercises : Class II

Question 1

Consider the following definition of the class MyClass:

public class MyClass

{

   private static int count = 0;

   private int x;

 

   public MyClass(int i)

   {

      x = i;

   }

   public void incrementCount()

   {

      count++;     

   }

 

   public void printX()

   {

      System.out.println("Value of x : "  + x);

   }

 

   public static void printCount()

   {

      System.out.println("Value of count : "  + count);

   }

}

 

public class MyClassDemo

{

   public static void main(String[] args)

   {

        MyClass myObject1 = new MyClass(5);

        MyClass myObject2 = new MyClass(7);       

   }

}

What is the output of the following Java code? (Assume that following statements are written inside main)

myObject1.printX();

myObject1.incrementCount();

MyClass.incrementCount();

myObject1.printCount();

myObject2.printCount();

myObject2.printX();

myObject1.setX(14);

myObject1.incrementCount();

myObject1.printX();

myObject1.printCount();

myObject2.printCount();

 

Question 2

Write a Java class Clock for dealing with the day time represented by hours, minutes, and seconds. Your class must have the following features:

·        Three instance variables for the hours (range 0 - 23), minutes (range 0 - 59), and seconds (range 0 - 59).

·        Three constructors:

o   default (with no parameters passed; is should initialize the represented time to 12:0:0)

o   a constructor with three parameters: hours, minutes, and seconds.

o   a constructor with one parameter: the value of time in seconds since midnight (it should be converted into the time value in hours, minutes, and seconds)

·        Instance methods:

o   a set-method method setClock() with one parameter seconds since midnight (to be converted into the time value in hours, minutes, and seconds as above).

o   get-methods getHours(), getMinutes(), getSeconds() with no parameters that return the corresponding values.

o   set-methods setHours(), setMinutes(), setSeconds() with one parameter each that set up the corresponding instance variables.

o   method tick() with no parameters that increments the time stored in a Clock object by one second.

o   method addClock() accepting an object of type Clock as a parameter. The method should add the time represented by the parameter class to the time represented in the current class.

o   Add an instance method toString() with no parameters to your class. toString() must return a String representation of the Clock object in the form "(hh:mm:ss)", for example "(03:02:34)".

o   Add an instance method tickDown() which decrements the time stored in a Clock object by one second.

o   Add an instance method subtractClock() that takes one Clock parameter and returns the difference between the time represented in the current Clock object and the one represented by the Clock parameter. Difference of time should be returned as an clock object.

Write a separate class ClockDemo with a main() method. The program should:

·        Instantiate a Clock object firstClock using one integer seconds since midnight obtained from the keyboard.

·        Tick the clock ten times by applying its tick() method and print out the time after each tick.

·        Extend your code by appending to it instructions instantiating a Clock object  secondClock by using three integers (hours, minutes, seconds) read from the keyboard.

·        Then tick the clock ten times, printing the time after each tick.

·        Add the secondClock time in firstClock by calling method addClock.

·        Print both clock objects calling toString method

Create a reference thirdClock that should reference to object of difference of firstClock and secondClock by calling the method subtractClock().

 

Question 3

Write a Java class Complex for dealing with complex number. Your class must have the following features:

·        Instance variables:

o   realPart for the real part of type double

o   imaginaryPart for imaginary part of type double.

·        Constructor:

o   public Complex (): A default constructor, it should initialize the number to 0, 0)

o   public Complex (double realPart, double imaginaryPart): A constructor with parameters, it creates the complex object by setting the two fields to the passed values.

·        Instance methods:

o   public Complex add (Complex otherNumber): This method will find the sum of the current complex number and the passed complex number.  The methods returns a new Complex number which is the sum of the two.

o   public Complex subtract (Complex otherNumber): This method will find the difference of the current complex number and the passed complex number.  The methods returns a new Complex number which is the difference of the two.

o   public Complex multiply (Complex otherNumber): This method will find the product of the current complex number and the passed complex number.  The methods returns a new Complex number which is the product of the two.

o   public Complex divide (Complex otherNumber): This method will find the ... of the current complex number and the passed complex number.  The methods returns a new Complex number which is the ... of the two.

o   public void setRealPart (double realPart): Used to set the real part of this complex number.

o   public void setImaginaryPart (double realPart): Used to set the imaginary part of this complex number.

o   public double getRealPart(): This method returns the real part of the complex number

o   public double getImaginaryPart(): This method returns the imaginary part of the complex number

o   public String toString(): This method allows the complex number to be easily printed out to the screen.

Write a separate class ComplexDemo with a main() method and test the Complex class methods.

 

Question 4

Write a Java class Author with following features:

·        Instance variables:

o   firstName for the author’s first name of type String.

o   lastName for the author’s last name of type String.

·        Constructor:

o   public Author (String firstName, String lastName): A constructor with parameters, it creates the Author object by setting the two fields to the passed values.

·        Instance methods:

o   public void setFirstName (String firstName): Used to set the first name of author.

o   public void setLastName (String lastName): Used to set the last name of author.

o   public string getFirstName(): This method returns the first name of the author.

o   public string getLastName(): This method returns the last name of the author.

o   public String toString(): This method printed out author’s name to the screen.

Write a Java class Book with following features:

·        Instance variables:

o   title for the title of book of type String.

o   author for the author’s name of type String.

o   price for the book price of type double.

·        Constructor:

o   public Book (String title, String name, double price): A constructor with parameters, it creates the Author object by setting the fields to the passed values.

·        Instance methods:

o   public void setTitle(String title): Used to set the title of book.

o   public void setAuthor(String author): Used to set the name of author of book.

o   public void setPrice(double price): Used to set the price of book.

o   public double getTitle(): This method returns the title of book.

o   public double getAuthor(): This method returns the author’s name of book.

o   public String toString(): This method printed out book’s details to the screen.

Write a separate class BookDemo with a main() method creates a Book titled “Developing Java Software” with authors Russel Winderand price 79.75. Prints the Book’s string representation to standard output (using System.out.println).
