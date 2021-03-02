package vitals;

import java.util.function.Function;

public class Battery {
	float temperature;
	float stateOfCharge;
	float chargeRate;
	boolean batteryStatus;
	
	Battery(float temperature, float stateOfCharge, float chargeRate) {
		this.temperature = temperature;
		this.stateOfCharge = stateOfCharge;
		this.chargeRate = chargeRate;
		this.batteryStatus = true;
	}
	
	 Battery checkBatteryStatus(Battery battery, Function<Battery, Battery> statusCheckFunction) {
	   statusCheckFunction.apply(this);
	   return battery;
	 }
}
