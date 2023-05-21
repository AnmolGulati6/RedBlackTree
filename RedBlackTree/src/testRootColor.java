
// Name: Anmol Gulati
// Email: agulati101@gmail.com


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 * This class tests the color of the root node of a red black tree in multiple scenarios, which
 * should always black or 1
 */
class testRootColor {

  /**
   * Tester method to check whether the tree undergoes the red node violation or not runs 1/1 if
   * test passes, if violation occurs then test fails
   */

  @Test
  void test() {
    RedBlackTree<Integer> testing = new RedBlackTree<Integer>();
    testing.insert(5);
    int check1 = testing.root.blackHeight;
    assertEquals(1, check1); // checks if root is black and not red with one node
    testing.insert(3);
    testing.insert(2);
    testing.insert(6);
    int check2 = testing.root.blackHeight;
    assertEquals(1, check2); // checks if root is black when multiple nodes are added
  }

}
