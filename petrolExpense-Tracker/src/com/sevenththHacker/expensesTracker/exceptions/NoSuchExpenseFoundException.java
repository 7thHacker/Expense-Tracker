package com.sevenththHacker.expensesTracker.exceptions;

public class NoSuchExpenseFoundException extends NoExpensesFoundException {

	private static final long serialVersionUID = 8113057132262050448L;

	public NoSuchExpenseFoundException() {
		super();
	}

	public NoSuchExpenseFoundException(String msg) {
		super(msg);
	}

}
