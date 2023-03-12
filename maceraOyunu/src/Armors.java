public abstract class Armors {
    private String name;

    public Armors(String name, int ID, int block, int money) {
        this.name = name;
        this.ID = ID;
        this.block = block;
        this.money = money;
    }
    private int ID ;
    private int block;
    private int money;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
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
}
