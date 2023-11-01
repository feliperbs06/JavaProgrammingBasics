package readafile;

import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        boolean success = false;

        FileReader fr = null;
        BufferedReader br = null;
        while (!success) {
            System.out.println("Enter filename: ");
            String filename = null;
            try {
                filename = keyboard.readLine();
                fr = new FileReader(filename);
                br = new BufferedReader(fr);
                success = true;
            } catch (FileNotFoundException e) {
                System.err.println( "File "+ filename + " was not found, try again...");
            } catch (IOException e) {
                System.err.println("Failed to read the keyboard!");
            }
        }

        String line;
        try {
            while (((line = br.readLine()) != null)) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.err.println("Failed to read the file!");
        }
    }
}
