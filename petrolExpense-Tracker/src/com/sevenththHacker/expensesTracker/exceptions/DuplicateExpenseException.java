package com.sevenththHacker.expensesTracker.exceptions;

public class DuplicateExpenseException extends Exception {

	private static final long serialVersionUID = 4285724119426884587L;

	public DuplicateExpenseException() {
		super();
	}

	public DuplicateExpenseException(String msg) {
		super(msg);
	}

}
