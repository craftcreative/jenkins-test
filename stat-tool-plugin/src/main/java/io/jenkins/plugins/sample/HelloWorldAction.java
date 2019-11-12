package io.jenkins.plugins.sample;

import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.RunAction2;

public class HelloWorldAction implements RunAction2 {
	private String name;
	private transient Run run;

//	Constructor
	public HelloWorldAction(String name) {
		this.name = name;
	}

//	Get name attribute ----> Important for Jelly file 
	public String getName() {
		return name;
	}

// For the icon
	@Override
	public String getIconFileName() {
		// TODO Auto-generated method stub
		return "document.png";
	}

//	For the label in side panel
	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return "Greeting";
	}

// URL fragment for action
	@Override
	public String getUrlName() {
		// TODO Auto-generated method stub
		return "greeting";
	}
//	============== RUN with side bar ==============
//
	@Override
	public void onAttached(Run<?, ?> r) {
		// TODO Auto-generated method stub
		this.run = r;

	}
//
	@Override
	public void onLoad(Run<?, ?> r) {
		// TODO Auto-generated method stub
		this.run = r;

	}
//	Return the Run ---> Important for Jelly file
	public Run getRun() {
		return this.run;
	}
	
	
	
	
	
	
	
	
	
	

}
