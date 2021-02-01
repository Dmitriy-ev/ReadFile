package ru.aplana.ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		
		String path = "text.txt";
		
		WordSearch search = new WordSearch();
		
		List<String> list = new ArrayList<>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			list = search.returnList(reader);
			search.forList(list);
			System.out.println("\n");
			
			search.searchWord(list);
			
			search.maxWord(list);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		
		} catch (UnsupportedOperationException e) {

			e.printStackTrace();
		
		} catch (NullPointerException e) {
			
			e.printStackTrace();
		
		}catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}catch (Exception e) {

			e.printStackTrace();
			
		}
	}
}
