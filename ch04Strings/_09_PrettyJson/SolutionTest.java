package _09_PrettyJson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _09_PrettyJson.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String A = "{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}";
        ArrayList<String> actual = solution.prettyJSON(A);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("{");
        expected.add("\tA:\"B\",");
        expected.add("\tC:");
        expected.add("\t{");
        expected.add("\t\tD:\"E\",");
        expected.add("\t\tF:");
        expected.add("\t\t{");
        expected.add("\t\t\tG:\"H\",");
        expected.add("\t\t\tI:\"J\"");
        expected.add("\t\t}");
        expected.add("\t}");
        expected.add("}");
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "[\"foo\", {\"bar\":[\"baz\",null,1.0,2]}]";
        ArrayList<String> actual = solution.prettyJSON(A);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("[");
        expected.add("\t\"foo\",");
        expected.add("\t{");
        expected.add("\t\t\"bar\":");
        expected.add("\t\t[");
        expected.add("\t\t\t\"baz\",");
        expected.add("\t\t\tnull,");
        expected.add("\t\t\t1.0,");
        expected.add("\t\t\t2");
        expected.add("\t\t]");
        expected.add("\t}");
        expected.add("]");
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String A = "{\"id\":100,\"firstName\":\"Jack\",\"lastName\":\"Jones\",\"age\":12}";
        ArrayList<String> actual = solution.prettyJSON(A);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("{");
        expected.add("\t\"id\":100,");
        expected.add("\t\"firstName\":\"Jack\",");
        expected.add("\t\"lastName\":\"Jones\",");
        expected.add("\t\"age\":12");
        expected.add("}");
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String A = "{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}";
        ArrayList<String> actual = solution.prettyJSON(A);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("{");
        expected.add("\t,");
        expected.add("\t\"firstName\":\"Jack\",");
        expected.add("\t\"lastName\":\"Jones\",");
        expected.add("\t\"age\":12");
        expected.add("}");
        assertEquals(expected, actual);
    }
}
