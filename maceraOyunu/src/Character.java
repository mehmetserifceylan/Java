import java.util.Scanner;

public abstract class Character {
    private String name;
    private int damage;
    private int healty;
    private int money;
    private int block;
    private String weapon;


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character(int block) {
        this.block = block;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Character(String name , int damage, int healty, int money, int block, String weapon) {
        this.name = name;
        this.damage = damage;
        this.healty = healty;
        this.money = money;
        this.weapon= weapon;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }
}

