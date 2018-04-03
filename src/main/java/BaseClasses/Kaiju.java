package BaseClasses;

import Interfaces.IMove;

abstract public class Kaiju implements IMove {
    private String name;
    private Integer healthValue;
    private Integer attackValue;
    private String moveMethod;

    public Kaiju(String name, Integer healthValue, Integer attackValue, String moveMethod) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.moveMethod = moveMethod;
    }


    public String roar() {
        return "I AM " + this.name + " - HEAR ME ROAR!!!!!!!!!";
    }


    public String move(){
        return "I AM " + this.name + " - FEAR ME AS I " + this.moveMethod + " TOWARDS YOU IN AN AGGRESSIVE MANNER!!!!!!!!!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(Integer healthValue) {
        this.healthValue = healthValue;
    }

    public Integer getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(Integer attackValue) {
        this.attackValue = attackValue;
    }
}
