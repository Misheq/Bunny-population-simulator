package bussiness_code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Simulator {

	static List<Bunny> bunnyList = new ArrayList<>();

	private Simulator() {

	}

	public static void initialBunnies() {
		for (int i = 0; i < 5; i++) {
			Bunny b = new Bunny();
			bunnyList.add(b);
		}

		log("init");
	}

	public static void killOld() {
		Iterator<Bunny> iter = bunnyList.listIterator();
		while (iter.hasNext()) {
			Bunny currentBunny = iter.next();

			if (currentBunny.isVampire() && currentBunny.getAge() > 50) {
				iter.remove();
			}

			if (currentBunny.getAge() > 10) {
				iter.remove();
			}
		}

		log("kill");
	}

	public static void increaseAge() {
		for (Bunny b : bunnyList) {
			b.addAge();
		}

		log("age");

		killOld();

	}

	//	public static void log() {
	//		for (Bunny b : bunnyList) {
	//			System.out.println(b);
	//		}
	//		System.out.println("");
	//	}

	public static void log(String tipp) {
		for (Bunny b : bunnyList) {
			System.out.println(tipp + ": " + b);
		}
		System.out.println("");
	}
}
