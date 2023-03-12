import java.util.Random;

public abstract class BattleLoc extends Location {
    Random random = new Random();
    Obstacle obstacle;
    private String item;
    Inventory inventory;


    public BattleLoc(Player player, String locName, Obstacle obstacle, String item) {
        super(player, locName);
        this.obstacle = obstacle;
        this.item = item;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int obstacleNumber = randomObstacleNumber();

    @Override
    public boolean onLocation() {
        System.out.println("Now you are here" + this.getLocName());
        if (obstacleNumber > 0) {
            System.out.println("Be careful here " + obstacleNumber + "\t" + this.getObstacle().getName() + "\t" + "Is living ");
        } else {
            System.out.println("No Obstacle Left" + "\n" + "Leaving here 🏃‍♀️💨");
            return true;
        }
        System.out.println("Press B for Battle🏹" + "\n" + "Press R for exit🏃‍💨‍️");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("R")) {
            System.out.println("Leaving this place🏃‍️💨");
            return true;
        }
        if (selectCase.equals("B") && combat()) {
                return true;
        }
        if(this.getPlayer().getHealty()<= 0){
            System.out.println("You are Dead💀");
            return false;
        }

        return true;
    }

    public int randomObstacleNumber() {
        return random.nextInt(3) + 1;
    }

    public void AfterHit() {
        System.out.println("Player's Health❤ : " + getPlayer().getHealty() + "💖");
        if (obstacle.getHealth() > 0) {
            System.out.println("Obstacle's Health❤ : " + obstacle.getHealth() + "🖤");

            System.out.println("----------------------------------");
        }


    }

    public boolean combat() {
        int originalHealth = obstacle.getHealth();
        for (int obs = 0; obs < obstacleNumber; obs++) {
            getPlayer().printPlayerInfo();
            System.out.println("🔱🔱🔱🔱🔱🔱🔱🔱🔱🔱🔱🔱🔱🔱🔱🔱");

            getObstacle().obstacleStats();
            while (getPlayer().getHealty() > 0 && getObstacle().getHealth() > 0 && obs != obstacleNumber ) {
                int whowillshoot = random.nextInt(2);
                switch (whowillshoot) {
                    case 0:
                        System.out.println("Press R for exit🏃‍♂️💨" + "\t" + "Press B for Battle🏹");
                        String selectCase = input.nextLine();
                        selectCase = selectCase.toUpperCase();
                        if (selectCase.equals("R")) {
                            System.out.println("Leaving🏃‍♀️💨");
                            return true;

                        } else if (selectCase.equals("B")) {
                            System.out.println("You Hit with " + getPlayer().getWeapon());
                            obstacle.setHealth(obstacle.getHealth() - getPlayer().getDamage());
                            if (obstacle.getHealth() <= 0) {
                                System.out.println(obstacle.getName() + "Dead☠⚰" + " You earned " + obstacle.getKillvalue() + "💵");
                                getPlayer().setMoney(getPlayer().getMoney() + obstacle.getKillvalue());
                                obstacleNumber--;
                                if(getLocName().equals("Mine⛏")){
                                    getObstacle().award();
                                    getObstacle().setHealth(originalHealth);
                                    break;
                                }
                                getObstacle().setHealth(originalHealth);
                            }
                            AfterHit();
                        }
                        break;
                    case 1:
                        System.out.println(obs +1 +". " + obstacle.getName() + " HİT👊");
                        if (getPlayer().getHealty() > 0) {
                            if (getPlayer().getBlock() < obstacle.getDamage()) {
                                getPlayer().setHealty(getPlayer().getHealty() - (obstacle.getDamage() - getPlayer().getBlock()));
                                if(getPlayer().getHealty() <= 0){
                                    return false;
                                }
                                AfterHit();
                            } else if (getPlayer().getBlock() >= obstacle.getDamage()) {
                                getPlayer().setHealty(getPlayer().getHealty());
                                AfterHit();

                            }
                        } else
                            return false;
                        break;
                }
            }

        }
        if(this.item.equals("Water")){
            getPlayer().getInventory().setWater(true);
        }else if (this.item.equals("Firewood")){
            getPlayer().getInventory().setFirewood(true);
        }else if (this.item.equals("Food")) {
            getPlayer().getInventory().setFood(true);
        }
        return true;
    }
}
