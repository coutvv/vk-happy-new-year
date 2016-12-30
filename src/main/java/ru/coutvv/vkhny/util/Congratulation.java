package ru.coutvv.vkhny.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class Congratulation {

	Map<Integer, String> congrats = new HashMap<>();
	
	public Congratulation(String filename) throws URISyntaxException {
		URI uri = Congratulation.class.getClassLoader().getResource(filename).toURI();
		Path file = Paths.get(uri);
		
		try (Stream<String> stream = Files.lines(file)) {
			Iterator<String> iter = stream.iterator();
			int i = 0;
			while(iter.hasNext()) {
				congrats.put(i, iter.next());
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	final Random rand = new Random();
	
	private static final String SMILE = "😊";
	
	public String createCongratulation(String destName) {
		String intro = rand.nextBoolean() ? "" : "Hey " + destName + "! ";
		String mid = congrats.get(rand.nextInt(congrats.size()));
		String smiles = "";
		int smileCount = rand.nextInt(5) + 1;
		for(int i = 0; i < smileCount; i++) {
			smiles += SMILE;
		}
		return intro + mid + smiles;
	}
	
}
