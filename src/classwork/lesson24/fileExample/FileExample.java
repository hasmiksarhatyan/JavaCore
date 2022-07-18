package classwork.lesson24.fileExample;

import java.io.File;
import java.io.IOException;

public class FileExample {
    static String filePath = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\classwork\\lesson24\\fileExample\\testFolder\\hello.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);
        System.out.println(myFile.exists());
        if (!myFile.exists()){
            myFile.createNewFile();
            System.out.println(myFile.exists());
        }
        System.out.println("isFile: "+myFile.isFile());
        System.out.println("isdirectory: "+myFile.isDirectory());
        if (myFile.isDirectory()){
            File[] files=myFile.listFiles();
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
        System.out.println(myFile.length());
    }
}
