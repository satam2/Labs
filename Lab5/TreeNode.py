class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

def isValidBST(self, root):

# testing
n1 = TreeNode(1)
n2 = TreeNode(2)
n9 = TreeNode(9)
n3 = TreeNode(3,n1,None)
n8 = TreeNode(8,n2,n9)
n4 = TreeNode(4,n3,n8)

print(str(isValidBST(n4,n4)))
