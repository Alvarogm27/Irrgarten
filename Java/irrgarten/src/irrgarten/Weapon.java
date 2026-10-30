package irrgarten;

/**
 *
 * @author agarmar
 */
public class Weapon {
    private float power;
    private int uses;
    
    
    public Weapon(float power, int uses) {
        this.power = power;
        this.uses = uses;
    }
    public Weapon(){
        this(Dice.weaponPower(), Dice.usesLeft());
    }

    public float attack() {
        
        if (uses > 0) {
            uses --;  
            return power;
  
        }

        return 0;
    }
    public String toString() {

        return "W["+power+","+uses+"]";

    }
    public boolean Discard(){
        return Dice.discardElement(this.uses);
    }
}
