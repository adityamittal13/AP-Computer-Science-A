import java.util.*;
public class ArrayMethods{
    private int[] values;
    public ArrayMethods(int[] initialValues) {
        values = initialValues;
    }
    public void swapFirstandLast() {
        int x = values[0];
        values[0] = values[values.length-1]; values[values.length-1] = x;
    }
    public void shiftRight() {
        int last = values[values.length-1];
        for (int i=values.length-1; i>0; i--) {
            values[i] = values[i-1];
        }
        values[0] = last;
    }
    public void swapEven(){
        for (int i = 0; i < values.length; i++){
            if (values[i] % 2 == 0){
                  values[i] = 0;
                }
            }
        }
     public void chooseLargerNeighbor(){
         for (int i = 1; i < values.length-1; i++){
             if (values[i-1] > values[i+1]){
                 values[i] = values[i-1];
                } else {
                    values[i] = values[i+1];
                }
            }
        }
        
     public int[] removeElement(){
         if (values.length % 2 != 0){
             int arr[] = new int[values.length-1];
             int mid = (values.length-1)/2;
             int count = 0;
             for (int i = 0; i < values.length; i++){
                 if (i != mid){
                     arr[count] = values[i];
                     count++;
                    }
                }
                
          return arr;
            } else {
                int arr[] = new int[values.length-2];
                int mid1 = (values.length)/2;
                int mid2 = mid1 + 1;
                int count = 0;
                for (int i = 0; i < values.length; i++){
                    if (i!=mid1 && i!=mid2){
                        arr[count] = values[i];
                        count++;
                    }
                }
                
          return arr;
            }
        }
        
     public int[] evenToFront() {
         int arr[] = new int[values.length];
         int j = 0;
         for (int i=0; i<values.length; i++) {
             if (values[i] % 2 == 0) {
                 arr[j] = values[i];
                 j ++;
             }
         }
         for (int i=0; i<values.length; i++) {
             if (values[i] % 2 == 1) {
                 arr[j] = values[i];
                 j++;
                }
            }
         return arr;
        }
     public int secondLargest() {
         int f = Math.max(values[0], values[1]); int s = Math.min(values[0], values[1]);
         for (int i=2; i<values.length; i++) {
             if (values[i] > f) {
                 s = f; f = values[i];
             }
             else if (values[i] > s) {
                 s = values[i];
             }
             
         }
         return s;
     }
     public boolean sorted() {
         for (int i=1; i<values.length; i++) {
             if (values[i] < values[i-1])
                return false;
         }
         return true;
     }
     public boolean adjDupl() {
         for (int i=1; i<values.length; i++) {
             if (values[i] == values[i-1])
                return true;
         }
         return false;
     }
     public boolean dupl() {
         int[] arr = values;
         Arrays.sort(arr);
         for (int i=1; i<values.length; i++) {
             if (arr[i] == arr[i-1])
                return true;
         }
         return false;
     }
    public static void main(String[] args){
        
}
}
