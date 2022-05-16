package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

import static org.mockito.Mockito.*;

public class TrainSensorTest {

    //test cases 1 alarmcalledbelowzero 2 alarmcalledabove500 3 alarmcalledbelowreferencespeed 4 alarmnotcalled
    private TrainSensor ts;
    private TrainUser tu;
    private TrainController tc;

    @Before
    public void before() {
        tc = mock(TrainController.class);
        tu = mock(TrainUser.class);

        when(tc.getReferenceSpeed()).thenReturn(100);

        ts = new TrainSensorImpl(tc, tu);
    }

    @Test
    public void AlarmCalledBelowZero() {
        ts.overrideSpeedLimit(-1);

        verify(tu, times(1)).setAlarmState(true);
    }

<<<<<<< HEAD
=======
    @Test
    public void AlarmCalledAbove500() {
        ts.overrideSpeedLimit(501);

        verify(tu, times(1)).setAlarmState(true);
    }

    @Test
    public void AlarmCalledBelowHalf() {
        ts.overrideSpeedLimit(49);

        verify(tu, times(1)).setAlarmState(true);
    }

    @Test
    public void AlarmNotCalledAboveHalf() {
        ts.overrideSpeedLimit(50);

        verify(tu, times(1)).setAlarmState(false);
    }
>>>>>>> ddb60a0350eef1bf9808254d63e98ffc601471c7
}
