package Transportes;

public interface ITransporte {
    public static final int CODIGO = 36500;
    /**
     * Metodo para calcular el coste
     * @param cp -> dar un Codigo Postal
     * @return cuanto cuesta
     */
    Float costeTotal(Integer cp);

    /**
     * Método para calcular el tipo de embalaje
     * @param dimensionX -> Ancho del paquete
     * @param dimensionY -> Largo del paquete
     * @param dimensionZ -> Alto del paquete
     * @param peso -> Peso del paquete
     * @return numero para despues saber que tipo es
     */
    Integer tipoEmbalaje(Float dimensionX, Float dimensionY, Float dimensionZ, Float peso);
}
