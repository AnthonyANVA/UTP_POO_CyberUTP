/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package misClases;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import misFormularios.frmInicioCliente;

/**
 *
 * @author ANTHONY
 */
public class ItemCarrito extends javax.swing.JPanel {

    private Producto producto;

    /**
     * Creates new form ItemProducto
     */

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        Producto.setText(producto.getNombreProducto());
        lblPrecio.setText("S/. " + precioProductoCarrito());
        lblCantidad.setText(String.valueOf(producto.getCantidad()));
    }

    public void deleteProducto() {
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        ((frmInicioCliente) topFrame).eliminarProductoCarrito(this, precioProductoCarrito());
    }

    public double precioProductoCarrito() {
        double precio = 0;
        precio = (double) producto.getPrecio() * producto.getCantidad();
        return precio;
    }

    public ItemCarrito() {
        initComponents();
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Producto = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(475, 60));
        setPreferredSize(new java.awt.Dimension(453, 40));

        Producto.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        Producto.setText("Producto");

        lblPrecio.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblPrecio.setText("Precio");

        btnEliminar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblCantidad.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCantidad)
                .addGap(59, 59, 59)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto)
                    .addComponent(lblPrecio)
                    .addComponent(btnEliminar)
                    .addComponent(lblCantidad))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEliminarActionPerformed
        deleteProducto();
    }// GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Producto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblPrecio;
    // End of variables declaration//GEN-END:variables
}
