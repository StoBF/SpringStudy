package ua.mystudy.spring.stobf.bodypart;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;

import ua.mystudy.spring.stobf.armorinterface.HeavyArmor;
import ua.mystudy.spring.stobf.armorinterface.LightArmor;
import ua.mystudy.spring.stobf.fighter.Autowired;

public class BodyPart implements InitializingBean, DisposableBean{
	
	private float condition;
	private boolean wearing_armor;
	@Autowired
	@Qualifier("")
	private HeavyArmor heavyArmor;
	@Autowired
	@Qualifier("")
	private LightArmor lightArmor;
    
	

	public void setCondition(float condition) {
		this.condition = condition;
	}

	public boolean isWearing_armor() {
		return wearing_armor;
	}
	public void setWearing_armor(boolean wearing_armor) {
		this.wearing_armor = wearing_armor;
	}
    public HeavyArmor getHeavyArmor() {
        return heavyArmor;
    }
    public void setHeavyArmor(HeavyArmor heavyArmor) {
        this.heavyArmor = heavyArmor;
        System.out.println("heavyArmor created");getClass();
        this.wearing_armor = true;
        //this.getHavyArmor().DefInfo();
    }
    public LightArmor getLightArmor() {
        return lightArmor;
    }
    public void setLightArmor(LightArmor lightArmor) {
        this.lightArmor = lightArmor;
        System.out.println("lightArmor created");
        this.wearing_armor = true;
        //this.getLightArmor().DefInfo();
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
