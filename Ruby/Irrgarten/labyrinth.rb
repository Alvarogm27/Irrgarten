module Irrgarten
  class Labyrinth
    @@BLOCK_CHAR = 'X'
    @@EMPTY_CHAR = '-'
    @@MONSTER_CHAR = 'M'
    @@COMBAT_CHAR = 'C'
    @@EXIT_CHAR = 'E'
    @@ROW = 0
    @@COL = 1

    def initialize(nRows, nCols, exitRow, exitCol)
      @nRows = nRows
      @nCols = nCols
      @exitRow = exitRow
      @exitCol = exitCol

      @labyrinth = Array.new(@nRows, 
                             Array.new(@nCols,@@EMPTY_CHAR))

      @monsters = Array.new(@nRows, 
                            Array.new(@nCols,nil))
      
      @players = Array.new(@nRows, 
                            Array.new(@nCols,nil))

      @labyrinth[@exitRow][@exitCol] = @@EXIT_CHAR
    end

  end
end