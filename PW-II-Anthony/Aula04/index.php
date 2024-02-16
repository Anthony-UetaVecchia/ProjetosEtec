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
    //atribuição de valores a um vetor

    $vetor = Array();

    $vetor[0] = 50;
    $vetor[1] = 20;
    $vetor[2] = 5;
    $vetor[3] = 2;
    $vetor[4] = 69;
    $vetor[5] = 37;
    $vetor[6] = 43;

    echo "o tamanho do vetor é: " . count($vetor) . "<br/>";

    for($i=0;$i<7;$i++){       
        echo "$vetor[$i] <br/>";

    }    


    
    ?>

</body>
</html>