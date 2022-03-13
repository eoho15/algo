package practice.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Student st1 = new Student("배찌", "1000");
//        Student st2 = new Student("다오", "2000");
//        Student st3 = new Student("디지니", "3000");
//
//        ArrayList<Student> list = new ArrayList<Student>();
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//
//        Scanner scan = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("계속 검색을 원하시면 y, 원하지 않으면 n을 입력해 주세요");
//            String input = scan.next();
//            if (input.equals("y")) {
//                System.out.println("검색을 시작합니다.");
//                String name = scan.next();
//                boolean flag = false;
//
//                for (Student stu : list) {
//                    if (stu.getName().equals(name))
//                        System.out.println("학생의 학번은 " + stu.getNo() + "입니다.");
//                        flag = true;
//                }
//
//                if(!flag) {
//                    System.out.println("해당하는 학생이 없습니다.");
//                }
//            } else if (input.equals("n")) {
//                System.out.println("검색을 종료합니다.");
//            }
//        }
//
//
//    }
//}


        Student st1 = new Student("배찌", "1000");
        Student st2 = new Student("다오", "2000");
        Student st3 = new Student("디지니", "3000");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("계속 검색을 원하시면 y, 원하지 않으면 n 을 입력해주세요");
                    String input = scan.next();

            if (input.equals("y")) {
                System.out.println("검색을 시작합니다.");
                String name = scan.next();
                boolean flag = false;

                for (Student stu : list) {
                    if (stu.getName().equals(name))
                        System.out.println("학생의 학번은" + stu.getNo() + "입니다.");
                    flag = true;

                }

                if (!flag)
                    System.out.println("해당하는 학생이 없습니다.");
            } else if (input.equals("n")) {
                System.out.println("검색을 종료합니다");
                break;
            }


        }


    }


}

