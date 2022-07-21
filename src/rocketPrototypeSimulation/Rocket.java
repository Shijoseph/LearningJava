package rocketPrototypeSimulation;


	
public	class Rocket implements Spaceship {

		int weightLimitOfTheRocket;
		int currentWeightofTheRocket;
		boolean ifCanCarry;

		public boolean launch() {
			return true;

		}

		public boolean land() {
			return true;
		}

		boolean canCarry(Item item) {
			if (item.weightOfTheItem <= weightLimitOfTheRocket) {
				return true;
			} else {
				return false;
			}
		}

		
		void carry(Item item) {

			currentWeightofTheRocket += item.weightOfTheItem;
		}

		@Override
		public boolean canCarry() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void carry() {
			// TODO Auto-generated method stub

		}

	}


