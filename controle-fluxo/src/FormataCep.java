public class FormataCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
        } catch (CepInvalidoException e) {
            System.out.println("o cep não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
