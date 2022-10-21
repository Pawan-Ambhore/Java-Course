package lectureOneandTwo;
import java.util.Scanner;

public class Basic{

    public static void main(String[] args) {

        Hello hi = new Hello();
        String greeting = "Hello";
        hi.Greet(greeting);

        // Area ar = new Area();
        // ar.areaOfCircle();
        

    }
}


//Print Hello World with java
class Hello{

    public static void Greet(String greeting) {

        System.out.println(greeting);
        
    }
        
}

//Calculate area of Circle

// class Area{
//     public static int areaOfCircle() {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Write the radious of circle: ");

//         int radios = sc.nextInt();

//         int area = radios * radios;

//         System.out.println(area);

//         return area;
        
//     }
// }

