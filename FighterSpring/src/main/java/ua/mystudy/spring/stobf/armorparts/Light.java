package ua.mystudy.spring.stobf.armorparts;

import ua.mystudy.spring.stobf.armorinterface.LightArmor;

public class Light extends Armor implements LightArmor{

	public Light(String name, float deffence) {
		super(name, deffence);
		// TODO Auto-generated constructor stub
	}
	public Light() {
        super();
        // TODO Auto-generated constructor stub
    }
 public String getName(){
		 return this.getName();
	 
 }
	public boolean IsWearing() {
		// TODO Auto-generated method stub
		return false;
	}

	public float getDeff() {
	    return this.Deffence;
		// TODO Auto-generated method stub
		
	}


}
