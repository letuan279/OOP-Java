package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Dell\\Desktop\\Ky5\\oop\\Other\\src\\hust\\soict\\dsai\\garbage\\garbage.exe";
        byte[] input;
        long startTime, endTime;

        try {
            input = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            String output = "";
            for (byte b : input) {
                output += (char) b;
            }
            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);

        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}
