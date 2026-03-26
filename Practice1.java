package Day_2;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map;
public class Practice1 {

    public static void main(String[] args){
        TreeMap<String, Long> contact=new TreeMap<>();

        String choice="Yes";
        while(choice.equals("Yes")){
            System.out.println("Enter the name of the contact:");
            String name=System.console().readLine();
            System.out.println("Enter the phone number of the contact:");
            long number=Long.parseLong(System.console().readLine());
            contact.put(name, number);
            System.out.println("Do you want to add another contact? (Yes/No)");
            choice=System.console().readLine();
        }

        for(Map.Entry<String, Long> it: contact.entrySet()){
            System.out.println(it.getKey() + ": " + it.getValue());
            
        }
    }
    
}
