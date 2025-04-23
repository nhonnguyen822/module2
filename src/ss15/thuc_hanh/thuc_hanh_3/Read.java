package ss15.thuc_hanh.thuc_hanh_3;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            File file = new File("src/ss15/thuc_hanh/thuc_hanh_3/HelloWort.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
