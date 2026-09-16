def get_score(prompt):
# function na magseset at magvavalidate na ang score ay within the range of 0 to 100
    while True:
        try:
            score = float(input(prompt))
            if 0 <= score <= 100:
                return score
            else:
                print("Please enter a score between 0 and 100.")
        except ValueError:
            print("Invalid input. Please enter a number.")


def get_letter_grade(average):
 
# function na magseset ng letter grade based on the average score

# walang while True loop dahil once na makuha ang average score then this function will be called
# at di na magloloop

    if average >= 90:
        return "A"
    elif average >= 80:
        return "B"
    elif average >= 75:
        return "C"
    else:
        return "F"

def get_yes_no(prompt):
# makes sure Yes or No answers only
    while True:
        choice = input(prompt).strip().upper()
        if choice in ("YES", "NO"):
            return choice
        else:
            print("Invalid input. Please enter YES or NO.")


def main():
    while True:

# main function na magrrun ng program at magccall sa ibang mga functions

        print("\n===== STUDENT GRADE CALCULATOR =====")
        java_score = get_score("Java Programming Score: ")
        c_score = get_score("C Programming Score: ")
        db_score = get_score("Database Handling Score: ")

        average = (java_score + c_score + db_score) / 3
        grade = get_letter_grade(average)

        print("\n====================================")
        print(f"Average: {average:.2f}")
        print(f"GRADE: {grade}")
        print("\n====================================")

#set the loop to ask the user if they want to continue or not

        choice = get_yes_no("\nDo you want to continue? (YES/NO): ")
        
        if choice == "NO":
            print("\nProgram terminated. Thank you!\n")
            break

# INDENTION IS VERY IMPORTANT! MAGINGAT! HAHAHAHA
if __name__ == "__main__":
    main()