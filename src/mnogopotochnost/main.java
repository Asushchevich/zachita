package mnogopotochnost;

/*public class main {
    public static void main(String[] args) {
        System.out.println("start");
        Thread thread = new MyThread();
        thread.start();
        System.out.println("\nFinish");
    }
}*/
public class main {
    public static void main(String[] args) {
        System.out.println("start");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print(i);
                }
            }
        });
        thread.start();
        System.out.println("\nFinish");
    }

}

