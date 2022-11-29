package bb;

public record object() {

	@Override
	public String toString() {
		return "object [hashCode()=" + hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ "]";
	}

}
