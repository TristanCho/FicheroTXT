
package ficherotxt;

import Variables.VariablesConfig;
import java.util.Properties;


public class Network extends javax.swing.JFrame {
    
    private final VariablesConfig DatosConfig;
    //private final CapturaForm CapturaForm1;
    public Network() {
        initComponents();
        
      DatosConfig = new VariablesConfig();
      //DatosCaptura = new CapturaForm();
        System.out.println("Base datos="+DatosConfig.DDBB);
      
      Properties Propiedades = new Properties();
      
     
      jtf_UserDDBB.setText(DatosConfig.dimeUser());
      jtf_PassDDBB.setText(DatosConfig.dimePass());
      jtf_DDBB.setText(DatosConfig.dimeDDBB());
      jtf_Puerto.setText(DatosConfig.dimePuerto());
      jtf_LocalServer.setText(DatosConfig.dimeLocalServer());
      jtf_RemoteServer.setText(DatosConfig.dimeRemoteServer());
      jtf_RemoteServer2.setText(DatosConfig.dimeRemoteServer2());
      String UserDDBB = jtf_UserDDBB.getText();
      
     //DatosConfig.setUser(UserDDBB);
      
         
       
     
     
     
     
      /*
      InputStream Archivo;

        try {
            Archivo = new FileInputStream("src/Archivador/ArchivoPropiedades.properties");
            Propiedades.load(Archivo);
            
            System.out.println("Prueba desde network 12");
          
        } catch (IOException ex) {
            System.out.println("Revisar la ruta del Archivo de propiedades");
        }*/ 
   
      
      
    }
    
   
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_RemoteServer = new javax.swing.JTextField();
        jtf_LocalServer = new javax.swing.JTextField();
        jtf_RemoteServer2 = new javax.swing.JTextField();
        jtf_DDBB = new javax.swing.JTextField();
        jtf_Puerto = new javax.swing.JTextField();
        jtf_PassDDBB = new javax.swing.JTextField();
        jtf_UserDDBB = new javax.swing.JTextField();
        btn_Editar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("UserDDBB:");

        jLabel2.setText("PassDDBB:");

        jLabel3.setText("Puerto:");

        jLabel4.setText("DDBB:");

        jLabel5.setText("LocalServer:");

        jLabel6.setText("RemoteServer:");

        jLabel7.setText("RemoteServer2:");

        jtf_RemoteServer.setEnabled(false);
        jtf_RemoteServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_RemoteServerActionPerformed(evt);
            }
        });

        jtf_LocalServer.setEnabled(false);
        jtf_LocalServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_LocalServerActionPerformed(evt);
            }
        });

        jtf_RemoteServer2.setEnabled(false);
        jtf_RemoteServer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_RemoteServer2ActionPerformed(evt);
            }
        });

        jtf_DDBB.setEnabled(false);
        jtf_DDBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_DDBBActionPerformed(evt);
            }
        });

        jtf_Puerto.setEnabled(false);
        jtf_Puerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_PuertoActionPerformed(evt);
            }
        });

        jtf_PassDDBB.setEnabled(false);
        jtf_PassDDBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_PassDDBBActionPerformed(evt);
            }
        });

        jtf_UserDDBB.setEnabled(false);
        jtf_UserDDBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_UserDDBBActionPerformed(evt);
            }
        });

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_RemoteServer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_LocalServer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_RemoteServer2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_DDBB, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_Puerto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_PassDDBB, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_UserDDBB, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Guardar))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_UserDDBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_PassDDBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_DDBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_Puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_LocalServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_RemoteServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_RemoteServer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Editar)
                    .addComponent(btn_Guardar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jtf_UserDDBB.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_RemoteServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_RemoteServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_RemoteServerActionPerformed

    private void jtf_LocalServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_LocalServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_LocalServerActionPerformed

    private void jtf_RemoteServer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_RemoteServer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_RemoteServer2ActionPerformed

    private void jtf_DDBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_DDBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_DDBBActionPerformed

    private void jtf_PuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_PuertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_PuertoActionPerformed

    private void jtf_PassDDBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_PassDDBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_PassDDBBActionPerformed

    private void jtf_UserDDBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_UserDDBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_UserDDBBActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
       
        jtf_UserDDBB.setEnabled(true);        
        jtf_PassDDBB.setEnabled(true);
        jtf_DDBB.setEnabled(true);
        jtf_Puerto.setEnabled(true);
        jtf_LocalServer.setEnabled(true);
        jtf_RemoteServer.setEnabled(true);
        jtf_RemoteServer2.setEnabled(true);
        
        
        
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
          //import        
        jtf_UserDDBB.setEnabled(false);
        jtf_PassDDBB.setEnabled(false);
        jtf_DDBB.setEnabled(false);
        jtf_Puerto.setEnabled(false);
        jtf_LocalServer.setEnabled(false);
        jtf_RemoteServer.setEnabled(false);
        jtf_RemoteServer2.setEnabled(false);
        
        String UserDDBB=jtf_UserDDBB.getText();
       
        DatosConfig.setUser(UserDDBB);
        
      
//CapturaForm(UserDDBB);
         
    
       
    }//GEN-LAST:event_btn_GuardarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jtf_DDBB;
    public javax.swing.JTextField jtf_LocalServer;
    public javax.swing.JTextField jtf_PassDDBB;
    public javax.swing.JTextField jtf_Puerto;
    public javax.swing.JTextField jtf_RemoteServer;
    public javax.swing.JTextField jtf_RemoteServer2;
    public javax.swing.JTextField jtf_UserDDBB;
    // End of variables declaration//GEN-END:variables
public class CapturaForm{
       public CapturaForm(String UserDDBB){
            System.out.println("El UserDDBB es...."+ UserDDBB);
       }
    }
 
}
 
