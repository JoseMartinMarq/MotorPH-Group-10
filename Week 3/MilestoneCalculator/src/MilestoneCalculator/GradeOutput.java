package MilestoneCalculator;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


public class GradeOutput extends JFrame {
     // Declare private variables for the Swing components
     private JLabel lblStudentName, lblStudentNo, lblMs1, lblMs2, lblTa, lblFinalGrade;
     private JTextField txtStudentName, txtStudentNo, txtMs1, txtMs2, txtTa, txtFinalGrade;
     private JButton closeButton;


     public GradeOutput(Student stud) {
         // Set up the frame
         super("Grade Output");
         setSize(490, 250);


         // Compute Average
         stud.computeGrade();


         // Create the components
         // Create labels
         lblStudentName = new JLabel("Student Name:");
         lblStudentNo = new JLabel("Student No:");
         lblMs1 = new JLabel("Milestone 1:");
         lblMs2 = new JLabel("Milestone 2:");
         lblTa = new JLabel("Terminal Assessment:");
         lblFinalGrade = new JLabel("Final Grade:");
       
         // Create Student Name textfield
         txtStudentName = new JTextField(20);
         txtStudentName.setEnabled(false);
         txtStudentName.setText(stud.getStudentName());
       
         // Create Student Number textfield
         txtStudentNo = new JTextField(20);
         txtStudentNo.setEnabled(false);
         txtStudentNo.setText(stud.getStudentNumber());
       
         // Create Quiz 1 textfield
         txtMs1 = new JTextField(10);
         txtMs1.setEnabled(false);
         txtMs1.setText(stud.getMs1());
       
         // Create Quiz 2 textfield
         txtMs2 = new JTextField(10);
         txtMs2.setEnabled(false);
         txtMs2.setText(stud.getMs2());
        
         // Create Quiz 3 textfield
         txtTa = new JTextField(10);
         txtTa.setEnabled(false);
         txtTa.setText(stud.getTa());
       
         // Create Average Grade textfield
         txtFinalGrade = new JTextField(10);
         txtFinalGrade.setEnabled(false);
         txtFinalGrade.setText(stud.getFinalGrade() + "%");
       
         // Create Close button
         closeButton = new JButton("Close");
       
         // Define the panel to hold the components  
         JPanel panel = new JPanel();
         SpringLayout layout = new SpringLayout();
         panel.setSize(300, 300);
         panel.setLayout(layout);
       
         // Add the components to the frame
         panel.add(lblStudentName);
         panel.add(txtStudentName);
         panel.add(lblStudentNo);
         panel.add(txtStudentNo);
         panel.add(lblMs1);
         panel.add(txtMs1);
         panel.add(lblMs2);
         panel.add(txtMs2);
         panel.add(lblTa);
         panel.add(txtTa);
         panel.add(lblFinalGrade);
         panel.add(txtFinalGrade);
         panel.add(closeButton);
  
         // Put constraint on components
         // Set label position: left
         layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblMs1, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblMs2, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblTa, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblFinalGrade, 6, SpringLayout.WEST, panel);
       
         // Set label and textfield position: top and bottom
         layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
         layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
         layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 10, SpringLayout.SOUTH, lblStudentName);
         layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
         layout.putConstraint(SpringLayout.NORTH, lblMs1, 10, SpringLayout.SOUTH, lblStudentNo);
         layout.putConstraint(SpringLayout.NORTH, txtMs1, 6, SpringLayout.SOUTH, txtStudentNo);
         layout.putConstraint(SpringLayout.NORTH, lblMs2, 10, SpringLayout.SOUTH, lblMs1);
         layout.putConstraint(SpringLayout.NORTH, txtMs2, 6, SpringLayout.SOUTH, txtMs1);
         layout.putConstraint(SpringLayout.NORTH, lblTa, 10, SpringLayout.SOUTH, lblMs2);
         layout.putConstraint(SpringLayout.NORTH, txtTa, 6, SpringLayout.SOUTH, txtMs2);
         layout.putConstraint(SpringLayout.NORTH, lblFinalGrade, 10, SpringLayout.SOUTH, lblTa);
         layout.putConstraint(SpringLayout.NORTH, txtFinalGrade, 6, SpringLayout.SOUTH, txtTa);
       
         // Set textfield position: right
         layout.putConstraint(SpringLayout.WEST, txtStudentName, 104, SpringLayout.EAST, lblStudentName);
         layout.putConstraint(SpringLayout.WEST, txtStudentNo, 122, SpringLayout.EAST, lblStudentNo);
         layout.putConstraint(SpringLayout.WEST, txtMs1, 119, SpringLayout.EAST, lblMs1);
         layout.putConstraint(SpringLayout.WEST, txtMs2, 119, SpringLayout.EAST, lblMs2);
         layout.putConstraint(SpringLayout.WEST, txtTa, 59, SpringLayout.EAST, lblTa);
         layout.putConstraint(SpringLayout.WEST, txtFinalGrade, 121, SpringLayout.EAST, lblFinalGrade);
       
         // Set button position
         layout.putConstraint(SpringLayout.NORTH, closeButton, 6, SpringLayout.SOUTH, txtFinalGrade);
         layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


         //Add panel to frame
         add(panel);


         // Add an ActionListener to the button
         closeButton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  dispose();
             }
         });
     }
}
