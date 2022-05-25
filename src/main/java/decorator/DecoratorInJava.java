package decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;

public class DecoratorInJava {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        // Book으로 타입을 강제
        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());

        // 예외 발생
        books.add(new Item());

        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book {

    }

    private static class Item {

    }
}
