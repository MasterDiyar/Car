package Factory;

public abstract class UserClass {
    public float Hp;
    public float Armor;
    public float Mana;
    public float Damage;
    public Weapon weapon;

    public abstract void heal(float damage);
    public abstract void openIneventory();
    public abstract void changeWeapon(Weapon weapon);

    public abstract void takeDamage (UserClass Atacker, float Damage);

    public UserClass setHp(float Hp) {
        this.Hp = Hp;
        return this;
    }
    public UserClass setArmor(float Armor) {
        this.Armor = Armor;
        return this;
    }
    public UserClass setMana(float Mana) {
        this.Mana = Mana;
        return this;
    }
    public UserClass setDamage(float Damage) {
        this.Damage = Damage;
        return this;
    }

    public UserClass setWeapon(Weapon weapon){
        this.weapon = weapon;
        return this;
    }
}
