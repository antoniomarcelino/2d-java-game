package Elementos;

import Itens.Item;
import Itens.Pocao;
import java.util.concurrent.ThreadLocalRandom;

public class Bau extends Element{
	
	protected Item i;
	
	public Bau(Item i)
	{
		this.i = i;
		this.block = true;
                this.path = PATH_AUX + "Bau.png";
	}
	
	public Bau()
	{ 
		this.i = new Pocao(ThreadLocalRandom.current().nextInt(5, 20 + 1), "MAGIC ");
		this.block = true;
                this.path = PATH_AUX + "Bau.png";
	}
	
	public Item getI() {
		return i;
	}
	public void setI(Item i) {
		this.i = i;
	}

	@Override
	public boolean action(Heroi x)
	{
		x.getInventory().add(this.getI());
		return true;
	}

}
