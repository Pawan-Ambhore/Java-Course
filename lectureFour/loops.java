package lectureFour;

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        
        //Print all even numbers till n

        // for(int i = 1; i<= 10; i++){
        //   if(i % 2 == 0 ){
        //     System.out.println(i);
        //   }
        // }

        //
        // for(; ;) {
        //     System.out.println("Pawan");
        // }

        // Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
        // If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
        // If they enter 0 then stop.
        // If he/ she scores :
        // Marks >=90 -> print “This is Good”
        // 89 >= Marks >= 60 -> print “This is also Good”
        // 59 >= Marks >= 0 -> print “This is Good as well”
        // 	Because marks don’t matter but our effort does.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your input: ");
        // int input = sc.nextInt();

        // if(input == 1){
        //     System.out.println("Enter your marks");
        //     int Marks = sc.nextInt();

        //     do{
        //     System.out.println("This is good man!");

        //     if(Marks >= 90){
        //         System.out.println("This is Good");
        //         return;
        //     }else if(Marks >= 60 &&  Marks<= 80){
        //         System.out.print("This is also Good");
        //         return;
        //     }else{
        //         System.out.println("This is Good as well");
        //         return;
        //     }
        //     }while(Marks > 0);

        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = sc.nextInt();

        // int multiplier = 1;

        // for(int i = 1; i <= 10; i++){

           for(int multiplier = 1; multiplier<= 10; multiplier++){

               System.out.println(num * multiplier );
           }
        //   System.out.println();

        // }


    }
    
}
