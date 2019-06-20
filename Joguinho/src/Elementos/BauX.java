package Elementos;


import java.util.concurrent.ThreadLocalRandom;

public class BauX extends Bau{
	private int dano;
	
	public BauX(int y, int x){
		
		this.dano = ThreadLocalRandom.current().nextInt(10, 30 + 1);
                this.y = y;
                this.x = x;
                this.block = true;
                this.path = PATH_AUX + "Bau.png";
	}

        @Override
	public boolean action(Heroi x)
	{
		x.setLife(x.getLife()-dano);
		return true;
	}

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
        
		
}
