<?php
class AlunoDAO {
    function iniciar_sessao($user, $senha) {
        session_start(); // Inicia a sessão
        $_SESSION['user'] = $user; // Armazena o usuário na sessão
        $_SESSION['senha'] = $senha; // Armazena a senha na sessão

        // Verifica se o usuário e a senha estão vazios
        if(empty($_SESSION['user']) && empty($_SESSION['senha'])) {
            exit('Usuário ou senha vazios');
        }

        // Dados do banco de dados (simulados)
        $usuario_bd = 'luiz';
        $senha_bd = '123';

        // Verifica se o usuário e a senha estão corretos
        if($_SESSION['user'] != $usuario_bd || $_SESSION['senha'] != $senha_bd) {
            exit;
        } else {
            header('Location: ../view/site.php'); // Redireciona para a página principal
        }
    }
}
?>