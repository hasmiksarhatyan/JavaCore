package homework.fileutil;

import java.io.*;
import java.util.Scanner;


public class RecursionSearch {
    private static Scanner scanner = new Scanner(System.in);
    private static FileStorage fileStorage = new FileStorage();
    private static String path;
    private static File folder;


    public static void main(String[] args) throws IOException {
        System.out.println("please input folder path");
        path = scanner.nextLine();
        folder = new File(path);

        fileSearch();
        // contentSearch();
        // findLines();
        // recursionSearch(folder);
    }

    static boolean fileSearch() {
        recursionSearch(folder);
        if (fileStorage.getSize() != 0) {
            System.out.println("please input file name");
            String fileName = scanner.nextLine();
            for (int i = 0; i < fileStorage.getSize(); i++) {
                if (fileStorage.getArray()[i].getName().equals(fileName)) {
                    System.out.println(fileStorage.getArray()[i].exists());
                }
            }
        }
        return false;
    }


    static void contentSearch() throws IOException {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        recursionSearch(folder);
        if (fileStorage.getSize() != 0) {
            for (File file : fileStorage.getArray()) {
                if (file != null && file.getName().endsWith(".txt")) {
                    try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                                break;
                            }
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }


    static void findLines() throws IOException {

        recursionSearch(folder);
        if (fileStorage.getSize() != 0) {
            System.out.println("please input file path");
            String txtPath = scanner.nextLine();
            for (File file : fileStorage.getArray()) {
                if (file != null && file.getName().endsWith(".txt") && file.getPath().equals(txtPath)) {
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
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }

    static void recursionSearch(File folder) {
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (File file : files) {
                if (file.isDirectory() && file.exists()) {
                    recursionSearch(file);
                } else if (file.isFile() && file.exists()) {
                    fileStorage.add(file);
                }
            }
        } else System.out.println("wrong path!");
    }
}
