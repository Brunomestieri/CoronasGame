import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;


public class Launcher
{
    public static void main (String[] args)
    {
     
     
        Game myGame = new SpaceGame();
        LwjglApplication launcher = new LwjglApplication( myGame, "Space Rocks", 800, 600 );
    }
}

/*


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;


/**
 *
 * @author bruno
 */


//public class Launcher extends javax.swing.JPanel {

    
  //  public NewJPanel() {
    //    initComponents();
    //}


    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    //private void initComponents() {

      //  jLabel1 = new javax.swing.JLabel();
        //jButton1 = new javax.swing.JButton();

      //  jLabel1.setText("jLabel1");

       // jButton1.setText("clique para comecar");
       // jButton1.addActionListener(new java.awt.event.ActionListener() {
         //   public void actionPerformed(java.awt.event.ActionEvent evt) {
      //          jButton1ActionPerformed(evt);
        //    }
       // });

      //  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      //  this.setLayout(layout);
      //  layout.setHorizontalGroup(
        //    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          //  .addGroup(layout.createSequentialGroup()
            //    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              //      .addGroup(layout.createSequentialGroup()
                //        .addGap(75, 75, 75)
                  //      .addComponent(jLabel1))
               //     .addGroup(layout.createSequentialGroup()
                 //       .addGap(62, 62, 62)
                   //     .addComponent(jButton1)))
            //    .addContainerGap(201, Short.MAX_VALUE))
    //    );
     //   layout.setVerticalGroup(
       //     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         //   .addGroup(layout.createSequentialGroup()
           //     .addGap(57, 57, 57)
             //   .addComponent(jLabel1)
            //    .addGap(35, 35, 35)
            //    .addComponent(jButton1)
           //     .addContainerGap(162, Short.MAX_VALUE))
     //   );
  //  }// </editor-fold>                        

  //  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// Game myGame = new SpaceGame();
  //      LwjglApplication launcher = new LwjglApplication( myGame, "Space Rocks", 800, 600 );        // TODO add your handling code here:
   // }                                        


    // Variables declaration - do not modify                     
  //  private javax.swing.JButton jButton1;
  //  private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
// }



