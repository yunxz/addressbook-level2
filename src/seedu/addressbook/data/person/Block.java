package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Block {
	public static final String EXAMPLE = "123";
	public static final String MESSAGE_BLOCK_CONSTRAINTS = "Block must be a number.";
	public static final String BLOCK_VALIDATION_REGEX = "\\d+";

	public final String value;
	private boolean isPrivate;

	Block(String block, boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		if (!isValidBlock(block)) {
			throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
		}
		this.value = block;
	}

	static boolean isValidBlock(String test) {
		return test.matches(BLOCK_VALIDATION_REGEX);
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		return other == this 
				|| (other instanceof Block 
						&& this.value.equals(((Block) other).value));
																
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

}
