import java.util.Scanner;

public class DiceRoller {

	// method getRandom takes int number of sides and passes it to Math.random
	// to generate a number between 1 and sides - returns sides
	public static int getRandom(int sides) {
		int roll = (int) ((Math.random() * sides) + 1);

		return roll;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sides;

		String option;

		System.out
				.println("Welcome to the Grand Circus Casino! Rolll the dice?(y/n)");
		option = scan.nextLine();

		// if option is yes play game
		if (Character.toLowerCase(option.charAt(0)) == 'y') {

			System.out.println("How many sides for each die?");
			sides = scan.nextInt();

			// counter for number of rolls
			int count = 1;

			// garbage
			scan.nextLine();

			// do/while - output roll and call method getRandom() twice to
			// generate dice rolls passing it amount of sides
			do {
				System.out.println("Roll " + count + ":");

				System.out.println(getRandom(sides));
				System.out.println(getRandom(sides));

				System.out.println("Roll again?(y/n)");
				option = scan.nextLine();

				count++;

			} while (Character.toLowerCase(option.charAt(0)) == 'y');
		}

		// exit program
		System.out.println("Goodbye");
		scan.close();
	}
}
