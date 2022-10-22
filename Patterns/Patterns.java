package Patterns;

public class Patterns {

    //1

 

    //     void printSquare(int n) {
    //         // code here
    //         for(int i = 0; i<n; i++){
    //             for(int j = 0; j<n; j++){
    //                  System.out.print("*"+" ");
    //             }
    //            System.out.println();
    //         }
            
    //     }


    //2
 
//     void printTriangle(int n) {
//         // code here
//         for(int i = 0;i < n; i++){
//             for(int j=0 ; j<=i; j++){
                
//                 System.out.print("*" + " ");
                
//             }
//             System.out.println();
//         }

// }

    //3

    // void printTriangle(int n) {
    //     // code here
        
    //     for(int i = 1; i<=n; i++){
            
    //         for(int j = 1; j<=i; j++){
    //             System.out.print(j + " ");
    //         }
            
            
    //         System.out.println();
    //     }
    // }

    //4

    // void printTriangle(int n) {
    //     // code here
    //     for(int i = n; i>=1; i--){
            
    //         for(int j=1; j<=i; j++){
                
    //             System.out.print("*" + " ");
    //         }
            
    //         System.out.println();
    //     }
    // }

    //6

    // void printTriangle(int n) {
    //     // code here
        
    //     for(int i =n; i>=1; i--){
            
    //         for(int j = 1; j<=i; j++){
    //             System.out.print(j+ " ");
    //         }
            
    //         System.out.println();
    //     }
    // }
    
    //7

    // void printTriangle(int n) {
    //     // code here
    //     for(int i = 0; i<n; i++){
            
    //         //For Spaces
    //         for(int j = 1; j<n-i; j++){
    //         System.out.print(" ");
    //         }
    //         for(int j = 0; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("*");
    //         }
            
            
    //         System.out.println();
    //     }
    // }

    //13

    void printTriangle(int n) {
        
        int num = 1;
        
        for(int i = 0; i<n; i++){
            
            for(int j=0; j<=i; j++){
                
                
                System.out.print(num + " ");
                
                num++;
            }
            
            System.out.println();
        }
        
    }

    
}
