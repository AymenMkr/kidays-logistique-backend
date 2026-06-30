# Kidays Logistique Backend

## Description du projet

Kidays Logistique est une application backend développée avec Spring Boot.  
Elle permet de gérer la logistique interne de Kidays, notamment les utilisateurs, le matériel, les prêts de matériel et une marketplace interne.

Le projet est orienté backend afin de mettre en avant la logique métier, la gestion des données, la sécurité et les API REST.

## Objectifs du projet

- Gérer les utilisateurs avec deux rôles : ADMIN et ANIMATEUR
- Gérer le matériel disponible chez Kidays
- Suivre les prêts de matériel aux animateurs
- Gérer une marketplace interne pour vendre ou recycler du matériel
- Tester les API avec des requêtes HTTP
- Versionner le code avec GitHub

## Technologies utilisées

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- H2 Database pour le développement
- MySQL prévu pour la version finale
- Maven
- Git et GitHub
- VS Code

## Architecture du projet

```text
src/main/java/com/example/logistique
│
├── controller
├── dto
├── entity
├── repository
├── security
├── service
└── LogistiqueApplication.java