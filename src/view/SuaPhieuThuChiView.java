package view;

import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import Model.ChucVu;
import Model.HDLD;
import Model.NhanVien;
import Model.PhieuThuChi;
import Model.PhongBan;
import service.PhieuThuChiService;

public class SuaPhieuThuChiView extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PhieuThuChiService phieuThuChiService = new PhieuThuChiService();

	public SuaPhieuThuChiView(String maPhieu) {
		setTitle("Sua Thong Tin Phieu Thu Chi");
		initComponents();
		loadPhieu(maPhieu);

	}

	private void loadPhieu(String maPhieu) {
		fieldNum.setEditable(false);
		PhieuThuChi phieu = phieuThuChiService.findByMaPhieu(maPhieu);
		fieldNum.setText(phieu.getMaPhieu());
		fieldName.setText(phieu.getTenChuPhieu());
		fieldAdd.setText(phieu.getDiaChi());
		fieldLiDo.setText(phieu.getLyDo());
		fieldMoney.setText(phieu.getTien());
		fielDate.setText(phieu.getThoiGian());
		comboBoxType.setSelectedItem(phieu.getLoaiPhieu());

	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		fieldName = new javax.swing.JTextField();
		fieldAdd = new javax.swing.JTextField();
		fieldLiDo = new javax.swing.JTextField();
		fieldMoney = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		fielDate = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		comboBoxType = new javax.swing.JComboBox<>();
		btnChinhSua = new javax.swing.JButton();
		btnBack = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		fieldNum = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		jLabel1.setText("Họ tên người nhận/chi:");

		jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		jLabel2.setText("Địac chỉ:");

		jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		jLabel3.setText("Lý do nộp/chi:");

		jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		jLabel4.setText("Số tiền:");

		fieldName.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N

		fieldAdd.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N

		fieldLiDo.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N

		fieldMoney.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N

		jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		jLabel5.setText("Ngày lập phiếu:");

		fielDate.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N

		jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
		jLabel6.setText("PHIẾU THU/CHI");

		jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		jLabel7.setText("Loại phiếu:");

		comboBoxType.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		comboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phiếu Thu", "Phiếu Chi" }));

		btnChinhSua.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		btnChinhSua.setText("Cập nhật");
		btnChinhSua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnChinhPhieuActionPerformed(evt);
			}
		});

		btnBack.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		btnBack.setText("Back");
		btnBack.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBackActionPerformed(evt);
			}
		});

		jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
		jLabel8.setText("Số phiếu:");

		fieldNum.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3)
												.addGap(151, 151, 151).addComponent(fieldLiDo,
														javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4)
												.addGap(217, 217, 217).addComponent(fieldMoney,
														javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel2).addComponent(jLabel1))
												.addGap(56, 56, 56)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(fieldAdd, javax.swing.GroupLayout.DEFAULT_SIZE,
																345, Short.MAX_VALUE)
														.addComponent(fieldName)))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5)
												.addGap(131, 131, 131)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(comboBoxType,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(0, 0, Short.MAX_VALUE))
														.addComponent(fielDate, javax.swing.GroupLayout.DEFAULT_SIZE,
																345, Short.MAX_VALUE)))))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(204, 204, 204)
												.addComponent(jLabel6))
										.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
												.addComponent(jLabel7)))
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addGap(112, 112, 112).addComponent(btnChinhSua)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnBack).addGap(100, 100, 100))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel8)
								.addGap(198, 198, 198).addComponent(fieldNum)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(jLabel6)
						.addGap(43, 43, 43)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(fieldNum, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(fieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(fieldLiDo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(fieldMoney, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(fielDate, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(comboBoxType,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnChinhSua).addComponent(btnBack))
						.addGap(26, 26, 26)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
		THUCHIView tcView = new THUCHIView();
		tcView.setVisible(true);
		tcView.setLocationRelativeTo(null);
		tcView.setResizable(false);
		this.dispose();
	}// GEN-LAST:event_btnBackActionPerformed

	private void btnChinhPhieuActionPerformed(ActionEvent evt) {
		PhieuThuChi phieuThuChi = new PhieuThuChi();

		phieuThuChi.setMaPhieu(fieldNum.getText());
		phieuThuChi.setTenChuPhieu(fieldName.getText());
		phieuThuChi.setDiaChi(fieldAdd.getText());
		phieuThuChi.setLyDo(fieldLiDo.getText());
		phieuThuChi.setTien(fieldMoney.getText());
		phieuThuChi.setThoiGian(fielDate.getText());
		phieuThuChi.setLoaiPhieu(String.valueOf(comboBoxType.getSelectedItem()));

		if (phieuThuChiService.findByMaPhieu(phieuThuChi.getMaPhieu()) != null) {
			phieuThuChiService.update(phieuThuChi);
			JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công");
		} else
			JOptionPane.showMessageDialog(this, "Bạn vui lòng thử lại");

	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnBack;
	private javax.swing.JButton btnChinhSua;
	private javax.swing.JComboBox<String> comboBoxType;
	private javax.swing.JTextField fielDate;
	private javax.swing.JTextField fieldAdd;
	private javax.swing.JTextField fieldLiDo;
	private javax.swing.JTextField fieldMoney;
	private javax.swing.JTextField fieldName;
	private javax.swing.JTextField fieldNum;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables
}
