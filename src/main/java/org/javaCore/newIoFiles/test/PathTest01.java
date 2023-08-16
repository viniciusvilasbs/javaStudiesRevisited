package org.javaCore.newIoFiles.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\bufferedwriter.txt");
        Path p2 = Paths.get("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample", "bufferedwriter.txt");
        Path p3 = Paths.get("C:", "temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample", "bufferedwriter.txt");
        Path p4 = Paths.get("C:", "temp", "intelliJ_idea", "JavaStudiesRevisited", "filesExample", "bufferedwriter.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
