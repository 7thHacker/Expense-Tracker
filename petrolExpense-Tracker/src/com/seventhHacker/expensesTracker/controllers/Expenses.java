package com.seventhHacker.expensesTracker.controllers;

import java.util.List;

import com.sevenththHacker.expensesTracker.exceptions.DuplicateExpenseException;
import com.sevenththHacker.expensesTracker.exceptions.NoExpensesFoundException;

public interface Expenses<T> {

	T populateExpense(String requestData);

	void populateExpenses() throws NoExpensesFoundException;

	List<T> getExpenseList() throws NoExpensesFoundException;

	T getExpense(String requestData) throws NoExpensesFoundException;

	boolean addExpense(String requestData) throws DuplicateExpenseException;

	boolean updateExpense(String requestData) throws NoExpensesFoundException;

	boolean removeExpense(String requestData) throws NoExpensesFoundException;
}
