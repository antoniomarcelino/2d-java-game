package Jogo;

import Elementos.*;
import Itens.Arma;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

public class Mapa {
    private JFrame jframe;
	private Element[][]mapa;
	private int gates;
	private int open_gates;
	private Heroi h;
	private int LIN = 12;
	private int COL = 31;
	
	public Mapa(String path, JFrame jframe) throws IOException
	{
        this.jframe = jframe;
		this.setMapa(loadMap(path));
	}
       
	
	public Element[][] loadMap(String path) throws IOException
	{
		Element[][]map = new Element[LIN][COL];
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		
		int l = 0;
		for (int i = 0; i < LIN; i++) {
			for (int j = 0; j < COL; j++, l++) {
				
				char s = str.charAt(l);
				Element e = null;
				switch(s)
				{
					case 'W':
						e = new Agua(i, j);
						this.gates++;
						break;
					case 'E':
						e = new Terra(i, j);
						this.gates++;
						break;
					case 'F':
						e = new Fogo(i, j);
						this.gates++;
						break;
					case 'A':
						e = new Ar(i, j);
						this.gates++;
						break;
					case 'R':
						e = new Rocha(i, j);
						break;            
					case 'B':
						e = new Bau();
	                    e.setY(i);
	                    e.setX(j);
						break;
					case 'X':
						e = new BauX(i, j);
						break;
					case '*':
						e = new Parede(i, j);
						break;
					case '#':
						e = new Heroi(this, i, j);
						this.setH((Heroi) e);
						break;
					case '-':
						e = new Floor(i, j);
						break;
					case 'e':
						e = new Bau(new Arma("SWORD", 0));
	                    e.setY(i);
	                    e.setX(j);
						break;
					case 'f':
						e = new Bau(new Arma("SWORD", 3));
	                    e.setY(i);
	                    e.setX(j);
						break;
					case 'w':
						e = new Bau(new Arma("SWORD", 1));
		                e.setY(i);
		                e.setX(j);
						break;
					case 'a':
						e = new Bau(new Arma("SWORD", 2));
	                    e.setY(i);
	                    e.setX(j);
						break;
				}
				map[i][j] = e;
			}
		}
		br.close();
		return map;
	}

	public boolean win()
	{
		if(this.gates == this.open_gates)
			return true;
		return false;
	}

	public void drawMap()
	{
		for (int i = 0; i < LIN; i++) 
			for (int j = 0; j < COL; j++) 
				mapa[i][j].drawImage(jframe.getGraphics(), mapa[i][j].getPath());         
	}
        
       
	public Element[][] getMapa() {
		return mapa;
	}
	public void setMapa(Element[][] mapa) {
		this.mapa = mapa;
	}
	
	public Heroi getH() {
		return h;
	}
	public void setH(Heroi h) {
		this.h = h;
	}

	public int getLin() {
		return LIN;
	}
	public void setLin(int lin) {
		this.LIN = lin;
	}

	public int getCol() {
		return COL;
	}
	public void setCol(int col) {
		this.COL = col;
	}

	public int getGates() {
		return gates;
	}
	public void setGates(int gates) {
		this.gates = gates;
	}

	public int getOpen_gates() {
		return open_gates;
	}
	public void setOpen_gates(int open_gates) {
		this.open_gates = open_gates;
	}
	
	public JFrame getJframe() {
		return jframe;
	}
	public void setJframe(JFrame jframe) {
		this.jframe = jframe;
	}

}
