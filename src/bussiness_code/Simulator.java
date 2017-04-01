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
			Bunny b = new Bunny("init");
			bunnyList.add(b);
			logInit(b);
		}
		emptyLine();
	}

	public static void killOld() {
		Iterator<Bunny> iter = bunnyList.listIterator();
		while (iter.hasNext()) {
			Bunny currentBunny = iter.next();

			if (currentBunny.isVampire() && currentBunny.getAge() > 50) {
				logDead(currentBunny);
				iter.remove();
			}

			if (currentBunny.getAge() > 10) {
				logDead(currentBunny);
				iter.remove();
			}
		}
		emptyLine();
	}

	public static void increaseAge() {
		for (Bunny b : bunnyList) {
			b.addAge();
		}

		killOld();
	}

	public static void reproduce() {
		int maleCount = 0;
		int femaleCount = 0;
		int sum = 0;
		int multi = 0;

		for (Bunny b : bunnyList) {
			if (b.isMale() && b.isMature()) {
				maleCount++;
			} else if (!b.isMale() && b.isMature()) {
				femaleCount++;
			}
		}

		sum = maleCount + femaleCount;
		//multi = maleCount * femaleCount;

		//		System.out.println("Male:" + maleCount + " Female:" + femaleCount + " sum:" + sum + " newBunnies:" + sum);

		for (int i = 0; i < sum; i++) {
			Bunny bunny = new Bunny();
			bunnyList.add(bunny);
			logBorn(bunny);
		}
		emptyLine();
	}

	public static void foodShortage() {
		if (bunnyList.size() > 1000) {
			// TODO: DELETE EFFECTIVELY half of the elements randomly 
		}
	}

	public static void emptyLine() {
		System.out.println("");
	}

	public static void logDead(Bunny b) {
		System.out.println("died: " + b);
	}

	public static void logBorn(Bunny b) {
		System.out.println("born: " + b);
	}

	public static void logInit(Bunny b) {
		System.out.println("init: " + b);
	}
}
