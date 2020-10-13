/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteriaorder;

import javax.swing.*;
 import java.awt.*;

 /**
 The DrinkPanel class allows the user to select drink.
 */

 public class DrinkPanel extends JPanel
 {
 // The following constants are used to indicate
 // the cost of drinks.
 public final double WATER = 0.0;
 public final double BOTTLEDWATER = 1.25;
 public final double SODA = 1.5;
 public final double REGULAR_COFFEE = 1.25;
 public final double DECAF_COFFEE = 1.25;
 public final double CAPPUCCINO = 2.3;

 private JRadioButton plainWater; // To select water
 private JRadioButton soda; // soda
 private JRadioButton bottledWater; // To select bottled water
 private JRadioButton regularCoffee; // To select regular coffee
 private JRadioButton decafCoffee; // To select decaf
 private JRadioButton cappuccino; // To select cappuccino
 private ButtonGroup bg; // Radio button group
 
 private String order = "";

 /**
 Constructor
* */

 public DrinkPanel()
 {
 // Create a GridLayout manager with
 // four rows and one column.
 setLayout(new GridLayout(6,1 ));

     // Create the radio buttons.
     plainWater = new JRadioButton("Water", true);
     bottledWater = new JRadioButton("Bottled water");
     soda = new JRadioButton("Soda");
     regularCoffee = new JRadioButton("Regular coffee");
     decafCoffee = new JRadioButton("Decaf coffee");
     cappuccino = new JRadioButton("Cappuccino");

     // Group the radio buttons.
     bg = new ButtonGroup();
     bg.add(plainWater);
     bg.add(bottledWater);
     bg.add(soda);
     bg.add(regularCoffee);
     bg.add(decafCoffee);
     bg.add(cappuccino);

     // Add a border around the panel.
     setBorder(BorderFactory.createTitledBorder("Drinks"));

     // Add the radio buttons to the panel.
     add(plainWater);
     add(bottledWater);
     add(soda);
     add(regularCoffee);
     add(decafCoffee);
     add(cappuccino);
 }

 /**
 getCoffeeCost method
 @return The cost of the selected drink.
 */

     public double getDrinkCost()
     {
         double drinkCost = 0.0;

         if (plainWater.isSelected())
         {
            drinkCost = WATER;
         }
         else if (bottledWater.isSelected())
         {
            drinkCost = BOTTLEDWATER;
            order +="Bottled Water";
         }
         else if (soda.isSelected())
         {
            drinkCost = SODA;
            order +="Soda";
         }
         else if (regularCoffee.isSelected())
         {
            drinkCost = REGULAR_COFFEE;
            order +="Regular coffee";
         }
         else if (decafCoffee.isSelected())
         {
            drinkCost = DECAF_COFFEE;
            order +="Decaf";
         }
         else if (cappuccino.isSelected())
         {
            drinkCost = CAPPUCCINO;
            order +="Cappuccino";
         }

         return drinkCost;
     }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
     
 
 }
