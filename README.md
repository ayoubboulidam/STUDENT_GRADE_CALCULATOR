# STUDENT_GRADE_CALCULATOR

## Description

`STUDENT_GRADE_CALCULATOR` is a simple Java application designed to help users manage subjects, input marks, and calculate the average percentage. The application follows the Model-View-Controller (MVC) design pattern, ensuring a clear separation between the application's logic, user interface, and control flow.

## Project Structure

- **Controller**: Manages the flow of data between the model and the view.
- **Model**: Stores subjects and their corresponding marks, and performs calculations.
- **View**: Displays subjects, marks, and the average percentage to the user.

## Classes and Their Responsibilities

### SubjectController

The `SubjectController` class is responsible for:

- Managing the addition of subjects and marks.
- Coordinating the display of subjects, marks, and the average percentage through the view.

### SubjectModel

The `SubjectModel` class is responsible for:

- Storing the list of subjects and their corresponding marks.
- Calculating the average mark.

### SubjectView

The `SubjectView` class is responsible for:

- Displaying the list of subjects.
- Displaying the marks for each subject.
- Displaying the average percentage of marks.

### Main

The `Main` class is responsible for:

- Initializing the MVC components (model, view, controller).
- Adding subjects.
- Prompting the user to enter marks for each subject.
- Displaying the subjects, marks, and the average percentage.

## Usage

1. **Initialize MVC Components**: Create instances of `SubjectModel`, `SubjectView`, and `SubjectController`.
2. **Add Subjects**: Use the controller to add subjects to the model.
3. **Enter Marks**: Prompt the user to enter marks for each subject.
4. **Display Results**: Use the controller to display the list of subjects, the marks, and the average percentage.

## Example

1. The application adds a list of subjects such as Mathematics, English, Physics, etc.
2. It prompts the user to enter marks for each subject.
3. The subjects, marks, and the average percentage are displayed to the user.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- A terminal or command prompt to run the application.

## How to Run

1. Compile the Java files:
   ```sh
   javac Main.java
   ```
2. Run the application:
   ```sh
   java Main
   ```

Follow the prompts to enter marks for each subject. The application will then display the subjects, marks, and the calculated average percentage.

## Contributions

Contributions are welcome! Feel free to open an issue or submit a pull request with improvements.
```
