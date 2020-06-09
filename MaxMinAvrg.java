
 
package maxminavrg;
import java.util.Scanner;
public class MaxMinAvrg {

    
    


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE,sum = 0;
        double avg;
        int i = 0;
        System.out.println("Enter 10 integers between 1 and 100, I will tell you the smallest, the largest and the average:");
        while (true){
            n=sc.nextInt();
            if(n<0 || n>100){
                System.out.println("Invalid input");
                continue;
            }
            i++;
             if(min>n){
                min = n;
            }
            if(max<n){
                max = n;
            }
            sum += n;
            if(i == 10){
                break;
            }
        }
        avg = sum / 10.0;
        System.out.printf("Smallest = %d\nLargest = %d\nAverage = %.2f\n\n",min,max,avg);

    }
    }
    
}
