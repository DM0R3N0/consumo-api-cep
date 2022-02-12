package br.com.buscadorcep.cliente;

import java.util.Scanner;

import br.com.bucadorcep.viacep.ServicoDeCep;
import br.com.buscadorcep.dominio.Endereco;

public class Main {

	public static void main(String[] args) throws Exception {
		
		 System.out.print("Informe seu CEP: ");
	        @SuppressWarnings("resource")
			String cep = new Scanner(System.in).nextLine();
	        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

	        System.out.println("Logradouro: " + endereco.getLogradouro());
	        System.out.println("Bairro: " + endereco.getBairro());
	        System.out.println("Localidade: " + endereco.getLocalidade());
	}

}
