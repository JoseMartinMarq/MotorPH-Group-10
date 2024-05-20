package MilestoneCalculator;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;

public class MilestoneCalculator extends JFrame {
     // Declare private variables for the Swing components
     private JLabel lblStudentName, lblStudentNo, lblMs1, lblMs2, lblTa;
     private JTextField txtStudentName, txtStudentNo, txtMs1, txtMs2, txtTa;
     private JButton calculateButton, clearButton;
 
     public MilestoneCalculator() {
         // Set up the frame
         super("Grade Calculator");
         setSize(490, 250);
 
         // Create the components
         // Create labels and textfields
         lblStudentName = new JLabel("Student Name:");
         txtStudentName = new JTextField(20);
         lblStudentNo = new JLabel("Student No:");
         txtStudentNo = new JTextField(20);
         lblMs1 = new JLabel("Milestone 1:");
         txtMs1 = new JTextField(10);
         lblMs2 = new JLabel("Milestone 2:");
         txtMs2 = new JTextField(10);
         lblTa = new JLabel("Terminal Assessment:");
         txtTa = new JTextField(10);
         calculateButton = new JButton("Calculate");
         clearButton = new JButton("Clear");
 
         // Define the panel to hold the components  
         JPanel panel = new JPanel();
         panel.setSize(300, 300);
         SpringLayout layout = new SpringLayout();
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
         panel.add(calculateButton);
         panel.add(clearButton);
 
         // Put constraint on components
         // Set label position: left or west
         layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblMs1, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblMs2, 6, SpringLayout.WEST, panel);
         layout.putConstraint(SpringLayout.WEST, lblTa, 6, SpringLayout.WEST, panel);
 
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
 
         // Set textfield position: right
         layout.putConstraint(SpringLayout.WEST, txtStudentName, 104, SpringLayout.EAST, lblStudentName);
         layout.putConstraint(SpringLayout.WEST, txtStudentNo, 122, SpringLayout.EAST, lblStudentNo);
         layout.putConstraint(SpringLayout.WEST, txtMs1, 119, SpringLayout.EAST, lblMs1);
         layout.putConstraint(SpringLayout.WEST, txtMs2, 119, SpringLayout.EAST, lblMs2);
         layout.putConstraint(SpringLayout.WEST, txtTa, 59, SpringLayout.EAST, lblTa);
 
         // Set button position for calculateButton
         layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, txtTa);
         layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);

         // Set button position for clearButton
         layout.putConstraint(SpringLayout.NORTH, clearButton, 6, SpringLayout.SOUTH, txtTa);
         layout.putConstraint(SpringLayout.WEST, clearButton, 6, SpringLayout.EAST, calculateButton);

 
         // Add panel to frame
         add(panel);
 
         // Add an ActionListener to the button
         calculateButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  
                  try {
                       Student stud = new Student();

                       // Get the values from the textfields for validation
                       float ms1 = Float.parseFloat(txtMs1.getText());
                       float ms2 = Float.parseFloat(txtMs2.getText());
                       float ta = Float.parseFloat(txtTa.getText());

                       // Valisate the input values
                       if (ms1 < 0 || ms1 > 25) {
                           txtMs1.setText("");
                           throw new IllegalArgumentException("EERROR: Milestone 1 score must be between 0 and 25 only.");
                       }

                       if (ms2 < 0 || ms2 > 40) {
                           txtMs2.setText("");
                           throw new IllegalArgumentException("ERROR: Milestone 2 score must be between 0 and 40 only.");
                       }

                       if (ta < 0 || ta > 40) {
                           txtTa.setText("");
                           throw new IllegalArgumentException("ERROR: Terminal Assessment score must be between 0 and 35 only.");
                       }

                       // Assign textfield values to stud object
                       stud.setStudentName(txtStudentName.getText());
                       stud.setStudentNumber(txtStudentNo.getText());
                       stud.setMs1(ms1);
                       stud.setMs2(ms2);
                       stud.setTa(ta);

                       // Instantiate and call GradeOutput class
                       GradeOutput output = new GradeOutput(stud);
                       output.setVisible(true);
                       
                  } catch (NumberFormatException ex) {
                       JOptionPane.showMessageDialog(panel, "Please enter valid scores for milestones and terminal assessment.", "Invalid input", JOptionPane.ERROR_MESSAGE);
                  } catch (IllegalArgumentException ex) {
                       JOptionPane.showMessageDialog(panel, ex.getMessage(), "Invalid input", JOptionPane.ERROR_MESSAGE);
                  } catch (Exception ex) {
                       JOptionPane.showMessageDialog(panel, "Something went wrong.", "Error", JOptionPane.ERROR_MESSAGE);
                  }
             }
         });
         
         clearButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  txtStudentName.setText("");
                  txtStudentNo.setText("");
                  txtMs1.setText("");
                  txtMs2.setText("");
                  txtTa.setText("");
             }
         });
     }
}
