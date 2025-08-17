public class Main {
    public static void main(String[] args) {
        Book book = new Book(320, "Палата №6", "Антон Чехов",
                1892);

        System.out.println(book.isBig());
        System.out.println(book.matches("Чехов"));
        System.out.println(book.estimatePrice());
    }
}