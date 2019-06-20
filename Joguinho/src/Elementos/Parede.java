package Elementos;


public class Parede extends Element{
	
	private static final boolean BLOCK = true;
	
	public Parede(int y, int x)
	{
                this.y = y;
                this.x = x;
		this.block = BLOCK;
                this.path = PATH_AUX +"Wall.png";
	}
	
	@Override
	public boolean action(Heroi x) {
		return false;	
	}

}
