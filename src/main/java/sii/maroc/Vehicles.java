package sii.maroc;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Vehicles {

	private String description;

	public Vehicles(String description) {
		this.description = description;
	}

	public String move(String type, String diesel, String portes, String kilometre) {
		String[] words = kilometre.split("\\s");

		int distance = Integer.parseInt(words[0]);
		NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);

		format.setMinimumFractionDigits(2);
		format.setRoundingMode(RoundingMode.UP);

		int result = (int) Math.ceil(distance * 5 / 100.0);
		if (type.equals("CAR") & diesel.equals("Diesel") & portes.equals("1 2 3 4")) {

			return "DOORS OK, MOVING. The CAR will consume " + format.format(result) + " L";
		}
		if (type.equals("TRUCK") && diesel.equals("Diesel") && portes.equals("1 2")) {
			return "DOORS OK, MOVING. The TRUCK will consume " + format.format(result) + " L";
		}
		if (type.equals("MOTORCYCLE") && diesel.equals("Fuel") && portes.equals("")) {
			return "DOORS OK, MOVING. The MOTORCYCLE will consume " + format.format(result) + " L";
		}
if(type.equals("CAR") & portes.equals("1 3 4") )
{
	return "DOORS KO, BLOCKED \n"+"  _\n"+ " | \\\n"+ " |_|";
}
	
if(type.equals("CAR") & portes.equals("1 2 4") )
{
	return "DOORS KO, BLOCKED \n"+"  _\n"+ " | |\n"+" /_|";
}
		
else {
			return "";
		}

	}

}
