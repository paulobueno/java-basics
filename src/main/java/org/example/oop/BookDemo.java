public class BookDemo {
    public static void main(String[] args) {
        Book statBook = new Book("Nate Silver", "The Signal and the Noise", "Statistics", 576);
        Book decisionBook = new Book("Daniel Kahneman", "Thinking, Fast and Slow", "Management", 512);
        Book scifiBook = new Book("Anthony Burgess", "A Clockwork Orange", "Sci-Fi", 240);
        
        statBook.printBookDetails();
        decisionBook.printBookDetails();
        scifiBook.printBookDetails();

//        printBookDetails(statBook);
//        printBookDetails(decisionBook);
//        printBookDetails(scifiBook);
    }

//    public static void printBookDetails(Book book) {
//        System.out.println(book.getTitle());
//        System.out.println("by " + book.getAuthor());
//        System.out.println("has " + book.getNumPages() + " pages and its genre is " + book.getGenre());
//        System.out.println();
//    }

}
