import Transportes.Barco;
import Transportes.Bicicleta;
import Transportes.Camion;
import Transportes.ITransporte;
import com.cristian.datos.PedirDatos;

public class Factory {
        public static final int CAMION = 1;
        public static final int BICICLETA = 2;
        public static final int BARCO = 3;
        public static Integer cp = null;
        public static Float dimensionX = null;
        public static Float dimensionY = null;
        public static Float dimensionZ = null;
        public static Float peso = null;

        /**
         * Devuelve producto del tipo de la Interface
         *
         * @param type 1: consola, 2:ventana
         * @return producto segun el tipo
         */
        public static ITransporte getProducto(int type) {
            cp = PedirDatos.pedirInt("Teclee tu CP");
            dimensionX = PedirDatos.pedirFloat("Teclee a dimensionX");
            dimensionY = PedirDatos.pedirFloat("Teclee a dimensionY");
            dimensionZ = PedirDatos.pedirFloat("Teclee a dimensionZ");
            peso = PedirDatos.pedirFloat("Teclee o peso");
            switch (type) {
                // tipo consola
                case CAMION:
                    return new Camion(cp, dimensionX, dimensionY, dimensionZ, peso);
                // tipo ventana
                case BICICLETA:
                    return new Bicicleta(cp, dimensionX, dimensionY, dimensionZ, peso);
                case BARCO:
                    return new Barco(cp, dimensionX, dimensionY, dimensionZ, peso);
                // otro tipo
                default:
                    return null;
            }
        }
    }

