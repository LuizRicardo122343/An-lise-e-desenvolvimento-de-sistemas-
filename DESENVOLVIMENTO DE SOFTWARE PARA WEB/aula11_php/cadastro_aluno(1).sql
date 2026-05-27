CREATE DATABASE cadastro;
use cadastro;
CREATE TABLE `cadastro_aluno` (
    matricula INT(10) AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sexo VARCHAR(30) NOT NULL,
    email VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL
);
