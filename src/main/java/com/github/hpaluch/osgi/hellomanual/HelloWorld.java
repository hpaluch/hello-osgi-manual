package com.github.hpaluch.osgi.hellomanual;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorld implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		System.out.println("Hello started: " + context.getBundle().getLocation());
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Hello stopped: " + context.getBundle().getLocation());		
	}
		
}
