package ua.mystudy.spring.stobf.fighter;

import java.util.Random;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;

import ua.mystudy.spring.stobf.armorinterface.Unit;
import ua.mystudy.spring.stobf.bodypart.BodyPart;

public class Fighter implements Unit, InitializingBean, DisposableBean  {
	private String Name;
	private float Weight;
	private float Speed;
	private float Strength;

	private BodyPart Hands; 
	private BodyPart Head;
	private BodyPart Body;
	private BodyPart Legs; 
	
	
	
	public Fighter(String name ) {
		Name = name;
		Weight = 70.0f;
		Speed = 12;
		Strength = 30;

	}
	

	public Fighter(String name, float weight, float speed, float strength) {
        super();
        Name = name;
        Weight = weight;
        Speed = speed;
        Strength = strength;
    }



    public BodyPart getHands() {
		return Hands;
	}

	public void setHands(BodyPart hands) {
	    
		Hands = hands;
		System.out.println("Hands created");
	}

	public BodyPart getLegs() {
		return Legs;
		
	}

	public void setLegs(BodyPart legs) {
		Legs = legs;
		System.out.println("Legs created");
	}

	public BodyPart getBody() {
		return Body;
	}

	public void setBody(BodyPart body) {
		this.Body = body;
		System.out.println("Body created");
	}

	public BodyPart getHead() {
		return Head;
	}

	public void setHead(BodyPart head) {
		Head = head;
		System.out.println("Head created");
	}

	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public float getWeight() {
		return Weight;
	}
	
	
	public void setWeight(float weight) {
		Weight = weight;
	}
	
	public float getSpeed() {
		return Speed;
	}
	
	public void setSpeed(float speed) {
		Speed = speed;
	}
	
	public float getStrength() {
		return Strength;
	}
	
	public Fighter() {
        super();
    }

    public void setStrength(float strength) {
		Strength = strength;
	}
	
	public float generateFloat() {
	   
	    float minimalValue = 1F;
	    float maximalValue = 10F;
	    float generatedFloat = minimalValue + new Random().nextFloat() * (maximalValue - minimalValue);
	    System.out.println("generatedFloat " + generatedFloat);
		return generatedFloat;
		
	}



    @Override
    public void Attac() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Deffense() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ShowInfo() {
        System.out.println("Name " + this.getName());
        System.out.println("Weight " + this.getWeight());
        System.out.println("Speed " + this.getSpeed());
        System.out.println("Strength " + this.getStrength());
        System.out.println("Head Armor " + this.Head.getHeavyArmor()+ " eqiped " + this.Head.isWearing_armor());
        System.out.println("Boby Armor " + this.Body.getLightArmor()+ " eqiped " + this.Body.isWearing_armor());
        System.out.println("Hands Armor " + this.Hands.getLightArmor() +" eqiped " + this.Hands.isWearing_armor());
        System.out.println("Legs Armor " + this.Legs.getLightArmor() +" eqiped " + this.Legs.isWearing_armor());
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
