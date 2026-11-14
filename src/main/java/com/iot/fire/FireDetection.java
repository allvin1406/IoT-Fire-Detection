
package com.iot.fire;

public class FireDetection {

    // Fire detection using multiple sensor inputs
    public static String detectFire(
            double temperature,
            int smokeLevel,
            boolean flameDetected) {

        if (temperature < 0 || smokeLevel < 0) {
            return "INVALID SENSOR DATA";
        }

        // Critical fire condition
        if (flameDetected || temperature >= 60 || smokeLevel >= 700) {
            return "FIRE";
        }

        // Warning condition
        if (temperature >= 40 || smokeLevel >= 300) {
            return "WARNING";
        }

        // Normal condition
        return "SAFE";
    }

    // Display emergency alert
    public static String generateAlert(String status) {

        switch (status) {
            case "FIRE":
                return "EMERGENCY! FIRE DETECTED";

            case "WARNING":
                return "WARNING! CHECK THE ENVIRONMENT";

            case "SAFE":
                return "NO FIRE DETECTED";

            default:
                return "INVALID SENSOR DATA";
        }
    }

    // Main method
    public static void main(String[] args) {

        double temperature = 75;
        int smokeLevel = 850;
        boolean flameDetected = true;

        String status = detectFire(
                temperature,
                smokeLevel,
                flameDetected
        );

        System.out.println("================================");
        System.out.println("   IoT FIRE DETECTION SYSTEM");
        System.out.println("================================");

        System.out.println("Temperature : " + temperature + " C");
        System.out.println("Smoke Level : " + smokeLevel);
        System.out.println("Flame       : "
                + (flameDetected ? "DETECTED" : "NOT DETECTED"));

        System.out.println("--------------------------------");
        System.out.println("System Status : " + status);
        System.out.println("Alert         : " + generateAlert(status));
        System.out.println("================================");
    }
}
