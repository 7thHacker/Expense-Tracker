package com.everydayRESTletstory.expensesTracker.expenses;

import java.util.List;

import com.everydayRESTletstory.expensesTracker.exceptions.DuplicateExpense;
import com.everydayRESTletstory.expensesTracker.exceptions.NoExpensesFound;

public interface Expenses<T> {

	T populateExpense(String requestData);

	void populateExpenses() throws NoExpensesFound;

	List<T> getExpenseList() throws NoExpensesFound;

	T getExpense(String requestData) throws NoExpensesFound;

	boolean addExpense(String requestData) throws DuplicateExpense;

	boolean updateExpense(String requestData) throws NoExpensesFound;

	boolean removeExpense(String requestData) throws NoExpensesFound;
}
