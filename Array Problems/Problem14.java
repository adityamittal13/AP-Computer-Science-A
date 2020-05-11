import java.util.Scanner;
public class P7_14{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
   	 
    	System.out.println("How many elements do you want for the array?");
    	int n = scan.nextInt();
   	 
    	double[] values = new double[n];
    	for (int i = 0; i < n; i++){
        	System.out.println("Enter an double.");
        	values[i] = scan.nextDouble();
    	}
    	final int valuesize = n;
   	 
    	double oldvar = 0;
    	for (int i = 0; i < valuesize; i++){
        	double temp = values[i];
        	if (i == 0){
            	values[0] = values[1];
        	} else if (i == n-1){
            	values[n-1] = values[n-2];
        	} else {
            	values[i] = (double)(oldvar+values[i+1])/2;
        	}
        	oldvar = temp;
    	}
   	 
    	for (int i = 0;i < valuesize; i++){
        	System.out.print(values[i] + " ");
    	}
	}
}
            	

