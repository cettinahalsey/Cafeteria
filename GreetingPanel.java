/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteriaorder;


import javax.swing.*;

/**
The GreetingPanel class displays a greeting in a panel.
*/

public class GreetingPanel extends JPanel
{
private JLabel greeting; // To display a greeting

/**
Constructor
*/

    public GreetingPanel()
    {
        // Create the label.
        greeting = new JLabel("Welcome to STES Cafeteria");

        // Add the label to this panel.
        add(greeting);
    }
}