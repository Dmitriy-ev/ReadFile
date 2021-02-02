package ru.aplana.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WordSearch {

	public void searchWord(List<String> list)throws ArrayIndexOutOfBoundsException { //статистика слов.
		
		List<String> newList = new ArrayList<>(list);
		
		int n = 0;
		for (int i = 0; i < newList.size(); i = 0) {
			String str = newList.get(i);
			Iterator<String> iter = newList.iterator();
			while(iter.hasNext()) {
				String str2 = iter.next();
				if(str.equals(str2)) {
					n++;
					iter.remove();
				}
			}
			System.out.println(str + " : " + n);
			n = 0;
		}
	}
	
	public void maxWord(List<String> list)throws ArrayIndexOutOfBoundsException { //наиболее часто встречаемое слово
		
		List<String> newList2 = new ArrayList<>(list);
		int x = 0;
		String str = null;
		for (int i = 0; i < newList2.size() - 1; i++) {
			int sum = 1;
			for (int j = i; j < newList2.size() - 1; j++) {
				if(newList2.get(j).equals(newList2.get(j+1)))
					sum++;
				else break;
			}
			if(sum >= x) {
				x = sum;
				str = newList2.get(i);
				System.out.println("Наиболее часто встречаемое слово: " + str + " - колличество повторенний " + x);
			}
		}
	}
	
	public List<String> returnList(FileReader file) throws IOException{
		BufferedReader reader = new BufferedReader(file);
		ArrayList<String> list = new ArrayList<>();
		String line;
		while((line = reader.readLine())!=null) {
			String[] mas = line.toLowerCase().split("[,.\\s]+");
			for (int i = 0; i < mas.length; i++) {
				list.add(mas[i]);
				}
			}
		Collections.sort(list);
		return list;
	}
	
	public void forList(List<String> list) {
		for (String string : list) {
			System.out.print(string + " ");
		}
	}
}
