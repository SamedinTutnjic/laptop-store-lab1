# Laptop-Prodavnica-Accessory
Spring Boot MVC web aplikacija za evidenciju laptopa i dodatne opreme. Omogućava pregled, dodavanje i upravljanje artiklima kroz jednostavan interfejs. Izrađeno kao laboratorijski zadatak (Lab 1) za predmet Web programiranje – UNZE.

# 💻 Laptop Store – Spring Boot MVC (Lab 1)

## 👥 Članovi tima
- **Samedin Tutnjić - vođa** 
- **Feda Coloman**

---

## 🏷️ Naziv aplikacije
**Laptop Store – Evidencija laptopa i dodatne opreme**

Ova aplikacija je izrađena u okviru laboratorijske vježbe **Lab 1 – Web programiranje** na temu **primjene MVC (Model–View–Controller)** arhitekture koristeći **Spring Boot** i **Thymeleaf**.

---

## 🧩 Opis modela i relacije

Aplikacija sadrži dva osnovna modela:

### 🖥️ **Model: Laptop**
Predstavlja osnovnu jedinicu evidencije – laptop u prodavnici.  
Sadrži podatke o:
- ID laptopa (`id`)
- Brendu i modelu (`brand`, `model`)
- Procesoru, RAM-u i disku (`cpu`, `ram`, `storage`)
- Cijeni (`price`)
- Broju komada na stanju (`stock`)
- Listi dodatne opreme (`List<Accessory>`)

Svaki laptop može imati **više dodataka (1:N relacija)**.

---

### 🎧 **Model: Accessory**
Predstavlja dodatnu opremu (miš, torba, docking station itd.).  
Sadrži:
- ID dodatka (`id`)
- Naziv, tip, brend (`name`, `type`, `brand`)
- Cijenu (`price`)

---

### 🔗 **Relacija između modela**
- Jedan **Laptop** može imati više **Accessory** objekata  
  → **(1 : N relacija)**  
- Dodatci se dodaju kroz formu na stranici *“Upravljaj / Otvori”*

---

## ⚙️ Funkcionalnosti aplikacije
- Pregled liste laptopa i njihove količine na stanju  
- Pregled liste dodatne opreme  
- Dodavanje novih laptopa i accessories kroz forme  
- Dodavanje opreme pojedinačnom laptopu  
- Brz pregled (“Otvori”) svakog laptopa  
- Podaci se čuvaju **u memoriji (DemoData komponenta)** – bez baze podataka

---

## 🖼️ Screenshot aplikacije

### 💻 Glavna stranica – *Lista laptopa*

<img width="3433" height="938" alt="Slika 1" src="https://github.com/user-attachments/assets/c8a436cb-702e-4d9c-bcf2-bf5668103fe1" />

### 💻 Stranica – *Lista Accessory*

<img width="3437" height="735" alt="Slika 2" src="https://github.com/user-attachments/assets/3d53cf85-44ca-45cc-b275-4566d2b5687c" />

### 💻 Stranica – *Stavke*

<img width="3433" height="684" alt="Slika 1 1" src="https://github.com/user-attachments/assets/f3a315c3-7fb5-4f5e-b61c-c2b6e6e05d49" />



