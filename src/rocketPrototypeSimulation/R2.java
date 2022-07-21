package rocketPrototypeSimulation;

import java.util.Random;


	
	public class R2 extends Rocket {
			@Override
			public boolean land() {
				Random randomNumber = new Random();
				double rand = randomNumber.nextDouble();
				int factor = (int) (0.08 * (currentWeightofTheRocket / weightLimitOfTheRocket));
				return factor >= rand;
			}

			@Override
			public boolean launch() {
				Random randomNumber = new Random();
				double rand = randomNumber.nextDouble();
				int factor = (int) (0.04 * (currentWeightofTheRocket / weightLimitOfTheRocket));
				return factor >= rand;
			}
		}


