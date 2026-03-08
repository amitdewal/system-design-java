/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.File;

/**
 * main class responsible for performing the file system searches
 */
//public class FileSearch {
//
////	perform recursive search through the file system starting from root;
////	return a lost of files that match the given criteria
//
//	public List<File> search(File root, FileSearchCriteria criteria) {
//
////		list to store matching files
//		List<File> result = new ArrayList<>();
//
////		stack to handle recursive traversal w/o actual recursion
//		final ArrayDeque<File> recursionStack = new ArrayDeque<>();
//
////		start with the root dir
//
//		recursionStack.add(root);
//
////		continue untill we have processed all files
//
//		while (!recursionStack.isEmpty()) {
////			get the next file to proceed
//			File next = recursionStack.pop();
////			check the file matches the criteria
//			if (criteria.isMatch(next)) {
//				result.add(next);
//
//			}
////			add all directory entries to the stack for processing
//			for (File entry : next.getEntries()) {
//				recursionStack.push(entry);
//			}
//
//		}
//
//		return result;
//
//	}
//
//}


//Main class responsible for performing file system searches
public class FileSearch {
 // Performs a recursive search through the file system starting from root
 // Returns a list of files that match the given criteria
 public List<File> search(final File root, final FileSearchCriteria criteria) {
     // List to store matching files
     final List<File> result = new ArrayList<>();
     // Stack to handle recursive traversal without actual recursion
     final ArrayDeque<File> recursionStack = new ArrayDeque<>();
     // Start with the root directory
     recursionStack.add(root);
     // Continue until we've processed all files
     while (!recursionStack.isEmpty()) {
         // Get the next file to process
         File next = recursionStack.pop();
         System.out.println("next: "+next);
         // Check if the file matches our criteria
         if (criteria.isMatch(next)) {
             result.add(next);
         }
         // Add all directory entries to the stack for processing
         for (File entry : next.getEntries()) {
             recursionStack.push(entry);
         }
         
     }
    
     return result;
 }
}
