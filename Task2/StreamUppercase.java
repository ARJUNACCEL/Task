import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUppercase {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("aBc", "d", "ef");


        List<String> uppercaseNames = names
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());


        System.out.println("Uppercase Names are :) ->");

        uppercaseNames.forEach(n -> System.out.println(n));
    }
}