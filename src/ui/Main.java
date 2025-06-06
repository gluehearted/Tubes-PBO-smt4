/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Gabriel Prakosa A
 */
public class Main extends javax.swing.JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private LoginAdmin loginAdminPanel;
    private LoginCustomer loginCustomerPanel;
    private DaftarCustomer daftarCustomerPanel;
    private DashboardCustomer dashboardCustomerPanel;
    private DashboardAdmin dashboardAdminPanel;
    private TopUpEwallet topupEwalletPanel;
    private KeranjangCustomer keranjangCustomerPanel;
    private RestaurantScreen restaurantScreenPanel;
    private AddRestaurantMenu addRestaurantMenuPanel; 
    private EditCustomer editCustomerPanel;
    private EditRestaurantMenu editRestaurantMenuPanel;
    private PesananSelesai pesananSelesaiPanel;
    private Checkout checkoutPanel;
    private JPanel homePanel;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        // Inisialisasi CardLayout dan Panel Utama
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Inisialisasi semua panel
        homePanel = new JPanel();
        homePanel.add(jLabel1);
        homePanel.add(btnLoginCust);
        homePanel.add(btnLoginAdm);

        loginCustomerPanel = new LoginCustomer(mainPanel, cardLayout);
        loginAdminPanel = new LoginAdmin(mainPanel, cardLayout);
        daftarCustomerPanel= new DaftarCustomer(mainPanel, cardLayout);
        dashboardCustomerPanel = new DashboardCustomer(mainPanel, cardLayout);
        dashboardAdminPanel = new DashboardAdmin(mainPanel, cardLayout);
        topupEwalletPanel = new TopUpEwallet(mainPanel, cardLayout);
        keranjangCustomerPanel = new KeranjangCustomer(mainPanel, cardLayout);
        restaurantScreenPanel = new RestaurantScreen(mainPanel, cardLayout);
        addRestaurantMenuPanel = new AddRestaurantMenu(mainPanel, cardLayout);
        editCustomerPanel = new EditCustomer(mainPanel, cardLayout);
        editRestaurantMenuPanel = new EditRestaurantMenu(mainPanel, cardLayout);
        pesananSelesaiPanel = new PesananSelesai(mainPanel, cardLayout);
        checkoutPanel = new Checkout(mainPanel, cardLayout);

        // Tambahkan semua panel ke mainPanel dengan nama unik
        mainPanel.add(homePanel, "home");
        mainPanel.add(loginAdminPanel, "loginAdmin");
        mainPanel.add(loginCustomerPanel, "loginCustomer");
        mainPanel.add(daftarCustomerPanel, "daftarCustomer");
        mainPanel.add(dashboardCustomerPanel, "dashboardCustomer");
        mainPanel.add(dashboardAdminPanel, "dashboardAdmin");
        mainPanel.add(topupEwalletPanel, "topupEwallet");
        mainPanel.add(keranjangCustomerPanel, "keranjangCustomer");
        mainPanel.add(restaurantScreenPanel, "restaurantScreen");
        mainPanel.add(addRestaurantMenuPanel, "addRestaurantMenu");
        mainPanel.add(editCustomerPanel, "editCustomer");
        mainPanel.add(editRestaurantMenuPanel, "editRestaurantMenu");
        mainPanel.add(pesananSelesaiPanel, "pesananSelesai");
        mainPanel.add(checkoutPanel, "Checkout");
        
        // Atur konten frame
        setContentPane(mainPanel);
        cardLayout.show(mainPanel, "home"); // Tampilkan halaman awal
        pack();
        setLocationRelativeTo(null); // Tengah layar
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        btnLoginCust = new javax.swing.JButton();
        btnLoginAdm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("SELAMAT DATANG DI APLIKASI PEMESANAN MAKANAN");

        btnLoginCust.setText("LOGIN CUSTOMER");
        btnLoginCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginCustActionPerformed(evt);
            }
        });

        btnLoginAdm.setText("LOGIN ADMIN");
        btnLoginAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoginAdm)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnLoginCust))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoginCust)
                .addGap(18, 18, 18)
                .addComponent(btnLoginAdm)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginCustActionPerformed
        cardLayout.show(mainPanel, "loginCustomer");
    }//GEN-LAST:event_btnLoginCustActionPerformed

    private void btnLoginAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdmActionPerformed
        cardLayout.show(mainPanel, "loginAdmin");
    }//GEN-LAST:event_btnLoginAdmActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginAdm;
    private javax.swing.JButton btnLoginCust;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
