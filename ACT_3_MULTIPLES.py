def getmulti():
    while True:
        try:
            multi = float(input("Enter A Multiple of 5 [1-100]: "))
            if 1 <= multi <= 100:
                return multi
            else:
                print("===========================================")
                print("Error! Please enter a multiple of 5 between 1 and 100.")
                print("===========================================")
        except ValueError:
            print("Invalid input. Please enter a number.")

def main():
    while True:
        multi = getmulti()
        if multi % 5 == 0:
            print("\n===========================================\n")
            print(f"{multi} is a multiple of 5.")
        else:
            print("\n===========================================\n")
            print(f"{multi} is not a multiple of 5.")

if __name__ == "__main__":
    main()