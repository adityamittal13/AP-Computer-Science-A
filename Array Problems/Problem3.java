import java.util.Scanner;
public class P7_3{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
   	 
    	System.out.println("Please enter the number of stalls");
    	int n = scan.nextInt();
   	 
    	boolean[] o = new boolean[n];
    	for (int i = 0; i < n; i++){
        	o[i] = false;
    	}
   	 
    	for (int i=0; i<n; i++) {
        	for (int j=0; j<n; j++) {
            	if (o[j]) {
                	System.out.print("X ");
            	} else {
                	System.out.print("_ ");
            	}
        	}
        	System.out.println();
        	int max = 0; int curr = 0;
        	int f = 0; int maxf = 0;
        	for (int j=0; j<n; j++) {
            	if (o[j]) {
                	curr = 0;
                	f = j+1;
            	} else {
                	curr ++;
                	if (curr > max) {
                    	maxf = f;
                	}
                	max = Math.max(max, curr);

            	}
        	}
        	o[max/2 + maxf] = true;
        	System.out.println(max + " " + maxf);
    	}
    	for (int i=0; i<n; i++) {
        	if (o[i]) {
            	System.out.print("X ");
        	} else {
            	System.out.print("_ ");
        	}
    	}
   	 
	}
}
    	
