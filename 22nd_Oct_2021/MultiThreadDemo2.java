import java.util.ArrayList;

public class MultiThreadDemo2 extends Thread {
    private String tname;
    private int tstart, tend;

    private static ArrayList<Integer> pno = new ArrayList<>();

    public MultiThreadDemo2(String name, int start, int end) {
        super(name);
        this.tname = name;
        this.tstart = start;
        this.tend = end;
    }

    public static ArrayList<Integer> getPno() {
        return MultiThreadDemo2.pno;
    }

    public void run() {
        for (int i = this.tstart; i <= this.tend; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                this.pno.add(i);
            }
        }

    }

}
