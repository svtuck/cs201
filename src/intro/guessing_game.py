import random


def check(guess, magic_number):
    # We can pull this next part into a function, this becomes 'static' in Java
    if guess > magic_number:
        print("Too high, guess again: ")
        done = False
    elif guess < magic_number:
        print("Too low, guess again: ")
        done = False
    else:
        print("Correct!")
        done = True
    return done


print('Welcome to the guessing game')
# Generate a secret number, yes you can use randint
magic_number = (int) (random.random() * 100) + 1

# Print the number
print("shh, the magic number is: ", magic_number)

# Prompt user for input
print("Guess a number: ")

done = False
# Until they guess the correct number, give them high/low prompts and repeat
while not done:
    guess = int(input())
    done = check(guess, magic_number)
