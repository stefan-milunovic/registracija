/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registracija;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Update extends javax.swing.JFrame  {

    /** Creates new form Update */
    public Update() {
        initComponents();
         setLocationRelativeTo(null);
            
    }


  
           
           Menu menu=new Menu();
           Connection con1=null;
           Connection con=null;
           PreparedStatement ps=null;
           ResultSet rs=null;
            PreparedStatement ps1=null;
           ResultSet rs1=null;
           
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUpdateJMBG = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnUpdateUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 87, 201));

        txtUpdateJMBG.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JMBG");

        btnUpdateUser.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateUser.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 13)); // NOI18N
        btnUpdateUser.setForeground(new java.awt.Color(40, 87, 201));
        btnUpdateUser.setText("SEARCH");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SEARCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(80, 80, 80)
                .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void actionPreformed(ActionEvent e){
    
}
    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed

        try{
        String q1="SELECT * from vozilo WHERE JMBG=?";             
        String q="SELECT * from vlasnik WHERE JMBG=?";
        con =DriverManager.getConnection("jdbc:mysql://localhost/registracija","root","");
           
            ps = con.prepareStatement(q);
            ps1 = con.prepareStatement(q1);
            ps.setString(1,txtUpdateJMBG.getText());
            ps1.setString(1, txtUpdateJMBG.getText());
            rs=ps.executeQuery();
            rs1=ps1.executeQuery();
           
            if(rs.next()&& rs1.next()){
                
               menu.txtIme.setText(rs.getString("Ime"));
               menu.txtPrezime.setText(rs.getString("Prezime"));
               menu.txtAdresa.setText(rs.getString("Adresa"));
               menu.txtBrTel.setText(rs.getString("BrTel"));
               menu.txtJMBG.setText(rs.getString("JMBG"));
               menu.txtDatRodj.setText(rs.getString("DatumRodj"));
                
                menu.txtMarka.setText(rs1.getString("Marka"));
               menu.txtModel.setText(rs1.getString("Model"));
               menu.txtKubikaza.setText(rs1.getString("Kubikaza"));
               menu.txtSnaga.setText(rs1.getString("Snaga"));
               menu.txtTezina.setText(rs1.getString("Tezina"));
               menu.txtBoja.setText(rs1.getString("Boja"));
               menu.txtGorivo.setText(rs1.getString("Gorivo"));
               menu.txtTablice.setText(rs1.getString("Tablice"));
               menu.txtBrSasije.setText(rs1.getString("BRMOTORA"));
               menu.txtOsiguranje.setText(rs1.getString("Osiguranje"));
               menu.txtTehPregled.setText(rs1.getString("TehnickiPregled"));
               menu.txtDatumR.setText(rs1.getString("datumReg"));
               menu.txtIstekR.setText(rs1.getString("datumIsteka"));
                menu.setVisible(true);  
                setVisible(false);
            new Baza().setVisible(false);
            }
            /* if(rs1.next()){
                  menu.txtMarka.setText(rs1.getString("Marka"));
               menu.txtModel.setText(rs1.getString("Model"));
               menu.txtKubikaza.setText(rs1.getString("Kubikaza"));
               menu.txtSnaga.setText(rs1.getString("Snaga"));
               menu.txtTezina.setText(rs1.getString("Tezina"));
               menu.txtBoja.setText(rs1.getString("Boja"));
               menu.txtGorivo.setText(rs1.getString("Gorivo"));
               menu.txtTablice.setText(rs1.getString("Tablice"));
               menu.txtBrSasije.setText(rs1.getString("BRMOTORA"));
               menu.txtOsiguranje.setText(rs1.getString("Osiguranje"));
               menu.txtTehPregled.setText(rs1.getString("TehnickiPregled"));
               menu.txtDatumR.setText(rs1.getString("datumReg"));
               menu.txtIstekR.setText(rs1.getString("datumIsteka"));
             }*/
            else{
                JOptionPane.showMessageDialog(null, "Wrong JMBG");
                 
            }
            
           
            
     }
     catch(Exception    e){
         JOptionPane.showMessageDialog(null, e);
     }     
           /* try{
               String q1="SELECT * from vozilo WHERE JMBG=?";
            con1 =DriverManager.getConnection("jdbc:mysql://localhost/registracija","root","");
            ps1 = con1.prepareStatement(q1);
            ps1.setString(1,txtUpdateJMBG.getText());
            rs=ps.executeQuery();
           
            if(rs.next()){
                
               menu.txtMarka.setText(rs.getString("Marka"));
               menu.txtModel.setText(rs.getString("Model"));
               menu.txtKubikaza.setText(rs.getString("Kubikaza"));
               menu.txtSnaga.setText(rs.getString("Snaga"));
               menu.txtTezina.setText(rs.getString("Tezina"));
               menu.txtBoja.setText(rs.getString("Boja"));
               menu.txtGorivo.setText(rs.getString("Gorivo"));
               menu.txtTablice.setText(rs.getString("Tablice"));
               menu.txtBrSasije.setText(rs.getString("BRMOTORA"));
               menu.txtOsiguranje.setText(rs.getString("Osiguranje"));
               menu.txtTehPregled.setText(rs.getString("TehnickiPregled"));
               menu.txtDatumR.setText(rs.getString("datumReg"));
               menu.txtIstekR.setText(rs.getString("datumIsteka"));
               
               
                
            }
             
            else{
                JOptionPane.showMessageDialog(null, "Wrong JMBG");
            }
            menu.setVisible(true);  
     }
     catch(Exception    e){
         JOptionPane.showMessageDialog(null, e);
     } */    
    }//GEN-LAST:event_btnUpdateUserActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtUpdateJMBG;
    // End of variables declaration//GEN-END:variables
}
