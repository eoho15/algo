package algori.algo5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("대소문자 바꾸시려는 영어를 입력해주세요");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        String result = "";
        char[] arr = input.toCharArray();

        for(int i=0; i<arr.length; i++) {

            if(arr[i] > 64 && arr[i]< 91) {
                char tmp = (char)(arr[i]+32);
                result += tmp;
            } else {
                char tmo = (char)(arr[i]-32);
                result += tmo;
            }
        }
        System.out.println(result);
    }
}
