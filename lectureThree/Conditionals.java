package lectureThree;

import java.util.Scanner;

public class Conditionals {
         public static void main(String[] args) {
            Calculator cal = new Calculator();

            cal.calCulate();
         }

    
}

class Calculator{
    
    // public static void calCulate() {

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your first number: ");
    //     int a = sc.nextInt();

    //     Scanner sc1 = new Scanner(System.in);
    //     System.out.println("Enter your second number: ");
    //     int b = sc1.nextInt();

    //     Scanner sc2 = new Scanner(System.in);
    //     System.out.println("Write the operation you want: \n 1.Multiplication \n 2.Division \n 3.Addition \n 4.Substarction ");
    //     int operation = sc2.nextInt();

    //     if(operation == 1){
    //         System.out.println("Multiplication" + "=" + a * b);
    //     }else if(operation == 2){
    //         System.out.println("Division" + "=" + a / b);
    //     }else if(operation == 3){
    //         System.out.println("Division" + "=" + a + b);
    //     }else{
    //         System.out.println("Substarction" + "=" + (a - b));
    //     }

    public static void calCulate() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your second number: ");
        int b = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Write the operation you want: \n 1.Multiplication \n 2.Division \n 3.Addition \n 4.Substarction ");
        int operation = sc2.nextInt();

        switch(operation){
            case 1:
            System.out.println("Multiplication" + "=" + a * b);
            break;
            case 2:
            System.out.println("Division" + "=" + a / b);
            break;
            case 3:
            System.out.println("Addition" + "=" + a + b);
            break;
            default:
            System.out.println("Substarction" + "=" + (a - b));
            break;

        }

    }
        
    }

// }