/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextArea;


public class License  extends JFrame{
     private static final int height = 550;
    private static final int base = 300;

    public License() {
        setTitle("Math Calculator");
        setSize(height,base);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createcontents();
        setVisible(true);
    }

    private void createcontents() {
        JTextArea license;
  JCheckBox confirmbox;
    
  setLayout(new BorderLayout());
  license = new JTextArea(
    "SOFTWARE END-USER LICENSE AGREEMENT\n\n" +
    "READ CAREFULLY: This Software End-User License Agreement" +
    " is a legal agreement between us, the software provider, and" +
    " you, the end user of a software product legitimately" +
    " purchased from us. You must accept this agreement to" +" complete the sale of the software license. If you do not" +
    " accept this agreement, you forfeit all rights to your" +
    " current and future property and progeny.");
    license.setEditable(false);
    license.setLineWrap(true);
    license.setWrapStyleWord(true);
    confirmbox = new JCheckBox("I accept the terms of this agreement.",true);
    
    add(license,BorderLayout.CENTER);
    add(confirmbox,BorderLayout.SOUTH);
   }
    
    
    
    
}
