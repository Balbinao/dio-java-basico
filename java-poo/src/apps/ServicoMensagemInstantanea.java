package apps;

public abstract class ServicoMensagemInstantanea{
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validarConectadoInternet(){
        System.out.println("Verificando se esta conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico da Mensagem");
    }

}
