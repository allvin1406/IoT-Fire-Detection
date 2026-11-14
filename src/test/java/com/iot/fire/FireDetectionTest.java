
package com.iot.fire;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireDetectionTest {

    @Test
    public void testSafeCondition() {
        assertEquals("SAFE",
                FireDetection.detectFire(25, 100, false));
    }

    @Test
    public void testHighTemperatureWarning() {
        assertEquals("WARNING",
                FireDetection.detectFire(45, 100, false));
    }

    @Test
    public void testHighSmokeWarning() {
        assertEquals("WARNING",
                FireDetection.detectFire(25, 400, false));
    }

    @Test
    public void testFlameDetected() {
        assertEquals("FIRE",
                FireDetection.detectFire(30, 100, true));
    }

    @Test
    public void testCriticalTemperature() {
        assertEquals("FIRE",
                FireDetection.detectFire(65, 100, false));
    }

    @Test
    public void testInvalidSensorData() {
        assertEquals("INVALID SENSOR DATA",
                FireDetection.detectFire(-5, 100, false));
    }
}
