import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        System.out.println("Do you have membership with our Store?");
        Scanner kb = new Scanner(System.in);
        String userAnswer = kb.next();
        if (userAnswer.equalsIgnoreCase("Yes")) {
            System.out.println("Great");
        } else {
            System.out.println("Would you like to join us for membership?");
            userAnswer = kb.next();
            if (userAnswer.equalsIgnoreCase("Yes")) {
                System.out.println("Great! Here is your new id");
            }
        }
        if (userAnswer.equalsIgnoreCase("Yes")) {
            System.out.println("I am glad, you are ligible for free gift in Store!");
        } else {
            System.out.println("I am sorry! only store members are eligible for free gift.");
        }

        kb.close();

    }
}