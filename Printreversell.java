import java.util.LinkedList;

public class Printreversell {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        list.add("Durga");
        list.add("Devi");
        list.add("Goki");
        list.add("Raju");

        System.out.println("Original list : " + list);
        System.out.print("Reversed List : ");

        for(int i = list.size()-1 ; i>=0 ; i--){
            System.out.print(list.get(i) + "  ");
        }
    }
    
}
