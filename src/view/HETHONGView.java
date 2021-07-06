/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.*;


/**
 *
 * @author asus
 */
public class HETHONGView extends javax.swing.JFrame {

    /**
     * Creates new form HETHONGView
     */
    public HETHONGView() {
        setTitle("Phòng Hệ Thống");
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

        jLabel1 = new javax.swing.JLabel();
        optionRoomBtn = new javax.swing.JButton();
        optionAccountBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("Lựa Chọn Mục Cần Cập Nhật");

        optionRoomBtn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        optionRoomBtn.setText("DANH MỤC PHÒNG BAN");
        optionRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionRoomBtnActionPerformed(evt);
            }
        });

        optionAccountBtn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        optionAccountBtn.setText("DANH MỤC TÀI KHOẢN");
        optionAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAccountBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        backBtn.setText("Trở về");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionRoomBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(optionAccountBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionRoomBtn)
                    .addComponent(optionAccountBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionRoomBtnActionPerformed
               DANHMUCPHONGBANView danhMucPhongBan = new DANHMUCPHONGBANView();
               danhMucPhongBan.setVisible(true);
               danhMucPhongBan.setLocationRelativeTo(null);
               danhMucPhongBan.setResizable(false);
               this.dispose();
    }//GEN-LAST:event_optionRoomBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
               MainView manHinhChinhView = new MainView(Main.tk.getQuyen());
               manHinhChinhView.setVisible(true);
               manHinhChinhView.setLocationRelativeTo(null);
               manHinhChinhView.setResizable(false);
               this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void optionAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAccountBtnActionPerformed
                DANHMUCTAIKHOANView danhMucTaiKhoanView = new DANHMUCTAIKHOANView();
                danhMucTaiKhoanView.setVisible(true);
                danhMucTaiKhoanView.setLocationRelativeTo(null);
                danhMucTaiKhoanView.setResizable(false);
                this.dispose();
    }//GEN-LAST:event_optionAccountBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HETHONGView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HETHONGView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HETHONGView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HETHONGView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HETHONGView heThongView = new HETHONGView();
                heThongView.setVisible(true);
                heThongView.setLocationRelativeTo(null);
                heThongView.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton optionAccountBtn;
    private javax.swing.JButton optionRoomBtn;
    // End of variables declaration//GEN-END:variables
}