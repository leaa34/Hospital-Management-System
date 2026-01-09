# Hospital-Management-System
-- Project Overview--
This Java application is a medical triage system that prioritizes patients based on the severity of their condition. It demonstrates core software engineering principles like Object-Oriented Programming (OOP), Data Structures, and Robust Error Handling.

-- Technical Features--
-Priority-Based Triage: Implemented a PriorityQueue with a custom Comparator to automatically sort patients by a severity scale.

-Defensive Programming: Utilized a global try-catch block to handle InputMismatchException, preventing crashes from non-numeric input.

-Scanner Buffer Management: Used scan.nextLine() in the catch block to clear invalid input and prevent infinite loops.

-Data Integrity: Designed the logic to use temporary copies during display, ensuring original records remain sorted and intact.

-- Skills Demonstrated--
Language: Java.

Version Control: Used GitHub for tracking development stages and error fixes.

Problem Solving: Choosing the correct data structure (PriorityQueue) for medical triage.
