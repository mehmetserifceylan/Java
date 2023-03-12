public class Base extends NormalLoc {
    public Base(Player player){
        super(player, "Safe house");
       if(getPlayer().getCharName().equals("Samurai")){
           getPlayer().setHealty(21);
       }
       else if(getPlayer().getCharName().equals("Archer")){
           getPlayer().setHealty(18);
       }
       else if(getPlayer().getCharName().equals("Knight")){
           getPlayer().setHealty(24);
       }
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
