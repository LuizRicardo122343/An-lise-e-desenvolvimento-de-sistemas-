<?php

include('../model/AlunoDAO.php');

$alunoDAO = new AlunoDAO();

// Recebe via POST o usuário e senha do formulário de login
if (isset($_POST['botao_logar'])) {
    $alunoDAO->iniciar_sessao($_POST['user'], $_POST['senha']); // Corrigido o nome do método
}

// Destroi a sessão quando o botão "Sair" for clicado
if (isset($_POST['botao_sair'])) {
    session_start();
    session_unset(); // Remove todas as variáveis de sessão
    session_destroy(); // Destroi a sessão
    header('Location: ../view/index.php');
    exit(); // Interrompe o script
}
