package ua.mystudy.spring.stobf.armorparts;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Armor implements InitializingBean, DisposableBean{
	private String Name;
	private float Deffence;	
	
	
	public Armor(String name, float deffence) {
		super();
		Name = name;
		Deffence = deffence;
	}
	public Armor() {
        super();
    }
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getDeffence() {
		return Deffence;
	}
	public void setDeffence(float deffence) {
		Deffence = deffence;
	}
	public void DefInfo(){
	    System.out.println(" Name " +this.getName()+" Armor Deffence "+ this.getDeffence());
	}
    @Override
    public void destroy() throws Exception {
        System.out.println(this + " - method destroy()");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " - method init()");

    }


}
