package algori.algo22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String input = scan.nextLine();
                int len = input.length();
                boolean flag = true;
                for(int i=0;i<len/2;i++) {
                    if (input.charAt(i) != input.charAt(len-i-1)) {
                        flag = false;
                    }
                }
                System.out.println(flag);
            }
        }

