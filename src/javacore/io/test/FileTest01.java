package javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean isCreated = file.createNewFile();

            System.out.println("created " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("absolute path " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("is last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            if (file.exists()) {
                System.out.println("deleted " + file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
