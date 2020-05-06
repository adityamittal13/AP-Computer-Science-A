import java.util.*;
public class E7_8{
    public static void main(String[] args){
        Random rand = new Random();
        
        for (int j = 0; j < 10; j++){
        ArrayList<Integer> rperm = new ArrayList<Integer>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            num.add(i);
        }
        
        for (int i = 10; i >= 1; i--){
            int n = rand.nextInt(i);
            rperm.add(num.get(n));
            num.remove(n);
        }
        
        System.out.println("The permutation array is: " + rperm);
}
}
}
