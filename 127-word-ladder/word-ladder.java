import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord)) {
            return 0;
        }

        Queue<String> q = new LinkedList<>();
        q.add(beginWord);

        int count = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                String word = q.poll();

                for (int j = 0; j < word.length(); j++) {

                    char[] arr = word.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {

                        arr[j] = c;
                        String next = new String(arr);

                        if (next.equals(endWord)) {
                            return count + 1;
                        }

                        if (set.contains(next)) {
                            q.add(next);
                            set.remove(next);
                        }
                    }
                }
            }

            count++;
        }

        return 0;
    }
}