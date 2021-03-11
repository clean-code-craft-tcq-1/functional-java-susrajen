package vitals;

public class BatteryStatusChecker {
	
	static Boolean checkIfHigher(float valueToCheck, float threshold) {
		if(valueToCheck > threshold) {
			return true;
		}
		return false;
	}
	
	static Boolean checkIfLower(float valueToCheck, float threshold) {
		if(valueToCheck < threshold) {
			return true;
		}
		return false;
	}

	static Void checkIfBatteryTemperatureIsHigh(Battery battery) {
		if (checkIfHigher(battery.temperature, 45)) {
			battery.abnormalState = "Temperature is high!";
			battery.abnormalValue = battery.temperature;
			battery.batteryStatus = false;
		}
		return null;
	}

	static Void checkIfBatteryTemperatureIsLow(Battery battery) {
		if (checkIfLower(battery.temperature, 0)) {
			
			battery.abnormalState = "Temperature is low!";
			battery.abnormalValue = battery.temperature;
			battery.batteryStatus = false;
		}
		return null; 
	}

	static Void checkIfStateOfChargeOfBatteryIsHigh(Battery battery) {
		if (checkIfHigher(battery.stateOfCharge,80)) {
			battery.abnormalState = "State of Charge is high!";
			battery.abnormalValue = battery.stateOfCharge;
			battery.batteryStatus = false;
		}
		return null; 
	}

	static Void checkIfStateOfChargeOfBatteryIsLow(Battery battery) {
		if (checkIfLower(battery.stateOfCharge, 20)) {
			battery.abnormalState = "State of Charge is low!";
			battery.abnormalValue = battery.stateOfCharge;
			battery.batteryStatus = false;
		}
		return null;
	}

	static Void checkIfChargeRateIsHigh(Battery battery) {
		if (checkIfHigher(battery.chargeRate, 0.8f)) {
			battery.abnormalState = "Charge Rate is high!";
			battery.abnormalValue = battery.chargeRate;
			battery.batteryStatus = false;
		}
		return null; 
	}
}
