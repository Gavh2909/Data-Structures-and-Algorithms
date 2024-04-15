# Tree Data Structure:

1. What is Tree?
2. Why are we using trees?
  - O(log(n))
  - Ordered Storage
  - Cost efficient
3. Where it is being used?

4. Define following things:
 - Node
 - Size
 - Child Node
 - Sibling
 - Edge
 - Height
 - Degree
 - LEaf Node
 - Level
 - Ancestor
 - Decendent

 5. Types of Binary Trees:
 - Complete Binary Tree
 - Full Binary Tree
 - Perfect Binary Tree
 - Height Balanced Tree
 - Skewed Binary Tree
 - Ordered Binary Tree

 ![Full Binary Tree](https://media.geeksforgeeks.org/wp-content/uploads/20221125111700/full.png)

![Complete Binary Tree](https://media.geeksforgeeks.org/wp-content/uploads/20221130172411/completedrawio.png)

![Perfecr Binary Tree](https://media.geeksforgeeks.org/wp-content/uploads/20221124094547/perfect.png)

![Height Balanced Binary Tree](https://media.geeksforgeeks.org/wp-content/uploads/20220519131143/heightbalanced.png)

 ![Skewed Binary Tree](https://media.geeksforgeeks.org/wp-content/uploads/20221130172501/skewed1.png)

 ![Ordered Binary Tree](https://static.javatpoint.com/ds/images/binary-search-tree1.png)

# Additional Properties
- In Perfect Binary Tree
  height =h
  total Node = 2^(h+1)-1

  if level =i
  then no of Nodes on that level = 2^i

  - Total no of leaf Nodes in perfect Binary Tree = 2^height

  N =  no of leaves
  log(N)+1 = levels atleast

  N =  no of Nodes 
   log(N+1) = minimum levels
  
Strict Binary Tree:

  N= leaf Nodes
  Internal Nodes = N-1

No of leaf Nodes = 1 + No of internal Nodes


## Implementation :
 1. Linked representation 
 2. Sequential representation


# Travrsal

1. Pre order Traversal -> NLR
