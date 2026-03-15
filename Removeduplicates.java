import java.util.HashSet;
public class Removeduplicates{
    public static void main(String[] args) {

        int[] arr = {1,2,1,3,4,4,5,6,3,2,1};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }
    
        System.out.println(set);
    }
}