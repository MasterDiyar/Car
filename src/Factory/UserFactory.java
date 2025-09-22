package Factory;

import Factory.Player.*;
import Factory.Weaponary.*;

public class UserFactory {
    public static class createBowArcher implements CharacterFactory {

        @Override
        public UserClass createUser() {
            return new Archer();
        }

        @Override
        public Weapon createWeapon() {
            return new Bow();
        }
    }


    public static class createCrossBowArcher implements CharacterFactory {
        @Override
        public UserClass createUser() {
            return new Archer();
        }
        @Override
        public Weapon createWeapon(){
            return new CrossBow();
        }
    }

    public static class createSwordWarrior implements CharacterFactory {
        @Override
        public UserClass createUser() {
            return new Swordsman();
        }

        @Override
        public Weapon createWeapon(){
            return new Sword();
        }
    }

    public static class createAxeWarrior implements CharacterFactory {
        @Override
        public UserClass createUser() {
            return new Swordsman();
        }

        @Override
        public Weapon createWeapon(){
            return new Axe();
        }
    }
}
