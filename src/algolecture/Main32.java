package algolecture;

import java.util.HashMap;
import java.util.Scanner;

public class Main32 {

    public String solution(String s1, String s2){

        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        // 제네릭 타입 생략가능!
        for(char x : s1.toCharArray()){
            System.out.println(x);
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(char x : s2.toCharArray()){
            System.out.println(x);
            if(!map.containsKey(x) || map.get(x) ==0)
                return "NO";
                map.put(x, map.get(x)-1);
        }
        return answer;
    }


    public static void main(String[] args) {
        Main32 T = new Main32();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a,b));
    }
}
