package framework;
import java.util.LinkedList;
import java.util.List;
public class ListInterface {
    public static void main (String [] args){
        List<String> listString = new LinkedList<String>();
        listString.add("1");
        listString.add("two");
        listString.add("three");
        listString.add("four");
        List<Integer> listint = new LinkedList<Integer>();
        listint.add(1);
        listint.add(2);
        listint.add(3);
        listint.add(5);
        listint.add(8);



        for(int i =0 ; i<listString.size();i++){
            System.out.println(listString.get(1));
        }
        for (int i =0 ; i<listint.size();i++){
            System.out.println(listint);
        }
    }
}