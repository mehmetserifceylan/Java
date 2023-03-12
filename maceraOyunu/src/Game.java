import java.util.Scanner;

public class Game {
    public void start() {
        Scanner scanning = new Scanner(System.in);
        System.out.println("HOSGELDINIZ");
        Player player = new Player("Serif");
        player.selectChar();
        Location location = null;
        boolean gameover = false;



        while (true) {
            player.printPlayerInfo();
            System.out.println("----------------------------------");
            System.out.println("Please select the number of the place you want to go");
            System.out.println("----------------------------------");
            System.out.println("1 : SafeHouse💒\n"
                    + "2 : ToolStore🏹🔨\n" + "3: Cave🪨\n" + "4: Forest🌳🌲\n" + "5: River🤽\n" +"6: Mine⛏\n" + "7 :Prize Area🏆 if you collect the all award and go to the this are you can Finish the game🔚");
            int input = scanning.nextInt();
            switch (input) {
                case 1:
                    System.out.println("You are entering the SafeZone🏠 Health is full in SAFEZONE💞");
                    location = new Base(player);
                    break;
                case 2:
                    System.out.println("You are entering the ToolStore🛠");
                    location = new ToolStore(player);
                    break;
                case 3:if(!player.getInventory().isFood()){
                    System.out.println("You are entering Cave🪨");
                    location = new Cave(player);
                }else {
                    System.out.println("You already collect the award you can't go there");
                    location = new Base(player);
                } break;

                case 4:
                    if(!player.getInventory().isFirewood()){
                        System.out.println("You are entering Forest🌲🌳 ");
                      location = new Forest(player);
                    }else {
                        System.out.println("You already collect the award you can't get in");
                        location = new Base(player);
                    } break;
                case 5:
                    System.out.println("You are entering River🤽");
                    location = new River(player);
                    break;
                case 6:
                    System.out.println("You are entering Mine⛏");
                    location = new Mine(player);
                    break;
                case 7:
                    System.out.println("Prize area🏆");

                    break;
                default:
                    location = new Base(player);
            }
            if(player.getInventory().isWater() && player.getInventory().isWater() && player.getInventory().isFirewood()){
                System.out.println("Congrulations you collect the all award GAME OVER");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            } else location.onLocation();


        }
    }
}

