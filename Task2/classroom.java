import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class classroom {

    public static void main(String[] args) {

        List<String> studentNames = Arrays.asList("Arjun","Gopal","Aruncachelem","noren","Abhishek Dharma","Aizen");

        List<String> students = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());


        System.out.println("Students names starting with 'A':");
        students.forEach(n -> System.out.println(n));



    }
}