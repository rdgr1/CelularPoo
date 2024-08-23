
public abstract class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        IPhone iphone = new IPhone() {
            @Override
            public void ligar(int numero) {

                System.out.println("Ligando Celular");
            }

            @Override
            public void atender() {
                System.out.println("Atendendo Ligação");
            }

            @Override
            public void iniciarCorreioVoz() {
                System.out.println("Iniciando Correio de Voz");
            }

            @Override
            public void exibirPagina(String url) {

            }

            @Override
            public void adicionarNovaAba(String url) {

            }

            @Override
            public void atualizarPagina() {

            }

            @Override
            public void tocar() {

            }

            @Override
            public void pausar() {

            }

            @Override
            public void selecionarMusica() {

            }

            @Override
            public void tocarMusica(String musica) {

            }

            @Override
            public void pausarMusica() {

            }
        };
    }
}