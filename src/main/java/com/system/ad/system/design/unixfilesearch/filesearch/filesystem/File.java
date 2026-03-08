/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.filesystem;

import java.util.HashSet;
import java.util.Set;

/**
 * this file class represents file or directory in the file system this contains
 * basic file attributes and supports hierarchical structure
 */
public class File {

	private boolean isDirectory;
	private int size;
	private String owner;
	private String filename;
	// set of directory entries (files and subdirectories)
	private Set<File> entries = new HashSet<>();

	public boolean isDirectory() {
		return isDirectory;
	}

	public int getSize() {
		return size;
	}

	public String getOwner() {
		return owner;
	}

	public String getFilename() {
		return filename;
	}

	public Set<File> getEntries() {
		return entries;
	}

	/**
	 * @param isDirectory
	 * @param size
	 * @param owner
	 * @param filename
	 */
	public File(boolean isDirectory, int size, String owner, String filename) {
		super();
		this.isDirectory = isDirectory;
		this.size = size;
		this.owner = owner;
		this.filename = filename;
	}

	// extract the values of a specified file attributes
	public Object extract(final FileAttribute attributeName) {

		switch (attributeName) {

		case SIZE -> {
			return size;
		}

		case OWNER -> {
			return owner;
		}

		case IS_DIRECTORY -> {
			return isDirectory;
		}

		case FILENAME -> {
			return filename;
		}

		}

		throw new IllegalArgumentException("Invalid filter criteria type");
	}

	// add a file or dir entry to this directory

	public void addEntry(final File entry) {
		entries.add(entry);

	}

	@Override
	public String toString() {
		return "File [isDirectory=" + isDirectory + ", size=" + size + ", owner=" + owner + ", filename=" + filename
				+ ", entries=" + entries + "]";
	}

}
