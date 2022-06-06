package algolecture;

import java.util.Scanner;
import java.util.Stack;

class Main36 {
    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty())
            answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main36 T = new Main36();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
