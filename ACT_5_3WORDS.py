def strings_only(prompt):
    while True:
        word = input(prompt)
        if word.isalpha():
            return word
        else:
            print("Invalid input. Please enter letters only (No numbers or special characters): ")

            
def main():
    words = []
    print("\n=======================================================\n")
    for i in range(3):
        word = strings_only(f"Type in word {i+1}: ")
        words.append(word)

    last_word = words[2]
    sorted_word = sorted(last_word)
    print("\n=======================================================\n")
    print(f"Last word alphabetically arranged: ", "" .join(sorted_word))

if __name__ == '__main__':
    main()