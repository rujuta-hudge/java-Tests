import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String args[]) {
        try {
            String file = ("D:\\JavaPrograms\\output.txt");
            System.out.println(file1.primeCounter(file));
        } catch (IOException e) {
            System.out.println("Couldn't find the file! ");
        }

    }

    public class file1 {

        public static int primeCounter(String fileName) throws IOException {
            int count = 0;
            int num;
            String str = null;
            File filename = new File("D:\\JavaPrograms\\input.txt");
            Scanner sc = new Scanner(filename);

            // BufferedReader data = null;
            // data = new BufferedReader(new FileReader(filename));
            while (sc.hasNextInt()) {
                num = Integer.parseInt(str);
                int see = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        see = see + 1;
                    }
                    if (see > 2) {
                        break;
                    }
                }
                if (see == 2) {
                    count = count + 1;
                }

            }
            return count;
        }
    }
}
