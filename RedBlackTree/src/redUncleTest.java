// Name: Anmol Gulati
// Email: agulati101@gmail.com

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Checks for the red uncle test violation in a red black binary tree. Inserts nodes that would
 * cause a violation and checks for the correct output. Also checks whether all the nodes are the
 * correct color or not
 */

class redUncleTest {


  /**
   * Tester method to check whether the tree undergoes the red uncle violation or not inserts
   * integers that cause a red uncle and checks for correct output inserts integers that cause a red
   * uncle and checks if the nodes are the correct colors
   */

  @Test
  void test() {
    RedBlackTree<Integer> testing = new RedBlackTree<Integer>();
    testing.insert(23);
    testing.insert(7);
    testing.insert(41);
    testing.insert(19);
    String arr = "[ 23, 7, 41, 19 ]";
    assertEquals(arr, testing.toLevelOrderString()); // checks for red uncle violation, produces
                                                     // correct output

    String a = "23: " + testing.root.blackHeight;
    String b = " 7: " + testing.root.leftChild.blackHeight;
    String c = " 41: " + testing.root.rightChild.blackHeight;
    String d = " 19: " + testing.root.leftChild.rightChild.blackHeight;
    String correctOutput = "23: 1 7: 1 41: 1 19: 0";
    assertEquals(correctOutput, a + b + c + d); // checks if nodes are correct colors after red
                                                // uncle rotation



  }

}
