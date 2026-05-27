<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt">
<head>
    <meta charset="UTF-8">
    <title>Sistema WEB</title>
</head>
<body>
<?php
session_start();
if(empty($_SESSION['user']) || empty($_SESSION['senha'])) {
    exit('Digite um usuario e senha.');
}
$logado = $_SESSION['user'];
?>
<table width="800" border="1"> <!-- Corrigido o erro no atributo border -->
    <tr>
        <td>
            <h1><?php echo "Bem-vindo, $logado"; ?></h1>
        </td>
        <td>
            <form method="POST" action="../controller/ControllerAluno.php">
                <input type="submit" name="botao_sair" value="Sair" />
            </form>
        </td>
    </tr>
</table>
</body>
</html>