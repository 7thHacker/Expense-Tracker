package com.everydayRESTletstory.expensesTracker.exceptions;

public class NoSuchExpenseFound extends NoExpensesFound {

	private static final long serialVersionUID = 8113057132262050448L;

	public NoSuchExpenseFound() {
		super();
	}

	public NoSuchExpenseFound(String msg) {
		super(msg);
	}

}
