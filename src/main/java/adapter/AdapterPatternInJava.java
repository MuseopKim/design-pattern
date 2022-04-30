package adapter;

import java.io.*;
import java.util.*;

public class AdapterPatternInJava {

    public static void main(String[] args) {
        /**
         * Array -> List
         * Adapter : Arrays class
         * Adaptee : Array
         * Traget interface : List
         */
        List<String> strings = Arrays.asList("a", "b", "c");

        /**
         * List -> Enumeration
         * Adapter : Collections class
         * Adaptee : List
         * Traget interface : Enumeration
         */
        Enumeration<String> enumeration = Collections.enumeration(strings);

        /**
         * Enumeration -> List
         * Adapter : Collections class
         * Adaptee : Enumeration
         * Target interface : List
         */
        List<String> list = Collections.list(enumeration);

        /**
         * IO
         */
        try (InputStream inputStream = new FileInputStream("input.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
