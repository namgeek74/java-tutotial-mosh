Heap for dynamic allocate memory and shared between threads
When 1 object in heap is not referenced by any variables, it is marked as available for Garbage Collection
And When Garbage Collection work (automatic, have 3 phases depend on lifetime of variables), it will remove this object out of Heap
Can have:
- OutOfMemoryException
- StackOverflowException

Stack store reference value to object, method call, method parameters, local variables
Stack is created for each of thread and not shared between these threads
Stack is smaller compare with Heap