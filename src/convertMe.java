/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carob8920
 */
public class convertMe extends javax.swing.JFrame {

    /**
     * Creates new form convertMe
     */
    public convertMe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        inchesToCent = new javax.swing.JLabel();
        ftToCent = new javax.swing.JLabel();
        yardsToMeters = new javax.swing.JLabel();
        milesToKm = new javax.swing.JLabel();
        conversionChoice = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        conversionChoiceTF = new javax.swing.JTextField();
        valueTF = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        responseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("Linear Conversion");

        inchesToCent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inchesToCent.setText("1. Inches to centimetres");

        ftToCent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftToCent.setText("2. Feet to centimetres");

        yardsToMeters.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yardsToMeters.setText("3. Yards to Meters");

        milesToKm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        milesToKm.setText("4. Miles to kilometers");

        conversionChoice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conversionChoice.setText("Enter conversion choice (1-4):");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueLabel.setText("Enter value to be converted:");

        conversionChoiceTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conversionChoiceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversionChoiceTFActionPerformed(evt);
            }
        });

        valueTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        calculateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        responseLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(milesToKm)
                            .addComponent(yardsToMeters)
                            .addComponent(ftToCent)
                            .addComponent(inchesToCent)
                            .addComponent(title)
                            .addComponent(responseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calculateButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(valueLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(conversionChoice)
                                    .addGap(18, 18, 18)
                                    .addComponent(conversionChoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(inchesToCent)
                .addGap(18, 18, 18)
                .addComponent(ftToCent)
                .addGap(18, 18, 18)
                .addComponent(yardsToMeters)
                .addGap(18, 18, 18)
                .addComponent(milesToKm)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conversionChoice)
                    .addComponent(conversionChoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(valueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calculateButton)
                .addGap(28, 28, 28)
                .addComponent(responseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    
      int choice;
      double value;
    /**
     * what happens when the calculate button is pressed
     * @param evt 
     */  
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        
      choice = Integer.parseInt(conversionChoiceTF.getText());
    
      switch (choice){
          case 1: inchesToCent(); break;
          case 2: ftToCent(); break;
          case 3: yardsToMeters(); break;
          case 4: milesToKm(); break;
      
      }
    }//GEN-LAST:event_calculateButtonActionPerformed
/** 
 * i made a mistake here and I don't know how to undo it
 * but it doesn't do anything 
 * @param evt 
 */
    private void conversionChoiceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversionChoiceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conversionChoiceTFActionPerformed
    /**
     * inches to centimeters conversion
     */
    private void inchesToCent(){
       double cent;
       
       value = Double.parseDouble(valueTF.getText()); 
       
       cent = value * 2.54;
       
       responseLabel.setText("There are "+cent+" centimeters in "+value+" inches");
    }
    /**
     * feet to centimeter conversions
     */
    private void ftToCent(){
        double cent;
        
        value = Double.parseDouble(valueTF.getText()); 
        
        cent = value * 30;
        
        responseLabel.setText("There are "+cent+" centimeters in "+value+" feet");
    }
    /**
     * yards to meter conversions
     */
    private void yardsToMeters(){
        double meters;
        
        value = Double.parseDouble(valueTF.getText()); 
        
        meters = value * 0.9144;
        
        responseLabel.setText("There are "+meters+" meters in "+value+" yards");
    }
    /**
     * miles to kilometers conversion
     */
    private void milesToKm(){
        double km;
        
        value = Double.parseDouble(valueTF.getText()); 
        
        km = value * 1.60934;
        
        responseLabel.setText("There are "+km+" kilometers in "+value+" miles");
    }
    
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
            java.util.logging.Logger.getLogger(convertMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convertMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convertMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convertMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convertMe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel conversionChoice;
    private javax.swing.JTextField conversionChoiceTF;
    private javax.swing.JLabel ftToCent;
    private javax.swing.JLabel inchesToCent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel milesToKm;
    private javax.swing.JLabel responseLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTextField valueTF;
    private javax.swing.JLabel yardsToMeters;
    // End of variables declaration//GEN-END:variables
}
