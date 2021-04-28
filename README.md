# celebrity
Solution to find the celebrity problem

This solution consists of two classes, Person and Celebrity.

Person class only has a  Boolean method which receives another Person as argument and returns true if the class knows the coming argument.

The method to resolve this problem is inside Celebrity class, it receives a list of Person objects and runs a double iteration over the 
received list, the first iteration will hold the position of a particular element in the list, while the second, nested loop will do a 
comparison to check if the position on the first loop knows no people on the list. If the condition result is false, a counter is used 
to check we're at the end of the second iteration, in which case the current position on the first iteration will be saved into the return value.
