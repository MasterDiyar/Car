package Factory.Player;

import Factory.UserClass;

public class Swordsman extends UserClass
{
    public Swordsman(){
        this.Hp = 100;
        this.Armor = 15;
        this.Mana = 20;
        this.Damage = 60;
    }

    @Override
    public void heal(float damage) {
        if (damage > 0)System.out.println("Healing " +2 * damage + " hp");
        else System.out.println("Damaging " + damage + " hp");
        Hp += (damage > 0) ? 2 * damage: damage;
        System.out.println("Archer now has " + Hp + " hp");
    }

    @Override
    public void about() {
        System.out.print("Alchemic with potions ");
    }

    @Override
    public void takeDamage(UserClass Atacker, float Damage) {
    }
}
