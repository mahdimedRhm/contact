/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logics.Contact;

/**
 *
 * @author acer
 */
public class MainGUI extends javax.swing.JFrame {
    
    private ArrayList<Contact>ListContact ; 
    private boolean modeffication;
    
    
    
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        ListContact = new ArrayList<>() ; 
        modeffication=false ; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactFileChooser = new javax.swing.JFileChooser();
        rechercherDialogue = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        nomRadioChooser = new javax.swing.JRadioButton();
        pernomRadioChooser = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rechercherTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        recherchButtonGroup = new javax.swing.ButtonGroup();
        nomLabel = new javax.swing.JLabel();
        prenomLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        prenomTextField = new javax.swing.JTextField();
        nomTextField = new javax.swing.JTextField();
        mobileFormatedTextField = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactTable = new javax.swing.JTable();
        supprimerContact = new javax.swing.JButton();
        modifierContact = new javax.swing.JButton();
        ajouterContact = new javax.swing.JButton();
        rechercherButton = new javax.swing.JButton();
        mainjMenuBar1 = new javax.swing.JMenuBar();
        filejMenu = new javax.swing.JMenu();
        ouvrirejMenuItem1 = new javax.swing.JMenuItem();
        enregistrerjMenuItem1 = new javax.swing.JMenuItem();
        fermerMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        quiterjMenuItem1 = new javax.swing.JMenuItem();
        aidejMenu = new javax.swing.JMenu();
        aproposjMenuItem = new javax.swing.JMenuItem();

        rechercherDialogue.setMinimumSize(new java.awt.Dimension(600, 400));
        rechercherDialogue.setModal(true);
        rechercherDialogue.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        rechercherDialogue.setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Recherche Par : ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        recherchButtonGroup.add(nomRadioChooser);
        nomRadioChooser.setSelected(true);
        nomRadioChooser.setText("Nom");

