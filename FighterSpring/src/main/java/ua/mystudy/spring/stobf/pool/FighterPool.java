package ua.mystudy.spring.stobf.pool;

import java.util.Collection;

import ua.mystudy.spring.stobf.armorinterface.Unit;
import ua.mystudy.spring.stobf.armorinterface.UnitPool;

public class FighterPool implements UnitPool {
    private Collection<Unit> unitCollection;

    @Override
    public Collection<Unit> getFighterCollection() {
        // TODO Auto-generated method stub
        return unitCollection;
    }
    public void setUnitCollection(Collection<Unit> unitCollection){
        this.unitCollection = unitCollection;
    }
    public void ShowInfo(){
        for (Unit unit : unitCollection){
            unit.ShowInfo();
        }
    }

}
