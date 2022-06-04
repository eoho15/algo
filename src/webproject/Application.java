package webproject;

public class Application {
    private final String[] args;
    private static final int EXIT_FAILURE = 1;
    public Application(String[] args) {
        this.args = args;
    }
    public void run() {
        if(args.length < 1) {
            System.out.println("인자개수가 부족합니드아아.");
            //실패했을때
            // 리눅스 시스템에서 0으로 종료하면 성공, 1로 종료하면 실패
            System.exit(EXIT_FAILURE);
            // 실패할때 1로 리턴해주면 좋겠다..
            // 매번 1로 할 수 없으니
        }
        int port = 0;
        try {
            port = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println("포트 번호가 잘 못 되었습니다.!!");
            System.exit(EXIT_FAILURE);
        }

        Server server = new Server(port);
        server.run();


    }
    public static void main(String[] args) {
        Application application = new Application(args);
        application.run();
    }
}
