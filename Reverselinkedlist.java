import java.util.LinkedList;

public class Reverselinkedlist {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        
        list.add("Durga");
        list.add("Devi");
        list.add("Ram");
        list.add("Raju");

        System.out.println("Original List : " + list);

        System.out.println("Reversed List : " +list.reversed());
    }
    
}
