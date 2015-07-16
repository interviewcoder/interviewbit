package _08_NextPermutation;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _08_NextPermutation.Solution } */
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
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 3, 2));
        assertEquals(B, A);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(B, A);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 5));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 5, 1));
        assertEquals(B, A);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(20, 50, 113));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(20, 113, 50));
        assertEquals(B, A);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(444, 994, 508, 72,
                125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675,
                424, 199, 201, 788, 609, 582, 979, 259, 901, 371, 766, 759,
                983, 728, 220, 16, 158, 822, 515, 488, 846, 321, 908, 469, 84,
                460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202,
                734, 128, 312, 499, 274, 213, 208, 472, 265, 315, 335, 205,
                784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226, 351,
                241, 526, 311, 164, 98, 422, 363, 103, 747, 507, 669, 153, 856,
                701, 319, 695, 52));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(444, 994, 508, 72,
                125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675,
                424, 199, 201, 788, 609, 582, 979, 259, 901, 371, 766, 759,
                983, 728, 220, 16, 158, 822, 515, 488, 846, 321, 908, 469, 84,
                460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202,
                734, 128, 312, 499, 274, 213, 208, 472, 265, 315, 335, 205,
                784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226, 351,
                241, 526, 311, 164, 98, 422, 363, 103, 747, 507, 669, 153, 856,
                701, 695, 52, 319));
        assertEquals(B, A);
    }

    @Test
    public void Test6() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 1));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 1, 2));
        assertEquals(B, A);
    }

    @Test
    public void Test7() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 4, 2, 1));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(4, 1, 2, 3));
        assertEquals(B, A);
    }

    @Test
    public void Test8() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(626, 436, 819,
                100, 382, 173, 817, 581, 220, 95, 814, 660, 397, 852, 15, 532,
                564, 715, 179, 872, 236, 790, 223, 379, 83, 924, 454, 846, 742,
                730, 689, 112, 110, 516, 85, 149, 228, 202, 988, 212, 69, 602,
                887, 445, 327, 527, 347, 906, 54, 460, 517, 376, 395, 494, 827,
                448, 919, 799, 133, 879, 709, 184, 812, 514, 976, 700, 156,
                568, 453, 267, 547, 8, 951, 326, 652, 772, 213, 714, 706, 972,
                318, 768, 506, 59, 854, 422));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(626, 436, 819,
                100, 382, 173, 817, 581, 220, 95, 814, 660, 397, 852, 15, 532,
                564, 715, 179, 872, 236, 790, 223, 379, 83, 924, 454, 846, 742,
                730, 689, 112, 110, 516, 85, 149, 228, 202, 988, 212, 69, 602,
                887, 445, 327, 527, 347, 906, 54, 460, 517, 376, 395, 494, 827,
                448, 919, 799, 133, 879, 709, 184, 812, 514, 976, 700, 156,
                568, 453, 267, 547, 8, 951, 326, 652, 772, 213, 714, 706, 972,
                318, 768, 506, 422, 59, 854));
        assertEquals(B, A);
    }

    @Test
    public void Test9() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 4, 3, 1));
        solution.nextPermutation(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 1, 2, 4));
        assertEquals(B, A);
    }

}
