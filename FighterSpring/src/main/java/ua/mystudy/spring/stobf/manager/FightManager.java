package ua.mystudy.spring.stobf.manager;

import ua.mystudy.spring.stobf.armorinterface.FightsManager;
import ua.mystudy.spring.stobf.fighter.Fighter;

public abstract class FightManager implements FightsManager{
    
    @Override
    public abstract Fighter createFigter();
	

}
