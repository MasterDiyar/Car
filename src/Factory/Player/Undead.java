package Factory.Player;

import Factory.UserClass;

public class Undead extends UserClass {

    public Undead() {
        this.Hp = 400;
        this.Armor = 60;
        this.Mana = 2;
        this.Damage = 90;
    }

    @Override
    public void heal(float damage) {

    }

    @Override
    public void about() {

    }

    @Override
    public void takeDamage(UserClass Atacker, float Damage) {

    }
}
