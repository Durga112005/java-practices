import java.util.HashSet;
public class IntersectionofArray {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4,2,1};
        int[] arr2 = {1,2,8,9,7,0};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        System.out.println(intersection);

    }
    
}
