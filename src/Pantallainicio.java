
import java.awt.AWTEvent;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.net.*;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import javax.swing.JOptionPane;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import javax.swing.JOptionPane;

public class Pantallainicio extends javax.swing.JFrame {

  
  public Pantallainicio() {
initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        dispose();
setUndecorated(true);
setVisible(true);

       Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
        public void eventDispatched(AWTEvent event) {
            if (event instanceof KeyEvent) {
                KeyEvent keyEvent = (KeyEvent) event;
                if (keyEvent.getKeyCode() == KeyEvent.VK_F4 && keyEvent.isAltDown()) {
                    int confirmed = JOptionPane.showConfirmDialog(null,
                            "¿Estás seguro que deseas cerrar la ventana?", "Confirmación de cierre",
                            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (confirmed == JOptionPane.YES_OPTION) {
                        dispose(); // Cierra el JFrame
                    } else {
                        // Evita que la ventana se cierre
                        keyEvent.consume();
                    }
                }
            }
        }
    }, AWTEvent.KEY_EVENT_MASK);

    addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_H) {
                Secreto secretForm = new Secreto();
                secretForm.setVisible(true);
            }
        }
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        Regresar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Utilidades = new javax.swing.JLabel();
        adm1 = new javax.swing.JLabel();
        exploradorlogo = new javax.swing.JLabel();
        Vector = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Acercaequipó = new javax.swing.JMenu();
        Menuinformacion = new javax.swing.JMenuItem();
        Infoequipo1 = new javax.swing.JMenuItem();
        Infodisco1 = new javax.swing.JMenuItem();
        Menucerrarsesion = new javax.swing.JMenuItem();
        Sistemout = new javax.swing.JMenuItem();
        Reiniciar = new javax.swing.JMenuItem();
        Archivoapagar = new javax.swing.JMenuItem();
        Herramientas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        admtareas = new javax.swing.JMenuItem();
        simbosistema = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Propiedades = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Infored = new javax.swing.JMenuItem();
        Inforam = new javax.swing.JMenuItem();
        Infousuario = new javax.swing.JMenuItem();
        fechahora = new javax.swing.JMenuItem();
        Especs = new javax.swing.JMenuItem();
        procesossistema = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Infointeres = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar (1).png"))); // NOI18N
        Regresar.setToolTipText("");
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 880, 180, 140));

        jLabel4.setBackground(new java.awt.Color(187, 187, 187));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setText("Utilidades");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 820, -1, -1));

        jLabel3.setBackground(new java.awt.Color(187, 187, 187));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Administrador de tareas");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 820, -1, -1));

        jLabel1.setBackground(new java.awt.Color(187, 187, 187));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Explorador de archivos");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 820, -1, -1));

        Utilidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/utilidades logo.png"))); // NOI18N
        Utilidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UtilidadesMouseClicked(evt);
            }
        });
        jPanel1.add(Utilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 270, -1, -1));

        adm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrador de tareas logo.png"))); // NOI18N
        adm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adm1MouseClicked(evt);
            }
        });
        jPanel1.add(adm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        exploradorlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Explorador de archivos logo.png"))); // NOI18N
        exploradorlogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exploradorlogoMouseClicked(evt);
            }
        });
        jPanel1.add(exploradorlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        Vector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vector 1.png"))); // NOI18N
        Vector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VectorMouseClicked(evt);
            }
        });
        jPanel1.add(Vector, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 900, 270, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1940, 1090));

        Acercaequipó.setText("Archivo");
        Acercaequipó.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcercaequipóMouseClicked(evt);
            }
        });
        Acercaequipó.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaequipóActionPerformed(evt);
            }
        });

        Menuinformacion.setText("Acerca del sistema operativo");
        Menuinformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuinformacionMouseClicked(evt);
            }
        });
        Menuinformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuinformacionActionPerformed(evt);
            }
        });
        Acercaequipó.add(Menuinformacion);

        Infoequipo1.setText("Acerca del equipo");
        Infoequipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Infoequipo1ActionPerformed(evt);
            }
        });
        Acercaequipó.add(Infoequipo1);

        Infodisco1.setText("Información del disco");
        Infodisco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Infodisco1ActionPerformed(evt);
            }
        });
        Acercaequipó.add(Infodisco1);

        Menucerrarsesion.setText("Cerrar sesión");
        Menucerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenucerrarsesionActionPerformed(evt);
            }
        });
        Acercaequipó.add(Menucerrarsesion);

        Sistemout.setText("Salir del sistema");
        Sistemout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SistemoutMouseClicked(evt);
            }
        });
        Sistemout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistemoutActionPerformed(evt);
            }
        });
        Acercaequipó.add(Sistemout);

        Reiniciar.setText("Reiniciar equipo");
        Reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReiniciarMouseClicked(evt);
            }
        });
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        Acercaequipó.add(Reiniciar);

        Archivoapagar.setText("Apagar equipo");
        Archivoapagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArchivoapagarMouseClicked(evt);
            }
        });
        Archivoapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoapagarActionPerformed(evt);
            }
        });
        Acercaequipó.add(Archivoapagar);

        jMenuBar1.add(Acercaequipó);

        Herramientas.setText("Herramientas");

        jMenuItem1.setText("Explorador de archivos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Herramientas.add(jMenuItem1);

        admtareas.setText("Administrador de tareas");
        admtareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admtareasActionPerformed(evt);
            }
        });
        Herramientas.add(admtareas);

        simbosistema.setText("Símbolo del sistema (CMD)");
        simbosistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simbosistemaActionPerformed(evt);
            }
        });
        Herramientas.add(simbosistema);

        jMenuItem4.setText("Símbolo del sistema (Powershell)");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Herramientas.add(jMenuItem4);

        jMenuBar1.add(Herramientas);

        Propiedades.setText("Propiedades");

        jMenuItem3.setText("Información del sistema operativo");
        Propiedades.add(jMenuItem3);

        Infored.setText("Información de red");
        Infored.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InforedActionPerformed(evt);
            }
        });
        Propiedades.add(Infored);

        Inforam.setText("Información de memoria ram");
        Inforam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InforamActionPerformed(evt);
            }
        });
        Propiedades.add(Inforam);

        Infousuario.setText("Información de usuario");
        Infousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfousuarioActionPerformed(evt);
            }
        });
        Propiedades.add(Infousuario);

        fechahora.setText("Información de fecha, hora y localización");
        fechahora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechahoraActionPerformed(evt);
            }
        });
        Propiedades.add(fechahora);

        Especs.setText("Especificaciones del sistema");
        Especs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecsActionPerformed(evt);
            }
        });
        Propiedades.add(Especs);

        procesossistema.setText("Información sobre procesos del sistema");
        procesossistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesossistemaActionPerformed(evt);
            }
        });
        Propiedades.add(procesossistema);

        jMenuBar1.add(Propiedades);

        jMenu2.setText("Acerca de");

        Infointeres.setText("Información de interés");
        Infointeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfointeresActionPerformed(evt);
            }
        });
        jMenu2.add(Infointeres);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivoapagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchivoapagarMouseClicked
             try {
        Runtime.getRuntime().exec("shutdown -s -t 0");
    } catch (IOException ex) {
    }
