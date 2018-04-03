package Classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiantMothTest {

    GiantMoth mothra;
    Tank sherman;

    @Before
    public void setUp() {
        mothra = new GiantMoth("Mothra", 500, 150, "FLY STRANGE-ELY");
        sherman = new Tank(250);
    }

    @Test
    public void canAttack() {
        System.out.println(sherman.getHealthValue());
        mothra.attack(sherman);
        System.out.println(sherman.getHealthValue());
    }

    @Test
    public void canRoar() {
        System.out.println(mothra.roar());
    }

    @Test
    public void canMove() {
        System.out.println(mothra.move());
    }

    @Test
    public void canGetName() {
        assertEquals("Mothra", mothra.getName());
    }

    @Test
    public void canSetName() {
        assertEquals("Mothra", mothra.getName());
        mothra.setName("Christine");
        assertEquals("Christine", mothra.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(500, mothra.getHealthValue(), 0.01);
    }

    @Test
    public void canSetHealthValue() {
        assertEquals(500, mothra.getHealthValue(), 0.01);
        mothra.setHealthValue(750);
        assertEquals(750, mothra.getHealthValue(), 0.01);
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(150, mothra.getAttackValue(), 0.1);
    }

    @Test
    public void canSetAttackValue() {
        assertEquals(150, mothra.getAttackValue(), 0.1);
        mothra.setAttackValue(250);
        assertEquals(250, mothra.getAttackValue(), 0.1);
    }
}
