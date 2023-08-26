package ifam.testes;

import ifam.model.Cidade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestaDesserializacao {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream arquivo = new FileInputStream("cidade.dat");

        try( ObjectInputStream desserializador = new ObjectInputStream(arquivo) ){

            Object objeto = desserializador.readObject();

            Cidade cidade = (Cidade) objeto;

            System.out.println(cidade.getNome());
            System.out.println(cidade.getIbge());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
