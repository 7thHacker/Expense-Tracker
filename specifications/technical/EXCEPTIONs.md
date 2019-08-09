# EXCEPTION

	This file contains the technical details about all the custom exceptions used in the application by the 
	different-different modules.

### DuplicateExpense

	Type		:	checked Exception
	Description	:	This Exception should be raised when the Instance of Expense from the request add operation is already present in our record.

### NoSuchExpenseFound

	Type		:	checked Exception
	Description	:	This Exception should raised when the requested Instance for either getExpense or updateExpense operation for specific Id is not found in our record.
	
### NoExpensesFound

	Type		:	checked Exception
	Description	:	This Exception should raised When the complete List of all the Expenses are requested but the List doesn't contain any instance.