package character;

public class Player {

	private int playerHP = 1000;
	private int playerMP = 1000;
	private int recoverMP = 3;

	private int money = 3000;

	private int skillCool = 100;
	private int skillPower = 50;
	private int skillRange = 30;

	private int[] playerLevel = {0,0,0,0};		//HP SKILL MP MPREC

	public int getPlayerHP() {
		return playerHP;
	}

	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}

	public int getPlayerMP() {
		return playerMP;
	}

	public void setPlayerMP(int playerMP) {
		this.playerMP = playerMP;
	}

	public int getRecoverMP() {
		return recoverMP;
	}

	public void setRecoverMP(int recoverMP) {
		this.recoverMP = recoverMP;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getSkillCool() {
		return skillCool;
	}

	public void setSkillCool(int skillCool) {
		this.skillCool = skillCool;
	}

	public int getSkillPower() {
		return skillPower;
	}

	public void setSkillPower(int skillPower) {
		this.skillPower = skillPower;
	}

	public int getSkillRange() {
		return skillRange;
	}

	public void setSkillRange(int skillRange) {
		this.skillRange = skillRange;
	}

	public int getPlayerLevel(int i) {
		return playerLevel[i];
	}

	public void setPlayerLevel(int i, int playerLevel) {
		this.playerLevel[i] = playerLevel;
	}

}
