package com.everydayRESTletstory.expensesTracker.exceptions;

public class DuplicateExpense extends Exception {

	private static final long serialVersionUID = 4285724119426884587L;

	public DuplicateExpense() {
		super();
	}

	public DuplicateExpense(String msg) {
		super(msg);
	}

}
