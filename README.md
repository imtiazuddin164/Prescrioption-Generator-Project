# Prescription Generator System

A comprehensive web-based prescription management system built with Spring Boot and Thymeleaf, designed for healthcare professionals to efficiently create, manage, and track patient prescriptions.

## 🚀 Features

- **Prescription Management**: Create, view, edit, and delete prescriptions
- **Patient Records**: Maintain patient information and medical history
- **Daily Reports**: Generate day-wise prescription reports
- **Secure Access**: User authentication and authorization
- **Print & Export**: Print prescriptions and export to PDF
- **Responsive Design**: Clean, professional interface accessible on all devices

## 🛠️ Technology Stack

- **Backend**: Spring Boot 3.x, Spring Security, Spring Data JPA
- **Frontend**: Thymeleaf, Bootstrap 5, HTML5, CSS3
- **Database**: MySQL
- **Build Tool**: Maven
- **Java Version**: 17 or higher

## 📋 Prerequisites

Before running this project, ensure you have the following installed:

- Java 17 or higher
- MySQL Server 8.0 or higher
- Maven 3.6 or higher
- Git

## 🚀 Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/imtiazuddin164/Prescrioption-Generator-Project.git
cd Prescrioption-Generator-Project
```

### 2. Database Configuration

Create a MySQL database named `prescription_db`:

```sql
CREATE DATABASE prescription_db;
```

### 3. Configure Application Properties

Update the `src/main/resources/application.properties` file with your database credentials:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/prescription_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# Server Configuration
server.port=8080

# Thymeleaf Configuration
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.mode=HTML
spring.thymeleaf.encoding=UTF-8
spring.thymeleaf.servlet.content-type=text/html
spring.thymeleaf.cache=false
```

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

Alternatively, you can run the JAR file:

```bash
java -jar target/prescription-generator-0.0.1-SNAPSHOT.jar
```

## 📖 Usage

### Access the Application

Open your web browser and navigate to:
```
http://localhost:8080/prescriptions
```

### Default Login

The application uses Spring Security. You'll need to configure users in the `SecurityConfig.java` file or set up a proper user service.

### Basic Workflow

1. **View Prescriptions**: Access the main dashboard to see all prescriptions
2. **Create New Prescription**: Click "New Prescription" to create a new record
3. **Filter Records**: Use date filters to find specific prescriptions
4. **Generate Reports**: Access daily reports from the main dashboard
5. **Print/Export**: Use print and PDF export features for individual prescriptions

## 🗂️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── prescription/
│   │           ├── controller/     # Spring MVC Controllers
│   │           ├── entity/         # JPA Entities
│   │           ├── repository/     # Data Access Layer
│   │           ├── service/        # Business Logic Layer
│   │           └── config/         # Configuration Classes
│   └── resources/
│       ├── templates/              # Thymeleaf HTML files
│       ├── static/                 # CSS, JS, Images
│       └── application.properties  # Application Configuration
```

## 🔧 Key Endpoints

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/prescriptions` | GET | Main dashboard with all prescriptions |
| `/prescriptions/new` | GET | Form to create new prescription |
| `/prescriptions` | POST | Save new prescription |
| `/prescriptions/edit/{id}` | GET | Edit existing prescription |
| `/prescriptions/update/{id}` | POST | Update prescription |
| `/prescriptions/view/{id}` | GET | View prescription details |
| `/prescriptions/delete/{id}` | POST | Delete prescription |
| `/reports/daily` | GET | Daily prescription reports |
| `/login` | GET | Login page |
| `/logout` | POST | Logout user |

## 📊 Database Schema

The main entity `Prescription` includes:
- Patient information (name, age, gender)
- Prescription details (date, diagnosis, medicines)
- Medical follow-up (next visit date)
- Timestamps for auditing

## 🎨 UI Features

- **Responsive Design**: Works on desktop, tablet, and mobile
- **Professional Styling**: Clean, medical-themed interface
- **Interactive Elements**: Hover effects, form validation
- **Print Optimization**: CSS optimized for printing prescriptions
- **PDF Export**: Generate downloadable PDF versions

## 🔒 Security

- Spring Security for authentication
- CSRF protection enabled
- Secure session management
- Password encryption

## 🚀 Deployment

### For Development:
```bash
mvn spring-boot:run
```

### For Production:
1. Build the JAR file:
```bash
mvn clean package
```

2. Deploy the JAR to your server:
```bash
java -jar prescription-generator-0.0.1-SNAPSHOT.jar
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Imtiaz Uddin**
- GitHub: [@imtiazuddin164](https://github.com/imtiazuddin164)

## 🙏 Acknowledgments

- Spring Boot team for the excellent framework
- Bootstrap team for the responsive CSS framework
- Thymeleaf team for the templating engine

## 📞 Support

If you have any questions or run into issues, please create an issue in the GitHub repository.
