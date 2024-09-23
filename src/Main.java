//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Kids!");
        System.out.println("Filme: Divertidamente");

        //padrão dePascalCase
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        // Precedencia
        double media = (9.8 + 6.3 + 8.8) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Divertidamente
                Pixar
                Como ocorrem as emoções de uma criança
                Muito bom!
                Ano de lançamento
                """+anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);


    }
}