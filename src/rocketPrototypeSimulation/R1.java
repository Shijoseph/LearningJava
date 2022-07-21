package rocketPrototypeSimulation;

import java.util.Random;


	
public 	class R1 extends Rocket {
		@Override
		public boolean land() {
			Random randomNumber = new Random();
			double rand = randomNumber.nextDouble();
			int factor = (int) (0.01 * (currentWeightofTheRocket / weightLimitOfTheRocket));
			return factor >= rand;
		}

		@Override
		public boolean launch() {

			Random randomNumber = new Random();
			double rand = randomNumber.nextDouble();
			int factor = (int) (0.05 * (currentWeightofTheRocket / weightLimitOfTheRocket));
			return factor >= rand;
		}

	}



