/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteriaorder;

import javax.swing.*;
 import java.awt.*;

 /**
 The SidesPanel class allows the user to select
 the toppings for the Entree.
 */

 public class SidesPanel extends JPanel
 {
     // The following constants are used to indicate
     // the cost of toppings.
     public final double ColeSlow = 1.00;
     public final double CornBread = .75;
     public final double CandiedYams = 1.00;
     public final double CarrotsAndPeas = 1.00;
     public final double FrenchFries = 1.50;
     public final double BreadRoll = 1.50;

     private JCheckBox coleSlow; // To select cream cheese
     private JCheckBox cornBread; // To select CornBread
     private JCheckBox candiedYams; // To select CandiedYams
     private JCheckBox carrotsAndPeas; // To select CarrotsAndPeas
     private JCheckBox frenchFries; // To select FrenchFries
     private JCheckBox breadRoll; // To select BreadRoll
     
     private String sides = "";
    /**
     Constructor
     */

     public SidesPanel()
     {
         // Create a GridLayout manager with
         // four rows and one column.
         setLayout(new GridLayout(6,1 ));

         // Create the check boxes.
         coleSlow = new JCheckBox("Cole slow");
         cornBread = new JCheckBox("Corn Bread");
         candiedYams = new JCheckBox("Candied yams");
         carrotsAndPeas = new JCheckBox("Carrots and peas");
         frenchFries = new JCheckBox("French fries");
         breadRoll = new JCheckBox("Bread roll");

         // Add a border around the panel.
         setBorder(BorderFactory.createTitledBorder("Toppings"));

         // Add the check boxes to the panel.
         add(coleSlow);
         add(cornBread);
         add(candiedYams);
         add(carrotsAndPeas);
         add(frenchFries);
         add(breadRoll);
     }

     /**
     getSidesCost method
     @return The cost of the selected toppings.
     */

     public double getSidesCost()
     {
         double sidesCost = 0.0;

         if (coleSlow.isSelected())
         {
            sidesCost += ColeSlow;
            sides += "Cole slow\n";
         }
         if (cornBread.isSelected())
         {
            sidesCost += CornBread;
            sides += "Corn Bread\n";
         }
         if (candiedYams.isSelected())
         {
            sidesCost += CandiedYams;
            sides += "Candied yams\n";
         }
         if (carrotsAndPeas.isSelected())
         {
            sidesCost += CarrotsAndPeas;
            sides += "Carrots and peas\n";
         }
         if (frenchFries.isSelected())
         {
            sidesCost += FrenchFries;
            sides += "French fries\n";
         }
         if (breadRoll.isSelected())
         {
            sidesCost += BreadRoll;
            sides += "Bread Roll\n";
         }

         return sidesCost;
     }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }
     
 }