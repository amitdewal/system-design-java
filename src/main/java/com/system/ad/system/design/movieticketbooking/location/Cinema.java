/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.location;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Cinema {
	private String name;
	private String location;
	private List<Room> rooms;

	/**
	 * @param name
	 * @param location
	 */
	public Cinema(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		this.rooms = new ArrayList<>();
	}

	public void addRooms(Room room) {
		rooms.add(room);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}
