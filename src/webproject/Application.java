package webproject;

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

        int port;
        try {
            port = Integer.parseInt(args[0]);
        }catch( NumberFormatException e){
            System.out.println("에러 메세지"+ e);
            System.exit(EXIT_FAILURE);
        }


        }

    public static void main(String[] args) {
        Application application = new Application(args);
        application.run();
    }
}
