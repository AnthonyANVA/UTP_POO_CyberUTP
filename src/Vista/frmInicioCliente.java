/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author ANTHONY
 */
public class frmInicioCliente extends javax.swing.JFrame {

        /**
         * Creates new form frmLoginCliente
         */
        public frmInicioCliente() {
                initComponents();
                this.setTitle("Inicio Cliente");
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        tabTienda = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cboProductos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdTienda = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblIgv = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        txtTelefono = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtConfirmarClave = new javax.swing.JPasswordField();
        txtClave = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JPasswordField();
        txtClave2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCliente.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCliente.setText("Cliente 01");

        btnCerrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 51, 51));
        btnCerrar.setText("Cerrar Sesión");

        tabTienda.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        cboProductos.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel5.setText("Producto:");

        lblImporte.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImporte.setText("S/. 0.0");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel7.setText("Importe:");

        spnCantidad.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel8.setText("Cantidad:");

        lblPrecio.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("S/. 0.0");

        tblProdTienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProdTienda);

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel10.setText("IGV:");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel11.setText("Subtotal:");

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel12.setText("Total:");

        lblTotal.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("S/. 0.0");

        lblSubtotal.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubtotal.setText("S/. 0.0");

        lblIgv.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblIgv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIgv.setText("S/. 0.0");

        btnQuitar.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnQuitar.setForeground(new java.awt.Color(102, 255, 102));
        btnQuitar.setText("-");

        btnAgregar.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(102, 255, 102));
        btnAgregar.setText("+");

        btnComprar.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnComprar.setText("Comprar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnCantidad)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuitar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIgv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );

        tabTienda.addTab("Tienda", jPanel1);

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel15.setText("Clave:");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setText("Confirmar Clave:");

        jLabel16.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel16.setText("DNI:");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel6.setText("Teléfono:");

        jLabel17.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel17.setText("Dirección:");

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtDireccion.setRows(3);
        jScrollPane2.setViewportView(txtDireccion);

        txtTelefono.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        txtDni.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        txtConfirmarClave.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        txtClave.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        btnRegistrarse.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnRegistrarse.setText("Actualizar datos");

        jLabel18.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel18.setText("Nombres:");

        jLabel19.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel19.setText("Apellidos:");

        txtNombres.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        txtClave2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnRegistrarse)
                        .addGap(293, 293, 293))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel3))
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(222, 222, 222)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(157, 157, 157)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18))
                                .addGap(144, 144, 144)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConfirmarClave)
                            .addComponent(txtTelefono)
                            .addComponent(txtDni)
                            .addComponent(txtClave)
                            .addComponent(jScrollPane2)
                            .addComponent(txtNombres)
                            .addComponent(txtClave2))))
                .addGap(170, 170, 170))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnRegistrarse)
                .addGap(58, 58, 58))
        );

        tabTienda.addTab("Datos", jPanel2);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setText("Pantalla Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(16, 16, 16))
            .addComponent(tabTienda)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {

                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(frmInicioCliente.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(frmInicioCliente.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(frmInicioCliente.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(frmInicioCliente.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new frmInicioCliente().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnComprar;
    public javax.swing.JButton btnQuitar;
    public javax.swing.JButton btnRegistrarse;
    public javax.swing.JComboBox<String> cboProductos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblCliente;
    public javax.swing.JLabel lblIgv;
    public javax.swing.JLabel lblImporte;
    public javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblSubtotal;
    public javax.swing.JLabel lblTotal;
    public javax.swing.JSpinner spnCantidad;
    private javax.swing.JTabbedPane tabTienda;
    public javax.swing.JTable tblProdTienda;
    public javax.swing.JPasswordField txtClave;
    public javax.swing.JPasswordField txtClave2;
    public javax.swing.JPasswordField txtConfirmarClave;
    public javax.swing.JTextArea txtDireccion;
    public javax.swing.JTextField txtDni;
    public javax.swing.JPasswordField txtNombres;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}