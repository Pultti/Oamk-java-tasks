/* 
public class Main {
public static void main(String[] args) {
    Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
    Book book2 = new Book("Robert Martin", "Clean Code", 1);
    Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

    CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
    CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
    CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(cd1);
    System.out.println(cd2);
    System.out.println(cd3);

    Box box = new Box(10);

    box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
    box.add(new Book("Robert Martin", "Clean Code", 1));
    box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

    System.out.println(box);

}
}
*/

public class Main {
    public static void main(String[] args) {
        Box bigBox = new Box(20);
        Box smallBox1 = new Box(5);
        Box smallBox2 = new Box(5);

        smallBox1.add(new Book("Author1", "Book1", 2));
        smallBox1.add(new CD("Artist1", "CD1", 2000));

        smallBox2.add(new Book("Author2", "Book2", 1));
        smallBox2.add(new CD("Artist2", "CD2", 2010));

        bigBox.add(smallBox1);
        bigBox.add(smallBox2);

        System.out.println(bigBox);
        
        // Try adding a box to itself
        bigBox.add(bigBox);
    }
}