        recherchButtonGroup.add(pernomRadioChooser);
        pernomRadioChooser.setText("Prenom");
        pernomRadioChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pernomRadioChooserActionPerformed(evt);
            }
        });

        recherchButtonGroup.add(jRadioButton1);
        jRadioButton1.setText("Mobile");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mot Clé:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/if_search_322497.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomRadioChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(142, 142, 142)
                        .addComponent(pernomRadioChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(143, 143, 143)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomRadioChooser)
                    .addComponent(pernomRadioChooser)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );

        rechercherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nom", "prenom", "mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rechercherTable);

        jButton2.setText("Selectionner");

        javax.swing.GroupLayout rechercherDialogueLayout = new javax.swing.GroupLayout(rechercherDialogue.getContentPane());
        rechercherDialogue.getContentPane().setLayout(rechercherDialogueLayout);
        rechercherDialogueLayout.setHorizontalGroup(
            rechercherDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rechercherDialogueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rechercherDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rechercherDialogueLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rechercherDialogueLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        rechercherDialogueLayout.setVerticalGroup(
            rechercherDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechercherDialogueLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));

        nomLabel.setText("nom:");

        prenomLabel.setText("prenom:");

        mobileLabel.setText("mobile:");

        contactTable.setBackground(new java.awt.Color(204, 255, 255));
        contactTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        contactTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prenom", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        contactTable.setGridColor(new java.awt.Color(0, 204, 204));
        contactTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactListMouseclicked(evt);
            }
        });
        jScrollPane1.setViewportView(contactTable);

        supprimerContact.setText("Supprimer");
        supprimerContact.setEnabled(false);
        supprimerContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerContactActionPerformed(evt);
            }
        });

        modifierContact.setText("Modifier");
        modifierContact.setEnabled(false);
        modifierContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierContactActionPerformed(evt);
            }
        });

        ajouterContact.setText("Ajouter");
        ajouterContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterContactActionPerformed(evt);
            }
        });

        rechercherButton.setBackground(new java.awt.Color(0, 255, 255));
        rechercherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/if_search_322497.png"))); // NOI18N
        rechercherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherButtonActionPerformed(evt);
            }
        });

        filejMenu.setText("File");

        ouvrirejMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        ouvrirejMenuItem1.setText("Ouvrire");
        ouvrirejMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouvrirejMenuItem1ActionPerformed(evt);
            }
        });
        filejMenu.add(ouvrirejMenuItem1);

        enregistrerjMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        enregistrerjMenuItem1.setText("Enregistrer");
        enregistrerjMenuItem1.setEnabled(false);
        enregistrerjMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerjMenuItem1ActionPerformed(evt);
            }
        });
        filejMenu.add(enregistrerjMenuItem1);

        fermerMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        fermerMenuItem1.setText("Fermer");
        fermerMenuItem1.setEnabled(false);
        fermerMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerMenuItem1ActionPerformed(evt);
            }
        });
        filejMenu.add(fermerMenuItem1);
        filejMenu.add(jSeparator1);

        quiterjMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quiterjMenuItem1.setText("Quiter");
        quiterjMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiterjMenuItem1ActionPerformed(evt);
            }
        });
        filejMenu.add(quiterjMenuItem1);

        mainjMenuBar1.add(filejMenu);

        aidejMenu.setText("Aide");

        aproposjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aproposjMenuItem.setText("A propos... ");
        aproposjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aproposjMenuItemActionPerformed(evt);
            }
        });
        aidejMenu.add(aproposjMenuItem);

        mainjMenuBar1.add(aidejMenu);

        setJMenuBar(mainjMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mobileLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ajouterContact, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modifierContact, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(supprimerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomLabel)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(prenomLabel)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prenomTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(nomTextField)
                            .addComponent(mobileFormatedTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rechercherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLabel)
                    .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rechercherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenomLabel))
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileFormatedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supprimerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifierContact, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajouterContact, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ouvrirejMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouvrirejMenuItem1ActionPerformed
        // TODO add your handling code here:
        //Ouvrire le fichier de contacts
        FileInputStream fis ; 
        contactFileChooser.showOpenDialog(this);
        try{
            fis = new FileInputStream(contactFileChooser.getSelectedFile());
            ObjectInputStream ois = new ObjectInputStream (fis); 
            ListContact=(ArrayList<Contact>) ois.readObject(); 
            ois.close();
            mettreAjoureLaTable();
            
        }catch(IOException ex){
            ex.printStackTrace();
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE,null,ex);
        }
        enregistrerjMenuItem1.setEnabled(true);
        fermerMenuItem1.setEnabled(true);
    }//GEN-LAST:event_ouvrirejMenuItem1ActionPerformed

    private void enregistrerjMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerjMenuItem1ActionPerformed
       enregitrer();
    }//GEN-LAST:event_enregistrerjMenuItem1ActionPerformed
    private void enregitrer (){
         // TODO add your handling code here:
        //Enregistrer les contacs dans un fichier
        FileOutputStream fos ;
        contactFileChooser.showSaveDialog(this);
        try {
            fos=new FileOutputStream(contactFileChooser.getSelectedFile());
            ObjectOutputStream ous = new ObjectOutputStream (fos);
            ous.writeObject(ListContact);
            ous.close();
            modeffication = false ; 
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
    private void quiterjMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiterjMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quiterjMenuItem1ActionPerformed

    private void aproposjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aproposjMenuItemActionPerformed
        // Afficher le message a propos
        JOptionPane.showMessageDialog(this,"RAHMOUN Mohamed Elmehdi"+"\n" +"email: mahidmedrhm@gmail.com","A Propos",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aproposjMenuItemActionPerformed

    private void ajouterContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterContactActionPerformed
        //ajouter un nouveau contact 
        Contact c =new Contact(
                nomTextField.getText().trim(),
                prenomTextField.getText().trim(),
                mobileFormatedTextField.getText()
        );
        ListContact.add(c);
        mettreAjoureLaTable();
        efacerLesChamps();
        enregistrerjMenuItem1.setEnabled(true);
        fermerMenuItem1.setEnabled(true);
        modeffication=true ;
    }//GEN-LAST:event_ajouterContactActionPerformed

    private void modifierContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierContactActionPerformed
        // TODO add your handling code here:
        int index=contactTable.getSelectedRow() ; 
        if (index>= 0){
            Contact c=new Contact(
                    nomTextField.getText().trim(), 
                    prenomTextField.getText().trim(), 
                    mobileFormatedTextField.getText().trim()
            );
            ListContact.set(index,c);
            mettreAjoureLaTable();
            efacerLesChamps();
            modifierContact.setEnabled(false);
            supprimerContact.setEnabled(false);
            enregistrerjMenuItem1.setEnabled(true);
                    
            
        }
        modeffication=true;
    }//GEN-LAST:event_modifierContactActionPerformed

    private void contactListMouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactListMouseclicked
        
        // TODO add your handling code here:
        int index=contactTable.getSelectedRow();
        if(index >=0 ){
            nomTextField.setText(ListContact.get(index).getNom());
            prenomTextField.setText(ListContact.get(index).getPrenom());
            mobileFormatedTextField.setText(ListContact.get(index).getMobile());
            modifierContact.setEnabled(true);
            supprimerContact.setEnabled(true);
        }
    }//GEN-LAST:event_contactListMouseclicked

    private void supprimerContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerContactActionPerformed
        // TODO add your handling code here:
        if (contactTable.getSelectedRow()>=0){
        ListContact.remove(contactTable.getSelectedRow());
        supprimerContact.setEnabled(false);
        modifierContact.setEnabled(false);
        }
        efacerLesChamps();
        mettreAjoureLaTable();
        this.setTitle(String.valueOf(ListContact.isEmpty()));
        if (!ListContact.isEmpty()){
        enregistrerjMenuItem1.setEnabled(true);
        }else{
        enregistrerjMenuItem1.setEnabled(false); 
        fermerMenuItem1.setEnabled(false);
        }
        modeffication=true;

    }//GEN-LAST:event_supprimerContactActionPerformed

    private void fermerMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerMenuItem1ActionPerformed
        int r=JOptionPane.showConfirmDialog(this,
                    "voulez vous enregistrer les modifications ?", 
                    "fichier non sauvgardé",
                    JOptionPane.YES_NO_CANCEL_OPTION
                    );
            switch (r){
                case 0 :
                    enregitrer();
                    fermer();
                    break;
                case 1 :
                    fermer();
                    modeffication= false;
                    break;
                case 2 : 
                    default:
            }
    }//GEN-LAST:event_fermerMenuItem1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void pernomRadioChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pernomRadioChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pernomRadioChooserActionPerformed

    private void rechercherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherButtonActionPerformed
        // TODO add your handling code here:
        rechercherDialogue.setLocationRelativeTo(this);
        rechercherDialogue.setSize(600, 400);
        rechercherDialogue.setVisible(true);
    }//GEN-LAST:event_rechercherButtonActionPerformed
    private void fermer (){
        //fermer la lise es contaccte en cour 
       
            viderListe();
            efacerLesChamps();
            fermerMenuItem1.setEnabled(false);
            enregistrerjMenuItem1.setEnabled(false);
    }
    
    private void mettreAjoureLaTable(){
        DefaultTableModel dfm=(DefaultTableModel)contactTable.getModel() ;
        //vider le tableau 
        while(dfm.getRowCount()>0) {
            dfm.removeRow(0);
        }
        for (Contact c: ListContact ){
            dfm.addRow(new Object[]{c.getNom(),c.getPrenom(),c.getMobile()});
        }
        contactTable.setModel(dfm);
        
    }
    private void efacerLesChamps (){
        nomTextField.setText("");
        prenomTextField.setText("");
        mobileFormatedTextField.setText("");
    }
    private void viderListe(){
        
           DefaultTableModel dfm=(DefaultTableModel)contactTable.getModel() ;
        //vider le tableau 
        while(dfm.getRowCount()>0) {
            dfm.removeRow(0);
        }
        //vier la liste des cnctctes 
        //for(Contact c: ListContact)
          //  ListContact.remove(c); 
            
        while (!ListContact.isEmpty())
            ListContact.remove(0);
        //! ==> la negation 
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aidejMenu;
    private javax.swing.JButton ajouterContact;
    private javax.swing.JMenuItem aproposjMenuItem;
    private javax.swing.JFileChooser contactFileChooser;
    private javax.swing.JTable contactTable;
    private javax.swing.JMenuItem enregistrerjMenuItem1;
    private javax.swing.JMenuItem fermerMenuItem1;
    private javax.swing.JMenu filejMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar mainjMenuBar1;
    private javax.swing.JFormattedTextField mobileFormatedTextField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JButton modifierContact;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JRadioButton nomRadioChooser;
    private javax.swing.JTextField nomTextField;
    private javax.swing.JMenuItem ouvrirejMenuItem1;
    private javax.swing.JRadioButton pernomRadioChooser;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JTextField prenomTextField;
    private javax.swing.JMenuItem quiterjMenuItem1;
    private javax.swing.ButtonGroup recherchButtonGroup;
    private javax.swing.JButton rechercherButton;
    private javax.swing.JDialog rechercherDialogue;
    private javax.swing.JTable rechercherTable;
    private javax.swing.JButton supprimerContact;
    // End of variables declaration//GEN-END:variables
}