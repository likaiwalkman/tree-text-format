package struct

import org.scalatest.{FlatSpec, FlatSpecLike}
import Traversable._
/**
  * Created by victor on 2017/4/20.
  */
class TraversableTest
  extends FlatSpec
  with FlatSpecLike{

  "Traversable" should "behave properly for Nil input" in {
    asciiDisplay(null)
    .foreach(println)
  }

  "Traversable" should "behave properly for one layer input" in {
    asciiDisplay(TreeNode("Root",
                  children = List(TreeNode("level1-1"),
                                  TreeNode("level1-2"),
                                  TreeNode("level1-3")
                             )
                  )
                 )
    .foreach(println)
  }

  "Traversable" should "behave properly for two layer input" in {
    asciiDisplay(TreeNode("Root",
      children = List(TreeNode("level1-1", children = List(TreeNode("level1-1-1"))),
        TreeNode("level1-2"),
        TreeNode("level1-3")
      )
    )
    )
      .foreach(println)
  }


}
