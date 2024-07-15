// Aqui será demonstrado um programa semelhante ao de NotaEscolar, porém otimizando-o com Condições ternárias.

public class ResultadoEscolar {
	public static void main(String[] args) {
		double nota = 4.1;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
