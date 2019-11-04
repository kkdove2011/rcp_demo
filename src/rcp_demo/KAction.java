package rcp_demo;


import java.lang.reflect.Constructor;

import com.teamcenter.rac.aif.AbstractAIFApplication;
import com.teamcenter.rac.aif.AbstractAIFUIApplication;
import com.teamcenter.rac.aif.common.actions.AbstractAIFAction;
import com.teamcenter.rac.util.MessageBox;

public class KAction extends AbstractAIFAction {


	KAction(AbstractAIFUIApplication app, String string) {
		super(app,string);
	}

	@Override
	public void run() {
		try {
			String[] actionSplit=actionName.split("#");
			String action=actionName;
			String actionData="";
			if(actionSplit.length==2) {
				action=actionSplit[0];
				actionData=actionSplit[1];
			}
			//System.out.println("actionName:"+actionName);
			//System.out.println("action:"+action);
			Class<?> c = Class.forName(action);
			Constructor<?> constructor = c.getConstructor(AbstractAIFApplication.class, String.class,String.class);
			KCommand command = (KCommand) constructor.newInstance(this.application, action, actionData);
			command.executeModal();
		} catch (Exception e) {
			e.printStackTrace();
			MessageBox.post("出错了："+e.toString(),"提示",MessageBox.ERROR);
		} 
	}
}
