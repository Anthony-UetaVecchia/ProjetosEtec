<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <?php

        $nome = $_POST['txNome'];
        $idade = $_POST['txIdade'];
        $peso = $_POST['txPeso'];

        echo "<p>Nome: $nome <br/></p>";
        echo "<p>Idade: $idade anos <br/></p>";


        if($idade<18){
            echo "Menor de idade."; 
        }else{
            echo "Maior de idade.";
        }

        echo "<p>Peso: $peso kg. <br/></p>";

        if($peso>100){
            echo "Acima do peso, fazer regime.";
            echo "<body style='background: #f00'></body>";
        }

    ?>

</body>
</html>