package ua.mystudy.spring.stobf.armorparts;

import ua.mystudy.spring.stobf.armorinterface.HeavyArmor;

public class Heavy extends Armor implements HeavyArmor{

	public Heavy(String name, float deffence) {
		super(name, deffence);
		// TODO Auto-generated constructor stub
	}
	
	public Heavy() {
        super();
        // TODO Auto-generated constructor stub
    }

	public boolean IsWearing() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Blocked() {
		// TODO Auto-generated method stub
		return false;
	}

	public void getDeff() {
		// TODO Auto-generated method stub
		
	}

}
