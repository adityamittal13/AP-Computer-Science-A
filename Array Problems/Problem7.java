import java.util.Scanner;
public class E7_7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to add to the reverse array?");
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Please enter a number.");
            arr[i] = scan.nextInt();
        }
        
        int[] reversearr = new int[n];
        for (int i = n-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}

