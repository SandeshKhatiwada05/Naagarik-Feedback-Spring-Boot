📢 Naagarik Feedback System

Naagarik Feedback System is a web-based platform where citizens 🧑‍🤝‍🧑 can provide feedback directly to the government 🏛️. It promotes transparency, civic engagement, and helps authorities receive suggestions, complaints, or appreciations from the public.

🛠️ Tech Stack:
- ⚙️ Backend: Spring Boot (Java)
- 🎨 Frontend: HTML, CSS, JavaScript
- 🗄️ Database: MySQL

✨ Features:
- 🗣️ Submit feedback anonymously or with login
- 🧾 Admins can view and manage feedback
- 🔐 Role-based access control (User/Admin)
- 🔄 REST API for frontend-backend interaction

📁 Project Structure:
```
NaagarikFeedback/
├── backend/
│   ├── controller/                    → Admin, User, Public, and Feedback controllers
│   ├── entity/                        → User and Feedback entities
│   ├── repository/                    → Spring Data JPA repositories
│   ├── service/                       → Services / business logic
│   └── NaagarikFeedbackApplication/   → Main Spring Boot application
├── frontend/
│   ├── index.html                     → Home page
│   ├── edit-feedback.html             → Home page
│   ├── add-feedback.html              → Home page
│   └── feedback-list.html             → Styling and interactivity
```
🚀 Getting Started:

🔧 Backend Setup:
1. Clone the repository
2. Open the 'backend/' as a Maven project
3. Set your database in `application.properties`:
   spring.datasource.url=jdbc:mysql://localhost:3306/naagarik_db  
   spring.datasource.username=root  
   spring.datasource.password=admin  
   spring.jpa.hibernate.ddl-auto=update  
4. Run the Spring Boot application

🌐 Frontend Setup:
1. Open `frontend/index.html` in your browser
2. Make sure the API URLs match your backend configuration

📷 Screenshots
![index](https://github.com/user-attachments/assets/b198d391-407a-4b9d-b924-f5246761031c)
![index](https://github.com/user-attachments/assets/b2352afa-87af-406c-a2b5-1d55aa4b059f)



💬 Feedback & Contribution:
If you'd like to suggest improvements or report bugs 🐞, feel free to open an issue or pull request!

---

👨‍💻 Made with passion by Sandesh Khatiwada 💻
