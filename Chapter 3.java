 System.out.println(++x); // prints 6
System.out.println(x++); // prints 6, then x becomes 7
System.out.println(x);   // prints 7
3.15 Identify and correct the errors in each of the following pieces of code. [Note: There may be more than one error in each piece of code.] 
a) if (age >= 65); 
System.out.println("Age is greater than or equal to 65"); 
else System.out.println("Age is less than 65)"; ans:
// ERROR 1: Semicolon after if condition terminates the if — remove it
// ERROR 2: Closing parenthesis inside the string literal in the else
if (age >= 65)
    System.out.println("Age is greater than or equal to 65");
else
    System.out.println("Age is less than 65");

b) int x = 1, total; 
while (x <= 10) { 
total += x; ++x;
 } ans:
// ERROR: `total` is not initialized — must be initialized to 0
int x = 1, total = 0;
while (x <= 10) {
    total += x;
    ++x;
}

c) while (x <= 100)
 total += x; ++x; d) 
while (y > 0) { 
System.out.println(y);
 ++y; ans:
// ERROR: Missing braces — only `total += x` is in the loop body,
// `++x` is outside, causing an infinite loop
while (x <= 100) {
    total += x;
    ++x;
}
