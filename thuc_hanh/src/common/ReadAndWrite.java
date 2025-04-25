package common;

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
            e.printStackTrace();
        }
    }

    public static <T> List<T> readFile(String pathFile) {
        List<T> tList = new ArrayList<>();
        File file = new File(pathFile);
        try (FileInputStream inputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            tList = (List<T>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tList;
    }
}
