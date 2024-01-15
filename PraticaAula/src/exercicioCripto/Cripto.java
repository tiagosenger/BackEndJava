package exercicioCripto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cripto {
	
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Por favor, forneça dois nomes de arquivos e uma senha como argumentos.");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String senha = args[2];

        try {
            process(inputFile, outputFile, senha);
            System.out.println("Cópia concluída com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro durante a cópia do arquivo: " + e.getMessage());
        } finally {
            System.exit(0); 
        }
    }

    public static void process(String inputFile, String outputFile, String senha) throws IOException {
        try (FileInputStream in = new FileInputStream(inputFile);
             FileOutputStream out = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                xorBytes(buffer, senha);
                out.write(buffer, 0, bytesRead);
            }
        }
    }

    private static void xorBytes(byte[] buffer, String senha) {
        byte[] senhaBytes = senha.getBytes();
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) (buffer[i] ^ senhaBytes[i % senhaBytes.length] ^ 255);
        }
    }
}
