package vitals;

import java.util.function.Function;

public class Battery {
	float temperature;
	float stateOfCharge;
	float chargeRate;
	boolean batteryStatus;
	String abnormalState;
	float abnormalValue;
	
	Battery(float temperature, float stateOfCharge, float chargeRate) {
		this.temperature = temperature;
		this.stateOfCharge = stateOfCharge;
		this.chargeRate = chargeRate;
		this.batteryStatus = true;
	}
	
	void printBatteryStatus(String batteryStatus, float abnormalValue) {
		System.out.println(batteryStatus + " Abnormal Value: " + abnormalValue);
	}
	
	 Battery checkBatteryStatus(Battery battery, Function<Battery, Void> statusCheckFunction) {
	   statusCheckFunction.apply(this);
	   return battery;
	 }
}
