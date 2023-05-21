

// Name: Anmol Gulati
// Email: agulati101@gmail.com


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Checks for the black uncle test violation in a red black binary tree. Inserts nodes that would
 * cause a violation and checks for the correct output. Also checks whether all the nodes are the
 * correct color or not
 */
class blackUncleTest {

  /**
   * Tester method to check whether the tree undergoes the black uncle violation or not inserts
   * integers that cause a black uncle and checks for correct output inserts integers that cause a
   * black uncle and checks if the nodes are the correct colors
   */

  @Test
  void test() {
    RedBlackTree<Integer> testing = new RedBlackTree<Integer>();
    testing.insert(45);
    testing.insert(26);
    testing.insert(72);
    testing.insert(18);

    String arr = "[ 45, 26, 72, 18 ]";
    assertEquals(arr, testing.toLevelOrderString()); // checks for black uncle violation, produces
                                                     // correct output

    String a = "45: " + testing.root.blackHeight;
    String b = " 26: " + testing.root.leftChild.blackHeight;
    String c = " 72: " + testing.root.rightChild.blackHeight;
    String d = " 18: " + testing.root.leftChild.leftChild.blackHeight;
    String correctOutput = "45: 1 26: 1 72: 1 18: 0";
    assertEquals(correctOutput, a + b + c + d); // checks if nodes are correct colors after black
                                                // uncle rotation
  }

}
