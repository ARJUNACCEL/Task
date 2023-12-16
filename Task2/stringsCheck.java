import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class stringsCheck {
    public static void main(String[] args) {


        List<String> ListStrings= Arrays.asList("abc","","bc","efg","abcd","","jkl");

        List<String> list= ListStrings.stream().filter(n -> !n.isEmpty()).collect(Collectors.toList());

          list.forEach(n -> System.out.println(n));

    }
}
