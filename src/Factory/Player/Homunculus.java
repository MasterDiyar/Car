package Factory.Player;

import Factory.UserClass;

public class Homunculus extends UserClass {
    @Override
    public void heal(float damage) {
        if (damage > 0)System.out.println("Healing " +1.2f * damage + " hp");
        else System.out.println("Damaging " + damage * 1.2f + " hp");
        Hp += damage*1.2f;
        System.out.println("Homunculus now has " + Hp + " hp");
    }

    @Override
    public void about() {
        System.out.print("Homunculus with fists ");
    }

    @Override
    public void takeDamage(UserClass Atacker, float Damage) {
        Atacker.heal(Damage);
    }
}
