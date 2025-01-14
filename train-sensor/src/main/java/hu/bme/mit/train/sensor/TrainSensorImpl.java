package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private int speedLimit = 5;

	public TrainSensorImpl(TrainController controller) {
		this.controller = controller;
	}

	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}

	@Override
	public void overrideSpeedLimit(int speedLimit) {
		

		if(speedLimit < 0 || speedLimit > 500){
			user.setAlarmState(true);
		} 
		else if(speedLimit < controller.getReferenceSpeed() * 0.5){
			user.setAlarmState(true);
		}
		else
			user.setAlarmState(false);


		this.speedLimit = speedLimit;
		controller.setSpeedLimit(speedLimit);
	}

}
