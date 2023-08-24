# Preorder Binary Tree




You are given a ‘Binary Tree’.                    
Return the preorder traversal of the Binary Tree.         

Example:         
Input: Consider the following Binary Tree:           
Output:            
Following is the preorder traversal of the given Binary Tree: [1, 2, 5, 3, 6, 4]           

Input Format:            
The only line contains elements in the level order form. The line consists of values of nodes separated by a single space. In case a node is null, we take -1 in its place.          
For example, the input for the tree depicted in the below image will be:            
alt text  
1         
2 3             
4 -1 5 6            
-1 7 -1 -1 -1 -1            
-1 -1            

Explanation :      
Level 1 :           
The root node of the tree is 1          
Level 2 :            
Left child of 1 = 2         
Right child of 1 = 3            
Level 3 :             
Left child of 2 = 4            
Right child of 2 = null (-1)            
Left child of 3 = 5            
Right child of 3 = 6           
Level 4 :            
Left child of 4 = null (-1)           
Right child of 4 = 7              
Left child of 5 = null (-1)              
Right child of 5 = null (-1)               
Left child of 6 = null (-1)               
Right child of 6 = null (-1)                   
Level 5 :                      
Left child of 7 = null (-1)                  
Right child of 7 = null (-1)                
The first not-null node(of the previous level) is treated as the parent of the first two nodes of the current level. The second not-null node (of the previous level) is treated as the parent node for the next two nodes of the current level and so on.         
The input ends when all nodes at the last level are null(-1).              
The sequence will be put together in a single line separated by a single space. Hence, for the above-depicted tree, the input will be given as:             
1 2 3 4 -1 5 6 -1 7 -1 -1 -1 -1 -1 -1             

Output Format:             
Return an array representing the preorder traversal of the given binary tree.         

Note :                
You do not need to print anything; it has already been taken care of. Just implement the given function.           

Sample Input 1:                           
1 2 3 5 4 6 7 -1 -1 -1 -1 -1 -1 -1 -1            
Sample Output 1:           
1 2 5 4 3 6 7                  
Explanation of Sample Input 1:                         
The Binary Tree given in the input is as follows:           
Sample1         

Sample Input 2:                   
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1       
 Sample Output 2:         
5 6 2 3 9 10          
Explanation of Sample Input 2:        
The Binary Tree given in the input is as follows:          
Sample2        

Expected Time Complexity:          
Try to do this in O(n).        

Constraints:           
1 <= n <= 100000         
where 'n' is the number of nodes in the binary tree.       
Time Limit: 1 sec          

