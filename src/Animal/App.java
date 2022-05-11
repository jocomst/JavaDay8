package Animal;

import java.util.ArrayList;

public class App implements ScannerFactory{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();


        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.println("Please enter a name:");
            String name = scan.nextLine();
            if (name.isEmpty()) break;
            System.out.println("Is it a dog? Yes or no:");
            String dogOrNot = scan.nextLine();
            if (dogOrNot.isEmpty()) break;
            animals.add(new Animal(name, dogOrNot.equalsIgnoreCase("yes") ? true : false));

        }

        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
