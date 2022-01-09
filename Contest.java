import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        System.out.println("Do you have membership with our Store?");
        Scanner kb = new Scanner(System.in);
        String userAnswer = kb.next();
        boolean eligibility = false;
        if (userAnswer.equalsIgnoreCase("Yes")) {
            System.out.println("Great");
            eligibility = true;
        } else {
            System.out.println("Would you like to join us for membership?");
            userAnswer = kb.next();
            if (userAnswer.equalsIgnoreCase("Yes")) {
                System.out.println("Great! Here is your new id");
                eligibility = true;
            } else {
                System.out.println("It is free of cost, let us know in future if you want to sign up");
                eligibility = false;
            }
        }
        if (eligibility) {
            System.out.println("I am glad, you are eligible for free gift in Store!");
            System.out.println("Its good to have you here");
        } else {
            System.out.println("I am sorry! only store members are eligible for free gift.");
        }

        kb.close();

    }
}