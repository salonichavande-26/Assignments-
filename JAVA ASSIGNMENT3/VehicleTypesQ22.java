/*22. Vehicle Types  
Scenario: Vehicles can be Land or Water types. Some vehicles can operate on both. 
Problem Statement: 
● Interface LandVehicle → method driveOnLand() 
● Interface WaterVehicle → method driveOnWater() 
● Class AmphibiousVehicle implements both interfaces → provides both methods 
Sample Input: 
AmphibiousVehicle → name=HydroCar 
Sample Output: 
HydroCar → Driving on Land 
HydroCar → Driving on Water
*/

interface LandVehicle{
	void driveOnLand();
}

interface WaterVehicle{
	void driveOnWater();
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle{
	String name;
		
	AmphibiousVehicle(String name){
		this.name = name;
	}
	@Override
	public void driveOnLand(){
		System.out.println(name + ":Driving on land");
	}
	public void driveOnWater(){
		System.out.println(name + ": driving on water");
	}
}
public class VehicleTypesQ22{
	public static void main(String[] args){
		AmphibiousVehicle  av = new AmphibiousVehicle("HydroCar");

av.driveOnLand();
av.driveOnWater();
	}
}	
			
	
	