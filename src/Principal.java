import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Os incríveis");
        meuFilme.setAnoDeLancamento(2003);
        meuFilme.setDuracaoEmMinutos(115);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(8);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        Serie friends = new Serie();
        friends.setNome("Friends");
        friends.setAnoDeLancamento(1994);
        friends.setTemporadas(10);
        friends.setEpisodiosPorTemporada(21);
        friends.setMinutosPorEpisodio(22);
        friends.exibeFichaTecnica();
        System.out.println("Duração da Série: " + friends.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Vingadores");
        outroFilme.setAnoDeLancamento(2012);
        outroFilme.setDuracaoEmMinutos(140);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(friends);
        System.out.println("NOVO " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(friends);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}