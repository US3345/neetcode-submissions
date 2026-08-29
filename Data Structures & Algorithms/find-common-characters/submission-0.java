
class Solution {
    public List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();

        int[] common = new int[26];

        // Count characters in first word
        for (char ch : words[0].toCharArray()) {
            common[ch - 'a']++;
        }

        // Check every other word
        for (int i = 1; i < words.length; i++) {

            int[] count = new int[26];

            for (char ch : words[i].toCharArray()) {
                count[ch - 'a']++;
            }

            // Keep the minimum count
            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], count[j]);
            }
        }

        // Add common characters to result
        for (int i = 0; i < 26; i++) {

            for (int j = 0; j < common[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }
}

