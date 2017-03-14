/*
 * File: FacePamphlet.java
 * -----------------------
 * This is the starter file for Assignment #5, in which you get to
 * implement FacePamphlet -- a simplified version of Facebook.
 */

import acm.program.*;
import stanford.facepamphlet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FacePamphlet extends ConsoleProgram implements FPConstants {

    /* Initializes the application */

    public void init() {
        repository = new FPRepositoryStub("eroberts", "Eric Roberts");
        initWestPanel();
    }


    /* Adds interactors on the west panel*/
    private void initWestPanel() {
        add(name, WEST);
        add(new JLabel("Friends:"), WEST);
        add(new JButton("one"), WEST);
        add(new JButton("two"), WEST);        
    }

    /* Instance variables */
    private FPRepository repository;
    private JButton name = new JButton("Eric Roberts");

}
