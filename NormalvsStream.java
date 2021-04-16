package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * This class is a test of normal and stream code by filter map including collect
 * @author Jayant
 *
 */
public class NormalvsStream {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Streams/NormalvsStream.java");


	void method() {
		myLogger.setLevel(Level.FINE);
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);

		// normal way
		
		List<Integer> Even = new ArrayList<Integer>();
		for (int i : list) {
			if (i % 2 == 0) {
				Even.add(i);
			}
		}
		myLogger.info("Initial List: " +list);
		myLogger.info("Even List by Normal Way: " +Even);
		
		// using Stream
		
		//Stream<Integer> stream = list.stream();
		List<Integer> newlist = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		myLogger.info("Even List by Stream Way: " +newlist);
	}

	public static void main(String[] args) {
		NormalvsStream stream = new NormalvsStream();
		stream.method();

	}
}