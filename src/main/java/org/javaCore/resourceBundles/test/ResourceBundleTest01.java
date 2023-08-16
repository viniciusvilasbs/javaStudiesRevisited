package org.javaCore.resourceBundles.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        ResourceBundle bundleBr = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(bundleBr.getString("olaIngles"));
        System.out.println(bundleBr.getString("bomDiaIngles"));
    }
}
