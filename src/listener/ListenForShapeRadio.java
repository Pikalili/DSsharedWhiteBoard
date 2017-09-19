package listener;

import java.awt.event.*;

import clientGui.ClientManager;
import clientGui.CommandArea;

public class ListenForShapeRadio implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(CommandArea.rdoCircle.isSelected()) {
			ClientManager.type = ClientManager.CIRCLE;
		}
	}

}
