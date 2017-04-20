package struct

import scala.collection.mutable

/**
  * Created by victor on 2017/4/20.
  */

object Traversable{
  def asciiDisplay(root:TreeNode[String]):Seq[String] = {
    val res = mutable.ListBuffer[String]()
    if(root == null) {
      Seq()
    } else {
      collect(List(root), 0, res )
      res
    }
  }
  def collect( children:Seq[TreeNode[String]], depth: Int, res: mutable.ListBuffer[String]): Seq[String] = {
    if(children != null && children.size > 0) {
      children.foreach({
        case child: TreeNode[String] =>{
          val content = Seq.fill(depth)("| ").mkString + "+-"+ child.data
          res.append(content)
          collect(child.children, depth+1, res)
        }
      })
    }
    res
  }
}


