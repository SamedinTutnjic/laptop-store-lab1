💻 Laptop Store – Spring Boot MVC & JPA (Lab 2)

Ovo je unapređena verzija projekta iz Lab 1, sada proširena i kompletirana prema zahtjevima za Lab 2 – Web programiranje (UNZE).
Implementiran je potpuni MVC + JPA + REST sistem sa radom nad H2 in-memory bazom.

👥 Članovi tima

Samedin Tutnjić – vođa projekta

Feda Coloman

🏷️ Naziv aplikacije

Laptop Store – Evidencija laptopa, kupaca i dodatne opreme
(Lab 2 – Spring Boot + JPA + Thymeleaf)

🔥 Šta je novo u Labu 2 (razlika u odnosu na Lab 1)

U odnosu na Lab 1 (koji je bio DEMO bez baze i sa ručno definisanim podacima), Lab 2 donosi sljedeće nadogradnje:

✅ 1. Uvedena H2 in-memory baza podataka

Aplikacija sada koristi:

H2 memorijsku bazu

automatsko kreiranje tabela preko JPA

automatsko punjenje početnih podataka (seed – DbSeed)

✅ 2. Dodani JPA entiteti

Implementirani entiteti:

🧍 Customer (NOVO u Lab 2)

id

name

email

phone

city

💻 Laptop (UNAPRIJEĐEN u Lab 2)

Dodana JPA anotacija i relacija:

@ManyToOne Customer customer

stock

puni JPA model

🎧 Accessory

Ostaje u memoriji, ali koristi se na formi za dodjelu dodataka laptopu.

✅ 3. Relacija 1:N između Customer i Laptop

jedan kupac → može imati više laptopa

laptop ima kolonu customer_id

Relacija je definisana u Laptop.java:
