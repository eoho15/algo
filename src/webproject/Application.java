package webproject;

import java.io.IOException;
import java.net.ServerSocket;

// Application의 객체를 만들어서 그걸 실행한다.
public class Application {

    private final String[] args;
    private static final int EXIT_FAILURE = 1;

    public Application(String[] args) {
        this.args = args;
    }

    private void run() {
        if(args.length <1){
            System.out.println("인자의 갯수가 부족합니다.");
            System.exit(EXIT_FAILURE);
        }

        int port = 0;
        try {
            port = Integer.parseInt(args[0]);
        }catch( NumberFormatException e){
            System.out.println("에러 메세지"+ e);
            System.exit(EXIT_FAILURE);
        }

        try {
            // Server 클래스를 사용하자
            Server server = new Server(port);
            server.run();
        }catch(DaehoException e){
            System.out.println("문제가 발생했습니다. "+ e.getMessage());
        } catch(Throwable e){
            System.out.println("예상치 못한 예외가 발생했습니다."+ e.getMessage());
        }


        }

    public static void main(String[] args) {
        Application application = new Application(args);
        application.run();
    }
}
