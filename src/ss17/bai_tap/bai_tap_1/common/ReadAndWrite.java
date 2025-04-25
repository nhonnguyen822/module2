package ss17.bai_tap.bai_tap_1.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite{
     public static <T> void writeFile(String pathFile, List<T> tList) {
        File file = new File(pathFile);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(tList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

     public static <T> List<T> readFile(String pathFile) {
        List<T> tList = new ArrayList<>();
        File file = new File(pathFile);
        try (FileInputStream inputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            tList = (List<T>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tList;
    }
}
