package Adapter;

public class WeaponMakeAdapter implements WeaponMachine {
    Ak47Creator creator;

    public WeaponMakeAdapter(Ak47Creator creator) {
        this.creator = creator;
    }
    @Override
    public void make(String material, float meter) {
        creator.CreateProduct((double) meter * 39.37, material);

    }
}
