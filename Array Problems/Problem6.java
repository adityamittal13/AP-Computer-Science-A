import java.util.Scanner;
public class E7_6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to add to the alternate sum?");
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Please enter a number.");
            arr[i] = scan.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                sum += arr[i];
            } else {
                sum -= arr[i];
            }
        }
        
        System.out.println(sum);
    }
}

