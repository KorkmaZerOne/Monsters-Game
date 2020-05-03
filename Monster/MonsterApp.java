package tecteun;

public class MonsterApp {
	
	public static double randGen() {
		double a = Math.random();
		return a;
	}
	
	public static boolean turn(Witch monster1, Bear monster2, double a) {
		if (a>=0.5) {
			int b = monster1.fireballAttack();
			return monster2.takeDamage(b);
		}
		else {
			int b = monster2.bearClawAttack();
			return monster1.takeDamage(b);
		}
	}

	public static void main(String[] args) {

		Bear beer = new Bear(50, 20);
		beer.setRagePoints(5);
		// de heks heeft 40hp ipv 30 voor een 50/50 resultaat, anders wint de beer altijd
		Witch heks = new Witch(40, 100);
		
		while(true) {
			double a = randGen();
			if (!turn(heks, beer, a)) {
				System.out.println("Match over!");
				break;
			}
			if (!turn(heks, beer, 1-a)) {
				System.out.println("Match over!");
				break;
			}
			//System.out.println("hp heks: " + heks.getHitPoints());
			//System.out.println("hp beer: " + beer.getHitPoints());
			beer.restoreRP(5);
			heks.restoreMP(4);
		}
		if (heks.getHitPoints() > 0) {
			System.out.println("De heks wint!!");
		} else {
			System.out.println("De beer wint");
		}
		
	}
}
