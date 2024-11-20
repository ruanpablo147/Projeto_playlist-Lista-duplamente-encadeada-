import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        playlasi<musicas> musi = new playlasi<>();
        String f, t, a, p, l;
        String opcao;
        int posicao;

        musicas M1 = new musicas("03", "The Emptiness Machine", "Linkin Park", "2024", "https://youtube.com/...");
        musicas M2 = new musicas("09", "Heavy Is the Crown", "Linkin Park", "2024", "https://youtube.com/...");
        musicas M3 = new musicas("02", "Red Hot Chili Peppers - Californication (Official Music Video) [HD UPGRADE]", "Red Hot Chili Peppers", "2009", "https://www.youtube.com/watch?v=YlUKcNNmywk&ab_channel=RedHotChiliPeppers");
        musicas M4 = new musicas("05", "Red Hot Chili Peppers - Otherside [Official Music Video]", "Red Hot Chili Peppers", "2011", "https://www.youtube.com/watch?v=rn_YodiJO6k&ab_channel=RedHotChiliPeppers");

        musi.adicionar(M1);
        musi.adicionar(M2);
        musi.adicionar(M3);
        musi.adicionar(M4);


        do {
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Listar músicas");
            System.out.println("(2) Adicionar música");
            System.out.println("(3) Buscar música");
            System.out.println("(4) Remover música");
            System.out.println("(5) Exibir música anterior");
            System.out.println("(6) Exibir música posterior");
            System.out.println("(s) Sair");

            opcao = leia.next();

            switch (opcao) {
                case "1":
                    musi.exibir();
                    break;

                case "2":
                    leia.nextLine();
                    System.out.println("Digite a faixa:");
                    f = leia.nextLine();
                    System.out.println("Digite o título:");
                    t = leia.nextLine();
                    System.out.println("Digite o autor:");
                    a = leia.nextLine();
                    System.out.println("Digite o período:");
                    p = leia.nextLine();
                    System.out.println("Digite o link:");
                    l = leia.nextLine();
                    musi.adicionar(new musicas(f, t, a, p, l));
                    break;

                case "3":
                    System.out.println("Informe a posição:");
                    posicao = leia.nextInt();
                    System.out.println("Música encontrada: " + musi.buscarmusica(posicao));
                    break;

                case "4":
                    System.out.println("Informe a posição:");
                    posicao = leia.nextInt();
                    System.out.println("Música removida: " + musi.removemusica(posicao));
                    break;

                case "5":
                    System.out.println("Informe a posição:");
                    posicao = leia.nextInt();
                    System.out.println("Música anterior: " + musi.anterior(posicao));
                    break;

                case "6":
                    System.out.println("Informe a posição:");
                    posicao = leia.nextInt();
                    System.out.println("Próxima música: " + musi.proximo(posicao));
                    break;

                case "s":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("s"));

        leia.close();
    }

}
