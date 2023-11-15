package ovningsuppgifter.Week4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Baseball baseball = new Baseball("Poop balls");
        Football football = new Football("Mega balls");
        baseball.bounce();
        football.toss();
        Tossable tossable = new Baseball("Best balls");
        tossable.toss();
        Ball ball = new Baseball("Space balls");

        System.out.println(ball.getBrandName());

        List<String> strings = List.of("Alfred", "Mikaela", "Daniel", "Andreas");

        strings.forEach(System.out::println);
        System.out.println("");

        strings.stream()
                .filter((s)-> s.startsWith("A"))
                .filter((s)-> s.endsWith("d"))
                .forEach(System.out::println);

    }
}
