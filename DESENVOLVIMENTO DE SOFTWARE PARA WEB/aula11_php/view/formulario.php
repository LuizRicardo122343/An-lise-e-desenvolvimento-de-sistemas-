<!DOCTYPE html>
<!--
Para alterar este cabeçalho de licença, selecione Cabeçalhos de Licença em Propriedades do Projeto.
Para alterar este arquivo de modelo, selecione Ferramentas | Modelos
e abra o modelo no editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
    <h2>Formulário de Aluno</h2>
        <form action="../controller/ControllerAluno.php" method="POST">
            <div>
                <input type="text" name="nome" placeholder="Nome">
            </div>
            <div>
                <input type="email" name="email" placeholder="Email">
            </div>
            <div>
                <input type="radio" name="sexo" value="masculino" required>Maculino
                <input type="radio" name="sexo" value="feminino" >Feminino 
            </div>
            <div>
                <input type="text" name="curso" placeholder="Curso"  required>
            </div>
            
        <div>
            <input type="submit" name="enviar" value="Enviar">
            <input type="submit" name="listar" value="Listar">
        </div>
        </form>
    </body>
</html>
