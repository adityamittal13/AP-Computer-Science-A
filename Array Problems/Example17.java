import java.util.*;
public class E7_17{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Print the number of integers you want to display.");
       int n = scan.nextInt();
       
       int[] arr = new int[n];
       for (int i = 0; i < n;i++){
           System.out.println("Enter an integer");
           arr[i] = scan.nextInt();
        }
        
       int max = arr[0];
       for (int i = 1; i < n; i++){
           if (max < arr[i]){
               max = arr[i];
            }
        }
        
       double factor = (double) 40/max;
       
       for (int i = 0; i < n; i++){
           for (int j = 0; j < (int)(arr[i]*factor); j++){
               System.out.print("*");
            }
            System.out.println();
        }
}
}
