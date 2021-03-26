package programme.ms.assignment;

<<<<<<< Updated upstream
public class ProgrammeMSAssignment {

    public static void main(String[] args) {
        // Liang was here
        System.out.println("NLM");
=======
import java.util.Scanner;
import entity.*;
import java.util.ArrayList;
import java.util.List;
import static programme.ms.assignment.SortingDriver.sortmenu;
import static programme.ms.assignment.BinaryTreeDriver.binaryTreeMenu;
import static programme.ms.assignment.FilterCourseDriver.displayCourse;

public class ProgrammeMSAssignment {
    //Glogal array lists for global access to all data
    public static List<Faculty> facultyList = new ArrayList();
    public static List<Lecturer> lecturerList = new ArrayList();
    public static List<Course> courseList = new ArrayList();

    public static void main(String[] args) {
        //Initialize all data
        initializeData();

        //Declaration
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String selection;

        //  Loop/Run System
        do {
            System.out.println("==========Programme Management System==========\n"
                    + "1. Faculty (Sorting List)\n"
                    + "2. Lecturers (Binary Tree)\n"
                    + "4. Course (Filter)\n"
                    + "0. Exit\n");
            System.out.printf("> ");
            
            selection = scanner.nextLine();
            switch (selection) {
                case "0":
                    System.out.println("\nExiting System...");
                    exit = true;
                    break;
                case "1":
                    sortmenu();
                    break;
                case "2":
                    binaryTreeMenu();
                    break;
                case "4":
                    displayCourse();
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while (!exit);
    }

    private static void initializeData() {
        //Initialize data
        
        //Generate Faculty array list
        facultyList.add(new Faculty("FAFB", "Faculty of Accounting"));
        facultyList.add(new Faculty("FOAS", "Faculty of Applied Science"));
        facultyList.add(new Faculty("FOET", "Faculty of Engineering and Technology"));
        facultyList.add(new Faculty("FSSH", "Faculty of Social Science and Humanities"));
        facultyList.add(new Faculty("FOCS", "Faculty of Computing and Information Technology"));
        facultyList.add(new Faculty("FCCI", "Faculty of Communication and Creative Industries"));
        
        //Generate Lecturer array list
        lecturerList.add(new Lecturer(Lecturer.idIndex++ ,"Keith", "012-255-5312", "keith_jt@gmail.com"));
        lecturerList.add(new Lecturer(Lecturer.idIndex++, "Rylie", "012-364-8912", "rylie_o@gmail.com"));
        lecturerList.add(new Lecturer(Lecturer.idIndex++, "Jenson", "012-123-4845", "jenson_jnsn@gmail.com"));
        lecturerList.add(new Lecturer(Lecturer.idIndex++, "Kyle", "017-568-7481", "kl_chd@gmail.com"));
        lecturerList.add(new Lecturer(Lecturer.idIndex++, "James", "012-126-4895", "james_vi@gmail.com"));
        lecturerList.add(new Lecturer(Lecturer.idIndex++, "Josaphine", "012-165-7821", "jsphn_tuit@gmail.com"));
        lecturerList.add(new Lecturer(Lecturer.idIndex++, "Adam", "016-665-8942", "adm_jnsn@gmail.com"));
        lecturerList.add(new Lecturer(Lecturer.idIndex++, "Jason", "017-134-4953", "jason_v@gmail.com"));
        
        //Generate Course array list
        courseList.add(new Course("PRINCIPLES OF ACCOUNTING", "BBFA1043",3));
        courseList.add(new Course("DATA STRUCTURES AND ALGORITHMS", "BACS2063",3));
        courseList.add(new Course("ENGLISH LANGUAGE", "BHEL1013",3));
        courseList.add(new Course("DATABASE MANAGEMENT", "BACS1053",3));
        courseList.add(new Course("PROBLEM SOLVING AND PROGRAMMING", "BACS1014",4));
        courseList.add(new Course("ENTERPRISE SYSTEMS", "BAIT1133",3));
        courseList.add(new Course("DATA WAREHOUSE TECHNOLOGY", "BAIT3003",3));
        courseList.add(new Course("INFORMATION SYSTEMS IMPLEMENTATION", "BAIT3023",3));
        courseList.add(new Course("QUANTITATIVE METHODS", "FPMA1024",4));
        courseList.add(new Course("ORGANISATION DEVELOPMENT & CHANGE", "BBDH2083",3));
        
    }

    //Function for "Press enter to continue..." for users to read displays before proceeding
    public static void entContinue() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nPress enter to continue...");
        try {
            scanner.nextLine();
        } catch (Exception e) {
        }
>>>>>>> Stashed changes
    }
    //test 123 456wlk
}
