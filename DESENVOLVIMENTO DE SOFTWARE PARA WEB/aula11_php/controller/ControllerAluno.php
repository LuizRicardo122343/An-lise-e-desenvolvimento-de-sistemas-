<?php

include('../model/Aluno.php');
include('../model/AlunoDAO.php');

$alunoDAO = new AlunoDAO();

if (isset($_POST['enviar'])){ 
    $btcadastro = $_POST['enviar']; 
    $aluno = new Aluno (0, $_POST['nome'], $_POST['sexo'], $_POST['email'], $_POST['curso']); 
    $alunoDAO->inserir($aluno->getNome(), $aluno->getSexo(), $aluno->getEmail(), $aluno->getCurso()); 
}
if (isset($_POST['listar'])) { 
    $btListar = $_POST ['listar']; 
    $alunoDAO->listar(); 
}
if (isset($_POST['botao_excluir'])){ 
    $alunoDAO->excluir ($_POST['id_excluir']); 
}
if (isset($_POST['botao_editar'])){ 
    $alunoDAO->busca_aluno ($_POST['id_editar']); 
}
if (isset($_POST['alterar'])){ 
    $alunoDAO->alterar($_POST['matricula_alterar'],$_POST['nome'],$_POST['sexo'],$_POST['email'],$_POST['curso']); 
}