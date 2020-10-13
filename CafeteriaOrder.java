/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteriaorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Halseys
 */
public class CafeteriaOrder extends JFrame{

 private EntreePanel entrees; // Entree panel
 private SidesPanel sides; // Sides panel
 private DrinkPanel drink; // Drink panel
 private GreetingPanel banner; // To display a greeting
 private JPanel buttonPanel; // To hold the buttons
 private JButton calcButton; // To calculate the cost
 private JButton exitButton; // To exit the application
 private final double TAX_RATE = .085; // Sales tax rate

 /**
 Constructor
 */

 public CafeteriaOrder()
 {
     // Display a title.
     setTitle("Order Calculator");

     // Specify an action for the close button.
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     // Create a BorderLayout manager.
     setLayout(new BorderLayout());
     // Create the custom panels.
     banner = new GreetingPanel();
     entrees = new EntreePanel();
     sides = new SidesPanel();
     drink = new DrinkPanel();

     // Create the button panel.
     buildButtonPanel();

     // Add the components to the content pane.
     add(banner, BorderLayout.NORTH);
     add(entrees, BorderLayout.WEST);
     add(sides, BorderLayout.CENTER);
     add(drink, BorderLayout.EAST);
     add(buttonPanel, BorderLayout.SOUTH);

     // Pack the contents of the window and display it.
     pack();
     setLocation(400, 200);
     setVisible(true);
 }

 /**
 The buildButtonPanel method builds the button panel.
 */

 private void buildButtonPanel()
 {
     // Create a panel for the buttons.
     buttonPanel = new JPanel();

     // Create the buttons.
     calcButton = new JButton("Calculate");
     exitButton = new JButton("Exit");

     // Register the action listeners.
     calcButton.addActionListener(new CalcButtonListener());
     exitButton.addActionListener(new ExitButtonListener());

     // Add the buttons to the button panel.
     buttonPanel.add(calcButton);
     buttonPanel.add(exitButton);
 }

 /**
 Private inner class that handles the event when
 the user clicks the Calculate button.
* */

 private class CalcButtonListener implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
     // Variables to hold the subtotal, tax, and total
     double subtotal, tax, total;
     String recap = "";

     // Calculate the subtotal.
     subtotal = entrees.getEntreeCost() +
     sides.getSidesCost() +
     drink.getDrinkCost();

     // Calculate the sales tax.
     tax = subtotal * TAX_RATE;

     // Calculate the total.
     total = subtotal + tax;
//     System.out.println(subtotal);
//     System.out.println(tax);
//     System.out.println(total);
     
     //Form the order string recap
     recap += entrees.getOrder();
     recap += sides.getSides();
     recap += drink.getOrder();
     
     // Display.
     JOptionPane.showMessageDialog(null, recap+"\n"+
     String.format("Subtotal: $%5.2f\n" +
     "Tax: $%5.2f\n" +
     "Total: $%5.2f",
     subtotal, tax, total));
     }
 }

 /**
 Private inner class that handles the event when
 the user clicks the Exit button.
 */

 private class ExitButtonListener implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        System.exit(1);
     }
 }

 /**
 main method
 */

    public static void main(String[] args)
    {
        new CafeteriaOrder();
    }
 }