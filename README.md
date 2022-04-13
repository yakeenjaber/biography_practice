PROJECT

The purpose of this project is to write a biography of one user’s favorite Author.

To do this, user will be asked some questions about their favorite author.


BEFORE WRITING THE ACTUAL PROGRAM

There are 2 classes that needs to be done to store data properly – Author and Book

QUESTIONS TO ASK IN PROGRAM

Firstly, program will ask user to enter their favorite author’s information as below

What is your favorite author’s first name?

What is your favorite author’s last name?

Where is your favorite author from?

Is your favorite author alive? Y/N

If user enters Y, then ask How old is your favorite author? If, user enters N, then skip this question. 


Then, program will ask about user’s favorite author’s books.

First ask, if they want to enter book information with below question

Would you like enter book information? (Y/N) 

If answer is Y, then ask below questions about the book 

What is the book name?

What is genre of the book?

How many pages does book have? 


NOTE: Keep asking user “Would you like enter book information? (Y/N)” question until they enter N and store all book information you got in Book objects.


EXPECTED OUTPUT 

Author's information

Author's book information


EXAMPLE PROGRAM: 

Program: What is your favorite author’s first name? 

User: Stefan

Program: What is your favorite author’s last name? 

User: Zweig

Program: Where is your favorite author is from? 

User: Austria 

Program: Is your favorite author is alive? (Y/N)

User: N


NOTE: since author is not alive, we need to skip age question

Program: Would you like to enter book info? (Y/N) 

User: Y 

Program: What is the name of the book? 

User: Amok 

Program: What is genre of the book?

User: tale 

Program: How many pages does book have?

User: 189

Program: Would you like to enter book info? (Y/N)
 
User: Y 

Program: What is the name of the book?
 
User: The Royal Game 

Program: What is genre of the book?

User: novella

Program: How many pages does book have?

User: 53

Program: Would you like to enter book info? (Y/N) 

User: Y 

Program: What is the name of the book?
 
User: 24 Hours in the Life of a Woman

Program: What is genre of the book?

User: novella

Program: How many pages does book have?

User: 80

Program: Would you like to enter book info? (Y/N) 

User: N


THE END RESULT OF ABOVE PROGRAM

Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}

Author's books are as listed below:

Book{name='Amok', genre:'tale', page=189}

Book{name='The Royal Game', tale='novella', page=53}

Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