// TODO add your handling code here:
    }//GEN-LAST:event_ArchivoapagarMouseClicked

    private void ReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReiniciarMouseClicked
     // TODO add your handling code here:
    }//GEN-LAST:event_ReiniciarMouseClicked

    private void MenucerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenucerrarsesionActionPerformed
     JOptionPane.showMessageDialog(this, "Sesión actual satisfactoriamente cerrada.");
        Ingreso PI = new Ingreso();
             PI.setVisible(true);
             dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_MenucerrarsesionActionPerformed

    private void MenuinformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuinformacionMouseClicked
   // TODO add your handling code here:
    }//GEN-LAST:event_MenuinformacionMouseClicked

    private void MenuinformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuinformacionActionPerformed
                 JOptionPane.showMessageDialog(this, "Sistema operativo Mint version 1.0, 2023.");
    // TODO add your handling code here:
    }//GEN-LAST:event_MenuinformacionActionPerformed

    private void AcercaequipóMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcercaequipóMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_AcercaequipóMouseClicked

    private void Infoequipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Infoequipo1ActionPerformed
   String userName = System.getProperty("user.name");
String osName = System.getProperty("os.name");
String osVersion = System.getProperty("os.version");
String javaVersion = System.getProperty("java.version");
String javaVendor = System.getProperty("java.vendor");
long totalMemory = Runtime.getRuntime().totalMemory();
long freeMemory = Runtime.getRuntime().freeMemory();
long maxMemory = Runtime.getRuntime().maxMemory();
String message = "Usuario: " + userName + "\nSistema operativo: " + osName + " " + osVersion + "\nVersión de Java: " + javaVersion + "\nProveedor de Java: " + javaVendor + "\nMemoria total: " + totalMemory + " bytes\nMemoria libre: " + freeMemory + " bytes\nMemoria máxima: " + maxMemory + " bytes";
JOptionPane.showMessageDialog(null, message, "Información del equipo", JOptionPane.INFORMATION_MESSAGE);  // TODO add your handling code here:      // TODO add your handling code here:
    }//GEN-LAST:event_Infoequipo1ActionPerformed

    private void AcercaequipóActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaequipóActionPerformed

    }//GEN-LAST:event_AcercaequipóActionPerformed

    private void Infodisco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Infodisco1ActionPerformed
