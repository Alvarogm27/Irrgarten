package irrgarten;

/**
 *
 * @author agarmar
 */
public class Shield {
    private float protection;
    private int uses;
    
    
    public Shield(float protection, int uses) {
        this.protection = protection;
        this.uses = uses;
    }
    public Shield(){
        this(Dice.shieldPower(), Dice.usesLeft());
    }
    public float protect() {
        
        if (uses > 0) {
            uses --; 
            return protection;   
        }

        return 0;
    }
    public String toString() {

        return "W["+protection+", "+uses+"]";

    } 
    public boolean Discard(){
        return Dice.discardElement(this.uses);
    }
}
