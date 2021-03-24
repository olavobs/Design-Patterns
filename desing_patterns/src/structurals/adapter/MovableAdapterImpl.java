package structurals.adapter;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;

	public MovableAdapterImpl(Movable car) {
		this.luxuryCars = car;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
}