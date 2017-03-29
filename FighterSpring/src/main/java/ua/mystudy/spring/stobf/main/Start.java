package ua.mystudy.spring.stobf.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.mystudy.spring.stobf.armorinterface.FightsManager;
import ua.mystudy.spring.stobf.fighter.Fighter;
import ua.mystudy.spring.stobf.manager.FightManager;
import ua.mystudy.spring.stobf.pool.FighterPool;

public class Start {
    public static void  main(String[] args){
        ApplicationContext AppContext = new ClassPathXmlApplicationContext("Context.xml");
//        FightManager Manager = (FightManager) AppContext.getBean("FightManager");
//        Fighter Garold = Manager.createFigter();
//        Fighter Alfred = Manager.createFigter();
//        
//
//        
//        //Fighter Pupkin = (Fighter)AppContext.getBean("Pupkin");
//        
//        Garold.generateFloat();
//        Alfred.generateFloat();
        FighterPool fighterPool = (FighterPool) AppContext.getBean("fighterPool");
        fighterPool.ShowInfo();
    }

}
