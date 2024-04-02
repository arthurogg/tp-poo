CREATE DATABASE TP_POO2;
USE TP_POO2;

CREATE TABLE Etudiant(
    code VARCHAR (15) PRIMARY KEY,
    nom VARCHAR (25) NOT NULL,
    DateNaiss Date,
    address VARCHAR (15),
    email VARCHAR (25),
    tel VARCHAR (25) not null,
    cycle varchar (15) not null,
    Niveau TINYINT (1));


CREATE TABLE Enseignant(
    code VARCHAR (15) PRIMARY KEY,
    nom VARCHAR (25) NOT NULL,
    DateNaiss Date,
    address VARCHAR (15),
    email VARCHAR (25),
    tel VARCHAR (25) not null,
    statut VARCHAR (15) not null);

CREATE TABLE Agent (
    code VARCHAR (15) PRIMARY KEY,
    nom VARCHAR (25) NOT NULL,
    DateNaiss Date,
    address VARCHAR (15),
    email VARCHAR (25),
    tel VARCHAR (25) not null,
    Salaire INTEGER(10), 
    statut VARCHAR (15) not null,
    Categorie VARCHAR (15),
    IndSal DECIMAL(6,2),
    occupation VARCHAR(15));

