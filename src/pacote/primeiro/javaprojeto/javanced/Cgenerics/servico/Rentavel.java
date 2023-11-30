package pacote.primeiro.javaprojeto.javanced.Cgenerics.servico;

import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class Rentavel<T> {
    //O T é usado para reperesentar um tipo genérico. Todas as classes referenciadas são
    //substituídas por esse tipo genérico.
    private List<T> veiculos;

    public Rentavel(List<T> veiculos){
        this.veiculos = veiculos;
    }

    public T compraVeiculo(){
        T veiculo = veiculos.remove(0);
        System.out.println("Veículo comprado: " + veiculo);
        System.out.println("Veículos disponíveis: " + veiculos);
        return veiculo;
    }

    public void vendeVeiculo(T veiculo){
        System.out.println("Veículo vendido: " + veiculo);
        veiculos.add(veiculo);
        System.out.println("Veículos disponíveis: " + veiculos);
    }
}
