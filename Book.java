public class Book {
    String author;
    String title;
    int releaseYear;
    int pages;

    public Book(int pages, String title, String author, int releaseYear) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }


    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.contains(word);
    }

    public int estimatePrice() {
        int price = pages * 3;
        return Math.max(250, price);
    }




}

