package com.everydayRESTletstory.expensesTracker.expenses;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import com.everydayRESTletstory.expensesTracker.exceptions.DuplicateExpense;
import com.everydayRESTletstory.expensesTracker.exceptions.NoExpensesFound;
import com.everydayRESTletstory.expensesTracker.exceptions.NoSuchExpenseFound;
import com.everydayRESTletstory.expensesTracker.expense.PetrolExpense;

public class PetrolExpenses implements Expenses<PetrolExpense> {

	private static ConcurrentHashMap<Long, PetrolExpense> petrolExpenses = new ConcurrentHashMap<Long, PetrolExpense>();

	public List<PetrolExpense> getExpenseList() throws NoExpensesFound {
		if (petrolExpenses == null || petrolExpenses.size() < 1)
			populateExpenses();
		return petrolExpenses.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
	}

	public PetrolExpense getExpense(String requestData) throws NoExpensesFound {
		if (petrolExpenses == null || petrolExpenses.size() < 1)
			populateExpenses();
		PetrolExpense petrolExpense = populateExpense(requestData);
		if (petrolExpense == null)
			throw new NoSuchExpenseFound(
					"The Instance of Petrol Expenses for the given Id, You are looking For, is NOT FOUND in our records");
		return petrolExpense;
	}

	public boolean removeExpense(String requestData) throws NoExpensesFound {
		if (petrolExpenses == null || petrolExpenses.size() < 1)
			populateExpenses();
		PetrolExpense petrolExpense = populateExpense(requestData);
		if (petrolExpense == null)
			throw new NoSuchExpenseFound(
					"The Instance of Petrol Expenses for the given Id, You are looking to Remove is NOT FOUND in our records");
		petrolExpense = petrolExpenses.remove(petrolExpense.getId());
		if (petrolExpense == null)
			return false;
		return true;
	}

	public boolean addExpense(String requestData) throws DuplicateExpense {
		if (petrolExpenses == null) {
			try {
				populateExpenses();
			} catch (NoExpensesFound e) {
				/* Nothing to do, If Map of Expenses is empty. addExpense will add First instance to this map. */
			}
		}
		PetrolExpense petrolExpense = populateExpense(requestData);
		if (petrolExpenses.get(petrolExpense.getId()) != null)
			throw new DuplicateExpense("The Instance of Petrol Expenses for the given Id, You are looking to store is already present in our records.");
		PetrolExpense addedPetrolExpense = petrolExpenses.put(petrolExpense.getId(), petrolExpense);
		if (addedPetrolExpense == null)
			return false;
		return true;
	}

	public boolean updateExpense(String requestData) throws NoExpensesFound {
		if (petrolExpenses == null || petrolExpenses.size() < 1)
			populateExpenses();
		PetrolExpense petrolExpense = populateExpense(requestData);
		Long id = petrolExpense.getId(); 
		if (id == null)
			throw new NoSuchExpenseFound("The Instane of Petrol Expenses for the given Id, You are looking to Update is NOT FOUND in our records");
		PetrolExpense updatedPetrolExpense = petrolExpenses.put(id, petrolExpense);
		if (updatedPetrolExpense == null)
			return false;
		return true;
	}

	public PetrolExpense populateExpense(String requestData) {
		return null;
	}

	public void populateExpenses() throws NoExpensesFound {
		if (petrolExpenses == null)
			throw new NullPointerException("Need to Restart Your System. All the Data Lost. Fatal Error.");
		if (petrolExpenses.size() < 1) {
			throw new NoExpensesFound(
					"It seems Your Expenses List is Empty. So Please add some expense instance to List First and then proceed to use our service ");
		}
	}

}
