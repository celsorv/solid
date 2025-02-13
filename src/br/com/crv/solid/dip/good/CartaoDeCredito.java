package br.com.crv.solid.dip.good;

public class CartaoDeCredito implements PagamentoMetodo {

    @Override
    public void realizarPagamento() {
        String[] messages = new String[]{
                "\uD83D\uDD0C Conectando...",
                "\uD83D\uDD11 Entre com a senha...",
                "\u2705 Validando credenciais...",
                "\u23F3 Aguardando aprovação...",
                "\uD83D\uDCB3 TRANSAÇÃO APROVADA!"
        };

        for (String s : messages)
            display("\t" + s);
    }

    private static void display(String msg) {
        try {
            Thread.sleep(2000);
            System.out.println(msg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
