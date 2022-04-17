import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE

        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("What is your favorite author’s first name?");
        String firstName = input.next();

        System.out.println("What is your favorite author’s last name?");
        String lastName = input.next();

        System.out.println("Where is your favorite author from?");
        String country = input.next();

        System.out.println("Is your favorite author alive? Y/N");
        boolean isAlive = input.next().toUpperCase().startsWith("Y");

        int age = 0;
        if (isAlive) {
            System.out.println("How old is your favorite author?");
            age = input.nextInt();
        }
        String askUserYN;

        do {
            System.out.println("Would you like enter book information? (Y/N)");
            askUserYN = input.next();

            if (askUserYN.toUpperCase().startsWith("N")) break;
                System.out.println("What is the book name?");
                input.nextLine();
                String bookName = input.nextLine();

                System.out.println("What is genre of the book?");
                String genre = input.nextLine();

                System.out.println("How many pages does book have?");
                int totalPage = input.nextInt();

                Book book = new Book(bookName, genre, totalPage);
                books.add(book);

        } while (askUserYN.toUpperCase().startsWith("Y"));
        Author author = new Author(firstName, lastName, country, isAlive, age, books);

        System.out.println("Author's information = " + author);
        System.out.println("Author's books are as listed below:");

        for (Book book : books) {
            System.out.println(book);
        }
    }
}


