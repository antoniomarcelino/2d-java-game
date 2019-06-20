package Jogo;

import java.io.IOException;

public class Programa{
        public Main main;
        public boolean running;
        public Mapa mapa;
        
        
        public Programa() throws IOException
        {
            String path = "INSERT YOUR PATH HERE\\Joguinho\\Res\\Maps\\map.txt";
            this.main = new Main();
            this.mapa = new Mapa(path, main);
            this.mapa.drawMap();
            this.mapa.getH().setName(this.main.getHeroName());
            this.running = true;
            main.setH(this.mapa.getH());  
        }
        
       
        
        public void loop()
        {
            if(mapa.getH().isAlive() )
            {
                if(!mapa.win())
                {
                    this.main.status();
                    this.mapa.drawMap();
                    mapa.getH().updateAlive();
                    return;
                }
                else
                {
                    this.main.youWon();
                }
            }
            else
            {
                this.mapa.drawMap();
                this.main.gameOver();
            }
            
            this.running = false;
        }
          
	public static void main(String[] args)  throws IOException {
		Programa prog = new Programa();
		while(prog.running)
                    prog.loop();
	}
}