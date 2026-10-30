    package irrgarten;

/**
 *
 * @author agarmar
 */
public class Backpack {
    //BIEN; pero lo hacemos mejor con un Array
    //private Weapon weapon1;
    //private Weapon weapon2;
    
    private Weapon[] weapons;
    
    
    //MAL
    //public Backpack(){
    //  this.weapons = new Weapon[2];
    //}
      
    public Backpack(Weapon weapon1, Weapon weapon2){
        this.weapons = new Weapon[2];
        
        //MAL 
        //this.weapons[0] = weapon1;
        //this.weapons[1] = weapon2;
        
        //REGULAR
        //this.weapons[0] = new Weapon(weapon1.getPower(), weapon1.getUses());
        //this.weapons[1] = new Weapon(weapon2.getPower(), weapon2.getUses());
        
        //BIEN
        //this.weapons[0] = new Weapon(weapon1);
        //this.weapons[1] = new Weapon(weapon2);
        
        
        
    }
    
    public Backpack(float power1, int uses1, float power2, int uses2){
        this.weapons = new Weapon[2];
        
        this.weapons[0] = new Weapon(power1, uses1);
        this.weapons[1] = new Weapon(power2,uses2);
    }
    
}
