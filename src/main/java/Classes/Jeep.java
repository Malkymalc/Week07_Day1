package Classes;

import BaseClasses.Kaiju;
import BaseClasses.Vehicle;
import Enums.VehicleType;
import Interfaces.IAttackKaiju;

public class Jeep extends Vehicle implements IAttackKaiju {


    public Jeep(Integer attackValue) {
        super(VehicleType.JEEP, attackValue);
    }

    @Override
    public void attackWithGuns(Kaiju kaiju) {
        int attackNumber = (int) ( Math.round( Math.random() * 50 ));
        while (attackNumber > 0) {
            int initial = kaiju.getHealthValue();
            Integer attackActual = (int) (Math.round(Math.random() * this.getAttackValue() * 0.1));
            Integer postAttack = initial - attackActual;
            kaiju.setHealthValue(postAttack);
            System.out.println("Let the good times roll...  " + attackActual.toString() + " damage caused to the evil monster!!!");
            attackNumber--;
        }
    }

    @Override
    public void attackWithFire(Kaiju kaiju){
            boolean monsterOnFire =  true;
            while (monsterOnFire) {
                int initial = kaiju.getHealthValue();
                Integer attackActual = (int) (Math.round(Math.random() * this.getAttackValue() * 0.7));
                Integer postAttack = initial - attackActual;
                kaiju.setHealthValue(postAttack);
                System.out.println("Let the good times roll...  " + attackActual.toString() + " damage caused to the evil monster!!!");
                if (kaiju.getClass() == GiantMoth.class) {
                    System.out.println("Hahaha....like a moth to a flame!!!");
                }
                monsterOnFire = (Math.round(Math.random() * 10)) > 6;
            }

    }
}
