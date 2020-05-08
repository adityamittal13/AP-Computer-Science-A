import java.util.*;
public class P7_2{
    public static void main(String[] args){
      Random rand = new Random();
      
      int[] arr = new int[20];
      for (int i = 0; i < 20; i++){
          arr[i] = rand.nextInt(6)+1;
        }
        
      int count = 0;
      int max = 0;
      int maxbegindex = 0;
      int begindex = 0;
      for (int i = 1; i < 20; i++){
          if ((arr[i-1] == arr[i]) && (count == 0)){
              begindex = i-1;
              count += 2;
            } else if ((arr[i-1] == arr[i])){
                count++;
            } else {
                if (count > max){
                    max = count;
                    maxbegindex = begindex;
                    count = 0;
                }
            }
        }
    int endindex = begindex+max-1;
    for (int i = 0; i < 20; i++){
        if (i == endindex){
            System.out.print(") " + arr[i]);
        } else if ((i == begindex)){
            System.out.print("( " + arr[i]);
        } else {
            System.out.print(" " + arr[i] );
        }
    }
    
    
}
}
