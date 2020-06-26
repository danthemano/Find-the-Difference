class Solution {
    //this solution uses a HashMap
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        //puts the characters in the orgiginal string and their counts in the Hashmap
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        //checks the HashMap for the extra character
        for(int i = 0; i < t.length(); i++){
            if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) < 1)
                return t.charAt(i);
            else
                map.replace(t.charAt(i), map.get(t.charAt(i)) - 1);
        }

        //! signals that there is no extra character
        return '!';
    }


    //this solution uses an array of 26 characters, one for each letter of the alphabet
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];

        //this loop places the count of a character in the corresponding place
        //inside the array(a = 1, b = 2,etc...)
        for(int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a'] += 1;

        //decrements the char array everytime a letter is found, until one of them is less than zero
        for(int i = 0; i < t.length(); i++){
            arr[t.charAt(i) - 'a'] -= 1;
            if(arr[t.charAt(i) - 'a'] < 0)
                return t.charAt(i);
        }

        //! signals that there is no extra character
        return '!';
    }
}