package transferplanner.ui;

import transferplanner.business.PlannerManage;
import transferplanner.domain.CourseInfo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.event.ListSelectionListener;

/**
 * A GUI main class which creates an individualized plan for a student who
 * wishes to graduate from EdCC with the new Associate in Computer Science
 * –Direct Transfer Agreement degree (CS DTA). Link to the courses:
 * http://catalog.edcc.edu/preview_program.php?catoid=52&poid=10505
 *
 * @author Uyen Hoang
 * @author Phuong Tran
 * @version 1.0
 */
public class AssociateCSPlan extends javax.swing.JFrame {

    // fields
    public PlannerManage s = new PlannerManage();
    public ArrayList<CourseInfo> courseTaken = new ArrayList<>();
    public ArrayList<CourseInfo> coursePlaced = new ArrayList<>();

    /**
     * Creates new form AssociateCSApp
     */
    public AssociateCSPlan() {
        initComponents();
        // center form
        this.setLocationRelativeTo(null);
        // Set the title 
        this.setTitle("Individualized Planner");
        // Set icon of the image to the form
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/transferplanner"
                + "/ui/logo.png"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        studentNametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        studentIdtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayJTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        clearJButton = new javax.swing.JButton();
        printJButton = new javax.swing.JButton();
        displayJButton = new javax.swing.JButton();
        exitJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        placedJList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        takenJList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        studentJLabel = new javax.swing.JLabel();
        warningJLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));

        jLabel1.setText("Student Name");

        studentNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNametxtActionPerformed(evt);
            }
        });

        jLabel2.setText("SID");

        studentIdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdtxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Course Placed");

        jLabel8.setText("Course Taken");

        displayJTextArea.setEditable(false);
        displayJTextArea.setColumns(20);
        displayJTextArea.setRows(5);
        jScrollPane2.setViewportView(displayJTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
        );

        clearJButton.setMnemonic('C');
        clearJButton.setText("Clear");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });

        printJButton.setMnemonic('P');
        printJButton.setText("Print");
        printJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJButtonActionPerformed(evt);
            }
        });

        displayJButton.setMnemonic('O');
        displayJButton.setText("Enter");
        displayJButton.setToolTipText("Click enter to display the plan");
        displayJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayJButtonActionPerformed(evt);
            }
        });

        exitJButton.setMnemonic('E');
        exitJButton.setText("Exit");
        exitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(displayJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(printJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(exitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearJButton)
                    .addComponent(displayJButton)
                    .addComponent(exitJButton)
                    .addComponent(printJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        placedJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "ENGL 099", "ENGL& 101", "MATH 087", "MATH 097", "MATH& 141", "MATH& 142", "MATH& 144", "MATH& 151" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        placedJList.setToolTipText("Please enter the course placed from the test");
        jScrollPane1.setViewportView(placedJList);

        takenJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "ENGL 099", "ENGL& 101", "ENGL& 235", "HLTH 100", "HLTH 150", "ENGR 100", "ART& 100", "COMM 101", "HUM 101", "MUSC 101", "ART 101", "ENGL 120", "CMST& 210", "CMST& 220", "HUM 108", "MUSC 106", "MATH 087", "MATH 097", "MATH& 141", "MATH& 142", "MATH& 144", "MATH& 151", "MATH& 152", "MATH& 153", "MATH& 254", "MATH& 271", "MATH& 272", "PHYS& 221", "PHYS& 222", "PHYS& 223", "CS 115", "CS& 131/141", "CS 132/142", "CS 133/143", "ECON& 201", "ECON& 202", "PHIL& 101" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        takenJList.setToolTipText("Please chosse the courses taken ");
        jScrollPane3.setViewportView(takenJList);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transferplanner/ui/edmondslogo.png"))); // NOI18N

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setMnemonic('C');
        jMenuItem2.setText("Clear");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setMnemonic('P');
        jMenuItem3.setText("Print");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setMnemonic('E');
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setMnemonic('H');
        jMenu3.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(studentIdtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(studentNametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112)
                .addComponent(jLabel4)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(warningJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(studentIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNametxtActionPerformed

    }//GEN-LAST:event_studentNametxtActionPerformed

    private void studentIdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdtxtActionPerformed

    /**
     * Close the application
     *
     * @param evt the action.
     */
    private void exitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJButtonActionPerformed
        // Close the application
        System.exit(0);
    }//GEN-LAST:event_exitJButtonActionPerformed

    /**
     * Close the application.
     *
     * @param evt the action.
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // end the form
        exitJButtonActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * Clear all the text fields and text areas.
     *
     * @param evt the action.
     */
    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        // Clear all and reset form
        //Clear the student name text field
        studentNametxt.setText("");
        //Clear the student ID text field
        studentIdtxt.setText("");
        // Clear the text area
        displayJTextArea.setText("");
        // Set the focus after reset the form
        studentNametxt.requestFocus();
        courseTaken = new ArrayList<>();
        coursePlaced = new ArrayList<>();

    }//GEN-LAST:event_clearJButtonActionPerformed

    /**
     * Clear all the text fields and text areas.
     *
     * @param evt the action.
     */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Clear all textfields
        clearJButtonActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * Print the form
     *
     * @param evt the action.
     */
    private void printJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJButtonActionPerformed
        // Print the form 
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printJButtonActionPerformed

    /**
     * Print the form
     *
     * @param evt the action.
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Print the form
        printJButtonActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * Show the About form
     *
     * @param evt the action.
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Display the application information
        AboutForm myAbout = new AboutForm(this, true);
        myAbout.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * Display the plan.
     *
     * @param evt the action.
     */
    private void displayJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayJButtonActionPerformed

        // Get the index of all the selected items
        int[] selectedIx = placedJList.getSelectedIndices();

        // Get all the selected items using the indices
        for (int i = 0; i < selectedIx.length; i++) {
            Object sel = placedJList.getModel().getElementAt(selectedIx[i]);
            for (int j = 0; j < s.getAllCourses().size(); j++) {
                String name = s.getAllCourses().get(j).getName();
                if (sel.toString().equals(name)) {
                    coursePlaced.add(s.getAllCourses().get(j));
                }
            }
        }

        if (coursePlaced.size() > 1) {
            for (int i = 0; i < coursePlaced.size() - 1; i++) {
                String n = coursePlaced.get(i).getName().substring(0, 3);
                if (coursePlaced.get(i + 1).getName().contains(n)) {
                    warningJLabel.setText("You cannot choose these courses as your"
                            + " placed courses. Please use ctrl to deselect them.");
                }
            }
            coursePlaced = new ArrayList<>();
            int[] selectedIx1 = placedJList.getSelectedIndices();

            // Get all the selected items using the indices
            for (int i = 0; i < selectedIx.length; i++) {
                Object sel = placedJList.getModel().getElementAt(selectedIx[i]);
                for (int j = 0; j < s.getAllCourses().size(); j++) {
                    String name = s.getAllCourses().get(j).getName();
                    if (sel.toString().equals(name)) {
                        coursePlaced.add(s.getAllCourses().get(j));
                    }
                }
            }
        }

        // Get the index of all the selected items
        int[] selectedIx2 = takenJList.getSelectedIndices();

        // Get all the selected items using the indices
        for (int i = 0; i < selectedIx2.length; i++) {
            Object sel = takenJList.getModel().getElementAt(selectedIx2[i]);
            for (int j = 0; j < s.getAllCourses().size(); j++) {
                String name = s.getAllCourses().get(j).getName();
                if (sel.toString().equals(name)) {
                    courseTaken.add(s.getAllCourses().get(j));
                }
            }
        }

        for (int i = 0; i < coursePlaced.size(); i++) {
            for (int j = 0; j < courseTaken.size(); j++) {
                if (courseTaken.get(j).getName().equals(coursePlaced.get(i).getName())) {
                    warningJLabel.setText("You already chose these courses!");
                    // Get the index of all the selected items
                    int[] selectedIx12 = takenJList.getSelectedIndices();

                    // Get all the selected items using the indices
                    for (int a = 0; a < selectedIx12.length; a++) {
                        Object sel = takenJList.getModel().getElementAt(selectedIx12[a]);
                        for (int b = 0; b < s.getAllCourses().size(); b++) {
                            String name = s.getAllCourses().get(b).getName();
                            if (sel.toString().equals(name)) {
                                courseTaken.add(s.getAllCourses().get(b));
                            }
                        }
                    }
                }
            }
        }

        String name = studentNametxt.getText();
        String id = studentIdtxt.getText();

        if (name.equals("") || id.equals("")) {
            warningJLabel.setText("Please fill out your name and/or your SID!");
            name = studentNametxt.getText();
            id = studentIdtxt.getText();
        }

        studentJLabel.setText("Student" + " " + name + " with ID: " + id
                + " has these courses to take.");

        s.modifyPlan(courseTaken, coursePlaced);
        ArrayList<CourseInfo> plan = s.getPlan();

        String output = "";
        for (int i = 0; i < plan.size(); i++) {
            output = output + plan.get(i).toString() + "\n";
        }
        // Display the plan on the text area
        displayJTextArea.setText(output);
        //
    }//GEN-LAST:event_displayJButtonActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String args[]) throws InterruptedException, FileNotFoundException {
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
            java.util.logging.Logger.getLogger(AssociateCSPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssociateCSPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssociateCSPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssociateCSPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //call the Splash Screen class and display the splash screen.
        SplashShow splash = new SplashShow();
        splash.splashMethod(); //call this method to display the splash screen.
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssociateCSPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearJButton;
    private javax.swing.JButton displayJButton;
    private javax.swing.JTextArea displayJTextArea;
    private javax.swing.JButton exitJButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> placedJList;
    private javax.swing.JButton printJButton;
    private javax.swing.JTextField studentIdtxt;
    private javax.swing.JLabel studentJLabel;
    private javax.swing.JTextField studentNametxt;
    private javax.swing.JList<String> takenJList;
    private javax.swing.JLabel warningJLabel;
    // End of variables declaration//GEN-END:variables

}