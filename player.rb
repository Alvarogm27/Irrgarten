module Irrgarten
  class Player
    @@MAX_WEAPONS = 2
    @@MAX_SHIELDS = 3
    @@INITIAL_HEALTH = 10.0
    @@HITS2LOSE = 3  
  

    def initialize(number, intelligence, strength)
      @name = "Player #" + number
      @number = number
      @intelligence = intelligence
      @strength = strength
      @consecutiveHits = 0
      @health = Player.INITIAL_HEALTH
      @col = -1
      @row = -1
      @weapons = []
      @shields = Array.new  # hace lo mismo que el de arriba
    end
    
    def sum_weapons
      suma = 0.0
      for arma in @weapons
        suma += arma.attack
      end
      suma
    end

    def take_weapon(weapon)
      @weapons << weapon
      weapon.give_to_player(self)
    end

    

  end
end