package ufba.abstractfactory;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;

public class FabricaDeDocumentacaoHTML extends FabricaDeDocumentacao{
    @Override
    public Cabecalho CriaCabecalho() {
        return new CabecalhoHTML();
    }

    @Override
    public Corpo CriaCorpo() {
        return new CorpoHTML();
    }

    @Override
    public Rodape CriaRodape() {
        return new RodapeHTML();
    }
}
