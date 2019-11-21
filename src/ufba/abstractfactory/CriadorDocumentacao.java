package ufba.abstractfactory;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

import java.util.Date;

public class CriadorDocumentacao {

	private FabricaDeDocumentacao fabrica;

	public CriadorDocumentacao(FabricaDeDocumentacao fabrica) {
		this.fabrica = fabrica;
	}

	public void setFabrica(FabricaDeDocumentacao fabrica) {
		this.fabrica = fabrica;
	}

	public String geraDocumentacao() {

		Cabecalho cabecalho = fabrica.CriaCabecalho();
		Corpo corpo = fabrica.CriaCorpo();
		Rodape rodape = fabrica.CriaRodape();

		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Universidade Federal da Bahia");
		corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
		rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}

}
