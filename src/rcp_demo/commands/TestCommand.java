package rcp_demo.commands;

import com.teamcenter.rac.aif.AbstractAIFApplication;
import com.teamcenter.rac.util.MessageBox;

import rcp_demo.KCommand;

public class TestCommand extends KCommand {

	public TestCommand(AbstractAIFApplication app, String commandId, String actionInfo) {
		super(app, commandId, actionInfo);
	}

	@Override
	public void executeModal() throws Exception {
		MessageBox.post("Hello, World","",MessageBox.INFORMATION);
	}

	
}
