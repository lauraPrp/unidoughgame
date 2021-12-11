package com.unicorn.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.unicorn.game.MyUnicornGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Cute Uni";
		config.width=800;
		config.height=480;
		new LwjglApplication(new MyUnicornGame(), config);
	}
}
