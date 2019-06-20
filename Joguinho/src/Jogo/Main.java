package Jogo;

import Elementos.Heroi;
import Itens.Item;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
	private static final long serialVersionUID = 1L;
	private Heroi h;
   
    

	public Main() throws IOException {
        initComponents();
        
        this.getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setVisible(true);         
    }
	
	public Heroi getH() {
		return h;
	}

	public void setH(Heroi h) {
		this.h = h;
	}
	
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        warrior = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        weapon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        life = new javax.swing.JLabel();
        inv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WrightSword");
        setPreferredSize(new java.awt.Dimension(992, 540));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WARRIOR");

        warrior.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        warrior.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WEAPON");

        weapon.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        weapon.setForeground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LIFE");

        life.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        life.setForeground(new java.awt.Color(204, 204, 204));

        inv.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        inv.setForeground(new java.awt.Color(255, 204, 0));
        inv.setText(" - INSTRUCTIONS -");
        inv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(life)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                        .addComponent(inv)
                        .addGap(210, 210, 210))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warrior)
                            .addComponent(weapon))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(warrior, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weapon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(life))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inv)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch (evt.getKeyCode())
        {
            case KeyEvent.VK_DOWN:
                h.drawImage(this.getGraphics(), h.getPath());
                h.move(2);
                break;
            case KeyEvent.VK_UP:
                h.drawImage(this.getGraphics(), h.getPath());
                h.move(5);
                break;
            case KeyEvent.VK_LEFT:
                h.drawImage(this.getGraphics(), h.getPath());
                h.move(1);
                break;
            case KeyEvent.VK_RIGHT:
                h.drawImage(this.getGraphics(), h.getPath());
                h.move(3);
                break;
            case KeyEvent.VK_SPACE:
                h.action();
                break;
            case KeyEvent.VK_ENTER:
                List<String> listaStr = new ArrayList<String>();
                List<Item> listaItem = h.getInventory();
                
                for(Item i: listaItem)
                    listaStr.add(i.name());
                
                Object lista[] =  listaStr.toArray();
                Object selected = JOptionPane.showInputDialog(null, "Choose your weapon wisely...", "Inventory", JOptionPane.QUESTION_MESSAGE, null, lista, lista[0]);
                int index = listaStr.indexOf(selected);
                h.usar(index);
                break;
        }     
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
         
    }//GEN-LAST:event_formKeyTyped

    private void invMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invMouseClicked
        String msg = "You must destroy the 4 gates to escape\n"
                + "Each gate has its matching weapon\n"
                + "Some garden walls are weaker so you may destroy them\n"
                + "Chests may hide good or bad surprises\n"
                + "\n"
                + " -- -- -- -- --  CONTROLS  -- -- -- -- -- \n"
                + "Use Arrow Keys to Move\n"
                + "Press Enter to Open Your Inventory\n"
                + "Press Space to Interact with Objects\n"
                + "\n"
                + "Have fun!";
        
        JOptionPane.showMessageDialog(null, msg, "Instructions", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_invMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel inv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel life;
    private javax.swing.JLabel warrior;
    private javax.swing.JLabel weapon;
    // End of variables declaration//GEN-END:variables
    
    public void status()
    {
       warrior.setText(h.getName());
       life.setText(Integer.toString(h.getLife()));
       weapon.setText(h.getA().name());
    }
    
    public void gameOver()
    {
        JOptionPane.showMessageDialog(null, "GOOD LUCK NEXT TIME", "GAME OVER", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
    public void youWon()
    {
        JOptionPane.showMessageDialog(null, "YOU WON !!!", "CONGRATULATIONS", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
    public String getHeroName()
    {
        return JOptionPane.showInputDialog(null, "Create a name for the player", "Warrior\'s Name", JOptionPane.DEFAULT_OPTION).toUpperCase();    
    }
}
