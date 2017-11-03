#Sample Boundary-Equivalence tables 

## Phone number variable

Variable 		 | Valid case EC 	 | Invalid case EC 	| Boundary and special cases 	| Notes
------------ | --------------  | ---------------- | --------------------------- | -------
Phone number |(\\([+]?[0-9\s]{2,3}\\)\|[+]?[0-9\s]{2,3})?[0-9\s]{7,12} |  		| 000000 				 | 
             |                 |  					      | 999999999999 								| 
             |                 |  					      | (+48)999999999999 					| 
             |                 |  					      | + 48999999999999 					  |
             |                 |                  | +48 111 222 333             |
             |                 | #number < 7			| 1234  								    | 
             |                 | #number > 15			| 111111111111111111 					  |
             |                 | not number	| AB999999999999 	   				|
             |                 | empty      			|  								            | 
             |                 |special character      			| *123456789			              | 

## Email variable

Variable 		| Valid case EC 	| Invalid case EC 	| Boundary and special cases 	| Notes
----------- | --------------- | ----------------- | --------------------------- | -------
Email 			|	[A-Za-z0-9._%+-]{1,64}@[A-Za-z0-9.-]{1,255}.[A-Za-z]{2,6} |  | aAzZ09.%+-bcdefghijk@aAzZ09.-defghijklmno.azzAZZ	| 
            |                 |                   | ab@ab.com |
            |                 | empty             | |
            |                 | before@ empty | @ab.com |
            |                 | before@ characters > 64 | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@z.az |
            |                 | after@ empty | a@.com | 
            |                 | after@ characters > 255 | a@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.com |
            |                 | TLD length < 2  | a@a.c |
            |                 | TLD length > 6  | a@a.commmmm |


## Username, Phone and Email variable test cases created using PICT

1. USERNAME: U1,U2,U3,U4,U5,U6,U7,U8,U9 (From sample file)
2. PHONE: P1: 000000, P2: 999999999999,P3: (+48)999999999999,P4: + 48999999999999,P5: +48 111 222 333, P6: 1234, P7: 111111111111111111,P8: AB999999999999, P9: empty, P:10 *123456789
3. EMAIL: E1:aAzZ09.%+-bcdefghijk@aAzZ09.-defghijklmno.azzAZZ, E2:ab@ab.com, E3:emEty, E4:@ab.com, E5:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@z.az, E6:a@.com, E7:a@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.com, E8:a@a.c,E9:a@a.commmmm


Username | Phonenumber  | Email
-------- | ------------ | -----
U7|	P8|	E2
U7|	P7|	E7
U9|	P4|	E7
U9|	P8|	E3
U8|	P1|	E1
U8|	P8|	E7
U4|	P8|	E6
U5|	P3|	E1
U2|	P5|	E3
U5|	P2|	E7
U4|	P4|	E3
U3|	PZ|	E9
U2|	P4|	E2
U3|	P2|	E2
U7|	P1|	E9
U2|	P1|	E7
U8|	P2|	E4
U6|	P3|	E8
U7|	P5|	E6
U6|	P7|	E3
U5|	P6|	E5
U6|	P4|	E6
U4|	P6|	E2
U7|	P9|	E3
U1|	P5|	E7
U9|	P9|	E6
U1|	P1|	E8
U6|	PZ|	E7
U7|	P3|	E4
U2|	P8|	E4
U1|	P2|	E1
U9|	PZ|	E1
U2|	P6|	E9
U7|	P4|	E8
U6|	P6|	E1
U1|	P4|	E4
U9|	P5|	E9
U3|	P8|	E5
U8|	P5|	E2
U8|	P6|	E3
U8|	P4|	E5
U2|	P3|	E6
U4|	P5|	E5
U9|	P2|	E8
U3|	P4|	E1
U5|	P8|	E9
U5|	PZ|	E6
U1|	PZ|	E2
U6|	P1|	E4
U1|	P7|	E6
U4|	P8|	E8
U4|	P3|	E7
U4|	P2|	E9
U6|	P2|	E5
U5|	P5|	E8
U2|	P2|	E8
U5|	P7|	E4
U4|	P1|	E3
U3|	P6|	E6
U2|	P7|	E5
U3|	P3|	E3
U2|	P9|	E1
U4|	P7|	E1
U8|	P7|	E9
U3|	P7|	E8
U4|	PZ|	E4
U3|	P5|	E4
U8|	P9|	E8
U7|	P2|	E5
U8|	P2|	E6
U4|	P9|	E4
U9|	P6|	E4
U9|	P1|	E5
U1|	P8|	E1
U5|	P4|	E9
U5|	P1|	E2
U7|	PZ|	E5
U5|	P9|	E2
U1|	P9|	E5
U2|	PZ|	E8
U1|	P2|	E3
U9|	P3|	E2
U8|	P3|	E5
U1|	P6|	E9
U7|	P6|	E1
U3|	P9|	E7
U6|	P9|	E9
U9|	P7|	E2
U3|	P1|	E6
U6|	P5|	E1
U5|	PZ|	E3
U9|	P6|	E8
U8|	PZ|	E1
U1|	P3|	E9
U6|	P8|	E2
U6|	P6|	E7
