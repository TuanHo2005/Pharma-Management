/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pharmatechno.UI;

import javax.swing.table.DefaultTableModel;
import com.mycompany.pharmatechno.Control.KhoiPhucDao;
import com.mycompany.pharmatechno.Model.Thuoc;
import com.mycompany.pharmatechno.UI.main;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cuong
 */
public class KhoiPhuc extends javax.swing.JFrame {
    private main mainFrame; // Tham chiếu đến MainFrame

    /**
     * Creates new form KhoiPhuc
     */
    public KhoiPhuc() {
        initComponents();
        filltotable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoiPhuc = new javax.swing.JTable();
        btnKhoiPhuc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblKhoiPhuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                " Mã Thuốc", "Tên Thuốc", "Số Lượng Tồn", "Đơn Giá"
            }
        ));
        tblKhoiPhuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoiPhucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhoiPhuc);

        btnKhoiPhuc.setText("Khôi Phục");
        btnKhoiPhuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm Kiếm : ");

        btnThoat.setText("thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(btnKhoiPhuc)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhoiPhuc)
                    .addComponent(btnThoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhoiPhucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Bạn muốn khôi phục sản phẩm này ?", "Xác nhận",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); //(1)
        if (opt == JOptionPane.YES_OPTION) { //(2)
            kp.restore(txtTimKiem.getText());//(3)
        }

        kp.filltoArrayList();//(4)
        filltotable(); //(5)
    }//GEN-LAST:event_btnKhoiPhucActionPerformed

    private void tblKhoiPhucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoiPhucMouseClicked
        // TODO add your handling code here:
        showDetail();
    }//GEN-LAST:event_tblKhoiPhucMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
 int option = JOptionPane.showConfirmDialog(
        this, 
        "Bạn có muốn thoát không?", 
        "Xác nhận thoát", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE
    );
    
    // Nếu người dùng chọn Yes
    if (option == JOptionPane.YES_OPTION) {
        // Đóng JFrame hiện tại (KhoiPhuc)
        this.dispose();

        // Mở lại panel jpnQuanLiThuoc trên MainFrame hiện tại
        if (mainFrame != null) {
            mainFrame.showPanel("jpnQuanLiThuoc");
        }
    }
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(KhoiPhuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoiPhuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoiPhuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoiPhuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhoiPhuc().setVisible(true);
            }
        });
    }
  
    KhoiPhucDao kp = new KhoiPhucDao();
    List<Thuoc> dstkp = kp.filltoArrayList();

    public void filltotable() {
        DefaultTableModel model = (DefaultTableModel) tblKhoiPhuc.getModel();
        model.setRowCount(0);
        for (Thuoc t : dstkp) {
            model.addRow(new Object[]{
                t.getMaThuoc(), t.getTenThuoc(), t.getSoLuongTon(), t.getDonGia()
            });
        }
    }

    public void showDetail() {
        int index = tblKhoiPhuc.getSelectedRow();
        Thuoc t = dstkp.get(index);
        txtTimKiem.setText(t.getMaThuoc());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKhoiPhuc;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhoiPhuc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
