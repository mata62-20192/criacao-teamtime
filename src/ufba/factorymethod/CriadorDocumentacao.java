package ufba.factorymethod;

import ufba.app.TipoDocumento;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

import java.util.Date;

public abstract class CriadorDocumentacao {

	public String geraDocumentacao() {
		Cabecalho cabecalho = CriaCabecalho();
		Corpo corpo = CriaCorpo();
		Rodape rodape = CriaRodape();

		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Universidade Federal da Bahia");
		corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
		rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}
	public abstract Cabecalho CriaCabecalho();
	public abstract Corpo CriaCorpo();
	public abstract Rodape CriaRodape();
}
