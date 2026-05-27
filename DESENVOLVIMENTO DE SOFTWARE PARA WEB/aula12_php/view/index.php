
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="meucss.css"> <!-- Link para o arquivo CSS -->
</head>
<body>
    <form method="post" action="../controller/ControllerAluno.php" id="formlogin" name="formlogin">
        <fieldset id="fie">
            <legend>Login</legend><br />
            <label>NOME: </label>
            <input type="text" name="user" id="login" /><br />
            <label>SENHA: </label>
            <input type="password" name="senha" id="Senha" /><br />
            <input type="submit" name="botao_logar" value="Entrar" />
        </fieldset>
    </form>
</body>
</html>