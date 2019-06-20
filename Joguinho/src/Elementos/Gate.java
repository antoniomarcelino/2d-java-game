package Elementos;

import Jogo.Mapa;


public class Gate extends Element{
	
	protected boolean open;
	protected int elemento;
	
	public Gate()
	{
		this.block = true;
		this.open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}


        @Override
	public boolean action(Heroi x)
	{
		if(x.getA().getElemento() == this.elemento)
		{
			this.open = true;
			Mapa aux = x.getMapa();
			aux.setOpen_gates(aux.getOpen_gates()+1);
			return true;
		}
		return false;
	}
	
}
