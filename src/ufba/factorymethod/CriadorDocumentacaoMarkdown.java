package ufba.factorymethod;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public class CriadorDocumentacaoMarkdown extends CriadorDocumentacao {

    @Override
    public Cabecalho CriaCabecalho() {
        return new CabecalhoMarkdown();
    }

    @Override
    public Corpo CriaCorpo() {
        return new CorpoMarkdown();
    }

    @Override
    public Rodape CriaRodape() {
        return new RodapeMarkdown();
    }
}
