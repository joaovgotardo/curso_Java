package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.D_formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste {
    public static void main(String[] args) {
        //Podem-se criar várias 'máscaras' para algum tipo de data com essa classe.
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
        //O at está em aspas simples, para sinalizar q essa parte de código será impressa literalmente.
        //Isso é altamente customizável.
        String personalized = "'Rio Grande do Sul,' dd 'de' MMMM 'de' yyyy 'às' HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        SimpleDateFormat sdf2 = new SimpleDateFormat(personalized);
        System.out.println(sdf2.format(new Date()));
        try{
            sdf2.parse("Rio Grande do Sul, 20 de novembro de 2023 às 18:28");
        }catch (ParseException e){
            e.printStackTrace();
        }
        //O parse também pode ser feito pelo SimpleDateFormat.
    }
}
