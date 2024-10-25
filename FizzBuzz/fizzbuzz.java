package FizzBuzz;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        //Initiate Scanner & print instructions to collect the user's input//
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you would like to see FizzBuzz: ");
        int n = sc.nextInt();
        //Begin printing the output//
        System.out.println("The FuzzBuzz Answers are: ");
        //Loop conditional statements upto chosen number & print correct fizzBuzz statements//
        for (int i = 1; i <= n; i++){
            //Prints FizzBuzz if the number is divisible by 3 & 5//
            if (i%3==0 && i%5==0){
                System.out.print("FizzBuzz");
            }
            //Prints Fizz if the number is divisible by 3//
            else if (i%3==0){
                System.out.print("Fizz");
            }
            //Prints Buzz if the number is divisible by 5//
            else if (i%5==0){
                System.out.print("Buzz");
            }
            //Prints the number if the number is not divisible by 3 or 5//
            else{
                System.out.print(i);
            }
            //Prints comma and space to format output//
            System.out.print(", ");
        }
    }
}