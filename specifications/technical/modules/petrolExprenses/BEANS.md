# BEANS

	This document contains the technical details about the classes created for the application. These classes
	contains the implementation details of the functionality of any module.
	
	The file is dedicated to specification of all the classes used by the "PetrolExpense-Tracker" module.

PetrolExpense :

	package 		: 	com.everydayRESTletstory.expensesTracker.expense;	
	class-type		: 	Concrete Class
	super-class 		: 	Expense
	data members		:	{
		01. id, for uniquely identification of object 
		02. airCheck, if air pressure of tyres were checked after petrol filling
      	03. price, price of petrol at the time of filling
      	04. amountINR, total amount of Rs. petrol were filled
      	05. amountLtr, total amount of Ltr. petrol were filled
     	06. odometerReading, the reading of odometer at the time of petrol filling
     	07. timeMS, the time and date when petrol filled
     	08. logTime, the time and date when expenses were logged to system
     	09. brand, the name of the petrol brand
     	10. pumpAddress, the full address of petrol bunk
     	11. modeOfTransection, the mode of transaction like cash, cc, dc, net-banking, paytm ...etc.
     	12. geoLocation, to hold the x and y co-ordinates of the Geo-location of the petrol bunk
	}
	member-methods	:	{
		01. getters & setters
		02. toString, Override toString method to print the value of data members instead of hashcode 
			of instance.
		03. compareTo, implement the method from super class so that all the instance of this class can
			be in order (either ASC or DESC)
    }

	
PetrolExpenses :

	description		:	It will define a Map to Store the instance of Expense with the unique 
					Id and implements all the methods from the "Expenses" interface on this data 
	package			:	com.everydayRESTletstory.expensesTracker.expenses
	class-type		:	Concrete [Generic Type]
	super-class 		:	Expenses
	data-member		:	{
		01. petrolExpenses, This is a Map to hold all the instance of PetrolExpense with the unique Id. 
	}
	member-methods		:	{
		/* It must implement all the methods from the super-class */
		01. populateExpense, It should populate an instance of PetrolExpense based on given Data
			(later this instance of PetrolExpense is used by different methods for different purpose)
		02. populateExpenses, It should restrict the user to using a Map of PetrolExpense Instance with 
			their respective Id, untill user adds its first instance of It, If the Map is Empty, 
			It should raise a Exception.
		03. getExpenseList, It should return the List of all PetrolExpense instance from the Map of it and
			should throw an Exception if the Map of Expenses is Empty
		04. getExpense, It should return the instance of PetrolExpense from the Map of It based on the Id 
			of PetrolExpense Instance request by the user. If the Map is Empty, It should raise a Exception.
		05. addExpense, It should return true on successful adding of new instance of PetrolExpense to Map with
			Unique Id based on the user request. It should return false if it fails to perform desire 
			operation. It should raise an exception if the generated id for the instance is already present
			to Map.
		06. updateExpense, It should return true on successful update of existing instance of PetrolExpense
			from the Map based on the user request. It should return false if it fails to perform desire 
			operation. It should raise an exception if the request instance is not present in the Map or Map 
			is Empty.
		07. removeExpense, It should return true on successful remove of existing instance of Expense from 
			the Map based on the user request. It should return false if it fails to perform desire operation.
			It should raise an exception if the requested instance is not present to Map or Map is Empty.
	}
