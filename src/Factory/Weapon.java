package Factory;

public class Weapon {
    public String name;
    public float damage;
    public int durability;

    public Weapon setDamage(float damage){
        this.damage = damage;
        return this;
    }

    public Weapon setDurability(int durability){
        this.durability = durability;
        return this;
    }

    public Weapon setName(String name){
        this.name = name;
        return this;
    }
}
