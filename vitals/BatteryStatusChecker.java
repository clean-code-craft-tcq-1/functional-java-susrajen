package vitals;

public class BatteryStatusChecker {

	static void printBatteryStatus(String batteryStatus, float abnormalValue) {
		System.out.println(batteryStatus + " Abnormal Value: " + abnormalValue);
	}

	static Battery checkIfBatteryTemperatureIsHigh(Battery battery) {
		if (battery.temperature > 45) {
			printBatteryStatus("Temperature is high!", battery.temperature);
			battery.batteryStatus = false;
		} 

		return battery;
	}

	static Battery checkIfBatteryTemperatureIsLow(Battery battery) {
		if (battery.temperature < 0) {
			printBatteryStatus("Temperature is low!", battery.temperature);
			battery.batteryStatus = false;
		} 
		return battery;
	}

	static Battery checkIfStateOfChargeOfBatteryIsHigh(Battery battery) {
		if (battery.stateOfCharge > 80) {
			printBatteryStatus("State of Charge is high!", battery.stateOfCharge);
			battery.batteryStatus = false;
		} 
		return battery;
	}

	static Battery checkIfStateOfChargeOfBatteryIsLow(Battery battery) {
		if (battery.stateOfCharge < 20) {
			printBatteryStatus("State of Charge is low!", battery.stateOfCharge);
			battery.batteryStatus = false;
		}
		return battery;
	}

	static Battery checkIfChargeRateIsHigh(Battery battery) {
		if (battery.chargeRate > 0.8) {
			printBatteryStatus("Charge Rate is high!", battery.chargeRate);
			battery.batteryStatus = false;
		} 
		return battery;
	}
}
