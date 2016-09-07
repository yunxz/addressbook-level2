package seedu.addressbook.data;


import java.util.HashMap;
import java.util.Map;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

public class Tagging {
	public static enum TaggingOperation { ADDITION, DELETION };
	private static final Map<TaggingOperation, String> operationSymbol;
	
	private final Person person;
	private final Tag tag;
	private final TaggingOperation operation;
	
	static {
		operationSymbol = new HashMap<>();
		operationSymbol.put(TaggingOperation.ADDITION, "+");
		operationSymbol.put(TaggingOperation.DELETION, "-");
	}
	
	public Tagging(Person person, Tag tag, TaggingOperation operation) {
		this.person = person;
		this.tag = tag;
		this.operation = operation;
	}
	
	public String toString() {
		return operationSymbol.get(operation) + " " + person + tag;
	}
	
}
