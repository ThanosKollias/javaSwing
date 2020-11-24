/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softecon.javaswing.test.forms;

import java.awt.Color;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import softecon.javaswing.test.utils.Tools;
import softecon.javaswing.test.vo.VO_Job;

/**
 *
 * @author tkol
 */
public class AddNewJobForm extends javax.swing.JDialog {

    ArrayList<VO_Job> jobList ;
    /**
     * Creates new form AddNewJobForm
     */
    public AddNewJobForm() {
        setModal(true);
        initComponents();
        init();
//        
//        ImageIcon img = new ImageIcon("C:\\Users\\tkol.SOFTECON\\Documents\\NetBeansProjects\\JavaSwing\\src\\softecon\\javaswing\\test\\icons/logo.png");
//        this.setIconImage(img.getImage());
       
       
    }

    public void init(){
        Tools.setFrameIcon(this);
        jobList = new ArrayList<VO_Job>();
        populateList();
    }
    
    public void populateList(){
       try{
           FileInputStream file = new FileInputStream("Jobs.dat");
        ObjectInputStream inputFile = new ObjectInputStream(file);
        
        boolean endOfFile = false;
        
        while(!endOfFile){
            try {
                jobList.add((VO_Job)inputFile.readObject());
                
            } catch (EOFException e) {
//                JOptionPane.showMessageDialog(null, e.getMessage(), "END OF FILE", JOptionPane.INFORMATION_MESSAGE);
                endOfFile = true;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Something's wrong... '1'", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        inputFile.close();
       }catch(IOException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Something's wrong... '2'", JOptionPane.ERROR_MESSAGE);
       }
 
    }
    
    public void saveJobsToFile(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Jobs.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(fileOutputStream);

               for(VO_Job job : jobList){
                   outputFile.writeObject(job);
               }
               outputFile.close();
               JOptionPane.showMessageDialog(null, "You did it!");
               this.dispose();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Something's wrong... '3'", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jobNameTxt = new javax.swing.JTextField();
        jobSalaryTxt = new javax.swing.JTextField();
        jobSaveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create new Job");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(770, 450));
        setMinimumSize(new java.awt.Dimension(770, 450));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setText("Create a new Job");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel2.setText("Name of Job :");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel3.setText("Salary of this Job :");

        jobNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobNameTxtActionPerformed(evt);
            }
        });

        jobSaveBtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jobSaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softecon/javaswing/test/icons/save.png"))); // NOI18N
        jobSaveBtn.setText("SAVE");
        jobSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobSaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jobSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jobSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jobNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobNameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jobSaveBtn)
                .addGap(78, 78, 78))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jobNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobNameTxtActionPerformed

    
    // ---- SAVE BUTTON -----// 
    //SAVE BUTTON IN THE ADDNEWJOBFORM
    //SOMETHING WILL HAPPEN WHEN I CLICK THE SAVE BUTTON
    private void jobSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobSaveBtnActionPerformed
       
        if(jobNameTxt.getText().isEmpty() || jobSalaryTxt.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Please fill out all the fields and try again.");
            JOptionPane.showMessageDialog(null, "Please fill out all the fields and try again.", "Relax, you re doing fine", JOptionPane.ERROR_MESSAGE);
        }else{
            
            try {
            Double.parseDouble(jobSalaryTxt.getText().trim());
            String jobName = jobNameTxt.getText().trim();
            String jobSalary = jobSalaryTxt.getText().trim();
            
            VO_Job job = new VO_Job(Double.parseDouble(jobSalary), jobName);
            jobList.add(job);
            saveJobsToFile();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number as job salary");
                
            }
            
        }
       new AddNewJobForm().setVisible(true);
    }//GEN-LAST:event_jobSaveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewJobForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jobNameTxt;
    private javax.swing.JTextField jobSalaryTxt;
    private javax.swing.JButton jobSaveBtn;
    // End of variables declaration//GEN-END:variables
}
