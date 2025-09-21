package Factory;

import Factory.Player.Archer;
import Factory.Weaponary.Bow;
import Factory.Weaponary.Fist;

public class MainFactiry {
    public static void main(String[] args) {
        UserClass user;
        UserFactory userFactory = new UserFactory();
        user = userFactory.ArcherWithBow();
        user.about();
        user.changeWeapon(new Fist().setName("gae"));
        user.about();
        user = userFactory.HomunculusWithBow();
        user.about();
    }
}
