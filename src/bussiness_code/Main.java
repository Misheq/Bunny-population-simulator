package bussiness_code;

public class Main {

	public static void main(String[] args) {
		Simulator.initialBunnies();

		while (Simulator.bunnyList.size() != 0 && Simulator.bunnyList.size() < 10000) {
			Simulator.increaseAge();
			Simulator.reproduce();
		}
	}
}