File diskPartition = new File("C:");
long totalCapacity = diskPartition.getTotalSpace();
long freeSpace = diskPartition.getFreeSpace();
long usedSpace = totalCapacity - freeSpace;
String message = "Capacidad total del disco C: " + totalCapacity / (1024 * 1024) + " MB\nEspacio libre: " + freeSpace / (1024 * 1024) + " MB\nEspacio utilizado: " + usedSpace / (1024 * 1024) + " MB";
JOptionPane.showMessageDialog(null, message, "Información del disco C:", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_Infodisco1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    if (Desktop.isDesktopSupported()) {
   try {
      Desktop.getDesktop().open(new File("C:\\"));
   } catch (IOException ex) {
      // Manejo de excepciones
   }
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void admtareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admtareasActionPerformed
  try {
    Runtime.getRuntime().exec("cmd /c start taskmgr.exe");
} catch (IOException ex) {
    ex.printStackTrace();
}
    }//GEN-LAST:event_admtareasActionPerformed

    private void simbosistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbosistemaActionPerformed
  try {
    Runtime.getRuntime().exec("cmd /c start cmd.exe");
} catch (IOException ex) {
    ex.printStackTrace();
}
    }//GEN-LAST:event_simbosistemaActionPerformed

    private void exploradorlogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploradorlogoMouseClicked
JOptionPane.showMessageDialog(this, "Ingresando a explorador de archivos.");
        Exploradordearchivos PI = new Exploradordearchivos();
             PI.setVisible(true);
             dispose();       }//GEN-LAST:event_exploradorlogoMouseClicked

    private void adm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adm1MouseClicked
JOptionPane.showMessageDialog(this, "Ingresando a administrador de tareas.");
Taskmgr PI = new Taskmgr();
             PI.setVisible(true);
             dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_adm1MouseClicked

    private void UtilidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UtilidadesMouseClicked
 JOptionPane.showMessageDialog(this, "Ingresando a utilidades.");
        Administrador PI1 = new Administrador();
             PI1.setVisible(true);
             dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_UtilidadesMouseClicked

    private void VectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VectorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VectorMouseClicked

    private void InforamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InforamActionPerformed
// Obtener la cantidad de memoria total del sistema
long totalMemory = Runtime.getRuntime().totalMemory();

// Obtener la cantidad de memoria libre en el sistema
long freeMemory = Runtime.getRuntime().freeMemory();

// Calcular la cantidad de memoria usada
long usedMemory = totalMemory - freeMemory;

