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

        $vetor[0] = 34;
        $vetor[1] = 112;
        $vetor[2] = 23;
        $vetor[3] = 8;
        $vetor[4] = 45;
        $vetor[5] = 2;
        $vetor[6] = 659;
        $vetor[7] = 4;
        $vetor[8] = 61;
        $vetor[9] = 948;
        
        echo "o tamanho do vetor é: " . count($vetor) . "<br/>";

        for($i=0;$i<10;$i+=2){
            echo "$vetor[$i] <br/>";
        }
    
    ?>

</body>
</html>