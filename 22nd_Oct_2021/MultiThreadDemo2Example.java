public class MultiThreadDemo2Example {
    public static void main(String[] args) {
        System.out.println("Thread 1");
        MultiThreadDemo2 t1 = new MultiThreadDemo2("Thread- 1", 1, 50000);
        System.out.println("Thread 2");
        MultiThreadDemo2 t2 = new MultiThreadDemo2("Thread- 2", 1, 50000);
        t1.start();
        t2.start();

        long starttime = System.currentTimeMillis();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

        System.out.println(MultiThreadDemo2.getPno());
        long endtime = System.currentTimeMillis();

        long takenTime = endtime - starttime;
        System.out.println("TotalTime taken is -: " + takenTime + " Milliseconds");

    }

}