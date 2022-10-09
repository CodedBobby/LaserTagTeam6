/*
Name: Team 6
Project: Laser Tag
Date: 09/30/2022
*/
package com.mycompany.app;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.KeyEvent;

class Controller implements ActionListener, MouseListener, KeyListener
{
	View view;
	Model model;
	
	
	Controller(Model m, View v){
		model = m;
		view = v;
		//System.out.println("constructor");
		view.btnConfirmID.addActionListener(e ->
		{
		    // your code here
			System.out.println("database player ID query");
			view.btnFinishUsername.setEnabled(true);
		});
		view.btnFinishUsername.addActionListener(e ->
		{
		    // your code here
			System.out.println("database add new usernames and IDs");
			view.btnStartGame.setEnabled(true);
		});
		view.btnStartGame.addActionListener(e ->
		{
		    // your code here
			System.out.println("game start");
			//view.frmLasertag.dispose();
			//System.exit(0);
		});
	}
	
	void setView(View v){
		view = v;
	}

	public void actionPerformed(ActionEvent e){
		
	}
	
	public void mousePressed(MouseEvent e){
	}
	
	public void mouseReleased(MouseEvent e) {  
		
	}
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {    }
	public void mouseClicked(MouseEvent e) {   }
	
	
	
	public void keyPressed(KeyEvent e){
	}

	public void keyReleased(KeyEvent e){
		
	}

	public void keyTyped(KeyEvent e){}

	void update(){}
	
}
