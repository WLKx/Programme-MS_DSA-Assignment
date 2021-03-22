package programme.ms.assignment;

import entity.Faculty;
import java.util.Scanner;
import static programme.ms.assignment.SortingDriver.faculty;
import static programme.ms.assignment.SortingDriver.sortmenu;

public class ProgrammeMSAssignment {

    public static void main(String[] args) {
        //Initialize data
        //Faculty
        faculty.add(new Faculty("FOCS", "Faculty of Computing and Information Technology"));
        faculty.add(new Faculty("FOAS", "Faculty of Applied Science"));
        faculty.add(new Faculty("FAFB", "Faculty of accounting"));
        faculty.add(new Faculty("FOET", "Faculty of Engineering and Technology"));
        faculty.add(new Faculty("FSSH", "Faculty of Social Science and Humanities"));
        faculty.add(new Faculty("FCCI", "Faculty of Communication and Creative Industries"));

        //Declaration
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String selection;

        //  Loop/Run System
        do {
            System.out.println("==========Programme Management System==========\n"
                    + "1. Sorting List\n"
                    + "0. Exit\n");
            System.out.printf("> ");

            selection = scanner.nextLine();
            switch (selection) {
                case "0":
                    System.out.println("Exiting System");
                    exit = true;
                    break;
                case "1":
                    sortmenu();
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }

        } while (!exit);
    }

    public static void entContinue() {
        System.out.println("Press enter to continue...");
        try
        {
            scanner.nextLine();
        }  
        catch(Exception e)
        {}  
    }
}
