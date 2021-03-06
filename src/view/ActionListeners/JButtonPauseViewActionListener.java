package view.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JAlphaNotationGUI;

public class JButtonPauseViewActionListener implements ActionListener {

	
	private JAlphaNotationGUI gui;
	public JButtonPauseViewActionListener(JAlphaNotationGUI gui) {
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gui.setEnableButtonStepInto(true);
		gui.setEnableButtonCompile(true);
		gui.setEnableButtonPlay(true);		
	}
}
