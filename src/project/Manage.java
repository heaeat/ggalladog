package project;

public class Manage {

	private int[] upgradePrice = new int[5];

	private int[] plusPlayerHP = { 100, 200, 300, 500, 1000 };
	private int[] plusPlayerMP = { 200, 500, 800, 1000, 1200 };
	private int[] plusSkill = { 1, 2, 3, 4, 5 };
	private int[] plusRecMP = { 3, 5, 10, 15, 20 };

	private int[] plusUnitPower = { 5, 10, 15, 20, 25 };
	private int[] plusUnitHP = { 10, 15, 20, 25, 30 };


	public int getUpgradePrice(int i, int check){
		switch (check) {
		case 1:
			this.upgradePrice[0] = 100;
			this.upgradePrice[1] = 200;
			this.upgradePrice[2] = 250;
			this.upgradePrice[3] = 300;
			this.upgradePrice[4] = 350;
			break;
		case 2:
			this.upgradePrice[0] = 200;
			this.upgradePrice[1] = 300;
			this.upgradePrice[2] = 450;
			this.upgradePrice[3] = 500;
			this.upgradePrice[4] = 550;
			break;
		case 3:
			this.upgradePrice[0] = 300;
			this.upgradePrice[1] = 400;
			this.upgradePrice[2] = 450;
			this.upgradePrice[3] = 500;
			this.upgradePrice[4] = 600;
			break;
		case 4:
			this.upgradePrice[0] = 450;
			this.upgradePrice[1] = 500;
			this.upgradePrice[2] = 650;
			this.upgradePrice[3] = 700;
			this.upgradePrice[4] = 800;
			break;
		case 5:
			this.upgradePrice[0] = 600;
			this.upgradePrice[1] = 750;
			this.upgradePrice[2] = 850;
			this.upgradePrice[3] = 1000;
			this.upgradePrice[4] = 1200;

			break;
		case 6:
			this.upgradePrice[0] = 800;
			this.upgradePrice[1] = 1000;
			this.upgradePrice[2] = 1200;
			this.upgradePrice[3] = 1250;
			this.upgradePrice[4] = 1300;
			break;
		case 7:
			this.upgradePrice[0] = 300;
			this.upgradePrice[1] = 500;
			this.upgradePrice[2] = 700;
			this.upgradePrice[3] = 1000;
			this.upgradePrice[4] = 1200;

			break;
		case 8:
			this.upgradePrice[0] = 100;
			this.upgradePrice[1] = 300;
			this.upgradePrice[2] = 450;
			this.upgradePrice[3] = 600;
			this.upgradePrice[4] = 800;

			break;
		case 9:
			this.upgradePrice[0] = 400;
			this.upgradePrice[1] = 800;
			this.upgradePrice[2] = 1000;
			this.upgradePrice[3] = 1200;
			this.upgradePrice[4] = 1500;

			break;
		case 10:
			this.upgradePrice[0] = 200;
			this.upgradePrice[1] = 500;
			this.upgradePrice[2] = 850;
			this.upgradePrice[3] = 900;
			this.upgradePrice[4] = 1200;
			break;

		default:
			break;
		}return upgradePrice[i];
	}

	

	public int getPlusPlayerHP(int level) {
		return plusPlayerHP[level];
	}

	public int getPlusPlayerMP(int level) {
		return plusPlayerMP[level];
	}

	public int getPlusUnitPower(int unitLevel) {
		return plusUnitPower[unitLevel];
	}

	public int getPlusUnitHP(int unitLevel) {
		return plusUnitHP[unitLevel];
	}

	public int getPlusRecMP(int level) {
		return plusRecMP[level];
	}

	public int getPlusSkill(int level) {
		return plusSkill[level];
	}

}