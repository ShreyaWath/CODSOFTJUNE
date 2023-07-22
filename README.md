# CODSOFTJUNE
INTERNSHIP TASKS FOR JAVA PROGRAMMING

Task 1 : Number Game 
Task Details :
1. Generate a random number within a specified range, such as 1 to 100. 
2. Prompt the user to enter their guess for the generated number. 
3. Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low. 
4. Repeat steps 2 and 3 until the user guesses the correct number. You can incorporate additional details as follows: 
5. Limit the number of attempts the user has to guess the number. 
6. Add the option for multiple rounds, allowing the user to play again. 
7. Display the user's score, which can be based on the number of attempts taken or rounds won.

Explanation of Code :
1] We start the code by importing classes from the java.util package which are Random and Scanner. Random class is used to generate a random number between the given range of numbers. Scanner class is used to read or write values in the java program.
2] After which we create a public class NumberGame that contains the main method from where the actual execution of the program would take place.
3] Inside the main method, several variables are declared and initialized:
Scanner scanner: Used to read input from the user.
Random random: Used to generate random numbers.
int score: Keeps track of the number of times the player correctly guesses the number.
int totalattempts: Keeps track of the total number of attempts made by the player in all games combined.
4] The main part of the program is the do-while loop that allows the user to play the game multiple number of times until he decides to stop.
5] The do block starts by generating a random number & is stored in randomNumber. The attempts are initialized to 0 and Boolean value of correctGuess to false.
6] Inside the do block we have a while loop which controls the number of attempts for the game in a single round.
If the guess is not correct & the count of attempts < 8 the loop will go on. If any of these two condition is not satisfied the control exits the loop it checks if the number guessed is not correct it will print “Sorry , you've reached the maximum number of attempts. The number was “ and the correct number.
7] During the execution of while loop it will prompt you to enter your guess and the attempts count will be increased by 1.
8] If the number guessed is less than the random number it prints “Too low! Try again”
Else If the number guessed is more than the random number it prints “Too high! Try again”
Else it prints “Coungratulations! You guessed the right number.
It sets the correctGuess value to true and increments the score by 1 and ends the control of while loop.
9] The value of attempts is stored into totalattempts and the user is asked whether he/she wants to play the game again by the while loop if the answer is yes the entire game is played again.
10] If the answer is no the score & the number of attempts is displayed. It displays the message “Thank you for playing! GoodBye.” After which the Scanner is closed to release system resources.


Task 2 : Word Counter
Task Details :
1. Prompt the user to enter a text or provide a file to count the words. 
2. Read the input text or file and store it in a string. 
3. Split the string into an array of words using space or punctuation as delimiters. 
4. Initialize a counter variable to keep track of the number of words. 
5. Iterate through the array of words and increment the counter for each word encountered. 
6. Display the total count of words to the user. 
You can further enhance the project by adding features such as: 
7. Ignoring common words or stop words. 
8. Providing statistics like the number of unique words or the frequency of each word. 
9. Implementing input validation to handle empty inputs or file errors. 
10. Adding a graphical user interface (GUI) for a more user-friendly experience.

Explanation of Code :
1] The program starts with importing necessary classes - HashMap, Map, and Scanner.
2] The code defines a class called wordCounter. It contains the main method, which serves as the entry point of the program, and several helper methods getTextFromUser, readFile, countWords, and displayWordCount to perform specific tasks.
3] The main method starts by calling the getTextFromUser method to get the input text from the user, either by manual entry or from a file. If the input is valid, it proceeds to count the words using the countWords method and then displays the word count using the displayWordCount method.
4] getTextFromUser method prompts the user to choose between manual entry or providing a file path. If the user chooses to enter the text manually, they can type the text, and it is returned as a string. If the user chooses to provide a file path, the method reads the file and returns its content as a string.
5] readFile method takes a file path as input and reads the content of the file. If the file exists, it reads the content line by line and appends it to a StringBuilder. The file content is returned as a string.
6] countWords method takes the input text as a string and performs word counting. It first splits the text into words using a regular expression (\\s+|\\p{Punct}), which splits the text by spaces or punctuation. Then, it counts the frequency of each word and stores the results in a HashMap. The word count is case-insensitive by converting all words to lowercase.
7] displayWordCount method takes the wordCount map as input, which contains the frequency of each word. It iterates over the map and displays each word along with its count. It also calculates and displays the total word count.


Task 3 : ATM Interface
Task Details : 
1.Create a class to represent the ATM machine. 
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and checking the balance. 
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance(). 
4. Create a class to represent the user's bank account, which stores the account balance. 
5. Connect the ATM class with the user's bank account class to access and modify the account balance. 
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals). 
7. Display appropriate messages to the user based on their chosen options and the success or failure of their transactions.

Explanation of Code :
1] BankAccount class represents a bank account. It has a private instance variable balance to store the account balance.
2] The constructor BankAccount(double initialBalance) initializes the account balance with the provided initialBalance.
3] getBalance() method returns the current account balance.
4] deposit(double amount) method allows depositing money into the account, updating the account balance accordingly.
5] withdraw(double amount) method allows withdrawing money from the account. If the amount is less than or equal to the current balance, it deducts the amount from the balance. Otherwise, it displays an "Insufficient balance!" message.
6] ATM class represents the ATM interface. It has a private instance variable bankAccount to store the associated bank account.
7] The constructor ATM(BankAccount bankAccount) initializes the ATM with the provided bankAccount.
8] displayMenu() method displays the options available to the user, such as checking balance, deposit, withdraw, and exit.
9] processOption(int option) method inside ATM class takes the user's selected option as input and processes it accordingly. It uses a switch statement to handle different options.
When the user selects option 1, it displays the current account balance.
Option 2 allows the user to deposit money into the account. It prompts the user for the deposit amount and calls the deposit method of the associated bank account to update the balance.
Option 3 allows the user to withdraw money from the account. It prompts the user for the withdrawal amount and calls the withdraw method of the associated bank account to update the balance. If the withdrawal amount exceeds the available balance, it displays an error message.
Option 4 is for exiting the ATM. It displays a goodbye message and exits the program using System.exit(0).
10] ATMInterface class main class of the program, where the main method is defined.
It creates an instance of BankAccount with an initial balance of 1000000.0. It then creates an instance of ATM, passing the BankAccount instance to it.
The program enters into a loop where it displays the ATM menu, reads the user's choice, and processes the chosen option using the ATM object.
