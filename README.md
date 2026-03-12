Naagarik Feedback System

Naagarik Feedback System is a web-based platform where citizens can provide feedback directly to the government. It promotes transparency, civic engagement, and helps authorities receive suggestions, complaints, or appreciations from the public.

Tech Stack:
- Backend: Spring Boot (Java)
- Frontend: HTML, CSS, JavaScript
- Database: MySQL

Features:
- Submit feedback anonymously or with login
- Admins can view and manage feedback
- Role-based access control (User/Admin)
- REST API for frontend-backend interaction
- Unit testing, Selenium testing

Project Structure: 
```
NaagarikFeedback/
├── com.NaagarikFeedback.naagrikFeedback/
│   ├── controller/                    → Admin, User, Public, and Feedback controllers
│   ├── entity/                        → User and Feedback entities
│   ├── repository/                    → Spring Data JPA repositories
│   ├── service/                       → Services / business logic
│   └── NaagarikFeedbackApplication/   → Main Spring Boot application
├── resources/static/
│   ├── index.html                     → Home page
│   ├── edit-feedback.html             → Home page
│   ├── add-feedback.html              → Home page
│   └── feedback-list.html             → Styling and interactivity
└────── application.properties
```
Getting Started:

Backend Setup:
1. Clone the repository
2. Open the 'backend/' as a Maven project
3. Set your database in `application.properties`:
   spring.datasource.url=jdbc:mysql://localhost:3306/naagarik_db  
   spring.datasource.username=root  
   spring.datasource.password=admin  
   spring.jpa.hibernate.ddl-auto=update  
4. Run the Spring Boot application

Frontend Setup:
1. Open `frontend/index.html` in your browser
2. Make sure the API URLs match your backend configuration

📷 Screenshots
<img width="1899" height="966" alt="Screenshot 2025-08-30 201230" src="https://github.com/user-attachments/assets/56d38d3f-1fa2-410c-9d12-fed10c417018" />
<img width="1637" height="869" alt="Screenshot 2025-08-30 201328" src="https://github.com/user-attachments/assets/ac122197-5f02-4ce7-9a28-65c5d2c31f85" />
<img width="1915" height="949" alt="Screenshot 2025-08-30 201343" src="https://github.com/user-attachments/assets/20086103-330b-4e35-9901-b437935304a1" />
<img width="1668" height="844" alt="Screenshot 2025-08-30 201412" src="https://github.com/user-attachments/assets/00ae6c58-8b16-4ec8-a052-d7cc11ce2268" />
<img width="1376" height="854" alt="Screenshot 2025-08-30 201431" src="https://github.com/user-attachments/assets/9dcdf4db-3c9f-4b59-b929-57a314dd0e75" />

