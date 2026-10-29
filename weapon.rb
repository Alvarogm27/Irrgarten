module Irrgarten

  class Weapon

    #Constructor con valores por defecto 
    #def initialize (power = Dice.weapon_power, uses = Dice.uses_left)

    def initialize (power, uses)
      @power = power
      @uses = uses

      #ejercicio de clase
      @players = []

      #bien, pero larga
      #@colores = [] # lo mismo que Array.new
      #@colores[0] = "Rojo"
      #@colores[1] = "Verde"

      #tipo MutsosTotos
      @colores = ["Rojo", "Verde"]
    end

    #ejercicio de clase 
    def give_to_player(player)
      @players << player
    end


    #MAL --> el reader devuelve el puntero
    #attr_reader :colores

    def colores
      #version larga
      #out = [@colores[0], @colores[1]]
      #return out 

      #version MutsosTotos
      [@colores[0], @colores[1]] 

    end

    #Constructor sin valores por defecto
    def self.new_default
      #MAL --> inicializacion de atrubutos de instancia desde clase
      #@power = power
      #@uses = uses

      new(Dice.weapon_power, Dice.uses_left)

    end

    def attack

      if @uses > 0
        @uses -= 1
        @power
      else
        0
      end

    end

    def to_s
      "W[#{@power}, #{@uses}]"
    end

  end

end