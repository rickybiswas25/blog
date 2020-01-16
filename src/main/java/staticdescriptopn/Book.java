package staticdescriptopn;

import java.util.ArrayList;
import java.util.List;

public class Book { // outer class
    private List<Page> pages;

    public Book() {
        System.out.println("Book is created");
        this.pages = new ArrayList<>();
    }

    public void addPages(int pageNumber) {
        this.pages.add(new Page(pageNumber));
    }

    class Page {
        private int pageNumber;
        public Page(int pageNumber) {
            this.pageNumber = pageNumber;
            System.out.println(String.format("Page %d is created", this.pageNumber));
        }
    }
}
