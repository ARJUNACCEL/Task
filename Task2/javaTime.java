import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class javaTime{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-MM-dd): ");

        String inputDate = s.nextLine();

        LocalDate birthdate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));



        Period age = Period.between(birthdate, LocalDate.now());

        System.out.print("Your age is ->"+age.getYears()+" years, "+age.getMonths()+" months, and "+age.getDays()+" days.");


        s.close();
    }
}