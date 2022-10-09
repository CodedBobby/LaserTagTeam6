/*
Name: Team 6
Project: Laser Tag
Date: 09/30/2022
*/

package com.mycompany.app;

import javax.swing.JFrame;
import java.awt.Toolkit;

public class App extends JFrame
{
	Model model;
	View view;
	Controller controller;
	
	public App()
	{
		model = new Model();
		view = new View();
		controller = new Controller(model, view);
		view.show(view);
		view.addMouseListener(controller);
		view.addKeyListener(controller);
	}
	
	public void run()
	{
		while(true)
		{
			controller.update();
			model.update();
			//view.repaint();
			Toolkit.getDefaultToolkit().sync();
			try{
				Thread.sleep(1);
			} catch(Exception e){
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	public static void main(String[] args)
	{
		App g = new App();
		g.run();
	}
}
