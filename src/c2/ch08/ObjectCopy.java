package c2.ch08;

public class ObjectCopy {
    
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];

        library[0] = new Book("태백산맥1", "양상길");
		library[1] = new Book("태백산맥2", "양상길");
		library[2] = new Book("태백산맥3", "양상길");
		library[3] = new Book("태백산맥4", "양상길");
		library[4] = new Book("태백산맥5", "양상길");

        copylibrary = library;

        System.out.println("======library=========");
        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("======copy library=========");
        for(Book book : copylibrary) {
            book.showBookInfo();
        }

        library[0].setTitle("변경");
        library[0].setAuthor("상길");

        System.out.println("======library=========");
        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("======copy library=========");
        for(Book book : copylibrary) {
            book.showBookInfo();
        }
    }
}
