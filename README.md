# 🔐 Password Strength Analyzer

A Java console application that analyzes the strength of user-entered passwords and generates secure random passwords. The project is built using Object-Oriented Programming (OOP) principles with a clean, modular architecture.

---

## Features

- Analyze password strength
- Detect uppercase letters
- Detect lowercase letters
- Detect numbers
- Detect special characters
- Check minimum password length
- Generate a password score
- Provide improvement suggestions
- Generate secure random passwords of a user-specified length
- Randomize generated passwords using the Fisher-Yates Shuffle algorithm
- Menu-driven console interface

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- IntelliJ IDEA
- Git & GitHub

---

## Project Structure

```
src/
├── Main.java
├── Menu.java
├── PasswordAnalyzer.java
└── PasswordGenerator.java
```

---

## Sample Output

```
Main Menu
=================================================
           PASSWORD STRENGTH ANALYZER
=================================================

1. Analyze Password
2. Generate Password
0. Exit

Enter choice: 1

=================================================
               PASSWORD ANALYSIS
=================================================

Enter Password: hello123

-------------- ANALYSIS RESULTS -----------------

Password Score: 3/5
Strength      : Moderate

Suggestions:
- Add at least one uppercase letter (A-Z).
- Add at least one special character (!, @, #, ...).

-------------------------------------------------
1. Analyze Password
2. Generate Password
0. Exit

Enter choice: 2
=================================================
               PASSWORD GENERATOR
=================================================

Enter desired password length (minimum 8): 12

------------- GENERATED PASSWORD ----------------

Generated Password: @K7m!Pq2#XaL

-------------------------------------------------
```

---

## Future Improvements

- Detect commonly used passwords
- Store password history
- Export analysis results to file
- MySQL integration

---

## Author

Shloka Patel
