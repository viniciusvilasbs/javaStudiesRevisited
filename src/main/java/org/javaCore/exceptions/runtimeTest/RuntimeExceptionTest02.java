package org.javaCore.exceptions.runtimeTest;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
//        opensConection();
    }

    public static String opensConection() {
        try{
            System.out.println("Abrindo arquivo");
//            throw new RuntimeException();
            System.out.println("Escrevendo arquivo");
            return "Conexão aberta";
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo S.O.");
        }
        return null;
    }
}
