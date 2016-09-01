package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
	public static final String EXAMPLE = "#12-34";
	public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS = "PostalCode must be a number";
	public static final String POSTAL_CODE_VALIDATION_REGEX = "\\d+";

	public final String value;
	private boolean isPrivate;

	PostalCode(String block, boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		if (!isValidPostalCode(block)) {
			throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINTS);
		}
		this.value = block;
	}

	static boolean isValidPostalCode(String test) {
		return test.matches(POSTAL_CODE_VALIDATION_REGEX);
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof PostalCode 
						&& this.value.equals(((PostalCode) other).value)); 
																		
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

}
