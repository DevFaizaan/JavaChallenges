package lib;

public class Items implements Readable {
	
	private int ID;
	private String itemName;
	private String category;
	private String dateIssued;
	private String returnDate;
	private boolean checkedIn;
	private boolean checkedOut;
	
	public Items(String itemName) {
		super();
		this.itemName = itemName;
	}
	
	public Items(int iD, String dateIssued, String returnDate, boolean checkedIn, boolean checkedOut) {
		super();
		ID = iD;
		this.dateIssued = dateIssued;
		this.returnDate = returnDate;
		this.checkedIn = checkedIn;
		this.checkedOut = checkedOut;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(String dateIssued) {
		this.dateIssued = dateIssued;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public boolean isCheckedOut() {
		return checkedOut;
	}
	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}


	
	@Override
	public String toString() {
		return "Items [id=" + ID + ", name=" + itemName + ", isCheckedIn=" + checkedIn + "]";
	}

	@Override
	public String reading() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
