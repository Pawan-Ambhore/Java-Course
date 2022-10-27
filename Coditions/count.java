package Coditions;

import javax.sound.sampled.SourceDataLine;

public class count {

    public static void main(String[] args) {
        
        
    int num = 12345446;

    int c = 4;

    int count = 0;

    while(num>0){
         
        int rem = num % 10;

        
        if(rem == c){
            count++;
        }
        
        num = num / 10;
    }

    System.out.println(count);
    }


    
}
