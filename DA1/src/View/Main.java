/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ChuyenManHinhController;
import ViewModels.DanhMucBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form ViewBanHang
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("QUẢN LÝ CỬA HÀNG BÁN QUẦN ÁO NAM");
        
        ChuyenManHinhController controller=new ChuyenManHinhController(jpnView);
        controller.setView(jpnThongKe, jlbThongKe);
        
        List<DanhMucBean> listItem=new ArrayList<>();
        listItem.add(new DanhMucBean("ThongKe",jpnThongKe,jlbThongKe));
        listItem.add(new DanhMucBean("HoaDon",jpnHoaDon,jlbHoaDon));
        listItem.add(new DanhMucBean("SanPham",jpnSanPham,jlbSanPham));
        listItem.add(new DanhMucBean("NhanVien",jpnNhanVien,jlbNhanVien));
        listItem.add(new DanhMucBean("KhuyenMai",jpnKhuyenMai,jlbKhuyenMai));
        listItem.add(new DanhMucBean("KhachHang",jpnKhachHang,jlbKhachHang));
        listItem.add(new DanhMucBean("DoiMatKhau",jpnDoiMatKhau,jlbDoiMatKhau));
        listItem.add(new DanhMucBean("DangXuat",jpnDangXuat,jlbDangXuat));
        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMenu = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpnHoaDon = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlbHoaDon = new javax.swing.JLabel();
        jpnSanPham = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlbSanPham = new javax.swing.JLabel();
        jpnNhanVien = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jlbNhanVien = new javax.swing.JLabel();
        jpnKhuyenMai = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jlbKhuyenMai = new javax.swing.JLabel();
        jpnKhachHang = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jlbKhachHang = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jlbThongKe = new javax.swing.JLabel();
        jpnDoiMatKhau = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jlbDoiMatKhau = new javax.swing.JLabel();
        jpnDangXuat = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jlbDangXuat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHẦN MỀM QUẢN LÝ BÁN QUẦN ÁO NAM");
        setBackground(new java.awt.Color(255, 255, 255));

        jpnMenu.setBackground(new java.awt.Color(255, 255, 153));
        jpnMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1146, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/9025885_shopping_cart_icon-2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("MAN STORE");

        jpnHoaDon.setBackground(new java.awt.Color(255, 255, 153));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/9165407_file_invoice_document_icon.png"))); // NOI18N

        jlbHoaDon.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jlbHoaDon.setText("Hoá đơn");

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jlbHoaDon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jlbHoaDon)
                .addGap(14, 14, 14))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnSanPham.setBackground(new java.awt.Color(255, 255, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/9027071_t_shirt_thin_icon.png"))); // NOI18N

        jlbSanPham.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jlbSanPham.setText("Sản phẩm");

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbSanPham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnSanPhamLayout.setVerticalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbSanPham))
        );

        jpnNhanVien.setBackground(new java.awt.Color(255, 255, 153));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/7065200_humans_staff_people_employee_team_icon.png"))); // NOI18N

        jlbNhanVien.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jlbNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbNhanVien))
        );

        jpnKhuyenMai.setBackground(new java.awt.Color(255, 255, 153));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3884118_black friday_cheap_discount_sale_icon.png"))); // NOI18N

        jlbKhuyenMai.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jlbKhuyenMai.setText("Khuyến mại");

        javax.swing.GroupLayout jpnKhuyenMaiLayout = new javax.swing.GroupLayout(jpnKhuyenMai);
        jpnKhuyenMai.setLayout(jpnKhuyenMaiLayout);
        jpnKhuyenMaiLayout.setHorizontalGroup(
            jpnKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhuyenMaiLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbKhuyenMai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnKhuyenMaiLayout.setVerticalGroup(
            jpnKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
            .addGroup(jpnKhuyenMaiLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbKhuyenMai))
        );

        jpnKhachHang.setBackground(new java.awt.Color(255, 255, 153));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4781820_avatar_male_man_people_person_icon.png"))); // NOI18N

        jlbKhachHang.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jlbKhachHang.setText("Khách hàng");

        javax.swing.GroupLayout jpnKhachHangLayout = new javax.swing.GroupLayout(jpnKhachHang);
        jpnKhachHang.setLayout(jpnKhachHangLayout);
        jpnKhachHangLayout.setHorizontalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHangLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbKhachHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnKhachHangLayout.setVerticalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11)
            .addGroup(jpnKhachHangLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbKhachHang))
        );

        jpnThongKe.setBackground(new java.awt.Color(255, 255, 153));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Business-Statistics-icon.png"))); // NOI18N

        jlbThongKe.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jlbThongKe.setText("Thống kê");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbThongKe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe)
                .addGap(14, 14, 14))
        );

        jpnDoiMatKhau.setBackground(new java.awt.Color(255, 255, 153));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/7023958_password_account_security_reset_safety_icon.png"))); // NOI18N

        jlbDoiMatKhau.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jlbDoiMatKhau.setText("Đổi mật khẩu");

        javax.swing.GroupLayout jpnDoiMatKhauLayout = new javax.swing.GroupLayout(jpnDoiMatKhau);
        jpnDoiMatKhau.setLayout(jpnDoiMatKhauLayout);
        jpnDoiMatKhauLayout.setHorizontalGroup(
            jpnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoiMatKhauLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbDoiMatKhau)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jpnDoiMatKhauLayout.setVerticalGroup(
            jpnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDoiMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDoiMatKhau)
                .addGap(14, 14, 14))
        );

        jpnDangXuat.setBackground(new java.awt.Color(255, 255, 153));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/7623195_arrow_left_logout_ui_logout icon_icon.png"))); // NOI18N

        jlbDangXuat.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jlbDangXuat.setText("Thoát");

        javax.swing.GroupLayout jpnDangXuatLayout = new javax.swing.GroupLayout(jpnDangXuat);
        jpnDangXuat.setLayout(jpnDangXuatLayout);
        jpnDangXuatLayout.setHorizontalGroup(
            jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDangXuatLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbDangXuat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDangXuatLayout.setVerticalGroup(
            jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpnDangXuatLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbDangXuat))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlbDangXuat;
    private javax.swing.JLabel jlbDoiMatKhau;
    private javax.swing.JLabel jlbHoaDon;
    private javax.swing.JLabel jlbKhachHang;
    private javax.swing.JLabel jlbKhuyenMai;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbSanPham;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JPanel jpnDangXuat;
    private javax.swing.JPanel jpnDoiMatKhau;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnKhachHang;
    private javax.swing.JPanel jpnKhuyenMai;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
