class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

def isValidBST(self, root):
     def helper(n, l=None, u=None):
          if n == None:
               return True
          if l != None and n.val <= l:
               return False
          if u != None and n.val >= u:
               return False
          if not helper(n.right,n.val,u):
               return False
          if not helper(n.left,l,n.val):
               return False
          return True
     return helper(root)

# testing
n1 = TreeNode(1)
n2 = TreeNode(2)
n9 = TreeNode(9)
n3 = TreeNode(3, n1, None)
n8 = TreeNode(8, n2, n9)
n4 = TreeNode(4, n3, n8)

print(isValidBST(n4,n4))  # False

n5 = TreeNode(5)
n7 = TreeNode(7)
n6 = TreeNode(6, n5, n7)
print(isValidBST(n6,n6))  # True
