package Streams;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * This Class is a sample of Iteration in Stream with forEach
 * 
 * @author Jayant
 *
 */
public class IteratingExample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Streams/IteratingExample.java");

	static void method() {
		myLogger.setLevel(Level.FINE);
		Stream.iterate(1, n -> n + 1).
		limit(10).
		forEach(x -> myLogger.info("Count" + x));
	}

	public static void main(String[] args) {
		method();
	}

}
