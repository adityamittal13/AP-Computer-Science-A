import java.util.Scanner;
public class P7_5{
	public static void main(String[] args){
    	int[][] a = new int[9][10];
    	for (int i=0; i<6; i++) {
        	for (int j=0; j<10; j++) {
            	a[i][j] = 10;
        	}
    	}
    	for (int i=3; i<6; i++) {
        	for (int j=2; j<8; j++) {
            	a[i][j] = 20;
        	}
    	}
    	a[6][2] = a[6][3] = a[6][6] = a[6][7] = a[7][1] = a[7][2] = a[7][7] = a[7][8] = a[8][0] = a[8][9] = 30;
    	a[6][4] = a[6][5] = a[7][3] = a[7][5] = a[8][1] = a[9][8] = 40;
    	a[7][4] = a[7][5] = 50;
    	for (int i=2; i<8; i++)
        	a[8][i] = 50;
   	 
   	 
    	Scanner scan = new Scanner(System.in);
   	 
    	System.out.println("Do you want to choose a seat or a price?");
    	String s = scan.nextLine();
    	if (s == "Seat" || s == "seat") {
       	 
        	while (true) {
        	System.out.println("What row?");
        	int r = scan.nextInt();
        	System.out.println("What column?");
        	int c = scan.nextInt();
            	if (a[r-1][c-1] == 0) {
                	System.out.println("That seat has been taken. Choose a different one.");
            	} else {
                	System.out.println("Congratulations. You bought it. It cost you " + a[r-1][c-1] + " dollars");
                	a[r-1][c-1] = 0;
                	break;
            	}
        	}
    	} else {
        	while (true) {
            	System.out.println("What price do you want?");
            	int p = scan.nextInt();
            	boolean found = false;
            	for (int i=0; i<9; i++) {
                	for (int j=0; j<10; j++) {
                    	if (a[i][j] == p) {
                        	found = true;
                        	break;
                    	}
                	}
            	}
            	if (found) {
                	System.out.println("Congratulations. You bought it.");
		              break;
            	} else {
                	System.out.println("There is no available seat of that price at this time. Enter a new one.");
            	}
        	}
    	}
	}
}

