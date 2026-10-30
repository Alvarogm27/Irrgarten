module Irrgarten

  class Shield

    def initialize(protection,uses)
      @protection = protection
      @uses = uses
    end
    
    def defence

      if @uses > 0
        @uses -= 1
        @protection
      else
        0
      end

    end
    def to_s
      "W[#{@protection}, #{@uses}]"
    end
  end

end