// Crear un mensaje con la información de la memoria
String message = "Total Memory: " + totalMemory / (1024 * 1024) + " MB\n" +
                 "Used Memory: " + usedMemory / (1024 * 1024) + " MB\n" +
                 "Free Memory: " + freeMemory / (1024 * 1024) + " MB";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, message, "Información de Memoria", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_InforamActionPerformed

    private void InforedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InforedActionPerformed
       StringBuilder sb = new StringBuilder();
        Enumeration<NetworkInterface> interfaces = null;
        try {
            interfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException ex) {
            Logger.getLogger(Pantallainicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            byte[] hardwareAddress = null;
           try {
               hardwareAddress = ni.getHardwareAddress();
           } catch (SocketException ex) {
               Logger.getLogger(Pantallainicio.class.getName()).log(Level.SEVERE, null, ex);
           }
            if (hardwareAddress != null) {
                String macAddress = "";
                for (int i = 0; i < hardwareAddress.length; i++) {
                    macAddress += String.format("%02X%s", hardwareAddress[i], (i < hardwareAddress.length - 1) ? "-" : "");
                }
                sb.append("Interface: ").append(ni.getName()).append("\n");
                sb.append("MAC Address: ").append(macAddress).append("\n");
            }
            Enumeration<InetAddress> addresses = ni.getInetAddresses();
            while (addresses.hasMoreElements()) {
                InetAddress addr = addresses.nextElement();
                if (addr instanceof Inet4Address) {
                    sb.append("IP Address: ").append(addr.getHostAddress()).append("\n");
                }
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
  
        
 // TODO add your handling code here:
    }//GEN-LAST:event_InforedActionPerformed

    private void InfousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfousuarioActionPerformed
       String userName = System.getProperty("user.name");
        String sessionId = ManagementFactory.getRuntimeMXBean().getName();
        String message = "Usuario: " + userName + "\nSesión activa: " + sessionId;
        JOptionPane.showMessageDialog(null, message, "Información del usuario", JOptionPane.INFORMATION_MESSAGE);
    
  // TODO add your handling code here:
    }//GEN-LAST:event_InfousuarioActionPerformed

    private void fechahoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechahoraActionPerformed
     Date fechaHoraActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        
        // Obtener la ubicación actual utilizando una API de servicios de ubicación
        String ubicacionActual = "Bogotá, Colombia";
        
        // Mostrar la información en un JOptionPane
        JOptionPane.showMessageDialog(null, 
            "Fecha: " + formatoFecha.format(fechaHoraActual) + "\n" +
            "Hora: " + formatoHora.format(fechaHoraActual) + "\n" +
            "Ubicación: " + ubicacionActual);    // TODO add your handling code here:
    }//GEN-LAST:event_fechahoraActionPerformed

    private void EspecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecsActionPerformed
      Runtime runtime = Runtime.getRuntime();
long totalMemory = runtime.totalMemory();
long freeMemory = runtime.freeMemory();
long maxMemory = runtime.maxMemory();

JOptionPane.showMessageDialog(null, "Memoria total: " + totalMemory + " bytes\n" +
        "Memoria libre: " + freeMemory + " bytes\n" +
        "Memoria máxima: " + maxMemory + " bytes");
try {
    Process process = Runtime.getRuntime().exec("systeminfo");

    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

    String line;
    while ((line = reader.readLine()) != null) {
        if (line.contains("Processor(s):")) {
            JOptionPane.showMessageDialog(null, line.trim());
            break;
        }
    }

    reader.close();
    process.destroy();
} catch (IOException e) {
    e.printStackTrace();
}
try {
    Process process = Runtime.getRuntime().exec("wmic diskdrive get caption,size,freespace");

    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

    String line;
    while ((line = reader.readLine()) != null) {
        if (line.contains("Caption")) {
            continue;
        }

        String[] parts = line.trim().split("\\s+");
        String caption = parts[0];
        long size = Long.parseLong(parts[1]);
        long freeSpace = Long.parseLong(parts[2]);

        JOptionPane.showMessageDialog(null, "Disco: " + caption + "\n" +
                "Tamaño: " + size + " bytes\n" +
                "Espacio libre: " + freeSpace + " bytes");
    }

    reader.close();
    process.destroy();
} catch (IOException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_EspecsActionPerformed

    private void procesossistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesossistemaActionPerformed
     RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
         List<String> arguments = runtimeMXBean.getInputArguments();
        String processID = "Process ID: " + runtimeMXBean.getName().split("@")[0];
        String jvmArguments = "JVM Arguments: " + arguments;
        JOptionPane.showMessageDialog(null, processID + "\n" + jvmArguments);
 
    }//GEN-LAST:event_procesossistemaActionPerformed

    private void InfointeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfointeresActionPerformed

