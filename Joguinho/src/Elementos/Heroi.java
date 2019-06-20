package Elementos;

import Jogo.Mapa;
import Itens.Arma;
import Itens.Item;

import java.util.ArrayList;

public class Heroi extends Element{
	private ArrayList<Item> inventory;
	private Mapa mapa;
	private String name;
	private int life;
	private Arma a;
	private int dir;
	private boolean alive;
	
	public Heroi(Mapa mapa, int y, int x)
	{
		this.mapa = mapa;
		this.y = y;
		this.x = x;
		this.inventory = new ArrayList<>();
		inventory.add(new Arma("KNIFE", 4));
		this.life = 100;
		this.a = (Arma) inventory.get(0);
		this.dir = 5;
		this.alive = true;
	}
	
	public void move(int dir)
	{
		int y = this.getY();
		int x = this.getX();
		int new_y, new_x;
		
		switch(dir)
		{
			case 5:
				new_y = this.getY()-1;
				if(!this.mapa.getMapa()[new_y][x].isBlock())
				{
					this.mapa.getMapa()[new_y][x] = this;
					this.setY(new_y);
					this.mapa.getMapa()[y][x] = new Floor(y, x);
					
				}
				this.setDir(5);
				break;
			case 2:
				new_y = this.getY()+1;
				if(!this.mapa.getMapa()[new_y][x].isBlock())
				{
					this.mapa.getMapa()[new_y][x] = this;
					this.setY(new_y);
					this.mapa.getMapa()[y][x] = new Floor(y, x);
					
				}
				this.setDir(2);
				break;
			case 1:
				new_x = this.getX()-1;
				if(!this.mapa.getMapa()[y][new_x].isBlock())
				{
					this.mapa.getMapa()[y][new_x] = this;
					this.setX(new_x);
					this.mapa.getMapa()[y][x] = new Floor(y, x);
					
				}
				this.setDir(1);
				break;
			case 3:
				new_x = this.getX()+1;
				if(!this.mapa.getMapa()[y][new_x].isBlock())
				{
					this.mapa.getMapa()[y][new_x] = this;
					this.setX(new_x);
					this.mapa.getMapa()[y][x] = new Floor(y, x);
				}
				this.setDir(3);
				break;
		}
	}
	
	public void action()
	{
		int y = this.getY();
		int x = this.getX();
		int new_y, new_x;
		int dir = this.getDir();
		switch(dir)
		{
			case 5:
				new_y = this.getY()-1;
				Element e = this.mapa.getMapa()[new_y][x];
				if(e.action(this))
					this.mapa.getMapa()[new_y][x] = new Floor(new_y, x);
				break;
			case 2:
				new_y = this.getY()+1;
				e = this.mapa.getMapa()[new_y][x];
				if(e.action(this))
					this.mapa.getMapa()[new_y][x] = new Floor(new_y, x);
				break;
			case 1:
				new_x = this.getX()-1;
				e = this.mapa.getMapa()[y][new_x];
				if(e.action(this))
					this.mapa.getMapa()[y][new_x] = new Floor(y, new_x);
				break;
			case 3:
				new_x = this.getX()+1;
				e = this.mapa.getMapa()[y][new_x];
				if(e.action(this))
					this.mapa.getMapa()[y][new_x] = new Floor(y, new_x);
				break;
		}
	}
	
	public void usar(int o)
	{
		if(o>0 && o<=this.getInventory().size())
		{
			Item i = this.getInventory().get(o);
			i.usar(this);
		}
	}
        
	
        @Override
        public String getPath()
        {
            switch(this.dir)
		{
		case 5:
			this.path = PATH_AUX + "heroUp.png";	
			break;
		case 2:
			this.path = PATH_AUX + "heroDown.png";
			break;
		case 1:
			this.path = PATH_AUX +"heroLeft.png";
			break;
		case 3:
			this.path = PATH_AUX +"heroRight.png";
			break;
		}
            return this.path;
        }
        
	public ArrayList<Item> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public Mapa getMapa() {
		return mapa;
	}
	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}

	public Arma getA() {
		return a;
	}
	public void setA(Arma a) {
		this.a = a;
	}

	public int getDir() {
		return dir;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}

	public boolean isAlive() {
		return alive;
	}
	public void updateAlive() {
		if(this.life <= 0)
		{
			this.alive = false;
			this.life = 0;
		}
		else
		{
			if(this.life > 100)
			{
				this.life = 100;
			}
		}
	}

	@Override
	public boolean action(Heroi x) {
		return false;
	}
	
}
