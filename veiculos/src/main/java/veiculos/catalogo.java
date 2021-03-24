/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author Marcio
 */
public class catalogo {

    static veiculo[] dados = {
        new veiculo("Ford Fusion", "Sedã", "Preto", 1, 4, 5, 39.900, true, true),
        new veiculo("Chevrolet S10", "Picape", "Branco", 2, 2, 3, 68.890, true, true),
        new veiculo("BMW X4", "Utilitário esportivo", "Preto", 3, 4, 5, 168.000, true, true),
        new veiculo("Land Rover Discovery Sport ", "Utilitário esportivo", "Branco", 4, 4, 5, 175.000, false, true)
    };
    
    String[] tabela = {"Código", "Modelo", "Tipo", "Cor", "Portas", "Bancos", "Preço", "Sistema Multimidia", "Airbags"};
    DecimalFormat df = new DecimalFormat("#0.00");
        
    public static String modelo(int pos) {
        return dados[pos].getModelo();
    }
    
    public static String tipo(int pos) {
        return dados[pos].getTipo();
    }
    
    public static String cor(int pos) {
        return dados[pos].getCor();
    }

    public static int cod(int pos) {
        return dados[pos].getCod();
    }
    
    public static int quant_porta(int pos) {
        return dados[pos].getQuant_porta();
    }
    
    public static int quant_banco(int pos) {
        return dados[pos].getQuant_banco();
    }

    public static double preco(int pos) {
        return dados[pos].getPreco();
    }
    
    public static boolean sistema_multimidia(int pos) {
        return dados[pos].isSistema_multimidia();
    }
    
    public static boolean airbags(int pos) {
        return dados[pos].isAirbags();
    }
    
    public static String checaBool(boolean bool){      
        if(bool){
            return "Sim";
        }else{
            return "Não";
        }
    }
    
    public void todosDados() {
        double valorTotal = 0;
        System.out.println(Arrays.toString(tabela));
        for (int i = 0; i < dados.length; i++) {
             valorTotal += preco(i);
            String[] resul = {String.valueOf(cod(i)), modelo(i), tipo(i), cor(i), String.valueOf(quant_porta(i)), String.valueOf(quant_banco(i)), String.valueOf(preco(i)),
                checaBool(sistema_multimidia(i)), checaBool(airbags(i))};
            System.out.println(Arrays.toString(resul));
            System.out.println("Valor de todos os carros: R$" + df.format(valorTotal));            
        }
    }
    
    public void valorTotal() {
        double valorTotal = 0;
        System.out.println(Arrays.toString(tabela));
        for (int i = 0; i < dados.length; i++) {
             valorTotal += preco(i);            
        }
        System.out.println("Valor de todos os carros: R$" + df.format(valorTotal));  
    }

    public void buscaCodigo(int cod) {
        boolean existe = false;
        for (int i = 0; i < dados.length; i++) {
            if (cod == cod(i)) {
                existe = true;
                System.out.println(Arrays.toString(tabela));
                String[] resul = {String.valueOf(cod(i)), modelo(i), tipo(i), cor(i), String.valueOf(quant_porta(i)), String.valueOf(quant_banco(i)), String.valueOf(preco(i)),
                checaBool(sistema_multimidia(i)), checaBool(airbags(i))};
                System.out.println(Arrays.toString(resul));
            }
        }
        if (!existe) {
            System.out.println("Codigo não encontrado na Database");
        }
    }
    
    public void buscaModelo(String nome) {
        boolean existe = false;
        for (int i = 0; i < dados.length; i++) {
            if (modelo(i).equals(nome)) {
                existe = true;
                System.out.println(Arrays.toString(tabela));
                String[] resul = {String.valueOf(cod(i)), modelo(i), tipo(i), cor(i), String.valueOf(quant_porta(i)), String.valueOf(quant_banco(i)), String.valueOf(preco(i)),
                checaBool(sistema_multimidia(i)), checaBool(airbags(i))};
                System.out.println(Arrays.toString(resul));
            }
        }
        if (!existe) {
            System.out.println("Modelo não encontrado na Database");
        } 
    }
}
