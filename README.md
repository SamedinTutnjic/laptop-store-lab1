# 💻 Laptop Store – Spring Boot MVC & JPA (Lab 2)

Projekt iz Lab 1 je proširen i doveden na nivo Lab 2 prema zahtjevima za Web programiranje. U ovoj verziji je urađena potpuna integracija MVC-a, JPA-e i H2 baze.

## 👥 Članovi tima

* **Samedin Tutnjić**
* **Feda Coloman**

---

# 🏷️ Naziv aplikacije

**Laptop Store – Evidencija laptopa, kupaca i dodatne opreme**
(Spring Boot + JPA + Thymeleaf)

---

# 🔥 Šta je urađeno u Labu 2

### ✔️ H2 in-memory baza

Aplikacija koristi H2 bazu, automatski kreira tabele i puni ih početnim podacima.

### ✔️ JPA entiteti

#### 🧍 Customer

* id, name, email, phone, city

#### 💻 Laptop

* brand, model, cpu, ram, storage, price, stock
* ManyToOne relacija prema kupcu

#### 🎧 Accessory

* memorijski model

### ✔️ Relacija 1:N

Kupac može imati više laptopa.
Laptop sadrži `customer_id`.

### ✔️ REST API

Ruta: `/api/customers`

* GET – lista kupaca
* GET/{id} – jedan kupac
* POST – dodavanje kupca

### ✔️ UI za Customer

Stranice za pregled, dodavanje, uređivanje i brisanje kupaca.

---

# 🧩 Modeli

## Customer

ID, Name, Email, Phone, City

## Laptop

Brand, Model, CPU, RAM, Storage, Price, Stock, Customer

## Accessory

Lista dodatne opreme (memorijski model).

---

# 🗄️ H2 Baza

H2 konzola:
👉 `http://localhost:8080/h2-console`

```
JDBC URL: jdbc:h2:mem:laptop_store_db
User: sa
Pass: 
```

Početni podaci se dodaju u `DbSeed.java`.

---

# 🌐 REST – Customers

| Metoda | Ruta                | Opis            |
| ------ | ------------------- | --------------- |
| GET    | /api/customers      | svi kupci       |
| GET    | /api/customers/{id} | jedan kupac     |
| POST   | /api/customers      | dodavanje kupca |

---

# 🎨 UI Stranice

* laptops.html
* customers.html
* customer-form.html
* accessories.html
* laptop-action.html

---

# 🖼️ Screenshoots

## 📍 Customers – lista kupaca

<img width="3420" height="1242" src="https://github.com/user-attachments/assets/8b5577b3-abed-4199-b935-9618ff54a725" />

## 📍 Laptopi – inventura

<img width="3415" height="1216" src="https://github.com/user-attachments/assets/bed97b90-9927-4048-bd45-665c44de7666" />

## 📍 Accessories – inventura

<img width="3401" height="1126" src="https://github.com/user-attachments/assets/fbdae889-b0c6-4207-b153-748a90d29cce" />

## 📍 H2 Baza

<img width="1388" height="677" src="https://github.com/user-attachments/assets/64651b46-1ced-4f55-a47a-ec6eeb7aef11" />

---

# ▶️ Pokretanje

```bash
mvn spring-boot:run
```

Laptopi:
👉 `http://localhost:8080/laptops`

H2 baza:
👉 `http://localhost:8080/h2-console`
