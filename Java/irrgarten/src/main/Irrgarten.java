package main;

import irrgarten.Dice;
import irrgarten.Directions;
import irrgarten.Player;
import irrgarten.Team;
import irrgarten.Weapon;

/**
 *
 * @author agarmar
 */
public class Irrgarten {

    public static void main(String[] args) {
        
        //Prueba de la practica2
        Player jugador = new Player('1', Dice.randomIntelligence(), Dice.randomStrength());
        Weapon arma = new Weapon(Dice.weaponPower(), Dice.usesLeft());
        jugador.takeWeapon(arma);
        Weapon arma2 = new Weapon(Dice.weaponPower(), Dice.usesLeft());
        jugador.takeWeapon(arma2);
        float ataque = jugador.sumWeapons();
        
        
        
        
        //Prueba equipo jugador
        Team equipo = new Team();
        equipo.addPlayer(jugador);
        //jugador.addTeam(equipo); MAL la relacion se tiene que establecer completamente en addPlayer
        
        //Mochila y armas
        
        //MAL
        //Backpack mochila = new Backpack();
        //TAMBIEN MAL
        //Backpack mochila = new Backpack(arma,arma2);
        //Backpack mochila2 = new Backpack(arma,arma2);
        
        
        
        Directions dir = Directions.DOWN;
        
        Weapon arma3 = new Weapon(3.5f, 5);
        
        //Constructor por defecto
        Weapon armaDefecto = new Weapon();
        
        //Atributo colores
        
        
        float inteligencia = 0.0f;
        int usos = -1;
        for(int i = 0; i< 10; i++){
            inteligencia = Dice.randomIntelligence();
            usos = Dice.usesLeft();
        }
        
        System.out.println("MAX_USES = " + Dice.getMAX_USES());
        
    }
    
}
