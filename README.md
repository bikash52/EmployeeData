# Employee Management System (Mini Version)

A simple Spring Boot + Hibernate + MySQL project to manage employee records with full CRUD operations and custom finder methods.

---

## 🧩 Entity: Employee

| Field | Type | Description |
|--------|------|-------------|
| id | int (PK) | Auto-generated |
| name | String | Employee full name |
| email | String | Unique |
| mobile | String | Unique |
| department | String | e.g. HR, IT, Finance |
| salary | double | Monthly salary |

---

## 🔧 Features

- Add new employee  
- Update employee details  
- Delete employee by ID  
- Get employee by ID  
- Get all employees  
- Finder methods:
  - `findByEmail(String email)`
  - `findByMobile(String mobile)`
  - `findByDepartment(String department)`
  - `findByEmailOrMobile(String email, String mobile)`

---

## ⚙️ Tech Stack

- Java  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- MySQL  
- JUnit  

---



