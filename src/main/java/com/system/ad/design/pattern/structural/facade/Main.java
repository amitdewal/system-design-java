/**
 * 
 */
package com.system.ad.design.pattern.structural.facade;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		// create subsystem objects
		DVDPlayer dvdPlayer = new DVDPlayer();
		Projector projector = new Projector();
		Lights lights = new Lights();
		SoundSystem soundSystem = new SoundSystem();

		// pass them to facade

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, lights, soundSystem);
		homeTheater.watchMovies();
		homeTheater.endMovie();

	}

}
