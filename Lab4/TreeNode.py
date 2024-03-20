class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

def invertTree(self, root):
     if(root!=None):
          temp = root.right
          root.right = root.left
          invertTree(self,root.left)
          root.left = temp
          invertTree(self,temp)

     return root

# testing
n3 = TreeNode(3)
n5 = TreeNode(5)
n6 = TreeNode(6)
n2 = TreeNode(2, n3, None)
n8 = TreeNode(8, n5, n6)
n1 = TreeNode(1, n2, n8)

print("\nafter inversion: ")
print("the root is " + str(invertTree(n1,n1).val))
print("1's children-- l: " + str(n1.left.val) + " r: " + str(n1.right.val))
print("2's children-- l: " + str(n2.left) + " r: " + str(n2.right.val))
print("8's children-- l: " + str(n8.left.val) + " r: " + str(n8.right.val))
