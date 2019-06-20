package Elementos;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public abstract class Element {
	
	protected int y;
	protected int x;
	protected boolean block;
    protected int WIDTH = 32;
	protected int HEIGHT = 32;
    protected String PATH_AUX = "INSERT YOUR PATH HERE\\Joguinho\\Res\\Maps\\";
    protected String path;
        
        public void drawImage(Graphics g, String path)
        {
            BufferedImage img= null;
            try {
                img = ImageIO.read(new File(path));
            } catch (Exception e) {
            }
            g.drawImage(img, this.x * WIDTH, this.y * HEIGHT, WIDTH, HEIGHT, null);
        }
        
        public abstract boolean action(Heroi x);

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
  
}
