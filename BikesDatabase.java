package Model;

import java.util.ArrayList;

public class BikesDatabase {

	private static ArrayList<Bike> BikeArrayList = new ArrayList<Bike>();

	public ArrayList<Bike> getBikeArrayList() {
		return BikeArrayList;
		}
	public Bike getBike(int id) {
		return BikeArrayList.get(idBike);
		}

		public void addBike(Bike OneBike) {
		ProductDatabase.BookArrayList.add(OneBike);
		}
		BikesDatabase() {
			addBike (new Bike(1, 15.00, "woman", 51, "child chair", 3));
			addBike (new Bike(2, 15.00, "man", 54, "none", 7));
			addBike (new Bike(3, 25.00, "woman", 56, "basket", 21));
}
		public static void printBikeDatabase() {
			for (Bike bi: BikeArrayList) {
				System.out.println(bi.getId() + ";" + "Bike type" + bi.getType() + "bike Size" + bi.getSize() + "bike's additional elements" + bi.getAdditionalElements() + "bike no of gears" + bi.getNoOfGears() + bi.getPrice() + "DKK");
 			}
		}
}
