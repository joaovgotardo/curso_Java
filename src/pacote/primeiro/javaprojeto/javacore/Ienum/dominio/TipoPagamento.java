package pacote.primeiro.javaprojeto.javacore.Ienum.dominio;

public enum TipoPagamento{
    //Sobrescrita de métodos
        CREDITO{
            //Pode-se sobrescrever o método na enumeração, para cálculo de um desconto, por exemplo.
        @Override
        public double Desconto(double valor) {
            return valor * 0.07;
        }
    },
        DEBITO{
            @Override
            public double Desconto(double valor){
                return valor * 0.05;
            }
        },
        PIX{
            @Override
            public double Desconto(double valor){
                return valor * 0.03;
            }
        };

        //O abstract indica que esse método não pode ter um corpo. Obrigatoriamente, usos dessa subclasse
    //deverão especificar seu comportamento, o que não será feito dentro do abstract.
        public abstract double Desconto(double valor);
    }
