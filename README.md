Q10) What does @Transactional annotation do?
Answer-
The @Transactional annotation in Spring is used to manage database transactions.
It ensures that a series of database operations are executed as a single unit of work. 
If any operation fails, the entire transaction is rolled back to maintain data integrity.

Key Features of @Transactional-

Atomicity: Ensures all operations within the transaction are completed successfully or rolled back in case of failure.
Consistency: Maintains data integrity by enforcing database constraints.
Isolation: Prevents data inconsistency by isolating transactions from each other.
Durability: Ensures that once a transaction is committed, changes are permanently saved.