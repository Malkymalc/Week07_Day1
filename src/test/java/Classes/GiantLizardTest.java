package Classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiantLizardTest {

    GiantLizard godzilla;
    Tank sherman;

    @Before
    public void setUp() {
        godzilla = new GiantLizard("Godzilla", 1000, 250, "WADDLE");
        sherman = new Tank(250);
    }

    @Test
    public void canAttack() {
        System.out.println(sherman.getHealthValue());
        godzilla.attack(sherman);
        System.out.println(sherman.getHealthValue());
    }

    @Test
    public void canRoar() {
        System.out.println(godzilla.roar());
    }

    @Test
    public void canMove() {
        System.out.println(godzilla.move());
    }

    @Test
    public void canGetName() {
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void canSetName() {
        assertEquals("Godzilla", godzilla.getName());
        godzilla.setName("Bob");
        assertEquals("Bob", godzilla.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(1000, godzilla.getHealthValue(), 0.01);
    }

    @Test
    public void canSetHealthValue() {
        assertEquals(1000, godzilla.getHealthValue(), 0.01);
        godzilla.setHealthValue(1100);
        assertEquals(1100, godzilla.getHealthValue(), 0.01);
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(250, godzilla.getAttackValue(), 0.1);
    }

    @Test
    public void canSetAttackValue() {
        assertEquals(250, godzilla.getAttackValue(), 0.1);
        godzilla.setAttackValue(350);
        assertEquals(350, godzilla.getAttackValue(), 0.1);
    }
}