<?php include("cabecalho.php") ?>

<form action="formContato.php" method="post">
    <input type="text" placeholder="Nome" name="txtNome"/>
    <input type="text" placeholder="Mensagem" name="txtMsg"/>
    <input type="submit" placeholder="Enviar" name="btnEnviar"/>
</form>

<?php include("rodape.php") ?>