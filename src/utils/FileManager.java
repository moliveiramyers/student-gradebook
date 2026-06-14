package src.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileManager {
    public static void save(String content) {
        try {
            FileWriter writer = new FileWriter("students.txt");
            writer.write(content);
            writer.close();

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }

    }

    public static String Load() {
        StringBuilder data = new StringBuilder();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));

            String line;
            while((line = reader.readLine())!= null){
                data.append(line);
                data.append("\n");
            } 

            reader.close();
        }
        catch(IOException e){
            System.out.println("No saved data found");
        }
        return data.toString();
    }
}
