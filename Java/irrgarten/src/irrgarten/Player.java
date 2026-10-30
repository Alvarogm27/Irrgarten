package irrgarten;

import java.util.ArrayList;

/**
 *
 * @author agarmar
 */
public class Player {
    private static int MAX_WEAPONS = 2;
    private static int MAX_SHIELDS = 3;
    private static int INITIAL_HEALTH = 10;
    private static int HITS2LOSE = 3;
    
    private String name;
    private char number;
    private float intelligence;
    private float strength;
    private float health;
    private int row;
    private int col;
    private int consecutiveHits = 0;
    
    //atributos de relaciones
    private ArrayList<Weapon> weapons;
    private ArrayList<Shield> shields;
    
    //ejemplo de equipos
    private ArrayList<Team> teams;
    
    
    
    public Player(char number, float intelligence, float strength){
        this.name = "Player #" + number;
        this.number = number;
        this.intelligence = intelligence;
        this.strength = strength;
        this.consecutiveHits = 0;
        this.health = Player.INITIAL_HEALTH;
        this.col = -1;
        this.row = -1;
        this.weapons = new ArrayList<>();
        this.shields = new ArrayList<>();
        
        //ejemplo equipos
        this.teams = new ArrayList<>();
        
    }
    
    public void resurrect(){
        weapons = new ArrayList<>();
        shields = new ArrayList<>();
        health = Player.INITIAL_HEALTH;
        consecutiveHits = 0;
    }
    
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public char getNumber(){
        return number;
    }
    
    public void setPos(int row, int col){
        this.row = row;
        this.col = col;
    }
    
    public boolean dead(){
        return heatlh <= 0;
    }
    
    //public Directions move (Directions direction, ArrayList<Directions> validMoves){}
    
    public float attack(){
        return strength + sumWeapons();
    }
    
    public boolean defend(float recievedAttack){
        return manageHit(float recievedAttack);
    }
    
    //public void recieveReward(){}
    
    public String toString(){
        return name + "\n" +
               "Inteligencia: " + intelligence + "\n" +
               "Fuerza: " + strength + "\n" + 
               "Vida: " + health + "\n" +
               "Posicion: " + row + "," + col + "\n";
    }
    
    //private void recieveWeapon(Weapon w){}
    //private void recieveShield(Shield s){}
    
    private Weapon newWeapon(){
        return new Weapon();
    }
    
    private Shield newShield(){
        return new Shield();
    }
    
    private float sumWeapons(){
        float suma = 0.0f;
        for(Weapon arma: this.weapons){
            suma += arma.attack();
        }
        
        return suma;
    }
    
    private float sumShields(){
        float suma = 0.0f;
        for(Shield escudo: this.shields){
            suma += escudo.protect();
        }
        return suma;
    }
    
    private float defensiveEnergy(){
        
    }
    
    //private boolean manageHit(float recievedAttack){}
    
    private void resetHits(){
        
    }
    
    private void gotWounded(){
        health--;
    }
    
    private void incConsecutiveHits(){
        
    }
    
    
    
    //Metodo para añadir equipos Extra a la practica 2
    public void addTeam(Team team){
        this.teams.add(team);
    }
    

    
    public void takeWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }
    
}
