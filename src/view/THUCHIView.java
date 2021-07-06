/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Model.PhieuThuChi;
import service.PhieuThuChiService;

/**
 *
 * @author asus
 */
public class THUCHIView extends javax.swing.JFrame {
	PhieuThuChiService phieuThuChiService = new PhieuThuChiService();

	DefaultTableModel defaultTableModel;

	/**
	 * Creates new form THUCHIView
	 */
	public THUCHIView() {
		setTitle("Bộ Phận Thu Chi");
		initComponents();
		loadData();

	}

	private void loadData() {
		defaultTableModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		};

		tableThuChi.setModel(defaultTableModel);

		defaultTableModel.addColumn("Số phiếu");
		defaultTableModel.addColumn("Loại Phiếu");
		defaultTableModel.addColumn("Lí Do");
		defaultTableModel.addColumn("Số Tiền");

		for (PhieuThuChi phieuThuChi : phieuThuChiService.findAll()) {
			defaultTableModel.addRow(new Object[] { phieuThuChi.getMaPhieu(), phieuThuChi.getLoaiPhieu(),
					phieuThuChi.getLyDo(), phieuThuChi.getTien() });
		}
		tableThuChi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = tableThuChi.getSelectedRow();
				displayDetails(index);
			}
		});
		tableThuChi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if ((e.getKeyCode() == KeyEvent.VK_UP) || (e.getKeyCode() == KeyEvent.VK_DOWN)) {
					int index = tableThuChi.getSelectedRow();
					displayDetails(index);
				}
			}

		});
	}

	private void displayDetails(int index) {
		String maPhieu = (String) tableThuChi.getValueAt(index, 0);
		PhieuThuChi ptc = phieuThuChiService.findByMaPhieu(maPhieu);
		if (ptc.getLoaiPhieu().equalsIgnoreCase("PHIẾU CHI")) {
			lbTenPhieu.setText("PHIẾU CHI");
			lbHoTen.setText("Họ tên người nhận:");
			lbLiDo.setText("Lí do chi:");
		} else {
			lbTenPhieu.setText("PHIẾU THU");
			lbHoTen.setText("Họ tên người nộp:");
			lbLiDo.setText("Lí do nộp:");
		}
		lbChamHoTen.setText(ptc.getTenChuPhieu());
		lbChamDiaChi.setText(ptc.getDiaChi());
		lbChamLiDo.setText(ptc.getLyDo());
		lbChamSoTien.setText(ptc.getTien());
		chamNgay.setText(ptc.getThoiGian().substring(0, 2));
		chamThang.setText(ptc.getThoiGian().substring(2, 4));
		chamNam.setText(ptc.getThoiGian().substring(4));
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

		jScrollPane2 = new javax.swing.JScrollPane();
		tableThuChi = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		lbTenPhieu = new javax.swing.JLabel();
		lbHoTen = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		lbLiDo = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		lbChamHoTen = new javax.swing.JLabel();
		lbChamDiaChi = new javax.swing.JLabel();
		lbChamLiDo = new javax.swing.JLabel();
		lbChamSoTien = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		chamNgay = new javax.swing.JLabel();
		chamThang = new javax.swing.JLabel();
		chamNam = new javax.swing.JLabel();
		taoPhieuBtn = new javax.swing.JButton();
		backBtn = new javax.swing.JButton();
		chinhPhieuBtn = new javax.swing.JButton();
		xoaPhieuBtn = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		tableThuChi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		tableThuChi
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Số phiếu", "Loại Phiếu", "Lí do", "Tiền" }));
		jScrollPane2.setViewportView(tableThuChi);

		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		jLabel1.setText("Đơn vị: CÔNG TY TNHH TDS");

		jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		jLabel2.setText("Địa chỉ: phường Linh Trung, TP Thủ Đức");

		jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		jLabel3.setText("Mẫu số 01 - TT");

		jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		jLabel4.setText("(Ban hành theo TT số: 133/2021/TT-BTC");

		jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		jLabel5.setText("ngày 26/8/2021 của Bộ trưởng BTC)");

		lbTenPhieu.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
		lbTenPhieu.setText("PHIẾU THU");

		lbHoTen.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		lbHoTen.setText("Họ tên người nộp:");

		jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		jLabel8.setText("Địa chỉ:");

		lbLiDo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		lbLiDo.setText("Lí do nộp:");

		jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		jLabel10.setText("Số tiền:");

		lbChamHoTen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
		lbChamHoTen.setText(
				".................................................................................................................................................................................");

		lbChamDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
		lbChamDiaChi.setText(
				".................................................................................................................................................................................");

		lbChamLiDo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
		lbChamLiDo.setText(
				".................................................................................................................................................................................");

		lbChamSoTien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
		lbChamSoTien.setText(
				".................................................................................................................................................................................");

		jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		jLabel7.setText("Ngày");

		jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		jLabel9.setText("Tháng");

		jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		jLabel11.setText("Năm");

		chamNgay.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		chamNgay.setText("         ");

		chamThang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		chamThang.setText("       ");

		chamNam.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
		chamNam.setText("           ");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel8).addComponent(lbLiDo).addComponent(jLabel10))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(lbHoTen).addGap(49, 49, 49)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(lbChamSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 1,
												Short.MAX_VALUE)
										.addComponent(lbChamLiDo, javax.swing.GroupLayout.PREFERRED_SIZE, 1,
												Short.MAX_VALUE)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(lbChamHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 519,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lbChamDiaChi, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 519,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1).addComponent(jLabel2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout.createSequentialGroup()
																		.addComponent(jLabel5).addGap(8, 8, 8)))
														.addGap(38, 38, 38))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup()
														.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
																115, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(79, 79, 79))))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44)
										.addComponent(lbTenPhieu))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7).addGap(18, 18, 18)
										.addComponent(chamNgay).addGap(18, 18, 18).addComponent(jLabel9)
										.addGap(18, 18, 18).addComponent(chamThang).addGap(18, 18, 18)
										.addComponent(jLabel11).addGap(18, 18, 18).addComponent(chamNam)))
						.addGap(184, 184, 184)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jLabel3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(jLabel2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lbTenPhieu)
						.addGap(21, 21, 21)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(jLabel9).addComponent(jLabel11)
								.addComponent(chamNgay).addComponent(chamThang).addComponent(chamNam))
						.addGap(28, 28, 28)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbHoTen).addComponent(lbChamHoTen))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(lbChamDiaChi))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbLiDo).addComponent(lbChamLiDo))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10).addComponent(lbChamSoTien))
						.addContainerGap(37, Short.MAX_VALUE)));

		taoPhieuBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
		taoPhieuBtn.setText("Tạo Phiếu");
		taoPhieuBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		backBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
		backBtn.setText("Back");
		backBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backBtnActionPerformed(evt);
			}
		});

		chinhPhieuBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
		chinhPhieuBtn.setText("Chỉnh Sửa");
		chinhPhieuBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				chinhSuaBtnActionPerformed(evt);
			}
		});

		xoaPhieuBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
		xoaPhieuBtn.setText("Xóa Phiếu");
		xoaPhieuBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xoaBtnActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
		jLabel6.setText("BẢNG PHIẾU THU CHI");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addComponent(taoPhieuBtn).addGap(89, 89, 89)
										.addComponent(chinhPhieuBtn).addGap(71, 71, 71).addComponent(xoaPhieuBtn)))
						.addGap(18, 18, 18)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel6)
										.addGap(405, 405, 405))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(backBtn,
								javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(37, 37, 37).addComponent(jLabel6).addGap(31, 31, 31)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(25, 25, 25)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(taoPhieuBtn).addComponent(chinhPhieuBtn).addComponent(xoaPhieuBtn))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(backBtn)
						.addContainerGap(42, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		TaoPhieuView taoPhieuView = new TaoPhieuView();
		taoPhieuView.setVisible(true);
		taoPhieuView.setLocationRelativeTo(null);
		taoPhieuView.setResizable(false);
		taoPhieuView.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void chinhSuaBtnActionPerformed(java.awt.event.ActionEvent evt) {
		int selectedIndex = tableThuChi.getSelectedRow();
		if (selectedIndex != -1) {
			String maPhieu = (String) defaultTableModel.getValueAt(selectedIndex, 0);
			SuaPhieuThuChiView suaPhieuView = new SuaPhieuThuChiView(maPhieu);
			suaPhieuView.setVisible(true);
			suaPhieuView.setLocationRelativeTo(null);
			suaPhieuView.setResizable(false);
			suaPhieuView.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu thu chi muốn cập nhật");
		}

	}

	private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed
		KETOANView kETOANView = new KETOANView();
		kETOANView.setVisible(true);
		kETOANView.setLocationRelativeTo(null);
		kETOANView.setResizable(false);
		this.dispose();
	}// GEN-LAST:event_backBtnActionPerformed

	private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoaBtnActionPerformed
		int index = tableThuChi.getSelectedRow();
		String maPhieu = (String) tableThuChi.getValueAt(index, 0);
		PhieuThuChi p = phieuThuChiService.findByMaPhieu(maPhieu);
		if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá phiếu " + p.getMaPhieu() + " không ", "Cảnh  báo xoá",
				JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
			if (phieuThuChiService.delete(p)) {
				JOptionPane.showMessageDialog(this, "Bạn đã xoá thành công " + p.getLoaiPhieu() + " " + p.getMaPhieu());
				loadData();
			}
		}

	}// GEN-LAST:event_xoaBtnActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(THUCHIView.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(THUCHIView.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(THUCHIView.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(THUCHIView.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				THUCHIView tcView = new THUCHIView();
				tcView.setVisible(true);
				tcView.setLocationRelativeTo(null);
				tcView.setResizable(false);

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton backBtn;
	private javax.swing.JLabel chamNam;
	private javax.swing.JLabel chamNgay;
	private javax.swing.JLabel chamThang;
	private javax.swing.JButton taoPhieuBtn;
	private javax.swing.JButton chinhPhieuBtn;
	private javax.swing.JButton xoaPhieuBtn;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel lbChamDiaChi;
	private javax.swing.JLabel lbChamHoTen;
	private javax.swing.JLabel lbChamLiDo;
	private javax.swing.JLabel lbChamSoTien;
	private javax.swing.JLabel lbHoTen;
	private javax.swing.JLabel lbLiDo;
	private javax.swing.JLabel lbTenPhieu;
	private javax.swing.JTable tableThuChi;
	// End of variables declaration//GEN-END:variables
}