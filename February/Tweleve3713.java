package February;
// Find the length of the longest substring where all characters appear the same number of times.
class Tweleve3713 {
    public static void main(String[] args) {
        String s = "abbac";
        // Call the function and store the longest balanced substring length
        int ans = new Tweleve3713().longestBalanced(s);
        System.out.println(ans); // Expected output: 4 ("abba")
    }

    private int longestBalanced(String s) {
        int maxLength = 0; // Store the max length of balanced substring found

        // Fix the starting index of substring
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; // Reset frequency array for every new start
                                        // freq[0] for 'a', freq[1] for 'b', ..., freq[25] for 'z'

            // Expand the ending index of substring
            for (int j = i; j < s.length(); j++) {
                // Increment frequency of the current character
                freq[s.charAt(j) - 'a']++;

                // Check if the current substring (i..j) is balanced
                if (isBalanced(freq)) {
                    // Update maxLength if this substring is longer
                    maxLength = Math.max(maxLength, (j - i) + 1);
                }
            }
        }

        return maxLength; // Return the length of the longest balanced substring
    }

    // Function to check if all characters in freq array have the same frequency
    private boolean isBalanced(int[] freq) {
        int expected = 0; // Store the frequency that all characters must match

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) { // Only consider characters present in the substring
                if (expected == 0) {
                    expected = freq[i]; // First non-zero frequency becomes the standard
                } else if (freq[i] != expected) {
                    return false; // If any character frequency differs, substring is unbalanced
                }
            }
        }

        return true; // All non-zero frequencies matched → substring is balanced
    }
}

// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Approach 
// we want subarray so need to fix the starting index of substring with outer loop
// and expand the ending index of substring with inner loop
// take a 26 length frequency array which will store the frequency of each character
// check if the current substring (i..j) is balanced
// if it is balanced then update maxLength

// How to know whether it is balanced or not 
// we maintain an array which will store the frequency of each character
// we traverse that frequency array if the element is greater than 0 means it is present in the substring
// after getting that element we will check if other have same frequncy or not if not return false
// else return true

