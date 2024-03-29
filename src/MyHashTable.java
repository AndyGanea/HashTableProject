import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an StudentInfo
	// object holding a reference value pointing to a student.

	public ArrayList<EmployeeInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int empNumber) {
		return(empNumber % buckets.length);  // student number modulo number of buckets
	}


	public void addToTable(EmployeeInfo theEmployee) {
		// Add the student referenced by theEmployee to the hash table.

		if (theEmployee != null) {
			int bucketToAddIn = calcBucket(theEmployee.empNumber);
			buckets[bucketToAddIn].add(theEmployee);
		}
	}


	public EmployeeInfo removeFromTable(int empNumber) {
		// Remove that student from the hash table and return the reference value for that student.
		// Return null if that student isn't in the table.

		int bucketToRemoveFrom = calcBucket(empNumber);
		for (int i = 0; i < buckets[bucketToRemoveFrom].size(); i++) {
			if (empNumber == buckets[bucketToRemoveFrom].get(i).empNumber) {
				EmployeeInfo removedEmpNumber = buckets[bucketToRemoveFrom].remove(i);
				return removedEmpNumber;
			}
		}
		return null;
	}

	
	public EmployeeInfo getFromTable(int empNumber) {
		// Return the reference value for that student, return null if student isn't in the table.

		int bucketToGetFrom = calcBucket(empNumber);
		for (int i = 0; i < buckets[bucketToGetFrom].size(); i++) {
			if (empNumber == buckets[bucketToGetFrom].get(i).empNumber) {
				EmployeeInfo getEmployeeNumber = buckets[bucketToGetFrom].get(i);
				return getEmployeeNumber;
			}
		}
		return null;
	}


	public void displayTable() {
		// Walk through the buckets and display the items in each bucket's ArrayList.

		EmployeeInfo currentEmployee;
		
		for (int i = 0; i < buckets.length; i++) {
			System.out.println("The Contents for Bucket # " + i + " are:");
			if (buckets[i].size() == 0 ) {
				System.out.println("There are no items in this bucket.");
			}
			else {
				for (int j = 0; j < buckets[i].size(); j++) {
					currentEmployee = buckets[i].get(j);
					System.out.println(currentEmployee.empNumber + " " + currentEmployee.firstName + " " + currentEmployee.lastName);
				}
			}
		}
	}

}
