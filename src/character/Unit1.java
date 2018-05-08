package character;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project.Controller;
import project.GamePanel;

public class Unit1 implements UnitControl {

	private int unitHp = 15;
	private int unitPower = 5;
	private String unitName = "∫¥∏∆¡÷";
	private int unitNumber = 1;
	private int unitSpeed = 5;
	private int unitPrice = 10;
	private int unitLevel = 0 ;
	
	
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
