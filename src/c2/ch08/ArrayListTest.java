package c2.ch08;

import java.util.ArrayList;

public class ArrayListTest {
    
    public static void main(String[] args) {
        
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥1", "양상길"));
		library.add(new Book("태백산맥2", "양상길"));
		library.add(new Book("태백산맥3", "양상길"));
		library.add(new Book("태백산맥4", "양상길"));
		library.add(new Book("태백산맥5", "양상길"));

        for(int i = 0; i < library.size(); i++) {
            library.get(i).showBookInfo();
        }
    }
}
