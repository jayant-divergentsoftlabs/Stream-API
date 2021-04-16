package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class is a sample of stream.reduce()
 * 
 * @author Jayant
 *
 */
public class ReduceExample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Streams/ReduceExample.java");

	static void method() {
		myLogger.setLevel(Level.FINE);
		List<Integer> list = Arrays.asList(1500, 2000, 2500);
		int Result = list.stream().reduce(0, (a1, a2) -> a1 + a2);
		myLogger.info("Result: " + Result);
	}

	public static void main(String[] args) {
		method();
	}

}
