package lib;

public class Maps extends Items {

	public boolean isTreasureMap;

	public Maps(String itemName, boolean isTreasureMap) {
		super(itemName);
		this.isTreasureMap = isTreasureMap;
	}

	public boolean isTreasureMap() {
		return isTreasureMap;
	}

	public void setTreasureMap(boolean isTreasureMap) {
		this.isTreasureMap = isTreasureMap;
	}

	@Override
	public String toString() {
		return "Map [isTreasureMap=" + isTreasureMap + ", name=" + getItemName() + ", isCheckedIn=" + isCheckedIn() +"]";
	}

	@Override
	public String reading() {
		return "Travel safely";
	}
}
