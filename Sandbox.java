/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/

public class Sandbox {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("\nHello, World" + " \nMohammad"+" and the rest of the world");
  
        System.out.println("\n Second statement");

   final double PI = 3.14;
   double radius = 3.5;
   double area;

   area = PI * radius *radius;


   System.out.println("The area of the circle is " + area);
   int currentyear = 2020;
   int yearOfBirth = 2001;
   
   int age = currentyear -yearOfBirth;

   System.out.println("My age is "+ age);
   }
}