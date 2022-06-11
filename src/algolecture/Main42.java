package algolecture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main42 {
    public String solution(String N, String subject) {

        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(char x : N.toCharArray())
            Q.offer(x);
        for(char x : subject.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll())
                    return "NO";
            }
        }
        if(!Q.isEmpty())
            return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main42 T = new Main42();
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String subject = sc.nextLine();
        System.out.println(T.solution(N ,subject));

    }
}
