package ru.aplana.ReadFile;

public class ReadFile {

	public static void main(String[] args) {
		
		String path = "text.txt";
		WordSearch search = new WordSearch();
		search.forList(search.returnList(path));
		System.out.println("\n");
		search.searchWord(search.returnList(path));
		search.maxWord(search.returnList(path));
		}
	}

