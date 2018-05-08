package character;

public class UnitRole implements UnitControl{

	UnitControl uc = null;
	
	public UnitRole(Unit1 u1)
	{
		this.uc = u1;
	}
	public UnitRole(Unit2 u2)
	{
		this.uc = u2;
	}
	public UnitRole(Unit3 u3)
	{
		this.uc = u3;
	}
	public UnitRole(Unit4 u4)
	{
		this.uc = u4;
	}
	public UnitRole(Unit5 u5)
	{
		this.uc = u5;
	}
	public UnitRole(Unit6 u6)
	{
		this.uc = u6;
	}
	public void changeMode(Object o)
	{
		if((o instanceof Unit1))
		{
			this.uc = ((Unit1)o);
		}
		else if((o instanceof Unit2))
		{
			this.uc = ((Unit2)o);
		}
		else if((o instanceof Unit3))
		{
			this.uc = ((Unit3)o);
		}
		else if((o instanceof Unit4))
		{
			this.uc = ((Unit4)o);
		}
		else if((o instanceof Unit5))
		{
			this.uc = ((Unit5)o);
		}
		else if((o instanceof Unit6))
		{
			this.uc = ((Unit6)o);
		}
		
	}

	public void setUnitNumber(int unitNumber) {
		// TODO Auto-generated method stub
		
	}

	public int getUnitNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setUnitHp(int unitHp) {
		// TODO Auto-generated method stub
		
	}

	public int getUnitHp() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setUnitPower(int unitPower) {
		// TODO Auto-generated method stub
		
	}

	public int getUnitPower() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setUnitName(String unitName) {
		// TODO Auto-generated method stub
		
	}

	public String getUnitName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setUnitLevel(int unitLevel) {
		// TODO Auto-generated method stub
		
	}
	public int getUnitLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
}