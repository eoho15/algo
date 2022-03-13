package algori.algo2;

public class Main {
    public static void main(String[] args) {

//        int []arr = new int[100];
//
//        // An = An-1 + An-2;   n>=3
//        // a1 = 1, a2 = 1
//        arr[1] = 1;
//        arr[2] = 1;
//
//        for(int i=3; i<100;i++){
//
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//
//        for(int i=1; i<=10; i++) {
//            System.out.println(arr[i]);
//        }

        // 2번째 방법.
        // An
                int prePrevNum = 1;// 전전
                int prevNum = 1;    //전
                System.out.println(prePrevNum);
                System.out.println(prevNum);
                for(int i=0; i<100; i++) {

                    int currentNum = prePrevNum + prevNum;
                    System.out.print(currentNum);
                    prePrevNum = prevNum;

                    prevNum = currentNum;

                    // 1        1               2               3                      5
                    //전전     전전              전             전전+현재
                }


            }
        }


