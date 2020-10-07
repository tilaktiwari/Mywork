package datareader;

import java.io.BufferedReader;
import java.io.FileReader;

public class LearningDataReader {
    //Path is a location of file two types of paths
    // Absolute path: full path
    //eg. :C:\Users\ttila\IdeaProjects\homePractice\DataTest\Sample
    //Relative path:partial path eg:DataTest/Sample
    // it is good to use relative path
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;//creating two reference variables
        String filePath = "../homePractice/DataTest/Sample";

        try {
            fileReader = new FileReader(filePath);//Creating object file reader and passing file path in parameter
            bufferedReader = new BufferedReader(fileReader);
            String data;//creating string type of data named data
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("File not found Exception");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();

            } catch (Exception e) {
                System.out.println("file already closed");

            }
        }
    }
}