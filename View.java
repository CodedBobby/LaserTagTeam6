/*
Name: Team 6
Project: Laser Tag
Date: 09/30/2022
*/
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel
{
	JButton button1;
	Model model;

	View(Controller c, Model m)
	{
		button1 = new JButton("Test Button");
		button1.addActionListener(c);
		this.add(button1);
		c.setView(this);
		model = m;
	}
	
	void removeButton()
	{
		this.remove(button1);
		this.repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(10, 10, 10));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}
