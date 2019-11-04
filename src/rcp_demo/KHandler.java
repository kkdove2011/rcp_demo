package rcp_demo;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;

import com.teamcenter.rac.aif.AbstractAIFUIApplication;
import com.teamcenter.rac.aifrcp.AIFUtility;

public class KHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent arg0) {
		AbstractAIFUIApplication app = AIFUtility.getCurrentApplication();
		new Thread(new KAction(app,arg0.getCommand().getId())).start();
		return null;
	}

}
