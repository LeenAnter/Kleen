package labs;
import java.util.Scanner;

public class ThreeStudents {
    static int weekGoal = 600, studySes = 0, totalTime = 0, programming = 0, math = 0, eng = 0, oth = 0;
    public static void StudyPlanner(Scanner scanner){
        boolean loop = true;
        while (loop) {
            System.out.println("""
                    ===== STUDY TRACKER =====
                    
                    1. Add study session
                    2. View statistics
                    3. Check weekly goal
                    4. Exit""");
            System.out.print("Answer(number): ");
            int choose = scanner.nextInt();

            if (choose == 1) {
                System.out.println(); // отступы межд программами
                AddStudySession(scanner);
            } else if (choose == 2) {
                System.out.println(); // отступы межд программами
                ViewStatistics();
            } else if (choose == 3) {
                System.out.println(); // отступы межд программами
                CheckWeekGoal();
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
        System.out.println("""
                Choose subject:
                1. Programming
                2. Mathematics
                3. English
                4. Other""");
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
        public static void ViewStatistics (){
        System.out.println("===== WEEKLY STATISTICS =====\n" + "Study sessions: " + studySes + "\n" + "Total study time: " + totalTime+ "\n" + "Programming: "+ programming+ "\n" + "Mathematics: "+ math+ "\n" + "English: "+ eng+ "\n" + "Other: "+ oth);
    }
        public static void CheckWeekGoal (){
        int remaining = weekGoal - totalTime;
        if (remaining < 0) remaining = 0;
        System.out.println("Weekly goal: "+ weekGoal+ "\n" + "You studied: "+ totalTime+ "\n" + "Remaining: "+ remaining);
    }
    public static void GradeTracker(Scanner scanner){
        int assigmentScore = 0, assigmentCount = 0, examScore= 0, examCount = 0;
        int assignmentAverage = 0, examAverage = 0;
        boolean loop = true;
        while (loop){
            System.out.println("""
                    ===== SEMESTER GRADE TRACKER =====
                    
                    1. Add assignment result
                    2. Add exam result
                    3. View current grade
                    4. Exit""");
            System.out.print("Choose an option: ");
            int choose = scanner.nextInt();

            if (choose == 1){
                System.out.print("Enter assignment score: ");
                int score = scanner.nextInt();
                if (score < 0 || score > 100){
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                } else {
                    assigmentScore += score;
                    assigmentCount += 1;
                    System.out.println("Assignment score added.");
                }
            } else if (choose == 2) {
                System.out.print("Enter exam score: ");
                int score = scanner.nextInt();
                if (score < 0 || score > 100){
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                } else {
                    examScore += score;
                    examCount += 1;
                    System.out.println("Exam score added.");
                }
            } else if (choose == 3) {
                if (assigmentCount == 0 && examCount == 0) {
                    System.out.println("No results available yet.\n");
                } else {
                    if (assigmentCount > 0){
                        assignmentAverage = assigmentScore / assigmentCount;
                    }
                    if (examCount > 0){
                        examAverage = examScore / examCount;
                    }

                    int overallAverage = (int) ((assignmentAverage * 0.50) + (examAverage * 0.50));

                    String grade = "F";
                    if (overallAverage >= 90) {
                        grade = "A";
                    } else if (overallAverage >= 80) {
                        grade = "B";
                    } else if (overallAverage >= 70) {
                        grade = "C";
                    } else if (overallAverage >= 60) {
                        grade = "D";
                    }


                    String status = (overallAverage >= 60) ? "Passing" : "Failing";

                    System.out.println("===== CURRENT RESULTS =====\n" +
                            "Assignments completed: " + assigmentCount + "\n" +
                            "Assignment average: " + assignmentAverage + "\n" +
                            "Exams completed: " + examCount + "\n" +
                            "Exam average: " + examAverage + "\n" +
                            "Overall average: " + overallAverage + "\n" +
                            "Grade: " + grade + "\n" +
                            "Status: " + status + "\n");
                }
            } else if (choose == 4) {
                loop = false;
            } else {
                System.out.println("Invalid option");
            }
        }
    }
    public static void ScreenTimeTracker(Scanner scanner){
        int socialMedia = 0, gaming = 0, studying = 0, streaming = 0, totalScreenTime = 0, sessions = 0;
        boolean loop = true;
        while (loop) {
            System.out.println("""
                    ===== SCREEN-TIME TRACKER =====
                    1. Add social media time
                    2. Add gaming time
                    3. Add studying time
                    4. Add video or streaming time
                    5. View statistics
                    6. Exit""");
            System.out.print("Choose an option: ");
            int choose = scanner.nextInt();

            if (choose == 1) {
                System.out.print("Enter social media minutes: ");
                int time = scanner.nextInt();
                if (time <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    socialMedia += time;
                    totalScreenTime += time;
                    sessions++;
                    System.out.println("Time added successfully!");
                }
            } else if (choose == 2) {
                System.out.print("Enter gaming minutes: ");
                int time = scanner.nextInt();
                if (time <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    gaming += time;
                    totalScreenTime += time;
                    sessions++;
                    System.out.println("Time added successfully!");
                }
            } else if (choose == 3) {
                System.out.print("Enter studying minutes: ");
                int time = scanner.nextInt();
                if (time <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    studying += time;
                    totalScreenTime += time;
                    sessions++;
                    System.out.println("Time added successfully!");
                }
            } else if (choose == 4) {
                System.out.print("Enter streaming minutes: ");
                int time = scanner.nextInt();
                if (time <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    streaming += time;
                    totalScreenTime += time;
                    sessions++;
                    System.out.println("Time added successfully!");
                }
            } else if (choose == 5) {
                System.out.println("===== TODAY'S SCREEN TIME =====\n" +
                        "Social media: " + socialMedia + " minutes\n" +
                        "Gaming: " + gaming + " minutes\n" +
                        "Studying: " + studying + " minutes\n" +
                        "Streaming: " + streaming + " minutes\n" +
                        "Total screen time: " + totalScreenTime + " minutes\n" +
                        "Recorded sessions: " + sessions);

                int entertainment = socialMedia + gaming + streaming;
                if (studying > entertainment) {
                    System.out.println("Study screen time is greater than entertainment screen time. Good balance!");
                } else if (entertainment > studying) {
                    System.out.println("Entertainment screen time is greater than study time.");
                } else {
                    System.out.println("Study and entertainment screen time are equal.");
                }

                if (totalScreenTime < 120) {
                    System.out.println("Low screen time\n");
                } else if (totalScreenTime <= 240) {
                    System.out.println("Moderate screen time\n");
                } else {
                    System.out.println("High screen time\n");
                }
            } else if (choose == 6) {
                System.out.println("Screen-time tracker closed.\n");
                loop = false;
            } else {
                System.out.println("Invalid option");
            }
            System.out.println(); // отступы между программами
        }
    }
}

