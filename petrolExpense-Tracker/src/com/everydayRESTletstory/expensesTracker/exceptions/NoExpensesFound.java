package com.everydayRESTletstory.expensesTracker.exceptions;

public class NoExpensesFound extends Exception{

	private static final long serialVersionUID = -5470558029978046316L;

	public NoExpensesFound() {
		super();
	}
	
	public NoExpensesFound(String msg) {
		super(msg);
	}

}
