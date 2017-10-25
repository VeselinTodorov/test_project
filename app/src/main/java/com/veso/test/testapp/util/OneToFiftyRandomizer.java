package com.veso.test.testapp.util;

import java.util.Random;

/**
 * Created by Veso on 10.10.2017 г..
 */

public class OneToFiftyRandomizer implements Randomizer {

	Random random;

	public OneToFiftyRandomizer() {
		random = new Random();
	}

	@Override
	public int getRandomNumber(int exclude) {
		int result = random.nextInt(50);
		while (result == 0) {
			result = random.nextInt(50);
		}
		return result;
	}
}
