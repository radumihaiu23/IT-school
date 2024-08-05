In this exercise, you will explore how to chain
multiple lambda expressions using default methods
in interfaces. Create a functional interface named
StringProcessor that has a single abstract method 
process which takes a String parameter and returns
a String. Also, create a default method in the interface 
that allows two StringProcessors to be chained together.
Use this to chain together two lambda expressions: 
one that converts a string to uppercase and another
that removes whitespace from a string.