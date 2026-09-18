def display_menu():
    print("\n==================ARITHMETIC CALCULATOR=====================")
    print("1. Addition          2. Subtraction       3. Multiplication")
    print("4. Division          5. Modulus           6. Increment")
    print("7. Decrement")
    print("============================================================")
# display menu function para madisplay yung menu
def main():
    while True:
        display_menu()

        while True:
# Second while True loop to validate the user input for the menu selection using nested match case
            choice = input("\nSelect an arithmetic operation: ")
            if choice in ('1', '2', '3', '4', '5', '6', '7'):
                break
            print("Error: Invalid menu option. Please select a number from 1 to 7.")
            print("===============================================================")

        match choice:
            case '1' | '2' | '3' | '4' | '5':
                x = float(input("Enter the value of x: "))
                y = float(input("Enter the value of y: "))
                print("\n===============================================================")
                print(f"\nVariable Values: x = {x}, y = {y}")
# 2nd match case to separate operations that requires 2 variables to 1 variable arithmetic operation .
                match choice:
                    case '1':
                        result = x + y
                        print(f"ADDITION: x + y = {result}")
                        print("\n===============================================================")
                    case '2':
                        result = x - y
                        print(f"SUBTRACTION: x - y = {result}")
                        print("\n===============================================================")
                    case '3':
                        result = x * y
                        print(f"MULTIPLICATION: x * y = {result}")
                        print("\n===============================================================")
                    case '4':
                        if y == 0:
                            print("Error: Division by zero is not allowed.")
                        else:
                            print(f"DIVISION: x / y = {x / y:.6f}")
                            print("\n===============================================================")
                    case '5':
                        if y == 0:
                            print("Error: Modulus by zero is not allowed.")
                        else:
                            print(f"MODULUS: x % y = {x % y}")
                            print("\n===============================================================")
            case '6' | '7':
                x = float(input("Enter the value of x: "))
                print(f"\nVariable Value: x = {x}")

                match choice:
                    case '6':
                        x+=1
                        print(f"INCREMENT: x + 1 = {x}")
                    case '7':
                        x-=1 
                        print(f"DECREMENT: x - 1 = {x}")

        # Ask to continue or not
        answer = input("\nDo you want to continue? (YES/NO): ").strip().upper()
        while answer not in ('YES', 'NO'):
            answer = input("Please enter YES or NO: ").strip().upper()
        
        if answer == 'NO':
            print("\nThank you for using the Arithmetic Calculator. Goodbye!\n")
            break
# INDENTION!!!!!

if __name__ == "__main__":
    main()