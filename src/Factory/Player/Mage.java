package Factory.Player;

import Factory.UserClass;

public class Mage extends UserClass {
    @Override
    public void heal(float damage) {
        if (damage > 0)System.out.println("Healing " + damage + " hp");
        else System.out.println("Damaging " + 1.4f*damage + " hp");
        Hp += (damage > 0) ? damage: 1.4f*damage;
        System.out.println("Mage now has " + Hp + " hp");
    }

    @Override
    public void about() {
        System.out.print("Mage with wand. ");
    }

    @Override
    public void takeDamage(UserClass Atacker, float Damage) {
        Atacker.heal(Damage*2);
    }
}
