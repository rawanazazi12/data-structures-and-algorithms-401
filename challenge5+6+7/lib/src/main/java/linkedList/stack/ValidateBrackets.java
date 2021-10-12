package linkedList.stack;

public class ValidateBrackets {

   public boolean validateBrackets (String input) throws Exception {

           CharStack  characterStack = new CharStack();


       for(int i = 0; i < input.length(); i++){
           if(input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(' ){
               characterStack.push(input.charAt(i));
           }else{

               if(characterStack.isEmpty()){
                   return false;
               }

               if(input.charAt(i) == '}' && characterStack.peek() == '{' ||
                       input.charAt(i) == ']' && characterStack.peek() == '[' ||
                       input.charAt(i) == ')' &&  characterStack.peek() == '('){
                   characterStack.pop();

               }else {
                   if(characterStack.isEmpty()){
                       return false;
                   }
               }

           }

       }
       return characterStack.isEmpty();
       }

   }

