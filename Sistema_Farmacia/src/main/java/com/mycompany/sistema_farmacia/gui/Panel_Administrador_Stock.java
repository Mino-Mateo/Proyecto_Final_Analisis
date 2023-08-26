/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Clase Publica */
// Clases o Paquetes
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;

// Librerias
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/* Clase Panel Administrador Stock */
public class Panel_Administrador_Stock extends javax.swing.JFrame {


    /* Inicializador */
    public Panel_Administrador_Stock() {
        initComponents();
        configurarVentana();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jButton_Salir = new javax.swing.JButton();
        jTabbedPane_Productos = new javax.swing.JTabbedPane();
        jPanel_AgregarP = new javax.swing.JPanel();
        jPanel_CajaAgregar = new javax.swing.JPanel();
        jPanel_CajaIngresos = new javax.swing.JPanel();
        jLabel_NombProNu = new javax.swing.JLabel();
        jLabel_PrProNu = new javax.swing.JLabel();
        jLabel_StockProNu = new javax.swing.JLabel();
        jTextField_NomProNu = new javax.swing.JTextField();
        jTextField_PrProNu = new javax.swing.JTextField();
        jTextField_StockProNu = new javax.swing.JTextField();
        jPanel_BtnIngresos = new javax.swing.JPanel();
        jButton_BtnAgregar = new javax.swing.JButton();
        jLabel_TituloAgre = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        jPanel_CajaStockProductos = new javax.swing.JPanel();
        jPanel_BtnsCrud = new javax.swing.JPanel();
        jButton_ActualizarNombre = new javax.swing.JButton();
        jButton_ActualizarPrecio = new javax.swing.JButton();
        jButton_ActualizarStock = new javax.swing.JButton();
        jLabel_TextoparaBotones = new javax.swing.JLabel();
        jPanel_CajaBusqueda = new javax.swing.JPanel();
        jButton_Buscar = new javax.swing.JButton();
        jLabel_TituloBuscar = new javax.swing.JLabel();
        jTextField_Busqueda = new javax.swing.JTextField();
        jScrollPane_tabla = new javax.swing.JScrollPane();
        jPanel_ContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();
        jLabel_Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Salir.setText("Volver");
        jButton_Salir.setActionCommand("Volver");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jLabel_NombProNu.setText("Nombre Producto:");

        jLabel_PrProNu.setText("Precio:");

        jLabel_StockProNu.setText("Stock:");

        javax.swing.GroupLayout jPanel_CajaIngresosLayout = new javax.swing.GroupLayout(jPanel_CajaIngresos);
        jPanel_CajaIngresos.setLayout(jPanel_CajaIngresosLayout);
        jPanel_CajaIngresosLayout.setHorizontalGroup(
            jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaIngresosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_NombProNu)
                    .addComponent(jLabel_PrProNu)
                    .addComponent(jLabel_StockProNu))
                .addGap(30, 30, 30)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_StockProNu, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_PrProNu, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextField_NomProNu)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel_CajaIngresosLayout.setVerticalGroup(
            jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaIngresosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NombProNu)
                    .addComponent(jTextField_NomProNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_PrProNu)
                    .addComponent(jTextField_PrProNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_StockProNu)
                    .addComponent(jTextField_StockProNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton_BtnAgregar.setText("Agregar Producto");
        jButton_BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BtnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BtnIngresosLayout = new javax.swing.GroupLayout(jPanel_BtnIngresos);
        jPanel_BtnIngresos.setLayout(jPanel_BtnIngresosLayout);
        jPanel_BtnIngresosLayout.setHorizontalGroup(
            jPanel_BtnIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BtnIngresosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton_BtnAgregar)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_BtnIngresosLayout.setVerticalGroup(
            jPanel_BtnIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BtnIngresosLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jButton_BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jLabel_TituloAgre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TituloAgre.setText("Agregar Productos");

        javax.swing.GroupLayout jPanel_CajaAgregarLayout = new javax.swing.GroupLayout(jPanel_CajaAgregar);
        jPanel_CajaAgregar.setLayout(jPanel_CajaAgregarLayout);
        jPanel_CajaAgregarLayout.setHorizontalGroup(
            jPanel_CajaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CajaIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_BtnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_CajaAgregarLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel_TituloAgre))
        );
        jPanel_CajaAgregarLayout.setVerticalGroup(
            jPanel_CajaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TituloAgre, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CajaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_CajaIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_BtnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel_AgregarPLayout = new javax.swing.GroupLayout(jPanel_AgregarP);
        jPanel_AgregarP.setLayout(jPanel_AgregarPLayout);
        jPanel_AgregarPLayout.setHorizontalGroup(
            jPanel_AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AgregarPLayout.createSequentialGroup()
                .addComponent(jPanel_CajaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_AgregarPLayout.setVerticalGroup(
            jPanel_AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AgregarPLayout.createSequentialGroup()
                .addComponent(jPanel_CajaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        jTabbedPane_Productos.addTab("Agregar Productos", jPanel_AgregarP);

        jButton_ActualizarNombre.setText("Actualizar Nombre");
        jButton_ActualizarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarNombreActionPerformed(evt);
            }
        });

        jButton_ActualizarPrecio.setText("Actualizar Precio");
        jButton_ActualizarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarPrecioActionPerformed(evt);
            }
        });

        jButton_ActualizarStock.setText("Actualizar Stock");
        jButton_ActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarStockActionPerformed(evt);
            }
        });

        jLabel_TextoparaBotones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TextoparaBotones.setText("Botones de Actualización");

        javax.swing.GroupLayout jPanel_BtnsCrudLayout = new javax.swing.GroupLayout(jPanel_BtnsCrud);
        jPanel_BtnsCrud.setLayout(jPanel_BtnsCrudLayout);
        jPanel_BtnsCrudLayout.setHorizontalGroup(
            jPanel_BtnsCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BtnsCrudLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton_ActualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton_ActualizarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton_ActualizarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BtnsCrudLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_TextoparaBotones)
                .addGap(148, 148, 148))
        );
        jPanel_BtnsCrudLayout.setVerticalGroup(
            jPanel_BtnsCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BtnsCrudLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel_TextoparaBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_BtnsCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ActualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ActualizarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ActualizarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jLabel_TituloBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TituloBuscar.setText(" Buscar Producto por Nombre");

        javax.swing.GroupLayout jPanel_CajaBusquedaLayout = new javax.swing.GroupLayout(jPanel_CajaBusqueda);
        jPanel_CajaBusqueda.setLayout(jPanel_CajaBusquedaLayout);
        jPanel_CajaBusquedaLayout.setHorizontalGroup(
            jPanel_CajaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaBusquedaLayout.createSequentialGroup()
                .addGroup(jPanel_CajaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_CajaBusquedaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextField_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Buscar))
                    .addGroup(jPanel_CajaBusquedaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel_TituloBuscar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel_CajaBusquedaLayout.setVerticalGroup(
            jPanel_CajaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaBusquedaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_TituloBuscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel_CajaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable_Productos);

        javax.swing.GroupLayout jPanel_ContenedorTablaLayout = new javax.swing.GroupLayout(jPanel_ContenedorTabla);
        jPanel_ContenedorTabla.setLayout(jPanel_ContenedorTablaLayout);
        jPanel_ContenedorTablaLayout.setHorizontalGroup(
            jPanel_ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel_ContenedorTablaLayout.setVerticalGroup(
            jPanel_ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane_tabla.setViewportView(jPanel_ContenedorTabla);

        javax.swing.GroupLayout jPanel_CajaStockProductosLayout = new javax.swing.GroupLayout(jPanel_CajaStockProductos);
        jPanel_CajaStockProductos.setLayout(jPanel_CajaStockProductosLayout);
        jPanel_CajaStockProductosLayout.setHorizontalGroup(
            jPanel_CajaStockProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaStockProductosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel_CajaStockProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_tabla)
                    .addGroup(jPanel_CajaStockProductosLayout.createSequentialGroup()
                        .addComponent(jPanel_CajaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_BtnsCrud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_CajaStockProductosLayout.setVerticalGroup(
            jPanel_CajaStockProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaStockProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CajaStockProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_CajaBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_BtnsCrud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaStockProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaStockProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane_Productos.addTab("Stock de Productos", jPanel);

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_Titulo.setText("Stock de Productos");

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane_Productos))
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel_Titulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton Volver
    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        manejoPantalla(new Panel_Administrador_Opciones());
    }//GEN-LAST:event_jButton_SalirActionPerformed

    // Boton Agregar
    private void jButton_BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BtnAgregarActionPerformed
        String nombreProducto = jTextField_NomProNu.getText();
        String precioProducto = jTextField_PrProNu.getText();
        String stockProducto = jTextField_StockProNu.getText();

        if (nombreProducto.isEmpty() || precioProducto.isEmpty() || stockProducto.isEmpty())
        {
            mostrarMensajeError("Complete todos los campos");
            return;
        }

        int confirmacion = mostrarConfirmacion("¿Está seguro que quiere ingresar este producto?");

        if (confirmacion == JOptionPane.YES_OPTION)
        {
            if (productoExiste(nombreProducto))
            {
                mostrarMensajeError("Error al Ingresar, este producto ya existe");
                return;
            }

            if (insertarProducto(nombreProducto, precioProducto, stockProducto))
            {
                mostrarMensajeExito("Producto Agregado");

                limpiarPantalla();
            } else
            {
                mostrarMensajeError("Error al agregar el producto");
            }
        }
    }//GEN-LAST:event_jButton_BtnAgregarActionPerformed

    // Boton Buscar
    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        String busqueda = jTextField_Busqueda.getText().trim();
        actualizarTabla(busqueda);
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    // Boton Actualizar Nombre
    private void jButton_ActualizarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarNombreActionPerformed
        int selectedRow = jTable_Productos.getSelectedRow();
        if (selectedRow == -1)
        {
            // No se ha seleccionado ninguna fila
            JOptionPane.showMessageDialog(this, "Error: Seleccione un Producto para actualizar su nombre", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirmResult = JOptionPane.showConfirmDialog(this, "¿Está seguro de querer cambiar el nombre?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION)
        {
            String nuevoNombre = JOptionPane.showInputDialog(this, "Introduzca el nuevo nombre del producto:", "Actualizar Nombre", JOptionPane.PLAIN_MESSAGE);
            if (nuevoNombre != null && !nuevoNombre.isEmpty())
            {
                actualizarNombreProducto(selectedRow, nuevoNombre);
            }
        }
    }//GEN-LAST:event_jButton_ActualizarNombreActionPerformed

    // Boton Actualizar Precio
    private void jButton_ActualizarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarPrecioActionPerformed
        int selectedRow = jTable_Productos.getSelectedRow();
        if (selectedRow == -1)
        {
            // No se ha seleccionado ninguna fila
            JOptionPane.showMessageDialog(this, "Error: Seleccione un Producto para actualizar su precio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirmResult = JOptionPane.showConfirmDialog(this, "¿Está seguro de querer cambiar el precio?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION)
        {
            String nuevoPrecioStr = JOptionPane.showInputDialog(this, "Introduzca el nuevo precio del producto:", "Actualizar Precio", JOptionPane.PLAIN_MESSAGE);
            if (nuevoPrecioStr != null && !nuevoPrecioStr.isEmpty())
            {
                try
                {
                    double nuevoPrecio = Double.parseDouble(nuevoPrecioStr);
                    actualizarPrecioProducto(selectedRow, nuevoPrecio);
                } catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(this, "Error: Introduzca un valor numérico válido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton_ActualizarPrecioActionPerformed

    // Boton Actualizar Stock
    private void jButton_ActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarStockActionPerformed
        int selectedRow = jTable_Productos.getSelectedRow();
        if (selectedRow == -1)
        {
            // No se ha seleccionado ninguna fila
            JOptionPane.showMessageDialog(this, "Error: Seleccione un Producto para actualizar su stock", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirmResult = JOptionPane.showConfirmDialog(this, "¿Está seguro de querer cambiar el stock?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION)
        {
            String nuevoStockStr = JOptionPane.showInputDialog(this, "Introduzca el nuevo stock del producto:", "Actualizar Stock", JOptionPane.PLAIN_MESSAGE);
            if (nuevoStockStr != null && !nuevoStockStr.isEmpty())
            {
                try
                {
                    int nuevoStock = Integer.parseInt(nuevoStockStr);
                    actualizarStockProducto(selectedRow, nuevoStock);
                } catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(this, "Error: Introduzca un valor numérico válido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton_ActualizarStockActionPerformed

    /* Logica */
    // Pantalla Agregar Productos
    // Verificar si el Producto esta en la base de datos
    private boolean productoExiste(String nombreProducto) {
        String QUERY_VERIFICAR_PRODUCTO = "SELECT COUNT(*) FROM Productos WHERE nombre = ?";

        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement stmt = conn.prepareStatement(QUERY_VERIFICAR_PRODUCTO))
        {
            stmt.setString(1, nombreProducto);

            try (ResultSet rs = stmt.executeQuery())
            {
                if (rs.next())
                {
                    int count = rs.getInt(1);
                    return count > 0; // Si count es mayor que cero, el producto existe
                }
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return false; // En caso de error o si no se encuentra el producto, devuelve false
    }

    // Insertar Producto
    private boolean insertarProducto(String nombreProducto, String precioProducto, String stockProducto) {
        String QUERY_INSERT_PRODUCTO = "INSERT INTO Productos (nombre, precio, stock) VALUES (?, ?, ?)";

        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement cone = conn.prepareStatement(QUERY_INSERT_PRODUCTO))
        {
            cone.setString(1, nombreProducto);
            cone.setString(2, precioProducto);
            cone.setString(3, stockProducto);

            int rowsAffected = cone.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

    /* Mensajes en Pantalla */
    // Error
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Exito
    private void mostrarMensajeExito(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    // Confimar si quieres
    private int mostrarConfirmacion(String mensaje) {
        return JOptionPane.showConfirmDialog(this, mensaje, "Confirmar", JOptionPane.YES_NO_OPTION);
    }

    // Actualizar Tabla
    private void actualizarTabla(String busqueda) {
        DefaultTableModel model = (DefaultTableModel) jTable_Productos.getModel();
        model.setRowCount(0);

        Connection cone = Conexion_MySQL.getConnection();

        if (cone != null)
        {
            String query = generarQuery(busqueda);

            try (PreparedStatement stmt = cone.prepareStatement(query))
            {
                asignarParametros(stmt, busqueda);
                ResultSet rs = stmt.executeQuery();

                while (rs.next())
                {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    int stock = rs.getInt("stock");
                    model.addRow(new Object[]
                    {
                        id, nombre, precio, stock
                    });
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                cerrarConexion(cone);
            }
        }
    }

    // Query de Busqueda
    private String generarQuery(String busqueda) {
        if (!busqueda.isEmpty())
        {
            return "SELECT * FROM Productos WHERE nombre = ?";
        } else
        {
            return "SELECT * FROM Productos";
        }
    }

    // Parametros de Busqueda
    private void asignarParametros(PreparedStatement stmt, String busqueda) throws SQLException {
        if (!busqueda.isEmpty())
        {
            stmt.setString(1, busqueda);
        }
    }

    // Cerrar Conexion de Busqueda
    private void cerrarConexion(Connection cone) {
        try
        {
            cone.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    // Actualizar Nombre
    private void actualizarNombreProducto(int rowIndex, String nuevoNombre) {
        DefaultTableModel model = (DefaultTableModel) jTable_Productos.getModel();
        int id = (int) model.getValueAt(rowIndex, 0);

        Connection connection = Conexion_MySQL.getConnection();

        if (connection != null)
        {
            String query = "UPDATE Productos SET nombre = ? WHERE id = ?";

            try (PreparedStatement stmt = connection.prepareStatement(query))
            {
                stmt.setString(1, nuevoNombre);
                stmt.setInt(2, id);

                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0)
                {
                    model.setValueAt(nuevoNombre, rowIndex, 1);
                    JOptionPane.showMessageDialog(this, "Nombre actualizado correctamente", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                cerrarConexion(connection);
            }
        }
    }

    // Actualizar Precio
    private void actualizarPrecioProducto(int rowIndex, double nuevoPrecio) {
        if (nuevoPrecio < 0)
        {
            JOptionPane.showMessageDialog(this, "El precio no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable_Productos.getModel();
        int id = (int) model.getValueAt(rowIndex, 0);

        Connection connection = Conexion_MySQL.getConnection();

        if (connection != null)
        {
            String query = "UPDATE Productos SET precio = ? WHERE id = ?";

            try (PreparedStatement stmt = connection.prepareStatement(query))
            {
                stmt.setDouble(1, nuevoPrecio);
                stmt.setInt(2, id);

                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0)
                {
                    model.setValueAt(nuevoPrecio, rowIndex, 2);
                    JOptionPane.showMessageDialog(this, "Precio actualizado correctamente", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                cerrarConexion(connection);
            }
        }
    }

    // Actualizar Stock
    private void actualizarStockProducto(int rowIndex, int nuevoStock) {
        if (nuevoStock < 0)
        {
            JOptionPane.showMessageDialog(this, "El stock no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable_Productos.getModel();
        int id = (int) model.getValueAt(rowIndex, 0);

        Connection connection = Conexion_MySQL.getConnection();

        if (connection != null)
        {
            String query = "UPDATE Productos SET stock = ? WHERE id = ?";

            try (PreparedStatement stmt = connection.prepareStatement(query))
            {
                stmt.setInt(1, nuevoStock);
                stmt.setInt(2, id);

                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0)
                {
                    model.setValueAt(nuevoStock, rowIndex, 3);
                    JOptionPane.showMessageDialog(this, "Stock actualizado correctamente", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                cerrarConexion(connection);
            }
        }
    }


    /* Extras */
    // Limpiar Pantalla
    private void limpiarPantalla() {
        jTextField_NomProNu.setText("");
        jTextField_PrProNu.setText("");
        jTextField_StockProNu.setText("");
    }

    // Manejo de Pantalla
    private void manejoPantalla(javax.swing.JFrame nuevaPantalla) {
        dispose();
        nuevaPantalla.setVisible(true);
    }

    // Configurar las pantallas
    private void configurarVentana() {
        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);

        // Evitar que la ventana pueda ser redimensionada
        setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ActualizarNombre;
    private javax.swing.JButton jButton_ActualizarPrecio;
    private javax.swing.JButton jButton_ActualizarStock;
    private javax.swing.JButton jButton_BtnAgregar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel_NombProNu;
    private javax.swing.JLabel jLabel_PrProNu;
    private javax.swing.JLabel jLabel_StockProNu;
    private javax.swing.JLabel jLabel_TextoparaBotones;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_TituloAgre;
    private javax.swing.JLabel jLabel_TituloBuscar;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel_AgregarP;
    private javax.swing.JPanel jPanel_BtnIngresos;
    private javax.swing.JPanel jPanel_BtnsCrud;
    private javax.swing.JPanel jPanel_CajaAgregar;
    private javax.swing.JPanel jPanel_CajaBusqueda;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaIngresos;
    private javax.swing.JPanel jPanel_CajaStockProductos;
    private javax.swing.JPanel jPanel_ContenedorTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_tabla;
    private javax.swing.JTabbedPane jTabbedPane_Productos;
    private javax.swing.JTable jTable_Productos;
    private javax.swing.JTextField jTextField_Busqueda;
    private javax.swing.JTextField jTextField_NomProNu;
    private javax.swing.JTextField jTextField_PrProNu;
    private javax.swing.JTextField jTextField_StockProNu;
    // End of variables declaration//GEN-END:variables
}
