package Factory.Player;

import Factory.UserClass;
import Factory.Weapon;
import Factory.Weaponary.Bow;

public class Archer extends UserClass {
    @Override
    public void heal(float damage) {
        if (damage > 0)System.out.println("Healing " + damage + " hp");
        else System.out.println("Damaging " + damage + " hp");
        Hp += damage;
        System.out.println("Archer now has " + Hp + " hp");
    }

    @Override
    public void about() {
        if (weapon == null){
            System.out.println("Archer without bow");
        }
        else if(weapon instanceof Bow){
            System.out.println("Archer with bow");
        }
        else {
            System.out.println("Archer with other weapon");
        }
    }


    @Override
    public void takeDamage(UserClass Atacker, float Damage) {

    }
}
