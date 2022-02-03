package c2.ch08;

public class BookArrayTest {
    
    public static void main(String[] args) {
        
        Book[] library = new Book[5];

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            // null
            // null
            // null
            // null
            // null
        }

        Book[] library2 = new Book[5];

        library2[0] = new Book("태백산맥1", "양상길");
		library2[1] = new Book("태백산맥2", "양상길");
		library2[2] = new Book("태백산맥3", "양상길");
		library2[3] = new Book("태백산맥4", "양상길");
		library2[4] = new Book("태백산맥5", "양상길");

        for(int i = 0; i < library2.length; i++) {
			System.out.println(library2[i]);
			library2[i].showBookInfo();
		}

    }
}
