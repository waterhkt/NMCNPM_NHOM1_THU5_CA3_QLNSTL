/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.TaiKhoan;

import service.TaiKhoanService;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class CHECKVALIDView extends javax.swing.JFrame {

	/**
	 * Creates new form CHECKVALIDView
	 */

	public CHECKVALIDView() {
		setTitle("Hệ thống quản lý nhân sự tiền lương");
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		fieldUser = new javax.swing.JTextField();
		loginBtn = new javax.swing.JButton();
		backBtn = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		fieldPass = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(400, 300));
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
		jLabel1.setText("Tên đăng nhập");

		jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
		jLabel2.setText("Mật khẩu");

		fieldUser.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

		loginBtn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
		loginBtn.setText("Đăng nhập");
		loginBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loginBtnActionPerformed(evt);
			}
		});

		backBtn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
		backBtn.setText("Trở về");
		backBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backBtnActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Đăng nhập");

		fieldPass.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel1).addComponent(jLabel2))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(fieldUser, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 200,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(fieldPass, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 200,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(35, 35, 35).addComponent(loginBtn)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(backBtn).addGap(53, 53, 53)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jLabel3).addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(fieldUser, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(35, 35, 35)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(fieldPass, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(loginBtn).addComponent(backBtn))
						.addGap(22, 22, 22)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginBtnActionPerformed
		TaiKhoanService taiKhoanService = new TaiKhoanService();
		String tendangnhap = fieldUser.getText();
		String matkhau = fieldPass.getText();
		TaiKhoan tk = taiKhoanService.findByUsernameAndPassword(tendangnhap, matkhau);
		if (tendangnhap.isEmpty())
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên đăng nhập", "Lỗi đăng nhập", JOptionPane.OK_OPTION);
		else if (matkhau.isEmpty())
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu", "Lỗi đăng nhập", JOptionPane.OK_OPTION);
		else if (tk != null) {
			Main.tk = tk;
			MainView mainView = new MainView(tk.getQuyen());
			mainView.setVisible(true);
			mainView.setLocationRelativeTo(null);
			mainView.setResizable(false);
			this.dispose();

		} else {
			JOptionPane.showMessageDialog(this, "Bạn nhập sai tên đăng nhập hoặc mật khẩu", "Lỗi đăng nhập",
					JOptionPane.OK_OPTION);
		}
	}// GEN-LAST:event_loginBtnActionPerformed

	private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed
			System.exit(0);
			this.dispose();
	}// GEN-LAST:event_backBtnActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton backBtn;
	private javax.swing.JPasswordField fieldPass;
	private javax.swing.JTextField fieldUser;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JButton loginBtn;
	// End of variables declaration//GEN-END:variables
}
