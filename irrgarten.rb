require_relative 'directions'
require_relative 'weapon'
require_relative 'dice'


require_relative 'player'

require_relative 'labyrinth'
module Irrgarten


  class TestP1
    def self.main
      #pruebas de la practica 2

      jugador = Player.new('1', Dice.random_intelligence, Dice.random_strength)
      arma = Weapon.new(Dice.weapon_power, Dice.uses_left)
      jugador.take_weapon(arma)
      arma2 = Weapon.new(Dice.weapon_power, Dice.uses_left)
      jugador.take_weapon(arma2)

      #Crear laberinto
      laberinto = Labyrinth.new(4, 5, 2, 1)

      dir = Directions::LEFT

      arma = Weapon.new(3.5,5)

      inteligencia = 0.0
      usos = -1
      for i in 1 .. 10
        inteligencia = Dice.random_intelligence
        usos = Dice.uses_left
      end

      puts "MAX_USES = " + Dice.MAX_USES.to_s

      #Llamada al constructor con parametros por defecto
      #arma2 = Weapon.new

      arma2 = Weapon.new_default

      mis_colores = arma2.colores
      mis_colores[0] = "AMARILLO"

      puts "Adios"

    end #main
  end #TestP1

end #Modulo


Irrgarten::TestP1.main