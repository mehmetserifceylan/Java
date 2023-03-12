import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String locName;
    protected Scanner input = new Scanner(System.in);
    public Location(Player player ,String locName) {
        this.player=player;
        this.locName = locName;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }
    public abstract boolean onLocation();
}
