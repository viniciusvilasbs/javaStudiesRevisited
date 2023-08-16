package org.javaCore.newIoFiles.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String projectDirectory = "filesExamplePath/subfolder01/subfolder02";
        String fileTxt = "../../subFolderFileExample.txt";

        Path path01 = Paths.get(projectDirectory, fileTxt);
        System.out.println(path01);
        System.out.println(path01.normalize());

        Path path02 = Paths.get("filesExamplePath/./subfolder01/./subfolder02");
        System.out.println(path02);
        System.out.println(path02.normalize());
    }
}
