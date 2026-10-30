package irrgarten;

import java.util.Random;

/**
 *
 * @author agarmar
 */
public class Dice {
    private static int MAX_USES = 5;
    private static float MAX_INTELLIGENCE = 10.0f;
    private static float MAX_STRENGTH = 10.0f;
    private static float RESURRECT_PROB = 0.3f;
    private static int WEAPONS_REWARD = 2;
    private static int SHIELDS_REWARD = 3;
    private static int HEALTH_REWARD = 5;
    private static float MAX_ATTACK = 3.0f;
    private static float MAX_SHIELD = 2.0f;
    
    private static Random generator = new Random();
    
    public static float randomIntelligence(){
        return Dice.generator.nextFloat() * Dice.MAX_INTELLIGENCE;
    }
    
    public static int usesLeft(){
        return Dice.generator.nextInt(Dice.MAX_USES + 1);
    }
    
    public static int getMAX_USES(){
        return Dice.MAX_USES;
    }
    
    public static int randomPos(int max){
        return Dice.generator.nextInt(max);
    }
    
    public static int whoStarts(int nplayers){
        return Dice.generator.nextInt(nplayers);
    }
    
    public static float randomStrength(){
        return Dice.generator.nextFloat() * Dice.MAX_STRENGTH;
    }
    
    public static boolean resurrectPlayer(){
        return generator.nextFloat() < RESURRECT_PROB;
    }
    
    public static int weaponsReward(){
        return Dice.generator.nextInt(Dice.WEAPONS_REWARD + 1);
    }
    
    public static int shieldsReward(){
        return Dice.generator.nextInt(Dice.SHIELDS_REWARD + 1);
    }
    
    public static int healthReward(){
        return Dice.generator.nextInt(Dice.HEALTH_REWARD + 1);
    }
    
    public static float weaponPower(){
        return Dice.generator.nextFloat() * Dice.MAX_ATTACK;
    }
    
    public static float shieldPower(){
        return Dice.generator.nextFloat() * Dice.MAX_SHIELD;
    }
    
    public static float intensity(float competence){
        return Dice.generator.nextFloat() * competence;
    }
    
    public static boolean discardElement(int usesLeft){
       if(usesLeft == MAX_USES){
           return false;
       }
       return Dice.generator.nextFloat() < (1.0f - ((float) usesLeft / MAX_USES));
    }
}
