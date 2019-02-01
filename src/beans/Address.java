package beans;

public class Address {
	private String village,District;

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDistrict() {
		return District;
	}

	@Override
	public String toString() {
		return "village= " + village + "\nDistrict=" + District;
	}

	public void setDistrict(String district) {
		District = district;
	}
}
