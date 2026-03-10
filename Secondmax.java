import java.util.*;
public class Secondmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Secondmax not possible");
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondmax = Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                secondmax = max; 
                max = arr[i];
            }else if(arr[i]<max && arr[i]>secondmax){
                secondmax = arr[i];
            }
        }

        if(secondmax == Integer.MIN_VALUE){
            System.out.println("secondmax not found");
        }else{
            System.out.println("secondmax found at" +secondmax);
        }
        
    }
    
}
