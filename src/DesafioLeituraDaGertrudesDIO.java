import java.util.Scanner;

public class DesafioLeituraDaGertrudesDIO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
        int diasNecessarios = paginas / paginasLidas;

        System.out.println(diasNecessarios + " dias");
    }
}
