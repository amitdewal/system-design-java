/**
 * 
 */
package com.system.ad.design.pattern.structural.facade;

/**
 * Provide a unified interface to a set of interfaces in a subsystem. Facade
 * defines a higher-level interface that makes the subsystem easier to use.
 * Facade is a structural design pattern that provides a simplified interface to
 * a complex subsystem.
 */
public class HomeTheaterFacade {

	private DVDPlayer dvdPlayer;
	private Projector projector;
	private Lights lights;
	private SoundSystem soundSystem;

	/**
	 * @param dvdPlayer
	 * @param projector
	 * @param lights
	 * @param soundSystem
	 */
	public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Lights lights, SoundSystem soundSystem) {
		super();
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.lights = lights;
		this.soundSystem = soundSystem;
	}

	public void watchMovies() {
		System.out.println(".........................Get Ready to watch movie..........................");
		lights.dim(30);
		projector.turnOn();
		soundSystem.turnOn();
		soundSystem.setVolume(50);
		dvdPlayer.play();
		System.out.println();
	}

	public void endMovie() {
		System.out.println(".........................Shuttig down movies.........................");
		dvdPlayer.stop();
		soundSystem.setVolume(0);
		projector.turnOff();
		lights.turnOn();

	}
}
