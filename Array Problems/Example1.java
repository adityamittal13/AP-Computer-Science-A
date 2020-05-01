import java.util.*;
public class E7_1{
	public static void main(String[] args){
    	Random rand = new Random();
    	int[] arr = new int[10];
    	for (int i = 0; i < 10; i++){
        	int a = rand.nextInt(1000000) - rand.nextInt(1000000);
        	arr[i] = a;
	}
    
	System.out.println("Elements at an even index: " + arr[0] + " " + arr[2] + " " + arr[4] + " " + arr[6] + " " + arr[8]);
    
	System.out.print("Even elements: ");
	for (int i = 0; i < 10; i++){
    	if (arr[i] % 2 == 0){
        	System.out.print(arr[i] + " ");
    	}
	}
    
	System.out.println();
    
	System.out.print("Reverse array: ");
	for (int i = 9; i >= 0; i--){
    	System.out.print(arr[i] + " ");
	}
    
	System.out.println();
    
	System.out.println("First element and last element: " + arr[0] + ", " + arr[9]);

}
}
