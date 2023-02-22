import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class Streams {

	public static void main(String[] args) {
		// Creating streams

		Stream<Integer> stream = Stream.of(10, 20, 30, 40);
//				stream.forEach((n)->System.out.println(n));
		// forEach is a terminal Operation
		stream.forEach(System.out::println);

		List<String> players = Arrays.asList("amogh", "sam");
		// players.stream().forEach(System.out::println);
		players.stream().forEach(System.out::println);

		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i).toUpperCase());
		}

		Stream<String> javaStream = Stream.generate(() -> "java").limit(5);
		javaStream.forEach(System.out::println);

		Stream<Integer> numberStream = Stream.iterate(1, n -> n + 10).limit(5);
		numberStream.forEach(System.out::println);

		Builder<String> builder = Stream.builder();
		Stream<String> build = builder.add("Akshay").add("Abhishek").add("Rasika").add("Krutika").add("Prathamesh")
				.add("Amogh").build();

		build.forEach(System.out::println);

	}
}
