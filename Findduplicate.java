import java.util.HashSet;
public class Findduplicate {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,9,9,1};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        System.out.print("Duplicate elements are :");
        System.out.println(duplicate);

    }
    
}
