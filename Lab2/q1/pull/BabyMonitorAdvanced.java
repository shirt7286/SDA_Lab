package pull;

import java.util.Observable;
import java.util.Observer;

public class BabyMonitorAdvanced implements Observer {
	private Observable mdata, cdata;
	private String babyname;
	private String name;
	private boolean crying;
	private int level;

	public BabyMonitorAdvanced(String name, Baby m, Baby c) {
		this.name = name;
		this.mdata = m;
		this.cdata = c;
		mdata.addObserver(this);
		cdata.addObserver(this);
	}

	public void display() {
		if (crying) {
			System.out.println("Monitor:" + name + " baby: " + babyname + " is crying at level: " + level);
		}
	}

	public void turnOff() {
		mdata.deleteObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.crying = ((Baby) o).isCrying();
		this.babyname = ((Baby) o).getBabyname();
		this.level = ((Baby) o).getLevel();
		display();
	}
}
