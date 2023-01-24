package pull;

import java.util.Observable;

public class Baby extends Observable {

	private boolean crying = false;
	private int level = 0;

	private String babyname;

	public Baby(String name) {
		this.babyname = name;
	}

	public void setData(boolean crying, int level) {
		this.crying = crying;
		this.level = level;
		setChanged();
		notifyObservers();
	}

	public boolean isCrying() {
		return crying;
	}

	public String getBabyname() {
		return babyname;
	}

	public int getLevel() {
		return level;
	}
}