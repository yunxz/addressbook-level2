package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
	public static final String EXAMPLE = "#12-34";
	public static final String MESSAGE_STREET_CONSTRAINTS = 
			"Street must be a combination of word characters and spaces";
	public static final String STREET_VALIDATION_REGEX = "[\\w\\s]+";
	public final String value;
	private boolean isPrivate;

	Street(String block, boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		if (!isValidStreet(block)) {
			throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
		}
		this.value = block;
	}

	static boolean isValidStreet(String test) {
		return test.matches(STREET_VALIDATION_REGEX);
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		return other == this
				|| (other instanceof Street 
						&& this.value.equals(((Street) other).value)); 
																	
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

}
