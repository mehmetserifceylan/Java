public class Inventory {
    private boolean water = false;
    private  boolean food = false;
    private boolean firewood = false;
    private String weaponName;
    private String armorName;
    private int damage;
    private int armor;

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;

    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Inventory(boolean water, boolean food, boolean firewood, String weaponName, String armorName, int damage, int armor) {
        this.water = water;
        this.food = food;
        this.firewood = firewood;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.damage = damage;
        this.armor = armor;
    }
}
