package util;

import java.math.BigDecimal;

public class Validaciones {

    // BUG intencional: valida mal el DNI (acepta letras si tiene 8 caracteres) RESUELTO
    public static boolean validarDni(String dni) {
        if (dni == null) return false;
        return dni.matches("\\d{8}");
    }

    // BUG intencional: acepta precio cero (debería ser > 0) RESUELTO
    public static boolean validarPrecio(BigDecimal precio) {
    if (precio == null) return false;
    // compareTo devuelve 1 si es mayor, 0 si es igual, -1 si es menor
    return precio.compareTo(BigDecimal.ZERO) > 0;
}


    // BUG intencional: acepta cantidad 0 (debería ser > 0) RESUELTO
    public static boolean validarCantidad(int cantidad) {
        return cantidad > 0;
    }
}
