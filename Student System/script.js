let students = [];

// Add mouseover and mouseout events to all buttons
document.querySelectorAll('button').forEach(button => {
    button.addEventListener('mouseover', () => {
        button.style.backgroundColor = 'lightblue';  // Change to your desired color
    });
    button.addEventListener('mouseout', () => {
        button.style.backgroundColor = '';  // Reset to the original color
    });
});

// Helper function to convert input to sentence case
function sentenceCase(str) {
    return str.charAt(0).toUpperCase() + str.slice(1).toLowerCase();
}

// Function to add a new student
function addStudent() {
    const name = prompt("Enter student's name:");
    const age = prompt("Enter student's age:");
    const grade = prompt("Enter student's grade:");

    if (name && age && grade) {
        students.push({
            name: sentenceCase(name),
            age: parseInt(age),
            grade: parseInt(grade)
        });
        alert("Student added successfully!");
    } else {
        alert("All fields are required.");
    }
}

// Function to view all students
function viewStudents() {
    if (students.length === 0) {
        document.getElementById('studentList').innerHTML = "No students available.";
        return;
    }

    let table = `<table>
                    <tr>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Grade</th>
                    </tr>`;

    students.forEach((student, index) => {
        table += `<tr>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                    <td>${student.grade}</td>
                  </tr>`;
    });

    table += `</table>`;
    document.getElementById('studentList').innerHTML = table;
}

// Function to sort students by grade in descending order
function sortStudents() {
    students.sort((a, b) => b.grade - a.grade);
    viewStudents();  // Re-display students after sorting
}

// Function to delete a student after confirmation
function deleteStudent() {
    const nameToDelete = prompt("Enter the name of the student to delete:");

    const index = students.findIndex(student => student.name.toLowerCase() === nameToDelete.toLowerCase());

    if (index !== -1) {
        const confirmation = confirm(`Are you sure you want to delete ${students[index].name}?`);
        if (confirmation) {
            students.splice(index, 1);
            alert("Student deleted successfully.");
        }
    } else {
        alert("Student not found.");
    }
    
    viewStudents();  // Re-display students after deletion
}
