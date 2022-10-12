package reflection;

import java.net.http.HttpClient;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("-- System  or Application class loader");
        System.out.println("Employee class loader: " + Employee.class.getClassLoader());
        System.out.println();
        // will read AppClassLoader at the bottom of the ladder

        System.out.println("-- Platform class loader");
        System.out.println("ResultSet class loader: " + ResultSet.class.getClassLoader());
        System.out.println("HttpClient class loader: " + HttpClient.class.getClassLoader());
        System.out.println();
        // will read PlatformClassLoader

        System.out.println("-- Bootstrap class loader");
        System.out.println("Math class loader: " + Math.class.getClassLoader());
        System.out.println("ArrayList class loader: " + ArrayList.class.getClassLoader());
        System.out.println();
        // returns null

        // clear heirachy of ClassLoaders:
        // application or user defined class loaders are loaded by APP class loaders
        // parts of the java library that are not in core java functionality are loaded by PLATFORM class loaders
        // Integral parts of java such as ArrayLists or Math libraries are loaded  by BOOTSTRAP class loaders
    }

    // What is a class loader?
    // the process of compiling java code results in the creation of .class files
    // during runtime these then need to be made available to the javaruntime
    // class loader is a component that abstracts the java runtime from the .class files - an intermediary
    // object responsible for loading classes
    // our class loader will take in a URL, which could be used to load .class files from a remote location e.g. a cloud

}
