import junit.framework.TestCase;

public class ImplementStrStrTest extends TestCase {

    public void testProfit1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int actual = Main.Solution.strStr(haystack, needle);
        int expected = 0;
        assertEquals(expected, actual);
    }

    public void testProfit2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int actual = Main.Solution.strStr(haystack, needle);
        int expected = -1;
        assertEquals(expected, actual);
    }
}
