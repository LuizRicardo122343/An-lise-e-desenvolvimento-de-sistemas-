<?php
class AlunoDAO {
    function inserir($nome, $sexo, $email, $curso) {
        
    try {
            $conn = new PDO('mysql:host=localhost;dbname=cadastro', "root", "");
            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            $stmt = $conn->prepare(
                'INSERT INTO cadastro_aluno (nome, sexo, email, curso) VALUES (:nome, :sexo, :email, :curso)');
            $stmt->execute(array(':nome' => "$nome", ':sexo' => "$sexo", ':email' => "$email", ':curso' => "$curso"));
            echo "<script>alert('" . $stmt->rowCount()
            . "Usuário cadastrado com sucesso!'); window.location = '../view/formulario.php';</script>";
        } catch (PDOException $e) {
            echo 'ERRO: ' . $e->getMessage();
        }
    }
    function listar() {
        $conn = new PDO('mysql:host=localhost;dbname=cadastro', "root", "");
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        $consulta = $conn->query("SELECT matricula, nome, sexo, email, curso FROM cadastro_aluno");
        ?>
        <html>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
            <title>Lista de Alunos</title>
            <body class="container">
                <h2 class="mt-4">Alunos Cadastrados</h2>
                <table class="table table-striped ">
                    <tr> 
                        <th>Matrícula</th>
                        <th>Nome</th>
                        <th>Sexo</th>
                        <th>Email</th>
                        <th>Curso</th>
                        <th>Excluir</th>
                        <th>Editar</th>
                    </tr>
                    <?php
                    while ($linha = $consulta->fetch(PDO::FETCH_ASSOC)) {
                        echo "<tr>";
                        echo "<td>" . $linha['matricula'] . "</td>";
                        echo "<td>" . $linha['nome'] . "</td>";
                        echo "<td>" . $linha['sexo'] . "</td>";
                        echo "<td>" . $linha['email'] . "</td>";
                        echo "<td>" . $linha['curso'] . "</td>";
                        echo "<td>"
    . "<form method='post' action='../controller/ControllerAluno.php'>"
    .     "<input class='btn btn-outline-danger' type='submit' name='botao_excluir' value='Excluir'>"
    .     "<input type='hidden' name='id_excluir' value='" . $linha['matricula'] . "'>"
    . "</form>"
    . "</td>";

echo "<td>"
    . "<form method='post' action='../controller/ControllerAluno.php'>"
    .     "<input class='btn btn-outline-primary' type='submit' name='botao_editar' value='Editar'>"
    .     "<input type='hidden' name='id_editar' value='" . $linha['matricula'] . "'>"
    . "</form>"
    . "</td>";
                        echo "</tr>";
                    }
                    ?>
                </table>
                <a class="btn btn-outline-primary" href="javascript:history.back(1)" >Voltar</a>
            </body>
        </html>
        <?php
    }
    
    function excluir($matricula) {
        try {
            $conn = new PDO('mysql:host=localhost;dbname=cadastro', "root", "");
            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            $stmt = $conn->prepare('DELETE FROM cadastro_aluno WHERE matricula = :matricula');
            $stmt->bindParam(':matricula', $matricula);
            $stmt->execute();
            echo "<script>alert('" . $stmt->rowCount() . " usuário detelado com sucesso!'); </script>";
            $alunoDAO = new AlunoDAO();
            $alunoDAO->listar();
        } catch (PDOException $e) {
            echo 'Error: ' . $e->getMessage();
        }
    }
    function busca_aluno($matricula) {
        $conn = new PDO('mysql:host=localhost;dbname=cadastro', "root", "");
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        $stmt = $conn->prepare("SELECT * FROM cadastro_aluno WHERE matricula = :matricula");
        $stmt->execute([':matricula' => $matricula]);
        $aluno = $stmt->fetch();
        
        echo "<html>";
        echo "<body>";
        echo "<form action='../controller/ControllerAluno.php' method='post'>";
        echo "<input type='hidden' name='matricula_alterar' value='" . $aluno['matricula'] . "'>";
        echo "<input type='text' name='nome' size='50px' value='" . $aluno['nome'] . "'>";
        echo "Masculino: <input type='radio' name='sexo' value='masculino'>";
        echo "Feminino: <input type='radio' name='sexo' value='feminino'>";
        echo "<input type='text' name='email' size='50px' value='" . $aluno['email'] . "'>";
        echo "<input type='text' name='curso' size='50px' value='" . $aluno['curso'] . "'>";
        echo "<input type='submit' name='alterar' value='Salvar'>";
        echo "</form>";
        echo "<a class='btn btn-primary' href='javascript:history.back(1)' >Voltar</a>";
        echo "</body>";
        echo "</html>";
    }
    function alterar($matricula, $nome, $sexo, $email, $curso) {
        try {
            $conn = new PDO('mysql:host=localhost;dbname=cadastro', "root", "");
            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            //preparo minha query
            $stmt = $conn->prepare('UPDATE cadastro_aluno SET ' 
            . 'nome = :nome,' 
            . 'sexo = :sexo, '
            . 'email = :email,'
            . 'curso = :curso WHERE matricula = :matricula');
            //executo o comando da queary passando como parâmetro minhas variáveis
            $stmt->execute(array(
                ':matricula' => $matricula, 
                ':nome' => $nome, 
                ':sexo' => $sexo, 
                ':email' => $email, 
                ':curso' => $curso,
            ));
            echo "<script>alert('" . $stmt->rowCount()
            . "usuário alterado com sucesso!');</script>";
            $alunoDAO = new AlunoDAO();
            $alunoDAO->listar();
        } catch (PDOException $e) {
            echo 'error ' . $e->getMessage();
        }
    }
}