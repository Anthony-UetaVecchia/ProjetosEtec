<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Atividade de media</title>

    <style>
        body{

            backgroud: #fff;
        }
        .aprovado{
            color: #00ff;
        }
        .reprovado{
            color: #ff0000;
        }

    </style>
</head>
<body>
    
    <?php
        $media1 = $_POST['txMedia1'];
        $media2 = $_POST['txMedia2'];
        $media3 = $_POST['txMedia3'];
        $media4 = $_POST['txMedia4'];
        
        $mediaTotal = ($media1 + $media2 + $media3 + $media4) / 4;
        
        $verificacao="";
        

        if ($mediaTotal >=6) {
            $verificacao=" Aprovado";
            echo "<p>
                    <span class='aprovado'> Sua média é de: " . ($mediaTotal) . "<br/>" . $verificacao . "</span> 
                 </p>";
        }else{
            $verificacao=" Reprovado";
            echo "<p>
                    <span class='reprovado'> Sua média é de: " . ($mediaTotal) . "<br/>" . $verificacao . "</span> 
                </p>";
        }
    ?>

</body>
</html>

