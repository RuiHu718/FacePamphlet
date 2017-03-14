/*
 * File: FacePamphlet.java
 * -----------------------
 * This is the starter file for Assignment #5, in which you get to
 * implement FacePamphlet -- a simplified version of Facebook.
 * need to commit
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
        initEastPanel();
    }


    /* Adds interactors on the west panel*/
    private void initWestPanel() {
        add(name, WEST);
        add(new JLabel("Friends:"), WEST);
        add(friends, WEST);
        add(new JButton("Visit"), WEST);
        add(new JLabel("Send A friend request: "), WEST);
        add(friendRequest, WEST);
        friendRequest.addActionListener(this);
        add(new JButton("Request"), WEST);
        add(new JLabel("Pending friend request: "), WEST);
        add(pendingFriends, WEST);
        add(new JButton("Accept"), WEST);
        add(new JButton("Reject"), WEST);
        add(new JLabel("Status: "), WEST);
        add(status, WEST);
        status.addActionListener(this);
        add(new JButton("Change Status"), WEST);
        add(new JLabel("Image: "), WEST);
        add(image, WEST);
        image.addActionListener(this);
        add(new JButton("Change Image"), WEST);
        addActionListeners();
    }


    private void initEastPanel() {
        wallName = new JLabel("Eric's Wall", JLabel.CENTER);
        add(wallName, EAST);
        add(wall, EAST);
        wall.setEditable(false);
        add(new JLabel("Message Area"), EAST);
        add(messageArea, EAST);
        add(new JButton("Send"), EAST);
    }
    
    /* Instance variables */
    private FPRepository repository;
    private JButton name = new JButton("Eric Roberts");
    private FPScrollableList friends = new FPScrollableList();
    private JTextField friendRequest = new JTextField();
    private FPScrollableList pendingFriends = new FPScrollableList();    
    private JTextField status = new JTextField();
    private JTextField image = new JTextField();
    private FPScrollableTextArea wall = new FPScrollableTextArea();
    private FPScrollableTextArea messageArea = new FPScrollableTextArea();
    private JLabel wallName;
    
}
