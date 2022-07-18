package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // fileSearch();
        //contentSearch();
        // findLines();
        // printSizeOfPackage();
         createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("please input folder path");
        String path = scanner.nextLine();
        File folder = new File(path);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("wrong path!");
        } else {
            System.out.println("please input file name");
            File[] files = folder.listFiles();
            for (File file : files) {
                String[] fileName = file.getName().split("\\.");
                System.out.println(fileName[0].equals(scanner.nextLine()));

            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("please input folder path");
        String path = scanner.nextLine();
        File folder = new File(path);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("path is wrong!");
        } else {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            File[] files = folder.listFiles();
            for (File file : files) {
                if (file.getName().endsWith("txt") && file.isFile()) {
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
                        while (!br.readLine().contains(keyword)) ;
                        System.out.println(file.getName());
                    } catch (NullPointerException e) {

                    }
                }
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("please input file path");
        String txtPath = scanner.nextLine();
        File myfile = new File(txtPath);
        if (myfile.exists() && myfile.isFile() && myfile.getName().endsWith(".txt")) {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            try (BufferedReader bf = new BufferedReader(new FileReader(txtPath))) {
                String line;
                int countOfLines = 0;
                while ((line = bf.readLine()) != null) {
                    countOfLines++;
                    if (line.contains(keyword)) {
                        System.out.println(countOfLines + ":" + line);
                    }
                }
            }
        } else {
            System.out.println("wrong path!");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input package path");
        String path = scanner.nextLine();
        File mypackage = new File(path);
        if (!mypackage.exists() || !mypackage.isDirectory()) {
            System.out.println("package with this name does not exists");
        } else {
            File[] files = mypackage.listFiles();
            double sizeOfPackage = 0;
            for (File file : files) {
                sizeOfPackage += file.length();
            }
            System.out.println(mypackage.getName() + " size = " + sizeOfPackage / 1024 + " kb");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("please input package path");
        String path = scanner.nextLine();
        File mypackage = new File(path);
        if (!mypackage.exists() || !mypackage.isDirectory()) {
            System.out.println("package with this path does not exists");
        } else {
            System.out.println("please input file name");
            String fileName = scanner.nextLine();
            String filepath = path + "\\" + fileName + ".txt";
            File myfile = new File(filepath);
            System.out.println("please input file content");
            int count = 0;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
                while (count != 10) {
                    count++;
                    String content = scanner.nextLine();
                    bw.write(content + "\n");

                }
            }
        }
    }
}






