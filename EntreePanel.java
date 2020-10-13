/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteriaorder;

import javax.swing.*;
 import java.awt.*;

 /**
 The EntreePanel class allows the user to select either
 a chicken or whole beef Entree.
 */

 public class EntreePanel extends JPanel
 {
     // The following constants are used to indicate
     // the cost of each type of Entree.
     public final double Chicken_Entree = 3.25;
     public final double Beef_Entree = 3.5;
     public final double Vegetarian_Entree = 3.0;

     private JRadioButton chickenEntree; // To select chicken
     private JRadioButton beefEntree; // To select beef
     private JRadioButton vegetarianEntree; // To select vegetarian
     private ButtonGroup bg; // Radio button group
     
     private String order = "";

 /**
 Constructor
 */

     public EntreePanel()
     {
         // Create a GridLayout manager with
         // two rows and one column.
         setLayout(new GridLayout(3,1 ));

         // Create the radio buttons.
         chickenEntree = new JRadioButton("Chicken", true);
         beefEntree = new JRadioButton("Beef");
         vegetarianEntree = new JRadioButton("Vegetarian");

         // Group the radio buttons.
         bg = new ButtonGroup();
         bg.add(chickenEntree);
         bg.add(beefEntree);
         bg.add(vegetarianEntree);

         // Add a border around the panel.
         setBorder(BorderFactory.createTitledBorder("Entree"));

         // Add the radio buttons to the panel.
         add(chickenEntree);
         add(beefEntree);
         add(vegetarianEntree);
     }

 /**
 getEntreeCost method
 @return The cost of the selected Entree.
 */

     public double getEntreeCost()
     {
         double EntreeCost = 0.0;

         if (chickenEntree.isSelected())
         {
            EntreeCost = Chicken_Entree;
            order += "Chicken\n";
         }
         else if(beefEntree.isSelected())
         {
            EntreeCost = Beef_Entree;
            order += "Beef\n";
         }
         else
         {
            EntreeCost = Vegetarian_Entree;
            order += "Vegetarian\n";
         }

         return EntreeCost;
     }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
     
     
 }
