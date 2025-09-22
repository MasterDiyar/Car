package Factory;

public class Weapon {
    public String name;
    public float damage;
    public int durability;

    public void print(){
        System.out.println(this.getClass().getSimpleName());
    }

}
