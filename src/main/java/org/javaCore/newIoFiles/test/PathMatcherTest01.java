package org.javaCore.newIoFiles.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path01 = Paths.get("filesExamplePath/subfolder01/subfolder02/subFolderFileExample.txt");
        Path path02 = Paths.get("filesExamplePath/subfolder01/subfolder02/subFolderFileExample.bkp");
        Path path03 = Paths.get("filesExamplePath/subfolder01/subfolder02/subFolderFileExample.bkp");
        Path path04 = Paths.get("filesExamplePath/subfolder01/subfolder02/file.java");

        matches(path01, "glob:*.bkp");
        matches(path01, "glob:**/*.bkp");
        matches(path01, "glob:**/*.{txt,bkp,java}");
        matches(path02, "glob:**/*.{txt,bkp,java}");
        matches(path03, "glob:**/*.{txt,bkp,java}");
        matches(path01, "glob:**/*.???");
        matches(path02, "glob:**/*.???");
        matches(path03, "glob:**/*.???");
        matches(path03, "glob:**/file.????");
        matches(path04, "glob:**/file.????");
    }
    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " : " + matcher.matches(path));
    }
}
