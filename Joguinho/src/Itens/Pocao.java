package Itens;

import Elementos.Heroi;


public class Pocao implements Item{
	private int cura;
	private String name;
      

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
	
	public Pocao(int cura, String name)
	{
		this.cura = cura;
		this.name = name;
                
	}
	
	public Pocao() {};
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public void usar(Heroi x) {
		x.setLife(x.getLife()+cura);
		int index = x.getInventory().indexOf(this);
		x.getInventory().remove(index);
	}

    

}
