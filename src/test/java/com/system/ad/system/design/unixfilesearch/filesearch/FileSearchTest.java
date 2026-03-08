/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch;

import java.util.List;
import com.system.ad.system.design.unixfilesearch.filesearch.clause.AndPredicate;
import com.system.ad.system.design.unixfilesearch.filesearch.clause.SimplePredicate;
import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.File;
import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.FileAttribute;
import com.system.ad.system.design.unixfilesearch.filesearch.operator.EqualsOperator;
import com.system.ad.system.design.unixfilesearch.filesearch.operator.RegexMatchOperator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * 
 */
public class FileSearchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}

	@Test
	public void testFileSearch() {

//		 create root dir and two files with different owners

		final File root = new File(true, 0, "adam", "root");
		final File a = new File(false, 2000, "adam", "a");
		final File b = new File(false, 3000, "george", "b");

//		add files to the root dir
		root.addEntry(a);
		root.addEntry(b);

//		search criteria: find non-directory files owned by users matching "ge.*";
		
		FileSearchCriteria fileSearchCriteria = new FileSearchCriteria(
				new AndPredicate(
						List.of(
								new SimplePredicate<>(FileAttribute.IS_DIRECTORY, new EqualsOperator<>(), false),
								new SimplePredicate<>(FileAttribute.OWNER, new RegexMatchOperator<String>(), "ge.*")
								)
						)
				);
		
//		execute the search and get the results;
		FileSearch fileSearch = new FileSearch();
		List<File> result = fileSearch.search(root, fileSearchCriteria);
	     
		
	
		
//		verify that only on file matches the criteria
		
		 assertEquals(1,result.size());
//		 assertEquals("b",result.get(0).getFileName());
		 
		
	
	}

}
