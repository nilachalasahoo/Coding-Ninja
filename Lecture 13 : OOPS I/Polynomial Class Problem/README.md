# Polynomial Class Problem




Implement a polynomial class, that contains following functions -              
1. setCoefficient -           
This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.               
2. add -          
Adds two polynomials and returns a new polynomial which has the result.            
3. subtract -           
Subtracts two polynomials and returns a new polynomial which has the result.         
4. multiply -         
Multiplies two polynomials and returns a new polynomial which has the result.          
5. print -         
Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.       
Print pattern for a single term : "x"       
And multiple terms should be printed separated by space. For more clarity, refer sample test cases.

Note : Only keep those terms which have non - zero coefficients.      

Input Format:     
The first line of input contains count of the number of coefficients in polynomial 1(C1)       
The next line of input has C1 degrees for polynomial 1.      
The next line of input has C1 coefficients for polynomial 1.            
The next line of input contains count of the number of coefficients in polynomial 2(C2)      
The next line of input has C2 degrees for polynomial 2.       
The next line of input has C2 coefficients for polynomial 2.          
The next line of input has the choice for the function you want to implement.          

Output Format:       
The output will be printed in case of print function same as that of print function format.        

Sample Input 1 :        
P1 : 1x2 2x3 4x6       
P2 : 3x4 1x2        
Sample Output 1 :       
P1 + P2 = 2x2 2x3 3x4 4x6        

Sample Input 2 :      
P1 : 1x2 2x3 4x6       
P2 : 3x4 1x2       
Sample Output 2 :       
P1 - P2 = 2x3 -3x4 4x6       
