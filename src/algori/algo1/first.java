package algori.algo1;

import java.util.ArrayList;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Student st1 = new Student("한대호","1994");
        Student st2 = new Student("한대일","1996");
        Student st3 = new Student("한유홍", "1968");

        ArrayList <Student>list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        // s.s.s.s.s.s.s
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("계속 검색을 하고 싶으시면 y, 종료 하고 싶으시면 n");
            String input = scan.next();

            if(input.equals("y")) {
                System.out.println("검색을 시작합니다.");
                String name = scan.next();

                for(Student stu : list){
                    if(stu.getName().equals(name))
                        System.out.println("학생의 해당 학번은"+stu.getNo()+"입니다.");
                     else
                        System.out.println("등록되지 않은 학생입니다.");
                        break;
                    }
            }
            else if (input.equals("n")) {
                break;
            }
            else
                System.out.println("잘못 입력 하셨습니다.");

        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
