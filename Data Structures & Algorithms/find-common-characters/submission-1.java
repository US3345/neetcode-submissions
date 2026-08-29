
class Solution {
    public List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();

        HashMap<Character, Integer> common = new HashMap<>();

        // Count first word
        for (char ch : words[0].toCharArray()) {
            common.put(ch, common.getOrDefault(ch, 0) + 1);
        }

        // Check remaining words
        for (int i = 1; i < words.length; i++) {

            HashMap<Character, Integer> count = new HashMap<>();

            // Count current word
            for (char ch : words[i].toCharArray()) {
                count.put(ch, count.getOrDefault(ch, 0) + 1);
            }

            // Update common counts
            for (char ch : common.keySet()) {

                if (count.containsKey(ch)) {
                    common.put(ch, Math.min(common.get(ch), count.get(ch)));
                } else {
                    common.put(ch, 0);
                }
            }
        }

        // Create result
        for (char ch : common.keySet()) {

            for (int i = 0; i < common.get(ch); i++) {
                result.add(String.valueOf(ch));
            }
        }

        return result;
    }
}

