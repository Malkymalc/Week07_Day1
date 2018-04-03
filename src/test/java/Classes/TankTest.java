package Classes;

import Enums.VehicleType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TankTest {

    GiantLizard godzilla;
    GiantMoth mothra;
    Tank sherman;

    @Before
    public void setUp() {
        godzilla = new GiantLizard("Godzilla", 1000, 250, "WADDLE");
        mothra = new GiantMoth("Mothra", 500, 150, "FLY STRANGE-ELY");
        sherman = new Tank(250);
    }

    @Test
    public void canAttackWithGuns() {
        sherman.attackWithGuns(godzilla);
    }

    @Test
    public void caAttackWithFire() {
        sherman.attackWithFire(godzilla);
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(250, sherman.getAttackValue(), 0.1);
    }

    @Test
    public void setAttackValue() {
        assertEquals(250, sherman.getAttackValue(), 0.1);
    }

    @Test
    public void getVehicleType() {
        assertEquals(VehicleType.TANK, sherman.getVehicleType());
    }


    @Test
    public void getHealthValue() {
        assertEquals(250, sherman.getHealthValue(), 0.1);
    }

    @Test
    public void setHealthValue() {
        sherman.setHealthValue(500);
        assertEquals(500, sherman.getHealthValue(), 0.1);
    }

    @Test
    public void getVehicleTypeString() {
        assertEquals("Tank", sherman.getVehicleTypeString());
    }

}