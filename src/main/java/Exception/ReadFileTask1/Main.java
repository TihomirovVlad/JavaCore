package Exception.ReadFileTask1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\JavaMOOC\\TrainingJavaCore\\src\\main\\java\\hashEqualsHashCode\\MiniTrainingProj\\Main.java";
        readFromFileNameTryCatch(fileName);
        readFromFileName(fileName);
    }

    public static void readFromFileNameTryCatch(String filename) {
        try {
            BufferedReader fin = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = fin.readLine()) != null) System.out.println(line);
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFromFileName(String filename) throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
        fin.close();
    }
}
