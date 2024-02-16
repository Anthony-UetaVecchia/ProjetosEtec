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

        $vetor = Array();

        $vetor[0] = 2;
        $vetor[1] = 45;
        $vetor[2] = 5;
        $vetor[3] = 65;
        $vetor[4] = 8;
        $vetor[5] = 23;
        $vetor[6] = 50;
        $vetor[7] = 6;
        $vetor[8] = 3;
        $vetor[9] = 19;

        $somaPar = 0;
        $somaImpar = 0;

        for($i=0;$i<10;$i+=2){
            $somaPar = $somaPar + $vetor[$i];

        }

        echo "A soma dos números de índices pares é: $somaPar <br/>";

        for($i=1;$i<10;$i+=2){
            $somaImpar = $somaImpar + $vetor[$i];

        }

        echo "A soma dos números de índices ímpares é: $somaImpar <br/>";
    
    ?>

</body>
</html>