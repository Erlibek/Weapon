import weapon.Weapon;

public class Player {

    private final Weapon[] weapons;

    public Player(Weapon[] weapons) {
        this.weapons = weapons;
    }

    public int getSloutsCount() {
        return weapons.length;
    }

//  public void shotWithWeapon(int slot) {
//    weapons[slot].shot();
//   }

    public void shotWithWeapon(int slot) {
        if (slot > weapons.length) {
            System.out.println("Ошибка");
            return;
        }
        Weapon weapon = weapons[slot];
        weapon.shot();
    }
}