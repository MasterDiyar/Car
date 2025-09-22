package Adapter;

public class MainRun {
    public static void main(String[] args) {
        WeaponMakeAdapter adapter = new WeaponMakeAdapter(new Ak47Creator());

        adapter.make( "Lead", 0.0076f);

        adapter.make( "Uranium", 0.0091f);

    }
}
