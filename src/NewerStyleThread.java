public class NewerStyleThread {

    public static void main(String[] args) throws Exception {
        System.out.println("main method:  I am running in thread: " + Thread.currentThread().getName());
        new Thread( () -> System.out.println("run method:  I am running in thread: " + Thread.currentThread().getName()), "dalethread").start();
    }
}