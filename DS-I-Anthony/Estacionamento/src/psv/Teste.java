package psv; 

import java.sql.*; 
import java.util.*; 

public class Teste { 
    public static void main(String[] args) { 
        Connection con = Conexao.abrirConexao();
        
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        
        //Inserir
        /*
            cb.setPlaca("SDF1G09"); 
            cb.setCor("Laranja"); 
            cb.setDescricao("Carro 3"); 
            System.out.println(cd.inserir(cb));
        */
        
        //Alterar
            /*
            cb.setPlaca("JJJ5415"); 
            cb.setCor("Prata"); 
            cb.setDescricao("Carro 3"); 
             cb.setModelo("Carro 3"); 
            System.out.println(cd.alterar(cb));
            */
       
       
        //Excluir
        /*
            cb.setPlaca("JKK1900");
            System.out.println(cd.excluir(cb));
        */        
        /*
        //Listagem
        
            List<CarroBean> lista = cd.listarTodos(); 
                if(lista != null){             
                    for(CarroBean carro : lista){ 
                        System.out.println("Placa: "+carro.getPlaca()); 
                        System.out.println("Cor: "+carro.getCor()); 
                        System.out.println("Descrição: "+carro.getDescricao());
                    }
                }
            Conexao.fecharConexao(con);
        */
    }    
} 