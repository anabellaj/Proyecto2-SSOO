/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Disk.Buffer;

/**
 *
 * @author alexandralecuna
 */
public class Interface extends javax.swing.JFrame {
    
    Buffer buffer;

    /**
     * Creates new form Interface
     */
    public Interface(Buffer buffer) {
        initComponents();
        this.buffer = buffer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        starTrekLogo = new javax.swing.JLabel();
        starWarsLogo = new javax.swing.JLabel();
        starSimulation = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        starTreckNumWin = new javax.swing.JLabel();
        starTreckCharacter = new javax.swing.JPanel();
        starTreckPlayer = new javax.swing.JLabel();
        starWarsCharacter = new javax.swing.JPanel();
        starWarsPlayer = new javax.swing.JLabel();
        starWarsID = new javax.swing.JLabel();
        starWarsNumWin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        starTreckID = new javax.swing.JLabel();
        starWarsName = new javax.swing.JLabel();
        starWarsTipoCarta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        velocidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        starTreckNivel3 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        starTreckNivel1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        starTreckNivel2 = new javax.swing.JList<>();
        vsLabel2 = new javax.swing.JLabel();
        jLabelN1 = new javax.swing.JLabel();
        jLabeln2 = new javax.swing.JLabel();
        jLabelN3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        starWarsNivel3 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        starWarsNivel1 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        starWarsNivel2 = new javax.swing.JList<>();
        jLabelN2 = new javax.swing.JLabel();
        jLabeln3 = new javax.swing.JLabel();
        jLabelN4 = new javax.swing.JLabel();
        starTreckName2 = new javax.swing.JLabel();
        starTreckTipoCarta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 0, 153));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        starTrekLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarTrekIMGs/Logo.png"))); // NOI18N
        panel.add(starTrekLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 130));

        starWarsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarWarsIMGs/Logo.png"))); // NOI18N
        panel.add(starWarsLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, -10, 490, 200));

        starSimulation.setBackground(new java.awt.Color(255, 255, 0));
        starSimulation.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        starSimulation.setText("Start");
        starSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starSimulationActionPerformed(evt);
            }
        });
        panel.add(starSimulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 150, 50));

        result.setFont(new java.awt.Font("Phosphate", 1, 48)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 0));
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("Resultado");
        panel.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        jLabel1.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ganadores:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        starTreckNumWin.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        starTreckNumWin.setForeground(new java.awt.Color(255, 255, 255));
        starTreckNumWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starTreckNumWin.setText("0");
        panel.add(starTreckNumWin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        starTreckCharacter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        starTreckPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starTreckPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarWarsIMGs/3cpo.jpg"))); // NOI18N
        starTreckPlayer.setToolTipText("");
        starTreckCharacter.add(starTreckPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 200));

        panel.add(starTreckCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 160, 200));

        starWarsPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starWarsPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarWarsIMGs/BB8.jpg"))); // NOI18N

        javax.swing.GroupLayout starWarsCharacterLayout = new javax.swing.GroupLayout(starWarsCharacter);
        starWarsCharacter.setLayout(starWarsCharacterLayout);
        starWarsCharacterLayout.setHorizontalGroup(
            starWarsCharacterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, starWarsCharacterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(starWarsPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        starWarsCharacterLayout.setVerticalGroup(
            starWarsCharacterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, starWarsCharacterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(starWarsPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel.add(starWarsCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        starWarsID.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        starWarsID.setForeground(new java.awt.Color(255, 255, 255));
        starWarsID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starWarsID.setText("ID");
        panel.add(starWarsID, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        starWarsNumWin.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        starWarsNumWin.setForeground(new java.awt.Color(255, 255, 255));
        starWarsNumWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starWarsNumWin.setText("0");
        panel.add(starWarsNumWin, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ganadores:");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        starTreckID.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        starTreckID.setForeground(new java.awt.Color(255, 255, 255));
        starTreckID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starTreckID.setText("ID");
        panel.add(starTreckID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        starWarsName.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        starWarsName.setForeground(new java.awt.Color(255, 255, 255));
        starWarsName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starWarsName.setText("Nombre");
        panel.add(starWarsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        starWarsTipoCarta.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        starWarsTipoCarta.setForeground(new java.awt.Color(255, 255, 255));
        starWarsTipoCarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starWarsTipoCarta.setText("Tipo Carta");
        panel.add(starWarsTipoCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Velocidad:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        velocidad.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        velocidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.5", "1", "1.5", "2" }));
        panel.add(velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        starTreckNivel3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(starTreckNivel3);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 120, 80));

        starTreckNivel1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(starTreckNivel1);

        panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 120, 80));

        starTreckNivel2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(starTreckNivel2);

        panel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 120, 80));

        vsLabel2.setFont(new java.awt.Font("Phosphate", 1, 48)); // NOI18N
        vsLabel2.setForeground(new java.awt.Color(255, 255, 0));
        vsLabel2.setText("VS");
        panel.add(vsLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jLabelN1.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabelN1.setForeground(new java.awt.Color(255, 255, 0));
        jLabelN1.setText("Nivel 1");
        panel.add(jLabelN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabeln2.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabeln2.setForeground(new java.awt.Color(255, 255, 0));
        jLabeln2.setText("Nivel 2");
        panel.add(jLabeln2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabelN3.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabelN3.setForeground(new java.awt.Color(255, 255, 0));
        jLabelN3.setText("Nivel 3");
        panel.add(jLabelN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        starWarsNivel3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(starWarsNivel3);

        panel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 120, 80));

        starWarsNivel1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(starWarsNivel1);

        panel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, 120, 80));

        starWarsNivel2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(starWarsNivel2);

        panel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, 120, 80));

        jLabelN2.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabelN2.setForeground(new java.awt.Color(255, 255, 0));
        jLabelN2.setText("Nivel 1");
        panel.add(jLabelN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, -1));

        jLabeln3.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabeln3.setForeground(new java.awt.Color(255, 255, 0));
        jLabeln3.setText("Nivel 2");
        panel.add(jLabeln3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        jLabelN4.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabelN4.setForeground(new java.awt.Color(255, 255, 0));
        jLabelN4.setText("Nivel 3");
        panel.add(jLabelN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, -1, -1));

        starTreckName2.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        starTreckName2.setForeground(new java.awt.Color(255, 255, 255));
        starTreckName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starTreckName2.setText("Nombre");
        panel.add(starTreckName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        starTreckTipoCarta.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        starTreckTipoCarta.setForeground(new java.awt.Color(255, 255, 255));
        starTreckTipoCarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starTreckTipoCarta.setText("Tipo Carta");
        panel.add(starTreckTipoCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void starSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starSimulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_starSimulationActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelN1;
    private javax.swing.JLabel jLabelN2;
    private javax.swing.JLabel jLabelN3;
    private javax.swing.JLabel jLabelN4;
    private javax.swing.JLabel jLabeln2;
    private javax.swing.JLabel jLabeln3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel result;
    private javax.swing.JButton starSimulation;
    private javax.swing.JPanel starTreckCharacter;
    private javax.swing.JLabel starTreckID;
    private javax.swing.JLabel starTreckName2;
    private javax.swing.JList<String> starTreckNivel1;
    private javax.swing.JList<String> starTreckNivel2;
    private javax.swing.JList<String> starTreckNivel3;
    private javax.swing.JLabel starTreckNumWin;
    private javax.swing.JLabel starTreckPlayer;
    private javax.swing.JLabel starTreckTipoCarta;
    private javax.swing.JLabel starTrekLogo;
    private javax.swing.JPanel starWarsCharacter;
    private javax.swing.JLabel starWarsID;
    private javax.swing.JLabel starWarsLogo;
    private javax.swing.JLabel starWarsName;
    private javax.swing.JList<String> starWarsNivel1;
    private javax.swing.JList<String> starWarsNivel2;
    private javax.swing.JList<String> starWarsNivel3;
    private javax.swing.JLabel starWarsNumWin;
    private javax.swing.JLabel starWarsPlayer;
    private javax.swing.JLabel starWarsTipoCarta;
    private javax.swing.JComboBox<String> velocidad;
    private javax.swing.JLabel vsLabel2;
    // End of variables declaration//GEN-END:variables
}
