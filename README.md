# Exceptions.
## Level 1, task 1:

### 💡 Package name task1
⚙ Run:
- `task1.Main` class to start the program.
- `task1.OutOfBoundsFailure` class to demonstrate IndexOutOfBoundsException handled.

1. Main class (main method):
    - Attempts to calculate the price of an empty cart. Prints custom exception message.
    - Creates 2 products and add them to the cart.
    - Calculates the price of the cart and prints it.

2. OutOfBoundsFailure class (main method):
    - attempts to access a non-existing element of a string.
    - catches the IndexOutOfBoundsException and prints its message.

## Level 2, task 1:

### 💡 Package name task2
⚙ run `task2.Main` class to start the program.
1. Main class (main method):
    - Request the user to input different types of data.
    - Catches the InputMismatchException and prints its message.
    - Catches CustomEscapeException and prints its message.
      - For String and Char inputs, in the case the input is empty.
      - For Booleans, ony yes or no are accepted and returns true or false.
    