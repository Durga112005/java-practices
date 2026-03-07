/*Create a program that:
Takes student marks into ArrayList
If mark < 0 or > 100 → throw custom exception
Handle invalid index access
Display valid marks */

import java.util.*;

class InvalidMarkException extends Exception{
    public InvalidMarkException(String message){
        super(message);
    }
}

public class Ex3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter no.of Students marks :");
        int n = sc.nextInt();
        int count = 0;

        while(count<n){
            System.out.println("Enter Mark :");
            int mark = sc.nextInt();

            try{
                if(mark<0 || mark>100){
                    throw new InvalidMarkException("Enter the Correct Mark");
                }
                list.add(mark);
                count++;
            }
            catch(InvalidMarkException e){
                System.out.println(e.getMessage());
            }

            }
            System.out.println("Enter the index :");
            while(true){
              
                int index = sc.nextInt();
                if(index >=0 && index<list.size()){
                System.out.println("Mark at index "+index+ " is :" + list.get(index));
                break;
                }
                else{
                    System.out.println("Invalid index.Enter the correct index :");
                }
            }
            
        System.out.println("valid marks :");
        for(int mark : list){
            System.out.println(mark);
        }
        sc.close();
        }
    }
