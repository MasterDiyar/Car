package Factory;

public abstract class UserClass {
    public float Hp;
    public float Armor;
    public float Mana;
    public float Damage;
    public Weapon weapon;

    public abstract void heal(float damage);
    public abstract void about();
    public void changeWeapon(Weapon weapon){
        var lab = this.weapon.getClass().getCanonicalName().split("\\.");
        var blab = lab[lab.length - 1];
        System.out.println("Before: "+ blab);
        this.weapon = weapon;
        lab = weapon.getClass().getCanonicalName().split("\\.");
        blab = lab[lab.length - 1];
        System.out.println("Now: "+ blab);
    }

    public abstract void takeDamage (UserClass Atacker, float Damage);


}
