package Elementos;


public class Rocha extends Element{

	public Rocha(int y, int x)
	{
                this.y = y;
                this.x = x;
		this.block = true;
                this.path = PATH_AUX +"Rock.png";
	}
	
	public boolean isBreakable()
	{
		return true;
	}

	@Override
	public boolean action(Heroi x) {
		return true;
	}	
}
