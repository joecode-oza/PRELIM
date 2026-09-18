def no_strings(prompt):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("Invalid input. Please enter a valid number.")

total = 0

numprice = 2

for x in range(1, numprice + 1):
    price = no_strings(f"Enter item {x} price: ")
    total += price

payment = no_strings("Enter your payment: ")
    

while True:
    if payment >= total:
        change = payment - total
        print("\n===========================================\n")
        print(f"Your change is: ${change:.2f}")
        print("Thank you for you purchase!\n")
        break
    else:
        print("\n===========================================\n")
        print("Insufficient payment. Please pay the correct amount.")
        payment = no_strings("Enter your payment: ")
