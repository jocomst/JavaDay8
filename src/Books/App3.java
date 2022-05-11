package Books;

import Animal.ScannerFactory;

import java.util.ArrayList;

public class App3 implements ScannerFactory {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Enter book name:");
            String name = scan.nextLine();
            if (name.isEmpty()) break;
            System.out.println("How many pages?");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("What year was it published?");
            int year = Integer.valueOf(scan.nextLine());
            bookList.add(new Book(name, pages, year));

        }

        while (true) {
            System.out.println("What do you want to be printed?");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("everything")) {
                for (Book b : bookList) {
                    System.out.println(b);
                }
                break;
            } else if (input.equalsIgnoreCase("name")) {
                for (Book b : bookList) {
                    System.out.println(b.getTitle());
                }
                break;
            } else {
                System.out.println("Input invalid, try again.");
            }
        }


    }
}
