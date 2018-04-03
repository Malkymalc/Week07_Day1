package Classes;

import BaseClasses.Kaiju;
import BaseClasses.Vehicle;
import Interfaces.IAttackHumans;

public class GiantLizard extends Kaiju implements IAttackHumans {


    public GiantLizard(String name, Integer healthValue, Integer attackValue, String moveMethod) {
        super(name, healthValue, attackValue, moveMethod);
    }


    @Override
    public void attack(Vehicle vehicle) {
            int initial = vehicle.getHealthValue();
            Integer attackActual = (int) ( Math.round( Math.random() * this.getAttackValue() * 5 ));
            Integer postAttack = initial - attackActual;
            vehicle.setHealthValue(postAttack);
            System.out.println("Oh dear " + attackActual.toString() + " health points lost to Lizard Attack");
            System.out.println("Aaaagggghhhhhh, I am evil giant lizard and I crush all your base!!!");
            System.out.println(roar());
    }
}
