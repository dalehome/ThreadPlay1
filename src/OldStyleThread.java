public class OldStyleThread extends Thread {
    @Override
    public void run() {
        System.out.println("run method:  I am running in thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("main method:  I am running in thread: " + Thread.currentThread().getName());
        OldStyleThread thread1 = new OldStyleThread();
        thread1.start();
    }
}

