package Books;

public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public Book(String title) {
        this.title = title;
        this.pages = 100;
        this.year = 2022;
    }

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.year = 2022;
    }

    public Book(int pages) {
        this.title = "No title";
        this.pages = pages;
        this.year = 2022;
    }

    public Book(int years, int pages) {
        this.title = "No title";
        this.pages = pages;
        this.year = years;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return this.getTitle() + ", " + this.getPages() + " pages, " + this.getYear();
    }
}
