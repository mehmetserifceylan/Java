import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner scanning = new Scanner(System.in);
    private int block;
    private int damage;
    private int healty;
    private int money;
    private String Weapon;
    private String charName;
    private String playerName;
    
    Inventory inventory = new Inventory(false,false,false,this.getWeapon(),"",3,5);
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public void selectChar() {
        Character[] charList = {new Samurai(), new Archer(), new Knight()};
        for (Character character : charList) {
            System.out.println("Karakter  :" + character.getName() + ", Hasar :" + character.getDamage() + ", Saglik :" + character.getHealty() + ", Para :" + character.getMoney() + " Silah : " + character.getWeapon());
        }
        System.out.println("Lutfen bir karakter giriniz.");
        int input = scanning.nextInt();
        switch (input) {
            case 1:
                System.out.println("Samuray Secildi.");
                gameChar(new Samurai());
                break;
            case 2:
                System.out.println("Okcu Secildi.");
                gameChar(new Archer());
                break;
            case 3:
                System.out.println("Sovalye Secildi.");
                gameChar(new Knight());
                break;
            default:
                System.out.println("Karakter rastgele seciliyor.");
                Random random = new Random();
                int rd = random.nextInt(3);
                switch (rd) {
                    case 1:
                        System.out.println("Samuray Secildi.");
                        gameChar(new Samurai());
                        break;
                    case 2:
                        System.out.println("Okcu Secildi.");
                        gameChar(new Archer());
                        break;
                    case 3:
                        System.out.println("Sovalye Secildi.");
                        gameChar(new Knight());
                        break;
                }

        }

    }

    public void gameChar(Character character) {
        this.setDamage(character.getDamage());
        this.setHealty(character.getHealty());
        this.setMoney(character.getMoney());
        this.setCharName(character.getName());
        this.setBlock(character.getBlock());
        this.setWeapon(character.getWeapon());
    }

    public boolean weaponChoose(Weapons weapons) {
        this.setDamage(getDamage() + weapons.getDamage());
        this.setMoney(getMoney() - weapons.getMoney());
        this.setWeapon(weapons.getWeaponName());
        return false;
    }
    public boolean Weapons(Weapons weapons) {
        this.setDamage(getDamage() + weapons.getDamage());
        this.setWeapon(weapons.getWeaponName());
        return false;
    }
    public void Armors(Armors armors) {
        this.setBlock(armors.getBlock());
    }

    public void printPlayerInfo() {
        System.out.println(getPlayerName() + " bilgileri");
        System.out.println("Para : " + getMoney() + "\n" + "Hasar : " + getDamage() + "\n" + "Engelleme :" + getBlock() + "\n" + "Saglik : " + getHealty() + "\n" + "Zirh : " + getWeapon());
    }

    public void armorChoose(Armors armors) {

        this.setMoney(getMoney() - armors.getMoney());
        this.setBlock(armors.getBlock());
        System.out.println("Kalan Bakiye :" + this.getMoney());
    }

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

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
