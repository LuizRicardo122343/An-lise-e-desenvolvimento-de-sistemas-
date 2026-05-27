<?php
class Aluno {
    private $matricula;
    private $nome;
    private $sexo;
    private $email;
    private $curso;
    function __construct($matricula, $nome, $sexo, $email, $curso) {
        $this->matricula = $matricula;
        $this->nome = $nome;
        $this->sexo = $sexo;
        $this->email = $email;
        $this->curso = $curso;
    }
    function getCurso() {
        return $this->curso;
    }
    function setCurso($curso) {
        $this->curso = $curso;
    }
    function getMatricula() {
        return $this->matricula;
    }
    function getNome() {
        return $this->nome;
    }
    function getSexo() {
        return $this->sexo;
    }
    function getEmail() {
        return $this->email;
    }
    function setMatricula($matricula) {
        $this->matricula = $matricula;
    }
    function setNome($nome) {
        $this->nome = $nome;
    }
    function setSexo($sexo) {
        $this->sexo = $sexo;
    }
    function setEmail($email) {
        $this->email = $email;
    }
}
