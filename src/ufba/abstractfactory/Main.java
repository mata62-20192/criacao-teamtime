package ufba.abstractfactory;


public class Main {

	public static void main(String[] args) {
		FabricaDeDocumentacao html = new FabricaDeDocumentacaoHTML();
		FabricaDeDocumentacao markdown = new FabricaDeDocumentacaoMarkdown();
		CriadorDocumentacao criador = new CriadorDocumentacao(markdown);
		System.out.println(criador.geraDocumentacao());
	}

}
