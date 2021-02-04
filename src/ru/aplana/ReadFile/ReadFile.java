package ru.aplana.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "text.txt";
		WordSearch search = new WordSearch();
		list = search.returnList(path);
		search.forList(list);
		System.out.println("\n");
		search.searchWord(list);
		search.maxWord(list);
	}
}

