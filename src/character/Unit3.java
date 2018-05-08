package character;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project.GamePanel;

public class Unit3 implements UnitControl {

	private int unitHp = 45;
	private int unitPower = 14;
	private String unitName = "ªÍªÁ√·";
	private int unitNumber = 3;
	private int unitSpeed = 5;
	private int unitPrice = 30;
	private int unitLevel = 1;

	public int getUnitLevel(){
		return this.unitLevel;
	}
	public void setUnitLevel(int unitLevel){
		this.unitLevel = unitLevel;		
	}
	
	public int getUnitNumber() {
		return this.unitNumber;
	}

	public int getUnitHp() {
		return this.unitHp;
	}

	public void setUnitHp(int unitHP) {

		this.unitHp = unitHP;
	}

	public int getUnitPower() {
		return this.unitPower;
	}

	public void setUnitPower(int unitPower) {

		this.unitPower = unitPower;
	}

	public String getUnitName() {
		return this.unitName;
	}

	private int getUnitSpeed() {
		return this.unitSpeed;
	}

	public void setUnitNumber(int unitNumber) {
		// TODO Auto-generated method stub

	}

	public void setUnitName(String unitName) {
		// TODO Auto-generated method stub

	}

}
