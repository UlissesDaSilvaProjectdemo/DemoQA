package com.bdddemoqa.utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitessetup {
	
	
	public void desiredCapabilitySetup() {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("ignoreProtectedModeSettings",false);
	cap.setCapability("ignoreZoomSettings",false); 
	cap.setCapability("enablePersistentHover",false);
	cap.setCapability("enableElementCacheCleanup",false);
	cap.setCapability("requireWindowFocus",false);
	cap.setCapability("browserAttachTimeout",true);
	cap.setCapability("ie.forceCreateProcessApi",false);	 
	cap.setCapability("ie.ensureCleanSessions",false);
	cap.setCapability("logFile",false);
	cap.setCapability("logLevel",false);
	cap.setCapability("host",false);
	cap.setCapability("extractPath",false); 
	cap.setCapability("silent",false);
	cap.setCapability("ie.setProxyByServer",false); 
	}

}
