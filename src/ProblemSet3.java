/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        //ps.sign();          // executes Exercise 1
        //ps.parity();        // executes Exercise 2
        //ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      Scanner in = new Scanner(System.in);
      System.out.print("\nEnter an integer: ");
      int userInteger = in.nextInt();
      in.nextLine();

      if (userInteger > 0) {
        System.out.println("\nPositive.");
      } else if (userInteger < 0) {
        System.out.println("\nNegative.");
      } else {
        System.out.println("\nZero.");
      }

      in.close();
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      Scanner in = new Scanner(System.in);
      System.out.print("\nEnter an integer: ");
      int userInteger = in.nextInt();
      in.nextLine();

      if (userInteger % 2 == 1) {
        System.out.println("\nOdd.");
      } else if (userInteger % 2 == 0 || userInteger == 0) {
        System.out.println("\nEven.");
      } else {
        System.out.println("\nError.");
      }

      in.close();
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      Scanner in = new Scanner(System.in);
      System.out.println("\nEnter three integers.");
      System.out.print("\nEnter an integer: ");
      int firstInt = in.nextInt();
      System.out.print("Enter an integer: ");
      int secondInt = in.nextInt();
      System.out.print("Enter an integer: ");
      int thirdInt = in.nextInt();
      in.nextLine();

      if (firstInt < secondInt && secondInt < thirdInt) {
        System.out.println("\nStrictly increasing.");
      } else if (firstInt <= secondInt && secondInt <= thirdInt) {
        System.out.println("\nIncreasing.");
      } else if (firstInt > secondInt && secondInt > thirdInt) {
        System.out.println("\nStrictly decreasing.");
      } else if (firstInt >= secondInt && secondInt >= thirdInt) {
        System.out.println("\nDecreasing.");
      } else {
        System.out.println("\nUnordered.");
      }

      in.close();
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
      Scanner in = new Scanner(System.in);

      final double A_VALUE = 4.00;
      final double B_VALUE = 3.00;
      final double C_VALUE = 2.00;
      final double D_VALUE = 1.00;
      final double F_VALUE = 0.00;
      final double PLUS_VALUE = 0.33;
      final double MINUS_VALUE = -0.33;
      
      System.out.print("\nEnter a letter grade: ");
      String userGrade = in.next().toUpperCase();
      String gradeSign = "";
      if (userGrade.length() > 1) {
        gradeSign = userGrade.substring(1);
        userGrade = userGrade.substring(0, 1);
      }

      double userGPA = 0;

      if (userGrade.equals("A")) {
        userGPA = A_VALUE;
      } else if (userGrade.equals("B")) {
        userGPA = B_VALUE;
      } else if (userGrade.equals("C")) {
        userGPA = C_VALUE;
      } else if (userGrade.equals("D")) {
        userGPA = D_VALUE;
      } else if (userGrade.equals("F")) {
        userGPA = F_VALUE;
      }

      if (gradeSign.equals("+") && !(userGrade.equals("A") || userGrade.equals("F"))) {
        userGPA += PLUS_VALUE;
      } else if (gradeSign.equals("-") && !userGrade.equals("F")) {
        userGPA += MINUS_VALUE;
      } 
      
      if ((gradeSign.equals("-") || gradeSign.equals("+")) && userGrade.equals("F")) {
        System.out.print("That's not a valid letter grade.");
      } else {
        System.out.printf("Your GPA is %.2f.", userGPA);
      }

      in.close();
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
