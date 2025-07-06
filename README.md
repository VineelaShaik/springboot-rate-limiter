# ⚡ Spring Boot Rate Limiter - Sliding Window Algorithm

A basic backend project built with **Spring Boot** that limits user API requests using the **Sliding Window Rate Limiting algorithm**.

This project helps protect your APIs from being overloaded by limiting the number of requests a user can make in a fixed time window (e.g., 5 requests per 10 seconds).



## 📌 Features

- ✅ RESTful API built with Spring Boot
- ⏳ Sliding Window algorithm for accurate rate-limiting
- 👤 User-specific request tracking (via `userId`)
- 🧠 In-memory storage (no DB required)
- 🛡️ Returns proper status messages (`Allowed` / `Too many requests`)
- 🚀 Ready to test with Postman or curl




## 📁 Project Structure
```
ratelimit/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── net/
│ │ │ └── ratelimit/
│ │ │ └── ratelimit/
│ │ │ ├── RatelimitApplication.java # Spring Boot main class
│ │ │ ├── RateLimiterController.java # REST Controller
│ │ │ └── RateLimiterService.java # Rate limiting logic
│ └── resources/
│ └── application.properties
├── pom.xml
└── README.md
```


## 🚀 Getting Started

### ✅ Prerequisites

- Java 17 or later
- Maven 3.8+
- IDE (IntelliJ / VS Code) or terminal
- (Optional) Postman for testing



# 🔧 Setup & Run


## Clone the project
```
git clone https://github.com/vineelashaik/springboot-rate-limiter.git
cd springboot-rate-limiter
```

## Build the project
```mvn clean install```

## Run the app
```mvn spring-boot:run```

# 🌐 API Usage

## ▶️ Endpoint

``` GET http://localhost:8080/api/check?userId=vineela```


Parameter	   - userId  

Type	       -String  

Description  -Unique identifier per user  





# 🧪 Testing in Postman
1.Run your app.

2.Open Postman.

3.Create a GET request:

```http://localhost:8080/api/check?userId=testuser```

4.Repeat the request multiple times within 10 seconds.



# ✅ Sample Responses

"Allowed" – if within limit


![Screenshot 2025-07-06 095722](https://github.com/user-attachments/assets/fa6711fe-4e05-4355-8491-ae36eeb1ec58)


"Too many requests" – if limit exceeded


![Screenshot 2025-07-06 095737](https://github.com/user-attachments/assets/b8040784-bee9-4f46-804b-2a8318d06a40)




# 💡 Concepts Covered
Spring Boot (@RestController, @Service, @GetMapping, Dependency Injection)

Java Collections (HashMap, List, removeIf)

Timestamp-based Sliding Window logic

RESTful API Design

Rate Limiting Pattern (used by APIs like Twitter, Stripe, etc.)


## 👩‍💻 Author
Vineela Shaik
