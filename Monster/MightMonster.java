package tecteun;

public abstract class MightMonster extends Monster {
	private int ragePoints;
	private int maxRP;

	public MightMonster() {
		
	}
	
	public MightMonster(int maxRP, int maxHP) {
		super(maxHP);
		this.maxRP = maxRP;
		this.ragePoints = maxRP;
	}

	public int getRagePoints() {
		return ragePoints;
	}

	public void setRagePoints(int ragePoints) {
		this.ragePoints = ragePoints;
	}

	public void restoreRP(int rp) {
		this.ragePoints += rp;
		if (this.ragePoints > this.maxRP) {
			this.ragePoints = this.maxRP;
		}
	}

	public boolean useRP(int rp) {
		this.ragePoints -= rp;
		if (this.ragePoints >= 0) {
			return true;
		} else {
			this.ragePoints += rp;
			return false;

		}
	}
}
