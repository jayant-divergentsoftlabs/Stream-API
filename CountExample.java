package Streams;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountExample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Streams/CountExample.java");

	static void method() {
		myLogger.setLevel(Level.FINE);
		Stream<String> stream = Stream.of("Jayant", "Jay", "John");

		long count = stream.collect(Collectors.counting());
		myLogger.info("Number of elements in the stream = " + count);
	}

	public static void main(String[] args) {
		method();
	}

}
