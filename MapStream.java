package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
/**
 * Sample for Stream Map and collect
 * @author Jayant
 *
 */
public class MapStream {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Streams/MapStream.java");

	void method() {
		myLogger.setLevel(Level.FINE);
		/*
		 * List<Integer>list=new ArrayList<Integer>(); list.add(1); list.add(2);
		 * list.add(3); list.add(4); list.add(5);
		 */
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		myLogger.info("Initial List :" + list);
		List<Integer> newlist = list.stream().map(number -> number * 3).collect(Collectors.toList()); 
		myLogger.info("List after multiply by 3 :" + newlist);
	}

	public static void main(String[] args) {
		MapStream mapStream = new MapStream();
		mapStream.method();
	}
}
