//234. [3차] n진수 게임

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();

        int number = 0;

        while (sb.length() < m * t) {
            sb.append(Integer.toString(number++, n).toUpperCase());
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < t; i++) {
            result.append(sb.charAt((i * m) + (p - 1)));
        }

        return result.toString();
    }
}