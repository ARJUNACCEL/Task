import java.util.Scanner;

public class weekdays{
    public static void main(String[] args) {

        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner s = new Scanner(System.in);

        System.out.print("Enter an the Index :) ");

        try {
            int index = s.nextInt();

            System.out.println("Day ->" + weekdays[index]);



        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid input. Please enter a valid integer.");
        }

            s.close();

    }
}