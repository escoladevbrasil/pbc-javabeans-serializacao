package ifam.testes;

import ifam.model.Cidade;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestaSerializacao {

    public static void main(String[] args) throws IOException {

        Cidade cidade = new Cidade("Manaus","123456");


        FileOutputStream arquivo = new FileOutputStream("cidade.dat");

        try( ObjectOutputStream serializador = new ObjectOutputStream(arquivo) ){

            serializador.writeObject(cidade);

        }catch(Exception e){

            System.out.println(e.getMessage());

        };


    }

}
