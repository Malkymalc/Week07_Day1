package Classes;

import BaseClasses.Kaiju;
import BaseClasses.Vehicle;
import Interfaces.IAttackHumans;

public class GiantMoth extends Kaiju implements IAttackHumans {

    public GiantMoth(String name, Integer healthValue, Integer attackValue, String moveMethod) {
        super(name, healthValue, attackValue, moveMethod);
    }

    @Override
    public void attack(Vehicle vehicle) {
        int attackNumber = (int) ( Math.round( Math.random() * 5 ));
        while (attackNumber > 0){
        int initial = vehicle.getHealthValue();
        Integer attackActual = (int) ( Math.round( Math.random() * this.getAttackValue() * 5 ));
        Integer postAttack = initial - attackActual;
        vehicle.setHealthValue(postAttack);
        System.out.println("Sad times, " + attackActual.toString() + " health points lost to Moth Attack");
        System.out.println("Hahaha, I am an evil giant moth, I am too quick for you!!!");
        System.out.println(roar());
        attackNumber--;
        }
    }
}
