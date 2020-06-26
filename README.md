# Find-the-Difference
Given two strings, this function finds the what extra letter was added into one of them

The function is given two strings, s and t which consist of only lowercase letters. String t is generated by 
random shuffling string s and then adding one more letter at a random position. This function finds the letter
that was added to string s.

I chose to try two different solutions, one by using a HashMap and one by using an array of 26 characters representing
the letter of the alphabet.

The time and space complexity for both solutions are the same.

The time complexity is O(n), where n is the size of string t because we have to iterate through both of the strings.

The space complexity is O(1) because even though we create a HashMap and an array, they both at most contain
only 26 elements.