package algolecture;

import java.util.Scanner;
import java.util.Stack;

public class Main37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = scan.nextLine();
        String answer = "";
        for(char x : str.toCharArray()){
            if(x == '(')
                stack.push(x);
            else if(x ==')')
                stack.pop();
            else if(stack.isEmpty()){
                answer += x;
            }
        }

        System.out.print(answer);
    }
}
