# Hospital Management System (HMS) 🏥

A robust console-based Java application designed to streamline hospital administration tasks, including patient registration, record tracking, and personnel details management.

---

## 📂 Project Structure

This project consists of the following core Java classes:
- **`Hospital_Main_Menu.java`**: The main entry point and console user interface managing core navigation loops and loops for patient operations.
- **`Person.java`**: An abstract base class defining common attributes and getters/setters for individuals in the system.
- **`Patient.java`**: A subclass of `Person` handling patient-specific attributes like medical insurance status and blood type.
- **`Doctor.java`**: A subclass of `Person` managing doctor-specific attributes like roles, shift schedules, experience, and salary.

---

## 🚀 Setup & Execution Guide (Visual Studio Code)

Follow these step-by-step instructions to download, open, and run the project inside **Visual Studio Code (VS Code)**.

### Step 1: Prerequisites
Make sure you have the following installed on your machine:
1. **Java Development Kit (JDK)** (Version 11 or higher recommended). Verify installation by typing `java -version` in your terminal.
2. **Visual Studio Code (VS Code)**.
3. **Extension Pack for Java** in VS Code (provides essential tools for compiling and running Java code).

### Step 2: Download the Files
1. Create a brand new folder on your computer (e.g., name it `HospitalManagementSystem`).
2. Download or copy all four source code files (`Hospital_Main_Menu.java`, `Person.java`, `Patient.java`, and `Doctor.java`) into this folder.

### Step 3: Open the Project in VS Code
1. Open **Visual Studio Code**.
2. Click on **File** > **Open Folder...** (or press `Ctrl+K` then `Ctrl+O` on Windows / `Cmd+O` on macOS).
3. Select and open the `HospitalManagementSystem` folder containing your Java files.
4. If VS Code prompts you to install missing dependencies or configure Java projects, click **Allow** or **Install**.

### Step 4: Run the Application
1. In the VS Code Explorer sidebar on the left, click on **`Hospital_Main_Menu.java`**.
2. Look at the top or side of the editor window for the **Run** button (a small play icon ▶️ near the `main` method), or press `Ctrl+F5` / `F5`.
3. The integrated terminal panel will launch at the bottom of VS Code, displaying the interactive **Hospital Management System** main menu. Enjoy testing the features!