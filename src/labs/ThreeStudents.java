package labs;
import java.util.Scanner;

public class ThreeStudents {
    static int weekGoal = 600, studySes = 0, totalTime = 0, programming = 0, math = 0, eng = 0, oth = 0;
    public static void StudyPlanner(Scanner scanner){
        boolean loop = true;
        while (loop) {
            System.out.println("===== STUDY TRACKER =====\n" + "\n" + "1. Add study session\n" + "2. View statistics\n" + "3. Check weekly goal\n" + "4. Exit");
            System.out.print("Answer(number): ");
            int choose = scanner.nextInt();

            if (choose == 1) {
                System.out.println(); // отступы межд программами
                AddStudySession(scanner);
            } else if (choose == 2) {
                System.out.println(); // отступы межд программами
                ViewStatistics(scanner);
            } else if (choose == 3) {
                System.out.println(); // отступы межд программами
                CheckWeekGoal(scanner);
            } else if (choose == 4) {
                System.out.println(); // отступы межд программами
                System.out.println("Study tracker closed. Keep up the good work!\n");
                loop = false;
            } else {
                System.out.println("Only 1-4");
            }
            System.out.println(); // отступы межд программами
        }
    }
        public static void AddStudySession (Scanner scanner){
        System.out.println("Choose subject:\n" + "1. Programming\n" + "2. Mathematics\n" + "3. English\n" + "4. Other");
        System.out.print("Answer(number): ");
        int chooseSub = scanner.nextInt();
        System.out.print("Study time in minutes: ");
        int chooseTime = scanner.nextInt();
        switch (chooseSub) {
            case 1:
                programming += chooseTime;
                break;
            case 2:
                math += chooseTime;
                break;
            case 3:
                eng += chooseTime;
                break;
            case 4:
                oth += chooseTime;
                break;
            default:
                System.out.println("Invalid subject choice! Time not added to subjects.");
                return;
        }
        System.out.println("Study session added!");
        totalTime += chooseTime;
        System.out.println("Current total study time " + totalTime);
        studySes++;
    }
        public static void ViewStatistics (Scanner scanner){
        System.out.println("===== WEEKLY STATISTICS =====\n" + "Study sessions: " + studySes + "\n" + "Total study time: " + totalTime+ "\n" + "Programming: "+ programming+ "\n" + "Mathematics: "+ math+ "\n" + "English: "+ eng+ "\n" + "Other: "+ oth);
    }
        public static void CheckWeekGoal (Scanner scanner){
        int remaining = weekGoal - totalTime;
        if (remaining < 0) remaining = 0;
        System.out.println("Weekly goal: "+ weekGoal+ "\n" + "You studied: "+ totalTime+ "\n" + "Remaining: "+ remaining);
    }
}

