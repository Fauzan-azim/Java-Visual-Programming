/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExamOOP;

/**
 *
 * @author ASUS
 */
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form page1
     */
    public RegisterForm() {
        initComponents();
    }

    Connection connection = null;
    ResultSet rs = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jDesktopPane1 = new javax.swing.JDesktopPane();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 32767));
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        checklist2 = new javax.swing.JCheckBox();
        checklist = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        textArea = new javax.swing.JTextField();
        edu = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        label_true = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE YOUR NEW ACCOUNT AS STUDENT");

        fname.setPreferredSize(new java.awt.Dimension(250, 20));
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameKeyTyped(evt);
            }
        });

        jLabel2.setText("Full Name     :");

        jLabel3.setText("User Name   :");

        jLabel4.setText("Date of Birth :");

        jButton1.setText("Submit");
        jButton1.setMaximumSize(new java.awt.Dimension(2132132312, 123123123));
        jButton1.setMinimumSize(new java.awt.Dimension(30, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.setMaximumSize(new java.awt.Dimension(2132132312, 123123123));
        jButton3.setMinimumSize(new java.awt.Dimension(30, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(55, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date :", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month :", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year :", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", " ", " ", " " }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setText("Reset");
        jButton2.setMaximumSize(new java.awt.Dimension(2132132312, 123123123));
        jButton2.setMinimumSize(new java.awt.Dimension(30, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Education     :");

        userName.setPreferredSize(new java.awt.Dimension(250, 20));

        address.setPreferredSize(new java.awt.Dimension(250, 20));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel10.setText("Address        :");

        checklist2.setText("I agree with Student Bureau term of use");
        checklist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checklist2ActionPerformed(evt);
            }
        });

        checklist.setText("Sign up to receive email about products, services, offers and events ");
        checklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checklistActionPerformed(evt);
            }
        });

        jLabel5.setText("(you can unsubscribe any time. See Privacy & Policy for details)");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel8.setText("Your Syblings             :  ");

        jLabel9.setText("Password     :");

        jLabel11.setText("Email             :");

        jLabel12.setText("Phone Num   :");

        Email.setPreferredSize(new java.awt.Dimension(250, 20));
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        phone.setPreferredSize(new java.awt.Dimension(250, 20));
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });

        textArea.setPreferredSize(new java.awt.Dimension(250, 20));

        edu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Last Education :", "Elementary School", "Junior High School", "Senior High School" }));

        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checklist2)
                    .addComponent(checklist)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_true, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(edu, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(edu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_true, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(checklist2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checklist, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        
        
        if (fname.getText().equals("")) {
            JOptionPane.showMessageDialog(Email, "FullName Field is Required!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }   else if (userName.getText().equals("")) {
            JOptionPane.showMessageDialog(Email, "Username Field is Required !!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (textArea.getText().equals("")) {
            JOptionPane.showMessageDialog(Email, "Password Field is Required !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if (date.getSelectedItem().equals("Date :") || month.getSelectedItem().equals("Month :") || year.getSelectedItem().equals("Year :")) {
            JOptionPane.showMessageDialog(Email, "Date of birth must be complete!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else if (edu.getSelectedItem().equals("Last Education :")) {
            JOptionPane.showMessageDialog(Email, "Choose your last Education History !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }  
        else if (address.getText().equals("")) {
            JOptionPane.showMessageDialog(Email, "Address Field is Required !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(Email, "Email is Required !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if (phone.getText().equals("")) {
            JOptionPane.showMessageDialog(Email, "Phone Number is Required !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
            else {
        }
        
        boolean status = emailVal(Email.getText());
        if (status){
           label_true.setText("True");
             
        }
        else{
            label_true.setText("Invalid");
            JOptionPane.showMessageDialog(Email, "Email Input is Invalid!", "Warning!", JOptionPane.ERROR_MESSAGE); 
        }
        if(fname.getText().equals("") && userName.getText().equals("") && textArea.getText().equals("")
                && address.getText().equals("")  && Email.getText().equals("")&& phone.getText().equals("")
                && date.getSelectedItem().equals("Date :") && month.getSelectedItem().equals("Month :") 
                && year.getSelectedItem().equals("Year :") && edu.getSelectedItem().equals("Last Education :")) {
         
            JOptionPane.showMessageDialog(Email, "Please Check Your Form again perhaps miss a field", "Warning!", JOptionPane.ERROR_MESSAGE); } 
        

      
        else if (fname.getText()!="" && userName.getText()!="" && textArea.getText()!=""
                && address.getText()!="" && phone.getText()!=""
                && date.getSelectedItem()!="Date :" && month.getSelectedItem()!="Month :"
                && year.getSelectedItem()!="Year :" && edu.getSelectedItem()!="Last Education :") {
            submitDatatoDatabase();
            clearField();
            
        }
        
        
         
      

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Thank you for your attention", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void clearField() {
        fname.setText(null);
        userName.setText(null);
        date.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
        edu.setSelectedIndex(0);
        address.setText(null);
        jSpinner1.setValue(0);
        textArea.setText(null);
        Email.setText(null);
        phone.setText(null);
        checklist.setSelected(false);
        checklist2.setSelected(false);
        label_true.setText("");
    }

    public void submitDatatoDatabase() {
        try {
            connection = Config.configDB();
            String url = "insert into account"
                    + "(Name, User_Name, Password, DATE_OF_BIRTH, Education, Address, PHONE_NUM, Email) "
                    + "values(?,?,?,?,?,?,?,?)";

            PreparedStatement ps = connection.prepareStatement(url);
            ps.setString(1, fname.getText());
            ps.setString(2, userName.getText());
            ps.setString(3, textArea.getText());
            ps.setString(4, date.getSelectedItem() + " " + month.getSelectedItem() + " " + year.getSelectedItem());
            ps.setString(5, (String) edu.getSelectedItem());
            ps.setString(6, address.getText());
            ps.setString(7, phone.getText());
            ps.setString(8, Email.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Saved Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    

    public void FilterHuruf(KeyEvent a) {
        if (Character.isDigit(a.getKeyChar())) {
            a.consume();
            //Pesan Dialog Boleh Di Hapus Ini Hanya Sebagai Contoh
            
            JOptionPane.showMessageDialog(null, "Enter Only Letters!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    //Method Untuk Menyaring Angka
    public void FilterAngka(KeyEvent b) {
        if (Character.isAlphabetic(b.getKeyChar())) {
            b.consume();
            //Pesan Dialog Boleh Di Hapus Ini Hanya Sebagai Contoh
            JOptionPane.showMessageDialog(null, "Enter Only Numbers!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    //Method Untuk Membatasi Jumlah Karakter
    public void JumlahKarakter(KeyEvent e) {
        if (fname.getText().length() == 30) {
            e.consume();
            //Pesan Dialog Boleh Di Hapus Ini Hanya Sebagai Contoh
            JOptionPane.showMessageDialog(null, "Maximum letters allowed Only 30 characters!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
      public static boolean emailVal(String email) {
         boolean status = false;
        String email_pattern = "^[_a-zA-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern pattern = Pattern.compile(email_pattern);
        Matcher matcher = pattern.matcher(email);
        
        if(matcher.matches()){
            status = true;
        }else{
            status = false;
     
        }
        return status;
    }



    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (int i = 1996; i <= 2035; i++) {
            year.addItem(Integer.toString(i));
        }
    }//GEN-LAST:event_formWindowOpened

    private void checklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checklistActionPerformed
        // TODO add your handling code here:
        checklist.setSelected(true);
    }//GEN-LAST:event_checklistActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        TermOfUse privacy = new TermOfUse();
        privacy.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void checklist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checklist2ActionPerformed
        // TODO add your handling code here:
        checklist2.setSelected(true);
    }//GEN-LAST:event_checklist2ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyTyped
        // TODO add your handling code here:
        JumlahKarakter(evt);
        FilterHuruf(evt);
    }//GEN-LAST:event_fnameKeyTyped

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);


    }//GEN-LAST:event_phoneKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        loginForm form3 = new loginForm();
        form3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_EmailKeyTyped

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checklist;
    private javax.swing.JCheckBox checklist2;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JComboBox<String> edu;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel label_true;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField textArea;
    private javax.swing.JTextField userName;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
