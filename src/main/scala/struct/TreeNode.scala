package struct

/**
  * Created by victor on 2017/4/20.
  */
case class TreeNode[T](data: T, children: Seq[TreeNode[T]] = Nil)
