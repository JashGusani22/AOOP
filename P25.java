class thread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 1");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class thread1 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 2");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class P25 {
    public static void main(String[] args) {
        thread t1 = new thread();
        thread1 t2 = new thread1();
        t1.start();
        t2.start();
    }
}
