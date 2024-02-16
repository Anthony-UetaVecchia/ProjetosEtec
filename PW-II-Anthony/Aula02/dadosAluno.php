<?php
    $nome = $_POST['txNome'];
    $idade = $_POST['txIdade'];
    
    echo $nome . "<br/>";
    echo $idade . "<br/>";

    $verificacao="";

    /*
    > maior
    < menor
    >= Maior ou igual,
    <= menor ou igual
    == igualdade
    != diferente
    */

    if ($idade <=10) {
        $verificacao="(Criança e menor de idade)";
    }
        else if($idade < 18){
            $verificacao="(Menor de idade)";
        }
            else{
                $verificacao="(Maior de idade)";
            }

    echo "$verificacao";

?>