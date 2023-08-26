package ifam.testes;

import ifam.model.Cidade;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestaSerializacaoXML {
    public static void main(String[] args) throws FileNotFoundException {
        Cidade cidade = new Cidade("Manaus","123456");


        FileOutputStream arquivo = new FileOutputStream("cidade.xml");

        try( XMLEncoder serializador = new XMLEncoder(arquivo) ){

            serializador.writeObject(cidade);

        }catch(Exception e){

            System.out.println(e.getMessage());

        };
    }

}
