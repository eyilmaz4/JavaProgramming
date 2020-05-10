package queue_stack;

import java.util.Stack;

public class CurlyStack {
    public static void main(String[] args) {
        System.out.println(isBalanced("{{}}}"));
        System.out.println(Duran("{{{{{}{}}}}}"));
    }
    public static boolean isBalanced(String n){
        Stack<Character> s=new Stack<>();
        for(int i=0; i<n.length(); i++){
            s.push(n.charAt(i));
        }
        if(s.size()%2==0){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean Duran(String n){
        Stack<Character>curlies=new Stack<>();
        for(int i=0; i<n.length(); i++){
            curlies.push(n.charAt(i));
        }
        System.out.println(curlies);
        int numberOfopen=0;
        int numberOfclosed=0;
        char ch;
        for (int i=0; i<n.length(); i++){
            ch=curlies.pop();
            if(ch=='{'){
                numberOfopen++;
            }
            else {
                numberOfclosed++;
            }
        }
        if (numberOfclosed==numberOfopen){
            return true;
        }
        else {
            return false;
        }
    }
}
