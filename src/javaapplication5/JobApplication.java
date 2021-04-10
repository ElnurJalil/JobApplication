/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;



public class JobApplication extends JFrame {
    private static final int height = 400;
    private static final int base = 400;
    private JCheckBox java;
    private JCheckBox help;
    private JCheckBox cofee;
    private JRadioButton citizen;
    private JRadioButton criminal;
    private JComboBox salary ;
    private String[] salaryoption ={"$20,000-$59,000","$59,000-$100,000","Above $100,000"};
    private JButton submit;

    public JobApplication() {
        setTitle("Job Application");
        setSize(base,height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createcontents();
        
    }

    private void createcontents() {
        JPanel xpanel = new JPanel(new BorderLayout(0,10));
        xpanel.setBorder(new EmptyBorder(10,10,10,10));
        JPanel zpanel = new JPanel(new FlowLayout());
        JPanel ypanel = new JPanel(new GridLayout(11,1));
        JLabel flabel = new JLabel("Skills (check all that apply):");
        java = new JCheckBox("Java Sun certified");
        help = new JCheckBox("help-desk experience");
        cofee= new JCheckBox("able to make good coffee");
        JLabel slabel = new JLabel("Community standing");
        JLabel tlabel = new JLabel("Salary requierments:");
        ButtonGroup radiobutton = new ButtonGroup();
        citizen = new JRadioButton("law-abiding citizen");
        criminal = new JRadioButton("violent criminal");
        submit = new JButton("Submit");
        salary = new JComboBox(salaryoption);
        radiobutton.add(citizen);
        radiobutton.add(criminal);
        ypanel.add(flabel);
        ypanel.add(java);
        ypanel.add(help);
        ypanel.add(cofee);
        ypanel.add(new JLabel()); //filling
        ypanel.add(slabel);
        ypanel.add(citizen);
        ypanel.add(criminal);
        ypanel.add(new JLabel()); //filling
        ypanel.add(tlabel);
        ypanel.add(salary);
        zpanel.add(submit);
        xpanel.add(ypanel,BorderLayout.CENTER);
        xpanel.add(zpanel,BorderLayout.SOUTH);
        add(xpanel);
        submit.addActionListener(new Listener());
        
        
        
        
        
        
    }

    private class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(java.isSelected()||help.isSelected()||cofee.isSelected()
                    &&citizen.isSelected()&&!salary.getSelectedItem().equals("Above $100,000"))
                JOptionPane.showMessageDialog(null, "Thank you for your application submission.\n" +
          "We'll contact you after we process your information.");
            
          else
                JOptionPane.showMessageDialog(null, "Sorry, no jobs at this time.");
           
        }
        

        
    }
    
    
    
    
  
  
  


  
    } 

  







