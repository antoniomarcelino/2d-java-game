package Elementos;


public class Floor extends Element{
    
	public Floor(int y, int x)
	{
		this.y = y;
		this.x = x;
                this.path = PATH_AUX + "Floor.png";
	}
        
	@Override
	public boolean action(Heroi x) {
		return false;
	}
}
