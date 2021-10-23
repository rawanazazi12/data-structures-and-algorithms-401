package trees;

public class KTree {
    KNode root;
    String allValues="";

    public String fizzBuzz(KNode root){
        if (Integer.parseInt(root.data) % 3 == 0 && Integer.parseInt(root.data) % 5 == 0 ){
            root.data =  "FizzBuzz";
        }
        else if (Integer.parseInt(root.data) % 3 == 0 ){
            root.data =  "Fizz";
        }
        else if (Integer.parseInt(root.data) % 5 == 0 ){
            root.data = "Buzz";
        }
        allValues+= root.data + " ";
        if(root.children.isEmpty()){
            return null;
        }
        for(KNode child : root.children){
            fizzBuzz(child);
        }
        return allValues;
    }
}
