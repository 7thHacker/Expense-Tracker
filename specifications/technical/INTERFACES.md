# INTERFACES

	This document contains the technical details about the interfaces used in the application.
	Interfaces are used in the application to define the generic behavior of the classes which
	extends them

### Expense :

	description		:	It will provide a generic instance for all kind of Expenses
	package 		:	com.everydayRESTletstory.expensesTracker.expense;
	class-type		:	Interface
	super-class 		:	Comparable<T> // so that all the sub-classes can be sorted
	data-member		:	{
	}
	member-method	:	{
	}

### Expenses :

	description		:	It will provide the generic structure to store the instance of Expense 
					with the unique Id into a map and operations performed on this data 
	package			:	com.everydayRESTletstory.expensesTracker.expenses
	class-type		:	Interface [Generic Type]
	super-class 		:	Object
	data-member		:	{
	}
	member-method	:	{
		01. populateExpense, It should populate an instance of Expense based on given Data(later this 
			instance of Expense is used by different methods for different purpose)
		02. populateExpenses, It should restrict the user to using a Map of Expense Instance with 
			their respective Id, untill user adds its first instance of Expense, If the Map is 
			Empty, It should raise a Exception.
		03. getExpenseList, It should return the List of all Expense instance from the Map of 
			Expenses and should throw an Exception if the Map of Expenses is Empty
		04. getExpense, It should return the instance of Expense from the Map of Expenses based 
			on the Id of Expense Instance request by the user. If the Map is Empty, It should 
			raise a Exception.
		05. addExpense, It should return true on successful adding of new instance of Expense to Map 
			with Unique Id based on the user request. It should return false if it fails to 
			perform desire operation. It should raise an exception if the generated id for the 
			instance is already present to Map.
		06. updateExpense, It should return true on successful update of existing instance of Expense 
			from the Map based on the user request. It should return false if it fails to perform 
			desire operation. It should raise an exception if the request instance is not present 
			in the Map or Map is Empty.
		07. removeExpense, It should return true on successful remove of existing instance of Expense 
			from the Map based on the user request. It should return false if it fails to perform
			desire operation. It should raise an exception if the requested instance is not present
			to Map or Map is Empty.
	}
