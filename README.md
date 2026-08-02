# Students-Management

- The application enables users to perform basic student management operations, including creating, viewing, updating, and deleting student records through a RESTful API. In addition to CRUD functionality, the application integrates with a Python-based AI prediction service. By submitting student information such as grades and attendance, users can receive a prediction about the student's expected academic performance. This demonstrates how Android applications can communicate with machine learning services through HTTP requests and JSON data exchange.

- For Project Details --> https://chatgpt.com/s/t_6a5e911f2d888191a2118fb5f291653b
---

## 📱 Features

- View all students
- Add a new student
- Update student information
- Delete students
- Request AI prediction from a Python server
- Display prediction results
- Handle loading and error states
- Follow MVVM Architecture

---

# 👥 Team Responsibilities

## 👨‍💻 Student 1 — UI Developer

### Responsibilities

- Design all screens
- Build reusable Compose components
- Navigation
- Input validation
- Connect UI to ViewModel

### Tasks

- [x] Create MainActivity
- [x] Create Navigation Graph
- [x] Create Student List Screen
- [x] Create Add Student Screen
- [x] Create Update Student Screen
- [x] Create Prediction Screen
- [x] Create Student Card Component
- [ ] Create Loading Indicator
- [ ] Create Error Dialog
- [x] Display prediction results

---

## 👨‍💻 Student 2 — ViewModel Developer

### Responsibilities

- Business Logic
- UI State Management
- Connect UI with Repository

### Tasks

- [ ] Create StudentViewModel
- [ ] Manage student list state
- [ ] Manage loading state
- [ ] Manage prediction state
- [ ] Manage error state
- [ ] Implement getStudents()
- [ ] Implement addStudent()
- [ ] Implement updateStudent()
- [ ] Implement deleteStudent()
- [ ] Implement predictStudent()
- [ ] Handle exceptions
- [ ] Write ViewModel tests

---

## 👨‍💻 Student 3 — Networking Developer

### Responsibilities

- Retrofit
- API Interface
- HTTP Communication

### Tasks

- [ ] Configure Retrofit
- [ ] Configure OkHttp
- [ ] Configure Logging Interceptor
- [ ] Create ApiService
- [ ] Implement GET endpoint
- [ ] Implement POST endpoint
- [ ] Implement PUT endpoint
- [ ] Implement DELETE endpoint
- [ ] Implement Prediction endpoint
- [ ] Configure JSON Serialization
- [ ] Handle HTTP errors
- [ ] Test all API requests using Postman

---

## 👨‍💻 Student 4 — Repository Developer

### Responsibilities

- Data Layer
- Repository Pattern
- Error Handling

### Tasks

- [ ] Create StudentRepository
- [ ] Implement getStudents()
- [ ] Implement addStudent()
- [ ] Implement updateStudent()
- [ ] Implement deleteStudent()
- [ ] Implement predictStudent()
- [ ] Handle Result wrapper
- [ ] Handle network exceptions
- [ ] Return data to ViewModel
- [ ] Write repository tests

---

## 👨‍💻 Student 5 — Model Developer

### Responsibilities

- Data Models
- Utility Classes
- Validation

### Tasks

- [x] Create Student model
- [x] Create PredictionRequest model
- [x] Create PredictionResponse model
- [x] Create ApiResponse model
- [ ] Create Constants object
- [x] Create ValidationUtils
- [x] Add documentation to all models
- [ ] Ensure JSON serialization compatibility

---
