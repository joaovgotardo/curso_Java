//package pacote.primeiro.javaprojeto.javanced.Njunit.dominio;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DesenvolvedorTest {
//    @Test
//    public void instanceOf_executarMétodoSubclasse_SeObjetoForSubclasse{
//        Funcionario funcionariodev = new Desenvolvedor("1", "Angular");
//        if(funcionariodev instanceof Desenvolvedor){
//            Desenvolvedor dev = (Desenvolvedor) funcionariodev;
//            Assertions.assertEquals("SpringBoot", dev.getFrameworkPrincipal());
//        }
//
//        //Com Pattern Matching
//        if(funcionariodev instanceof Desenvolvedor dev){
//            Assertions.assertEquals("SpringBoot", dev.getFrameworkPrincipal());
//        }
//    }
//}