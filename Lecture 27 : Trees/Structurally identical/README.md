# Structurally identical




Given two Generic trees, return true if they are structurally identical i.e. they are made of nodes with the same values arranged in the same way.                  

Input format :               
Line 1 : Tree 1 elements in level order form separated by space (as per done in class) in the following order:              
root_data, n (number of children of root), n children, and so on for every element.                 
Line 2 : Tree 2 elements in level order form separated by space (as per done in class). Order is - `             
root_data, n (number of children of root), n children, and so on for every element.            

Output format :            
true or false            

Sample Input 1 :                
10 3 20 30 40 2 40 50 0 0 0 0         
10 3 20 30 40 2 40 50 0 0 0 0       
Sample Output 1 :  
true          
Explanation :              
If we draw the tree for the above inputs, both the trees will look like this. So the answer for this is true.               

Sample Input 2 :                  
10 3 20 30 40 2 40 50 0 0 0 0             
10 3 2 30 40 2 40 50 0 0 0 0                
Sample Output 2:              
false    
