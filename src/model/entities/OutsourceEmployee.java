package model.entities;

public class OutsourceEmployee extends Employee {
	
	private Double additionaCharge;

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionaCharge) {
		super(name, hours, valuePerHour);
		this.additionaCharge = additionaCharge;
	}

	public Double getAdditionaCharge() {
		return additionaCharge;
	}

	public void setAdditionaCharge(Double additionaCharge) {
		this.additionaCharge = additionaCharge;
	}
	
	@Override
	public Double payment() {
		return (hours * valuePerHour) + (additionaCharge/100)*110;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name+" - $"+payment());
		return sb.toString();
	}
}
