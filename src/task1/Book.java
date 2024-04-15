package task1;

import java.util.Arrays;

public class Book extends MyHomeworkObjects {
    private String title;
    private int pages;
    private final String[] authors = new String[]{"John", "Doe"};
    private String genre;

    public Book(String title, int pages, String genre) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book = " +
                "title=' " + title +
                ", pages=' " + pages +
                ", authors= " + Arrays.toString(authors) +
                ", genre=' " + genre;
    }
}
