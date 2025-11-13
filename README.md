Naravno — mogu ti ovo prepravljati da izgleda **jednostavnije, ljudskije i kao da si ti lično pisao**, bez AI stila. Zadržat ću strukturu, ali ću skratiti objašnjenja i učiniti tekst prirodnijim.

---

# 💻 Laptop Store – Spring Boot MVC & JPA (Lab 2)

Projekt iz **Lab 1** je proširen i doveden na nivo **Lab 2** prema zahtjevima za predmet *Web programiranje*. U ovoj verziji je urađena potpuna integracija MVC-a, JPA-e i H2 baze.

## 👥 Članovi tima

* **Samedin Tutnjić**
* **Feda Coloman**

---

# 🏷️ Naziv aplikacije

**Laptop Store – Evidencija laptopa, kupaca i dodatne opreme**
(Spring Boot + JPA + Thymeleaf)

---

# 🔥 Šta je urađeno u Labu 2

U odnosu na prvu verziju, Lab 2 dodaje funkcionalnosti koje aplikaciju pretvaraju u pravi mali inventurni sistem.

### ✔️ 1. H2 in-memory baza

Aplikacija sada radi sa **H2 bazom**, automatski generiše tabele i puni ih početnim podacima.

### ✔️ 2. Implementirani JPA entiteti

Dodani su kompletni modeli:

#### 🧍 Customer

* id, name, email, phone, city
* novi entitet uveden tek u Labu 2

#### 💻 Laptop

* proširen JPA model
* dodana veza prema kupcu: `@ManyToOne`

#### 🎧 Accessory

* ostaje jednostavni memorijski model

### ✔️ 3. Relacija 1:N (Customer – Laptop)

Jedan kupac može imati više laptopa.
Laptop tabela sada sadrži `customer_id`.

### ✔️ 4. REST API za kupce

Dostupno na /api/customers

* GET – lista kupaca
* GET/{id} – pojedinačni kupac
* POST – dodavanje kupca

### ✔️ 5. UI stranice za Customer

Dodane su stranice za pregled, unos, uređivanje i brisanje kupaca.

---

# 🧩 Modeli

## Customer

* ID
* Name
* Email
* Phone
* City

## Laptop

* Brand
* Model
* CPU
* RAM
* Storage
* Price
* Stock
* Customer (ManyToOne)

## Accessory

Jednostavna lista dodatne opreme (memorijski model).

---

# 🗄️ H2 Baza

H2 konzola:
👉 `http://localhost:8080/h2-console`

Parametri:

```
JDBC URL: jdbc:h2:mem:laptop_store_db
User: sa
Pass: (prazno)
```

Početni podaci se dodaju u `DbSeed.java` (kupci + laptopi).

---

# 🌐 REST – Customers

| Metoda | Ruta                | Opis        |
| ------ | ------------------- | ----------- |
| GET    | /api/customers      | svi kupci   |
| GET    | /api/customers/{id} | jedan kupac |
| POST   | /api/customers      | dodavanje   |

---

# 🎨 UI Stranice

Aplikacija koristi moderniji i pregledniji prikaz za:

* listu laptopa
* listu kupaca
* formu za dodavanje kupaca
* dodatnu opremu

---

# ▶️ Pokretanje

```bash
mvn spring-boot:run
```

Laptopi:
👉 `http://localhost:8080/laptops`

H2 baza:
👉 `http://localhost:8080/h2-console`

---

Ovim nadogradnjama projekt iz Lab 1 prerastao je u funkcionalnu **MVC + JPA web aplikaciju**, sa bazom, REST API-jem i kompletnim CRUD-om nad kupcima.

---

Ako želiš, mogu ti uraditi i:

✔ verziju za PDF format
✔ verziju za README.md (GitHub)
✔ potpuno kratku verziju
✔ formalniju verziju za asistenta/profesora

Samo reci koju želiš.
