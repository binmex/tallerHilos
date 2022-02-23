package persistencia;

import java.util.ArrayList;

public class DaoTurnos {
    private String RUTA = "Recursos/Factura.txt";

    /**
     * metodo para agregar datos al archivo plano
     * @param f	objeto de tipo Factura requerido para añadir los datos
     */
    /*public void guardarfactura(Factura f) {

        new ArchivoCy().AgregarContenido(RUTA, f.getNitClente() + "," + f.getDescripcion() + "," + f.getValor());

    }*/

    /**
     * metodo que retorna un listado con los datos del archivo plano
     * @return retorna un Arraylist  cargado con los datos del archivo plano
     */
    /*public ArrayList<Factura> mostrarFacturas() {
        ArrayList<String> datos = new ArchivoCy().ContenidoArchivo(RUTA);

        ArrayList<Factura> listadoFacturas = new ArrayList<Factura>();

        for (int i = 0; i < datos.size(); i++) {
            Factura f = new Factura();

            // Separo cada linea de datos en atributos
            String Linea[] = datos.get(i).split(",");

            f.setNitClente(Linea[0]);
            f.setDescripcion(Linea[1]);
            f.setValor(Integer.parseInt(Linea[2].replace(";", "")));


            listadoFacturas.add(f);

        }*/

        //return listadoFacturas;

    //}
}
