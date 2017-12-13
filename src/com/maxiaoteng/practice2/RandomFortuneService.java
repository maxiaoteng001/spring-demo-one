package com.maxiaoteng.practice2;

import java.util.Random;

import com.maxiaoteng.springdemo.FortuneService;

/**
 * @author jizhu
 * @ getFortune() method return a random result from fortunes String array.
 */

public class RandomFortuneService implements FortuneService {

	private Random myRandom = new Random();
	
	String[] fortunes = {"Today is a lucky day!",
						 "Today is a very lucky day!",
						 "Today is a so badly day!"};
	@Override
	public String getFortune() {

		int k= myRandom.nextInt(fortunes.length);

		return fortunes[k];
	}

}
