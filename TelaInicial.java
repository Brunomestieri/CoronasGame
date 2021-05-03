import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import java.awt.Dimension;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TelaInicial extends JFrame{
    JButton botao1,botao2, botao3;
    JPanel panel;
    JLabel label;
    
    public void criaJanela()
    {
        setResizable(false);
        panel = new JPanel();
        panel.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setType(java.awt.Window.Type.POPUP);
        setLocationRelativeTo(null);
        
        // ========== Botoes ==============
        botao1 = new JButton("Jogar");
        botao2 = new JButton("Fechar");
        //definindo tamanho e posiçao do botao
        
        botao1.setBounds(200,350, 100, 30);
        botao2.setBounds(30,350, 120, 30);
        //================================ 
        
        botao3 = new JButton("");
        ImageIcon icone = new ImageIcon(getClass().getResource("/assets/hero.png"));
        botao3.setIcon(icone);
        botao3.setBounds(0,0, 350, 350);
        botao3.setBackground( Color.BLACK );
        botao3.setFocusPainted(false);
        botao3.setBorderPainted(false);
        
        
        
        // =========== Adiciona painel e demais neste ============
        add(panel, java.awt.BorderLayout.CENTER);
        panel.getAccessibleContext().setAccessibleParent(null); 
        panel.add(botao1);
        panel.add(botao2);
        panel.add(botao3);
        //=======================================================
        
        // ========== Define cor Backgroung =============
        panel.setBackground( Color.BLACK );
        //===============================================
        
        // ============= Define tamanho do Painel =======
        panel.setPreferredSize(new Dimension(350,400));
        //===============================================
        
        //getContentPane().add(panel,BorderLayout.CENTER);
        
        pack();
        setVisible(true);
        
        
        //============ Abre o Jogo ========================
        //============ Botao 1 ============================
        botao1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                
        Game myGame = new SpaceGame();
        LwjglApplication launcher = new LwjglApplication( myGame, "Space Rocks", 800, 600 );
       
            }
        });
        //================== Fecha a janela ==============
        //================== Botao 2 =====================
        botao2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            };
        });
    }
    
    //===================================================
    public static void main(String args[]){
        TelaInicial Jogo = new TelaInicial();
        Jogo.criaJanela();
    }
    
}