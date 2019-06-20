package Itens;

import Elementos.Heroi;


public class Arma implements Item{
	private String name;
	private String tipo;
	private int elemento;
	
        
	public Arma(String tipo, int elemento)
	{
		this.tipo = tipo;
		this.elemento = elemento;
		switch(this.elemento)
		{
		case 0:
			this.name = "EARTH";
                        
			break;
		case 1:
			this.name = "WATER";
                        
			break;
		case 2:
			this.name = "AIR";
                        
			break;
		case 3:
			this.name = "FIRE";
			break;
		case 4:
			this.name = "TRAINING";
			break;
			
		}
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
	
	@Override
	public String name() {
		return name + " " + tipo;
	}
	
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	@Override
	public void usar(Heroi x) {
		x.setA(this);		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

   

}
