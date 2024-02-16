<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
 

    <?php /*Básico If, Else e Else If*/
        /*
        $opcao = 3;

        if($opcao == 1){
            echo "Adição";
        }else if($opcao == 2){
            echo "Subtração";
        }else if($opcao == 3){
            echo "Multiplicação";
        }else if($opcao == 4){
            echo "Divisão";
        }else{
            echo "Opção Inválida";
        }
    */
    ?>
    
    <?php /*SwitchCase*/
        /*
        $opcao = 9;

        switch($opcao){
            case 1:
                echo "Adição";
                break;
            case 2:
                echo "Subtração";
                break;
            case 3:
                echo "Multiplicação";
                break;
            case 4:
                echo "Divisão";
                break;
            default:
                echo "Opção Inválida";
                break;
        }
    */
    ?>

    <?php /*Laço de Repetição "For"*/
        /*
        $num = 5;

        for($i=0; $i<=10; $i++){

            $multi = $i * $num;
            echo "5 x $i: $multi <br/>";
        }
    */

    /*Atividade somatório do número 1 ao 100, utilizando laço de repetição*/
        /*
        $soma = 0;
        $total = 0;

        for($i=0; $i<=100; $i++){
            
            $total = $soma + $i;
            echo "<p>$soma + $i é igual a: $total</p>";
            $soma = $total; 
        }*/

    ?>

    <?php /*Atividade imprimir números pares em um intervalo de 0 a 100, utilizando laço(s)(for, while e do while) de repetição*/ 
        
        /*echo "<h1>Imprimindo somente números pares</h1>";*/
        
        /*For
        for($i=0;$i<=100;$i+=2){
            echo "$i <br/>";

        }*/

        /*While

        $i=0;

        while($i<=100){
            echo "$i <br/>";

            $i+=2;

        }*/

        /*Do While*/
        /*
        $i=0;

        do{
            echo "<br/> $i";

            $i+=2;

        }while($i<=100);*/

    ?>

    <?php 
    
        for($i=0;$i<=100;$i++){
            $verificador = $i%2;
            if($verificador==0){
                echo "<span style='color:#4E9F3D'>$i</span>";
                echo "<br/>";
            }else{
                echo "<span style='color:#A020F0'>$i</span>";
                echo "<br/>";
            }
        }

    ?>

</body>
</html>