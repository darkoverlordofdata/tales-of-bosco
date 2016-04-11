package com.darkoverlordofdata.talesofbosco.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.darkoverlordofdata.talesofbosco.Tob;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Tales of Bosco";
		config.width = 320;
		config.height = 480;
		new LwjglApplication(new Tob(), config);
	}
}
