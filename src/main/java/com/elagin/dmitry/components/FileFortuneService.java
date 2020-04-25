package com.elagin.dmitry.components;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes;
	//private final String fileName="fortunes.txt";
	private final String fileName="E:/YandexDisk/Java/Spring/Udemy/SpringEx/src/main/resources/fortunes.txt";

	@PostConstruct
	public void init() {

		fortunes=new ArrayList<>();
		
	
		try (BufferedReader reader = 
				new BufferedReader(new FileReader(fileName))) {
			String fortune;

		
			while((fortune = reader.readLine())!=null) {
				fortunes.add(fortune);
			}
			}

		catch (Exception e) {
				System.err.println("Ошибка чтения файла! - "+e);
		}

	}

	public String getDailyFortune() {
		Random random = new Random(System.currentTimeMillis());
		int index = random.nextInt(fortunes.size());
		return fortunes.get(index);

	}

}
