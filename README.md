🚀 Portfolio Backend API
Welcome to the backend repository for my personal portfolio website! This is a Spring Boot application that handles contact form submissions, email notifications, and data storage.

🛠️ Technologies Used
🖥️ Spring Boot – Backend framework

🐳 Docker – Containerization for easy deployment

🗄️ MySQL (hosted on Railway) – Database management

📧 JavaMail (SMTP) – Sending emails via Gmail SMTP

🧪 JUnit – Testing framework

🔄 GitHub – Source control and versioning

☁️ Render – Hosting backend service 24/7

⚙️ Features
💬 Receive and store contact form submissions

📩 Send email notifications automatically on form submit

🔐 Secure handling of sensitive environment variables with .env

📦 Dockerized app for consistent deployment

🔄 Smooth integration with frontend via REST APIs

🚀 Getting Started
Prerequisites
Java 17+

Maven or use the included ./mvnw wrapper

Docker (optional, for containerized deployment)

Setup
Clone the repo:

bash
Copy
Edit
git clone https://github.com/gk1106/gk-backend.git
Create a .env file in the root with your credentials:

env
Copy
Edit
DB_URL=jdbc:mysql://your-db-url
DB_USERNAME=your-username
DB_PASSWORD=your-password
EMAIL_USERNAME=your-email@gmail.com
EMAIL_PASSWORD=your-email-app-password
Build the project:

bash
Copy
Edit
./mvnw clean package -DskipTests
Run locally:

bash
Copy
Edit
java -jar target/portfolio-0.0.1-SNAPSHOT.jar
Or run via Docker:

bash
Copy
Edit
docker build -t portfolio-backend .
docker run -p 8089:8089 portfolio-backend
🔗 Links
Frontend repo: [https://github.com/gk1106/gk]

Backend repo: [https://github.com/gk1106/gk-backend]

Live Website : [https://gk-wheat.vercel.app/]

🌟 Support
If you like this project, please ⭐ star the repo and share it with others!
Your support motivates me to keep improving.

🙌 Contact
Feel free to reach out for questions or collaborations!
