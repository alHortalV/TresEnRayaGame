/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.juego.tresenraya;

/**
 *
 * @author leona
 */
public class GUI_tablero extends javax.swing.JFrame {

    static Tablero tablero = new Tablero(); // Inicializamos el tablero

    /**
     * Creates new form GUI_tablero
     */
    public GUI_tablero() {
        initComponents();
        crearJugadores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        Casilla1 = new javax.swing.JButton();
        Casilla2 = new javax.swing.JButton();
        Casilla3 = new javax.swing.JButton();
        Casilla4 = new javax.swing.JButton();
        Casilla5 = new javax.swing.JButton();
        Casilla6 = new javax.swing.JButton();
        Casilla7 = new javax.swing.JButton();
        Casilla8 = new javax.swing.JButton();
        Casilla9 = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        tituloAplicacion = new javax.swing.JLabel();
        textoTurno = new javax.swing.JLabel();
        textoTurnoJugador = new javax.swing.JLabel();
        logoZaidin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(69, 147, 108));

        panelTabla.setBackground(new java.awt.Color(0, 0, 0));
        panelTabla.setLayout(new java.awt.GridLayout(3, 3));

        Casilla1.setBackground(new java.awt.Color(154, 204, 119));
        Casilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla1);

        Casilla2.setBackground(new java.awt.Color(154, 204, 119));
        Casilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla2);

        Casilla3.setBackground(new java.awt.Color(154, 204, 119));
        Casilla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla3);

        Casilla4.setBackground(new java.awt.Color(154, 204, 119));
        Casilla4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla4);

        Casilla5.setBackground(new java.awt.Color(154, 204, 119));
        Casilla5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla5);

        Casilla6.setBackground(new java.awt.Color(154, 204, 119));
        Casilla6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla6);

        Casilla7.setBackground(new java.awt.Color(154, 204, 119));
        Casilla7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla7);

        Casilla8.setBackground(new java.awt.Color(154, 204, 119));
        Casilla8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla8);

        Casilla9.setBackground(new java.awt.Color(154, 204, 119));
        Casilla9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9ActionPerformed(evt);
            }
        });
        panelTabla.add(Casilla9);

        panelDatos.setBackground(new java.awt.Color(51, 79, 83));

        tituloAplicacion.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        tituloAplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAplicacion.setText("TRES EN RAYA");

        textoTurno.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textoTurno.setForeground(new java.awt.Color(255, 255, 255));
        textoTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoTurno.setText("Es el turno de : ");
        textoTurno.setIconTextGap(0);

        textoTurnoJugador.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        textoTurnoJugador.setForeground(new java.awt.Color(255, 255, 255));
        textoTurnoJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoTurnoJugador.setText("X");

        logoZaidin.setIcon(new javax.swing.ImageIcon("tres_en_raya\\src\\main\\recursos\\imgs\\ieszaidin.png")); // NOI18N

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
                panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDatosLayout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addGroup(panelDatosLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout
                                                .createSequentialGroup()
                                                .addGroup(panelDatosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tituloAplicacion,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textoTurno,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(17, 17, 17))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout
                                                .createSequentialGroup()
                                                .addComponent(textoTurnoJugador, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(113, 113, 113))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                panelDatosLayout.createSequentialGroup()
                                                        .addComponent(logoZaidin)
                                                        .addGap(41, 41, 41)))));
        panelDatosLayout.setVerticalGroup(
                panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(tituloAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(logoZaidin)
                                .addGap(18, 18, 18)
                                .addComponent(textoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoTurnoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(228, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 524,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87,
                                        Short.MAX_VALUE)
                                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 458,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE))
                        .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Casilla1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(0,
                0, turnoJugador())) {
            actualizarCelda(0, Casilla1);
        }
    }

    private void Casilla2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(0,
                1, turnoJugador())) {
            actualizarCelda(1, Casilla2);
        }
    }

    private void Casilla3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(0,
                2, turnoJugador())) {
            actualizarCelda(2, Casilla3);
        }
    }

    private void Casilla4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(1,
                0, turnoJugador())) {
            actualizarCelda(3, Casilla4);
        }
    }

    private void Casilla5ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(1,
                1, turnoJugador())) {
            actualizarCelda(4, Casilla5);
        }
    }

    private void Casilla6ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(1,
                2, turnoJugador())) {
            actualizarCelda(5, Casilla6);
        }
    }

    private void Casilla7ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(2,
                0, turnoJugador())) {
            actualizarCelda(6, Casilla7);
        }
    }

    private void Casilla8ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(2,
                1, turnoJugador())) {
            actualizarCelda(7, Casilla8);
        }
    }

    private void Casilla9ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!tablero.isPartidaTerminada() && tablero.cambiarJugada(2,
                2, turnoJugador())) {
            actualizarCelda(8, Casilla9);
        }
    }

    private int turnoJugador() {
        return (tablero.getTurnoActual() == Tablero.getJugador1()) ? Tablero.getJugador1() : Tablero.getJugador2();
    }

    private void actualizarCelda(int index, javax.swing.JButton boton) {
        String simbolo = (tablero.getTurnoActual() == Tablero.getJugador1()) ? "O" : "X";
        boton.setText(simbolo); // Establece el símbolo en el botón

        if (tablero.getTurnoActual() == Tablero.getJugador1()) {
            textoTurnoJugador.setText("X");
        } else {
            textoTurnoJugador.setText("O");
        }
    }

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_tablero.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_tablero.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_tablero.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_tablero.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_tablero().setVisible(true);
            }
        });
    }

    public void crearJugadores() {
        Jugador jugador1 = new Jugador("X");
        Jugador jugador2 = new Jugador("O");
        // Iniciamos ambos hilos
        jugador1.start();
        jugador2.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Casilla1;
    private javax.swing.JButton Casilla2;
    private javax.swing.JButton Casilla3;
    private javax.swing.JButton Casilla4;
    private javax.swing.JButton Casilla5;
    private javax.swing.JButton Casilla6;
    private javax.swing.JButton Casilla7;
    private javax.swing.JButton Casilla8;
    private javax.swing.JButton Casilla9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoZaidin;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JLabel textoTurno;
    private javax.swing.JLabel textoTurnoJugador;
    private javax.swing.JLabel tituloAplicacion;
    // End of variables declaration//GEN-END:variables
}
