import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BlueRayCollection info = new BlueRayCollection();

        int choice;
        do {
            System.out.println("""
                   0. Quit
                   1. Add BlueRay to collection
                   2. See collection
                   """);
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("What is the title?");
                    String title = scan.nextLine();
                    System.out.println("What is the director?");
                    String director = scan.nextLine();
                    System.out.println("What is the year of release?");
                    int year = scan.nextInt();
                    scan.nextLine();
                    System.out.println("What is the cost?");
                    double cost = scan.nextDouble();
                    scan.nextLine();

                    BlueRayDisk disk = new BlueRayDisk(title, director, year, cost);
                    info.add(disk);
                    break;

                case 2:
                    info.show_all();
                    break;
            }
        } while(choice != 0);
    }
}

