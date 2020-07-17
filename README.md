# WrapperText

WrapperText is a Java program that can be run in the terminal and will wrap a given string input so that no line is more that 13 characters long.

# Breakdown

The main method will take in a string argument and then will be checked in the following try/catch statement to make sure that it is a valid input. If no input is provided then a catch will call the ArrayIndexOutofBoundsException and print “No input provided” to the console. 
As long as there is some input then the splitString method is called.

The splitString method takes the string as a parameter and splits the string into a collection of strings by splitting the string at the “ “ character, filtering out any words that are longer than the 13 character restriction and then collecting the new strings into a list and returning that list. 
That list is then checked in an if statement to make sure that size of the list is not zero. If the input text was a string of 13 characters with no spaces it would have been filtered out during the splitString method. In the case that List words is empty then a NullPointerException would be thrown and “Input invalid” would be printed to the console.

If List words is not empty then int lineLength is instantiated and a StringBuilder is constructed. The StringBuilder will be used to construct the string that will be formatted with the character restrictions and lineLength will be used to keep track of the size of each line. A for each loop is used to iterate through List words. 
The if statement is used to determine if adding a new word to the line is still within the restriction or if it’s the first word in the StringBuilder. 
If both of these arguments are true then a “ “ character and the next word in the list will be added to StringBuilder. If not then it moves to the else if statement. 
This statement verifies that the length of the line would be longer than 13 characters and adds the new line. 
The else statement will only be applicable at the very start of creating the formatted string. 
Once List words has been iterated over the StringBuilder will be converted to a string and be printed to the console. 
