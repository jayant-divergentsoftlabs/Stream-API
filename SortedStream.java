package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
/**
 * This class is a sample of stream.sorted()
 * @author Jayant
 *
 */
public class SortedStream {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Streams/SortedStream.java");

	static void method() {
		myLogger.setLevel(Level.FINE);
		List<String>list=Arrays.asList("Aman","Jayant","Bhavesh","Dheeraj","Chandu");
		myLogger.info("Initial List: " +list);
		List<String>newlist=list.stream().sorted().collect(Collectors.toList());
		myLogger.info("Sorted List: " +newlist);
		
	}
public static void main(String[] args) {
	method();
}
}
