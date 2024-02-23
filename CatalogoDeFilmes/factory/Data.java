package CatalogoDeFilmes.factory;

import CatalogoDeFilmes.exception.DataException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
    public static LocalDate StringParaData(String stringDataNascimento) {
        if(validacao(stringDataNascimento)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(stringDataNascimento, formatter);
        }
        throw new DataException("Data informada está em um formato invalido.");
    }
    private static boolean validacao(String stringDataNascimento){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);

        try {
            formatoData.parse(stringDataNascimento);
            return true;
        }
        catch (ParseException e){
            return false;
        }
    }
}
