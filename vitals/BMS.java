package vitals;

public class BMS {
       
    static boolean checkBatteryStatus(Battery battery) {
    	battery.checkBatteryStatus(battery, BatteryStatusChecker::checkIfBatteryTemperatureIsHigh)
    	.checkBatteryStatus(battery, BatteryStatusChecker::checkIfBatteryTemperatureIsLow)
    	.checkBatteryStatus(battery, BatteryStatusChecker::checkIfStateOfChargeOfBatteryIsHigh)
    	.checkBatteryStatus(battery, BatteryStatusChecker::checkIfStateOfChargeOfBatteryIsLow)
    	.checkBatteryStatus(battery, BatteryStatusChecker::checkIfChargeRateIsHigh);
    	
    	return battery.batteryStatus;
    }

    public static void main(String[] args) {
   
    	assert(checkBatteryStatus(new Battery(25, 70, 0.7f)) == true);
    	assert(checkBatteryStatus(new Battery(50, 85, 0.0f)) == false);
    	assert(checkBatteryStatus(new Battery(-5, 60, 0.0f)) == false);
    	assert(checkBatteryStatus(new Battery(-5, 85, 0.0f)) == false);
    	assert(checkBatteryStatus(new Battery(20, 85, 0.0f)) == false);
    	assert(checkBatteryStatus(new Battery(50, 35, 0.9f)) == false);
    }
 
}
