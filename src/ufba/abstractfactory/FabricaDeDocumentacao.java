package ufba.abstractfactory;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public abstract class FabricaDeDocumentacao {

    public abstract Cabecalho CriaCabecalho();
    public abstract Corpo CriaCorpo();
    public abstract Rodape CriaRodape();

}