String message = "Proyecto Mint OS" +   " versión 1.0 " +  "\n"
               + "Desarrollado por: Sebastián Vega, Julián Mendoza y Juan Felipe Gómez\n"
               + "Sistema operativo: Mint OS";

JOptionPane.showMessageDialog(null, message, "Información del Proyecto", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_InfointeresActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 JOptionPane.showMessageDialog(this, "Ingresando a explorador de archivos.");
        Exploradordearchivos PI = new Exploradordearchivos();
             PI.setVisible(true);
             dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
  try {
    Runtime.getRuntime().exec("cmd /c start powershell.exe");
} catch (IOException ex) {
    ex.printStackTrace();
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
 JOptionPane.showMessageDialog(this, "Ingresando a utilidades.");
        Administrador PI1 = new Administrador();
             PI1.setVisible(true);
             dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
JOptionPane.showMessageDialog(this, "Ingresando a administrador de tareas.");
Taskmgr PI = new Taskmgr();
             PI.setVisible(true);
             dispose();            // TODO add your handling code here:
    
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        JOptionPane.showMessageDialog(this, "Regresando al menú anterior.");
        Ingreso PI = new Ingreso();
        PI.setVisible(true);
        dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_RegresarMouseClicked

    private void ArchivoapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoapagarActionPerformed
          JOptionPane.showMessageDialog(this, "Apagando el equipo.");
        try {
            Runtime.getRuntime().exec("shutdown -s -t 0");
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Pantallainicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ArchivoapagarActionPerformed

    private void SistemoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SistemoutMouseClicked
  JOptionPane.showMessageDialog(this, "Gracias por usar nuestro sistema.");
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_SistemoutMouseClicked

    private void SistemoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SistemoutActionPerformed
        JOptionPane.showMessageDialog(this, "Gracias por usar nuestro sistema.");
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_SistemoutActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
   try {
    Runtime.getRuntime().exec("shutdown -r -t 0");
} catch (IOException ex) {
    ex.printStackTrace();
}     // TODO add your handling code here:
    }//GEN-LAST:event_ReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantallainicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acercaequipó;
    private javax.swing.JMenuItem Archivoapagar;
    private javax.swing.JMenuItem Especs;
    private javax.swing.JMenu Herramientas;
    private javax.swing.JMenuItem Infodisco1;
    private javax.swing.JMenuItem Infoequipo1;
    private javax.swing.JMenuItem Infointeres;
    private javax.swing.JMenuItem Inforam;
    private javax.swing.JMenuItem Infored;
    private javax.swing.JMenuItem Infousuario;
    private javax.swing.JMenuItem Menucerrarsesion;
    private javax.swing.JMenuItem Menuinformacion;
    private javax.swing.JMenu Propiedades;
    private javax.swing.JLabel Regresar;
    private javax.swing.JMenuItem Reiniciar;
    private javax.swing.JMenuItem Sistemout;
    private javax.swing.JLabel Utilidades;
    private javax.swing.JLabel Vector;
    private javax.swing.JLabel adm1;
    private javax.swing.JMenuItem admtareas;
    private javax.swing.JLabel exploradorlogo;
    private javax.swing.JMenuItem fechahora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem procesossistema;
    private javax.swing.JMenuItem simbosistema;
    // End of variables declaration//GEN-END:variables
}
