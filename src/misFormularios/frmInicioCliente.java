/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package misFormularios;

import java.util.ArrayList;
import misClases.ItemCarrito;
import misClases.Producto;
import misClases.ItemProducto;

/**
 *
 * @author ANTHONY
 */
public class frmInicioCliente extends javax.swing.JFrame {

        /**
         * Creates new form frmLoginCliente
         */
        public static String cliente;
        public double total;
        Producto objProducto = new Producto();
        ArrayList<ItemCarrito> listaProdCarrito = new ArrayList<>();

        public frmInicioCliente() {
                initComponents();
                cliente = frmLoginCliente.cliente;
                if (cliente != null) {
                        lblCliente.setText("Cliente - " + cliente);
                }
                ;
                listarProductos();
                jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        }

        public void listarProductos() {
                // Lista y agrega los productos existentes en la base de datos
                ArrayList<Producto> listaProductos = objProducto.obtenerListaProductos();
                for (Producto p : listaProductos) {
                        ;
                        ItemProducto itemProducto = new ItemProducto();
                        itemProducto.setProducto(p);
                        panelProductos.add(itemProducto);
                        panelProductos.updateUI();
                }
        }

        public void agregarProductoCarrito(Producto producto) {
                // Agrega un producto al panel Carrito
                ItemCarrito itemCarrito = new ItemCarrito();
                itemCarrito.setProductoCarrito(producto);
                if (!existeProductoCarrito(itemCarrito)) {
                        listaProdCarrito.add(itemCarrito);
                        if (producto.getCantidad() != 0) {
                                panelCarrito.add(itemCarrito);
                                sumarTotal(itemCarrito);
                        }
                }
        }

        public boolean existeProductoCarrito(ItemCarrito itemCarrito) {
                // Verifica si existe un producto en el Carrito
                for (ItemCarrito p : listaProdCarrito) {
                        if (p.getProductoCarrito().getNombreProducto() == itemCarrito.getProductoCarrito()
                                        .getNombreProducto()) {
                                restarExistente(p);
                                p.setProductoCarrito(itemCarrito.getProductoCarrito());
                                sumarTotal(itemCarrito);
                                panelCarrito.remove(p);
                                panelCarrito.add(p);
                                if (p.getProductoCarrito().getCantidad() == 0) {
                                        panelCarrito.remove(p);
                                }
                                return true;
                        }
                }
                return false;
        }

        public void eliminarProductoCarrito(ItemCarrito itemCarrito) {
                // Elimina un producto un producto del Carrito
                restarTotal(itemCarrito);
                listaProdCarrito.remove(itemCarrito);
                panelCarrito.remove(itemCarrito);
                panelCarrito.updateUI();
                btnComprar.setFocusable(false);
        }

        public void sumarTotal(ItemCarrito itemCarrito) {
                total += itemCarrito.precioProductoCarrito();
                lblTotal.setText("S/. " + String.valueOf(total));
        }

        public void restarTotal(ItemCarrito itemCarrito) {
                total -= itemCarrito.precioProductoCarrito();
                lblTotal.setText("S/. " + String.valueOf(total));
        }

        public void restarExistente(ItemCarrito itemCarrito) {
                total -= itemCarrito.precioProductoCarritoExistente();
        }

        public void listarCompra() {
                txtCompra.setText("");
                for (ItemCarrito itemCarrito : listaProdCarrito) {
                        txtCompra.setText(txtCompra.getText() + "\n" + itemCarrito.detalleProducto());
                }
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
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                lblCliente = new javax.swing.JLabel();
                btnCerrar = new javax.swing.JButton();
                tabCarrito = new javax.swing.JTabbedPane();
                jPanel1 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                panelProductos = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                panelCarrito = new javax.swing.JPanel();
                btnComprar = new javax.swing.JButton();
                lblTotal = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                txtCompra = new javax.swing.JTextArea();
                jLabel2 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                lblCliente.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
                lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblCliente.setText("Cliente 01");

                btnCerrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
                btnCerrar.setForeground(new java.awt.Color(255, 51, 51));
                btnCerrar.setText("Cerrar Sesión");
                btnCerrar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCerrarActionPerformed(evt);
                        }
                });

                tabCarrito.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
                tabCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tabCarritoMouseClicked(evt);
                        }
                });

                panelProductos.setLayout(new java.awt.GridLayout(0, 3));
                jScrollPane1.setViewportView(panelProductos);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072,
                                                                Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 629,
                                                                Short.MAX_VALUE));

                tabCarrito.addTab("Productos", jPanel1);

                panelCarrito.setLayout(new javax.swing.BoxLayout(panelCarrito, javax.swing.BoxLayout.PAGE_AXIS));
                jScrollPane2.setViewportView(panelCarrito);

                btnComprar.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
                btnComprar.setText("Comprar");
                btnComprar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnComprarActionPerformed(evt);
                        }
                });

                lblTotal.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
                lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblTotal.setText("0.00");

                jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
                jLabel3.setText("Total:");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap(279, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                118,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(37, 37, 37)
                                                                                                .addComponent(lblTotal,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                151,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(13, 13, 13))
                                                                                .addComponent(jScrollPane2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                478,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(74, 74, 74)
                                                                .addComponent(btnComprar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                181,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(60, 60, 60)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(74, 74, 74)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                467,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnComprar,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                60,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblTotal,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(34, 34, 34)));

                tabCarrito.addTab("Carrito", jPanel2);

                txtCompra.setEditable(false);
                txtCompra.setColumns(20);
                txtCompra.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
                txtCompra.setRows(5);

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(0, 171, Short.MAX_VALUE)
                                                                .addComponent(txtCompra,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                730,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 171, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(0, 117, Short.MAX_VALUE)
                                                                .addComponent(txtCompra,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                402,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 118, Short.MAX_VALUE)));

                tabCarrito.addTab("Compra", jPanel3);

                jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
                jLabel2.setText("Pantalla Principal");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                407,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(lblCliente,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                374,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnCerrar)
                                                                .addGap(16, 16, 16))
                                                .addComponent(tabCarrito));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lblCliente,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnCerrar)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(tabCarrito,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                667,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCerrarActionPerformed
                this.setVisible(false);
                new frmLoginCliente().setVisible(true);
        }// GEN-LAST:event_btnCerrarActionPerformed

        private void tabCarritoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabCarritoMouseClicked
                panelProductos.updateUI();
        }// GEN-LAST:event_tabCarritoMouseClicked

        private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnComprarActionPerformed
                listarCompra();
                panelCarrito.updateUI();
        }// GEN-LAST:event_btnComprarActionPerformed

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
        private javax.swing.JButton btnCerrar;
        private javax.swing.JButton btnComprar;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel lblCliente;
        private javax.swing.JLabel lblTotal;
        private javax.swing.JPanel panelCarrito;
        private javax.swing.JPanel panelProductos;
        private javax.swing.JTabbedPane tabCarrito;
        private javax.swing.JTextArea txtCompra;
        // End of variables declaration//GEN-END:variables
}
