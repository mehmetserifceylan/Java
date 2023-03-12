public abstract class Weapons {
    private String weaponName;
    private int ID;
    private int damage;
    private int money;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Weapons(String weaponName, int ID, int damage, int money) {
        this.weaponName = weaponName;
        this.ID = ID;
        this.damage = damage;
        this.money = money;
    }

}
