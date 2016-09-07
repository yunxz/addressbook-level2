package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
    public final String value;
    private boolean isPrivate;
	public Contact(String value, boolean isPrivate, 
			String messageConstraints, String validationRegex) throws IllegalValueException {
		this.isPrivate = isPrivate;
		value = value.trim();
		if(!isValidContact(value, validationRegex))
			throw new IllegalValueException(validationRegex);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
    public boolean isPrivate() {
		return isPrivate;
	}
    
	protected static boolean isValidContact(String test, String validFormat) {
        return test.matches(validFormat);
    }
	
	public String toString() {
		return value;
	}
	
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact// instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }
	
	public int hashCode() {
		return value.hashCode();
	}
}
