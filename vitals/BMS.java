package vitals;

public class BMS {
    static boolean checkIfBatteryIsOk(float temperature, float stateOfCharge, float chargeRate) {
    	if(checkIfBatteryTemperatureIsLow(temperature) && checkIfBatteryTemperatureIsHigh(temperature) && 
    	checkIfStateOfChargeOfBatteryIsHigh(stateOfCharge) && checkIfStateOfChargeOfBatteryIsLow(stateOfCharge)
    	&& checkIfChargeRateIsHigh(chargeRate)) {
    		return true;
    	}
        return false;
    }

    public static void main(String[] args) {
   	
    	assert(checkIfBatteryIsOk(25, 70, 0.7f) == true);
    	assert(checkIfBatteryIsOk(50, 85, 0.0f) == false);
    	assert(checkIfBatteryIsOk(-5, 85, 0.0f) == false);
    	assert(checkIfBatteryIsOk(20, 15, 0.0f) == false);
    	assert(checkIfBatteryIsOk(20, 85, 0.0f) == false);
    	assert(checkIfBatteryIsOk(50, 35, 0.9f) == false);
    }
    
    static void printBatteryStatus(String batteryStatus, float abnormalValue) {
    	System.out.println(batteryStatus + " Abnormal Value: " + abnormalValue);
    }
    
    static boolean checkIfBatteryTemperatureIsHigh(float temperature) {
    	if(temperature > 45) {
    		printBatteryStatus("Temperature is high!", temperature);
    		return false;
    	}
    	return true;
    }
    
    static boolean checkIfBatteryTemperatureIsLow(float temperature) {
    	if(temperature < 0) {
    		printBatteryStatus("Temperature is low!", temperature);
    		return false;
    	}
    	return true;
    }
    
    static boolean checkIfStateOfChargeOfBatteryIsHigh(float stateOfCharge) {
    	if(stateOfCharge > 80) {
    		printBatteryStatus("State of Charge is high!", stateOfCharge);
    		return false;
    	}
    	return true;
    }
    
    static boolean checkIfStateOfChargeOfBatteryIsLow(float stateOfCharge) {
    	if(stateOfCharge < 20) {
    		printBatteryStatus("State of Charge is low!", stateOfCharge);
    		return false;
    	}
    	return true;
    }
    
    static boolean checkIfChargeRateIsHigh(float chargeRate) {
    	if(chargeRate > 0.8) {
    		printBatteryStatus("Charge Rate is high!", chargeRate);
    		return false;
    	}
    	return true;
    }
}
