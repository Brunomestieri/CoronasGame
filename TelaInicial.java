import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import java.awt.Dimension;

public class TelaInicial extends JFrame{
    JButton botao1,botao2;
    JPanel panel;
    
    public void criaJanela()
    {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botao1 = new JButton("Jogar");
        botao2 = new JButton("Fechar");
        
        botao2.setLocation(100,100);
        panel = new JPanel();
        panel.add(botao1);
        panel.add(botao2);
        
        
        panel.setBackground( Color.BLACK );
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(400,400));
        
        getContentPane().add(panel,BorderLayout.CENTER);
        
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