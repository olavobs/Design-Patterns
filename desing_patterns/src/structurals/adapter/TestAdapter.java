package structurals.adapter;

public class TestAdapter {

	public static void main(String[] args) {

		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

		System.out.println(bugattiVeyronAdapter.getSpeed());
	}
}
