package algori.algo29;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputs[] = new int[8];
        int cnt = 0;
        String a = "";
        for(int i=0;i< inputs.length;i++)
            inputs[i] = scan.nextInt();

        for(int i=0;i< inputs.length-1;i++) {
            if(inputs[i+1] == inputs[i]+1)
               a="assending";
            else if(inputs[i+1] == inputs[i]-1 )
                a = "descending";
            else {
                a = "mixed";
                break;
            }

        }
        System.out.println(a);
    }
}
