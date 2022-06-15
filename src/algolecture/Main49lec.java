package algolecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 제네릭 타입 Point클래스의 객체를 정렬한다.!
class Point implements Comparable<Point>{
    public int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x)
            return this.y - o.y;
            // 오름차순은 음수값이 나오도록, 내림차순은 양수가 나오도록!}
        else
            return this.x - o.x;
    }
}

public class Main49lec {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x,y));
        }

        Collections.sort(arr);
        for(Point o : arr)
            System.out.println(o.x+" "+o.y);
    }
}
