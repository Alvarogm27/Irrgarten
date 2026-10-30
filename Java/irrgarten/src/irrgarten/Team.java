package irrgarten;

import java.util.ArrayList;

/**
 *
 * @author agarmar
 */
public class Team {
    private ArrayList<Player> players;
    
    public Team(){
        this.players = new ArrayList<>();
    }
    
    public void addPlayer(Player player){
        this.players.add(player);
        player.addTeam(this);
    }
}
