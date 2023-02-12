package telran.measure;

public enum LengthUnit {
	MM(1), CM(10), IN(25.4f), M(1_000), KM(1_000_000);
	float value;
	
	LengthUnit(float value) {
		this.value = value;
	}

	public Length between(Length l1, Length l2) {
		return new Length(
				Math.abs(
						l1.convert(this).getAmount() - l2.convert(this).getAmount()
						),
				this
				);
	}
	
//	public float convert(LengthUnit to, float amount) {
//		return value * amount / to.value;
//	}
	
	public float getValue() {
		return value;
	}
}
