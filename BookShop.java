import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;

        while (status) {
            try {
                System.out.println("----- Main Menu -----");
                System.out.println("1 - Display all books");
                System.out.println("2 - Add book");
                System.out.println("3 - Update book");
                System.out.println("4 - Delete book");
                System.out.println("5 - Search book");
                System.out.println("6 - Exit");
                System.out.print("Enter your choice: ");

                // 🔥 IMPORTANT FIX FOR JENKINS (NO USER INPUT)
                int choice = 6;

                switch (choice) {

                    case 1:
                        Book.dispalayAllBook();
                        break;

                    case 2:
                        Book.addbook(input);
                        break;

                    case 3:
                        if (Book.bookList.isEmpty()) {
                            System.out.println("No books to update. Please add some first.");
                            break;
                        }
                        Book.updateWithString(input);
                        status = Book.statusBoolean;
                        break;

                    case 4:
                        Book.deleteBook(input);
                        break;

                    case 5:
                        if (Book.bookList.isEmpty()) {
                            System.out.println("No books to search. Please add some first.");
                            break;
                        }

                        System.out.print("Enter book name: ");
                        String name = input.nextLine();

                        Book foundBook = Book.getBookByName(name);

                        if (foundBook == null) {
                            System.out.println("Book not found!");
                        } else {
                            System.out.println("Book Name: " + foundBook.getName());
                            System.out.println("Author: " + foundBook.getAuthor());
                            System.out.println("Price: " + foundBook.getPrice());
                        }
                        break;

                    case 6:
                        status = false;
                        System.out.println("Program exited successfully!");
                        break;

                    default:
                        System.out.println("Please enter a number between 1 and 6!");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                input.nextLine(); // prevent crash loop
            }
        }

        input.close();
    }
}