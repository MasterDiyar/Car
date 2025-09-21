package Factory;

import Factory.Player.Alchemic;
import Factory.Player.Archer;
import Factory.Player.Homunculus;
import Factory.Weaponary.Bow;
import Factory.Weaponary.Fist;
import Factory.Weaponary.Sword;

public class UserFactory {

    public UserClass ArcherWithBow(){
        return new Archer()
                .setWeapon(new Bow())
                .setHp(20)
                .setDamage(7)
                .setMana(45);
    }

    public UserClass ArcherWithSword(){
        return new Archer()
                .setWeapon(new Sword()
                        .setName("escalibur"))
                .setHp(20)
                .setDamage(12)
                .setMana(20)
                .setArmor(3);
    }

    public UserClass Alchemist(){
        return new Alchemic()
                .setWeapon(new Fist())
                .setHp(22)
                .setDamage(7)
                .setMana(80)
                .setArmor(11);
    }

    public UserClass HomunculusWithBow(){
        return new Homunculus()
                .setWeapon(new Fist())
                .setHp(20)
                .setDamage(7)
                .setMana(20);
    }





}
