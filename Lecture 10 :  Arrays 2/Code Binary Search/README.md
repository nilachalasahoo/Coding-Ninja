# Code Binary Search




You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. If the element is not present in the array/list, then return -1.        

Input format :          
The first line contains an Integer 'N', which denotes the size of the array/list.     
The second line contains 'N' single space-separated integers representing the elements in the array/list.     
The third line contains the value of X to be searched for in the array/list.     

Output Format :      
Return the index at which X is present for each test case, -1 otherwise.      

Constraints :      
0 <= N <= 10^6     
0 <= X <= 10^9      
Time Limit: 1 sec      

Sample Input 1:      
7        
1 3 7 9 11 12 45        
3      
Sample Output 1:     
1      
Explanation of sample output 1:     
For ARR = [1, 3, 7, 9, 11, 12, 45],      
The index of element '3' is 1.      
Hence, the answer is '1'.      

Sample Input 2:      
7       
1 2 3 4 5 6 7     
9       
Sample Output 2:     
-1     
Explanation of sample output 2:      
For ARR = [1, 2, 3, 4, 5, 6, 7],       
Element '9' doesn't exist.      
Hence, the answer is '-1'.      
