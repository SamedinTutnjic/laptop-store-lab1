Naravno — sada ćemo napraviti **potpuno novi README.md za Lab 2**, profesionalan, uredan i tačno prema onome što si implementirao:

* **H2 baza**
* **JPA entiteti (Customer + Laptop)**
* **Relacija 1:N**
* **REST API za kupce**
* **MVC stranice za laptop, accessories i customers**
* **Seed podaci (DbSeed)**
* **Uređena inventura tema**
* **Dodavanje, editovanje i brisanje kupaca**

Spreman za copy–paste 👇👇

---

# 💻 Laptop Store – Spring Boot MVC & JPA (Lab 2)

Ovo je unapređena verzija projekta iz **Lab 1**, sada proširena i kompletirana prema zahtjevima za **Lab 2 – Web programiranje (UNZE)**.
Implementiran je potpuni **MVC + JPA + REST** sistem sa radom nad **H2 in-memory bazom**.

## 👥 Članovi tima

* **Samedin Tutnjić** – vođa projekta
* **Feda Coloman**

---

# 🏷️ Naziv aplikacije

**Laptop Store – Evidencija laptopa, kupaca i dodatne opreme**
(Lab 2 – Spring Boot + JPA + Thymeleaf)

---

# 🔥 Šta je novo u Labu 2 (razlika u odnosu na Lab 1)

U odnosu na Lab 1 (koji je bio DEMO bez baze i sa ručno definisanim podacima), Lab 2 donosi sljedeće nadogradnje:

### ✅ 1. **Uvedena H2 in-memory baza podataka**

Aplikacija sada koristi:

* **H2 memorijsku bazu**
* automatsko kreiranje tabela preko JPA
* automatsko punjenje početnih podataka (seed – DbSeed)

### ✅ 2. **Dodani JPA entiteti**

Implementirani entiteti:

#### 🧍 Customer (NOVO u Lab 2)

* `id`
* `name`
* `email`
* `phone`
* `city`

#### 💻 Laptop (UNAPRIJEĐEN u Lab 2)

Dodana JPA anotacija i relacija:

* `@ManyToOne Customer customer`
* `stock`
* puni JPA model

#### 🎧 Accessory

Ostaje u memoriji, ali koristi se na formi za dodjelu dodataka laptopu.

### ✅ 3. **Relacija 1:N između Customer i Laptop**

* jedan kupac → može imati više laptopa
* laptop ima kolonu `customer_id`

Relacija je definisana u `Laptop.java`:

```java
@ManyToOne
@JoinColumn(name = "customer_id")
private Customer customer;
```

### ✅ 4. **REST API za Customer entitet**

Putanja: `/api/customers`

Podržava:

* `GET /api/customers` – lista kupaca
* `GET /api/customers/{id}` – pojedinačni kupac
* `POST /api/customers` – dodavanje kupca

### ✅ 5. **Customer MVC stranice (NEW UI)**

Dodane profesionalne stranice za:

* pregled kupaca
* dodavanje kupaca
* uređivanje kupaca
* brisanje kupaca

Sve urađeno u modernoj inventura temi.

### ✅ 6. **Kompletan redizajn UI**

SVE stranice (laptops, accessories, customers) sada imaju:

* Identican moderan header
* Inventura stil
* Sjene, kartice, button stilovi
* Mobile-responsive dizajn

---

# 🧩 Modeli i relacije

## 🧍 **Customer (entitet)**

* ID
* Name
* Email
* Phone
* City

## 💻 **Laptop (entitet)**

* ID
* Brand
* Model
* CPU
* RAM
* Storage
* Price
* Stock
* MANY-TO-ONE → Customer

## 🎧 **Accessory (memorijski model)**

Oprema se čuva u memoriji i koristi u formi za dodjelu dodatka laptopu.

### 🔗 **Relacija**

* **Jedan Customer → više Laptopa**
* Laptop ima `customer_id` u tabeli

---

# 🗄️ H2 Baza podataka

Koristi se **H2 in-memory** baza, vidljiva na adresi:

👉 `http://localhost:8080/h2-console`

Parametri:

```
JDBC URL: jdbc:h2:mem:laptop_store_db
User: sa
Pass: (prazno)
```

Baza se kreira pri pokretanju aplikacije i puni initial podacima iz `DbSeed.java`:

* 2 kupca
* 3 laptopa
* relacija između laptopa i kupca

---

# 🌐 REST API – Customers

| Metoda | Ruta                  | Opis              |
| ------ | --------------------- | ----------------- |
| GET    | `/api/customers`      | lista kupaca      |
| GET    | `/api/customers/{id}` | pojedinačni kupac |
| POST   | `/api/customers`      | dodavanje kupca   |

---

# 🎨 UI – Stranice aplikacije

Sve stranice imaju moderno uređenu inventura-temu:

* `laptops.html`
* `accessories.html`
* `customers.html`
* `customer-form.html`
* `laptop-action.html`

---

# 🖼️ Screenshot (LAB 2 verzija)

## 📍 Customers – lista kupaca

*(primjer ubaciš sliku nakon push-a, kao i za laptops)*

```
<img src="URL_SLIKE">
```

## 📍 Laptopi – inventura

*(prethodna slika iz Lab 1 ostaje)*

## 📍 Accessories – inventura

*(prethodna slika ostaje)*

---

# ▶️ Pokretanje aplikacije

```bash
mvn spring-boot:run
```

Stranica:
👉 `http://localhost:8080/laptops`

H2 baza:
👉 `http://localhost:8080/h2-console`

---

# ✔️ Zaključak

U Lab 2 verziji aplikacija je unapređena u:

* **MVC + JPA + REST full-stack web aplikaciju**
* sa potpunom bazom, entitetima i relacijama
* modernim, responzivnim UI
* kompletnim CRUD sistemom za kupce
* i profesionalnim inventura izgledom

