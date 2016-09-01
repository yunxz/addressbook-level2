package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
	public static final String EXAMPLE = "#12-34";
	public static final String MESSAGE_UNIT_CONSTRAINTS = "Unit must be a #number(optional -)number, like #12-34";
	public static final String UNIT_VALIDATION_REGEX = "#\\d+(-\\d)*";

	public final String value;
	private boolean isPrivate;

	Unit(String block, boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		if (!isValidUnit(block)) {
			throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
		}
		this.value = block;
	}

	static boolean isValidUnit(String test) {
		return test.matches(UNIT_VALIDATION_REGEX);
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		return other == this
				|| (other instanceof Unit 
						&& this.value.equals(((Unit) other).value)); 
																	
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

}
