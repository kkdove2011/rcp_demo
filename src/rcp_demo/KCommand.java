package rcp_demo;


import com.teamcenter.rac.aif.AbstractAIFApplication;
import com.teamcenter.rac.aif.AbstractAIFCommand;

public abstract class KCommand extends AbstractAIFCommand{

	protected AbstractAIFApplication app;
	protected String actionInfo;

	public KCommand(AbstractAIFApplication app,String commandId,String actionInfo) {
		this.app=app;
		this.actionInfo=actionInfo;
	}

}
