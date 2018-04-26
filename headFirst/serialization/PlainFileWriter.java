package headFirst.serialization;

import java.io.FileWriter;
import java.io.IOException;

public class PlainFileWriter {

    public static void main(String[] args) {

        try{
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("My first Java string to be saved in file");
            writer.close();
            System.out.println("Your file was saved successfully");
        } catch (IOException ex){}

    }

}
