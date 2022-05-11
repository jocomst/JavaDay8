package TVShows;

import Animal.ScannerFactory;

import java.util.ArrayList;

public class App2 implements ScannerFactory {

    public static void main(String[] args) {
        ArrayList<TvShow> tvList = new ArrayList<>();

        while (true) {
            System.out.println("Name of the show:");
            String name = scan.nextLine();
            if (name.isEmpty()) break;
            System.out.println("How many episodes?");
            int episodes = Integer.valueOf(scan.nextLine());
            System.out.println("What is the genre?");
            String genre = scan.nextLine();
            tvList.add(new TvShow(name, episodes, genre));
        }

        for (TvShow v : tvList) {
            System.out.println(v);
        }
    }
}
