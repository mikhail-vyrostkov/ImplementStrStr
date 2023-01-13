public class Main {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "is;ip";
        System.out.println(Solution.strStr(haystack, needle));
        System.out.println(haystack.indexOf(needle));

    }

    public static class Solution {
        public static int strStr(String haystack, String needle) {
            char[] hArr = haystack.toCharArray();
            char[] nArr = needle.toCharArray();
            int j = 0;
            if (haystack.contains(needle)) {
                int out = 0;
                for (int k = 0; k < nArr.length; k++) {
                    for (int i = 0; i < hArr.length; i++) {
                        out = i;
                        if (nArr[k] == hArr[i]) {
                            if (k < nArr.length - 1) {
                                k++;
                            } else {
                                return out - nArr.length + 1;
                            }
                        } else {
                            k = 0;
                            i = j++;
                        }
                    }
                }
                return out - nArr.length + 1;
            } else {
                return -1;
            }
        }
    }
}
