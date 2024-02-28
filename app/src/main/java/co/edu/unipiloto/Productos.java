package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;

public class Productos {

    List<String> getBrand(String spinner){
        List<String> brands = new ArrayList<String>();
        if(spinner.equals("Productos Liquidos")){
            brands.add("Agua");
            brands.add("Gasolina");
            brands.add("Petroleo");
            brands.add("Zumos");
            brands.add("Aceites");
        } if(spinner.equals("Productos Agricolas")){
            brands.add("Maiz-Granel");
            brands.add("Maiz-Bulto ");
            brands.add("Cafe-Granel");
            brands.add("Cafe-Bulto");
            brands.add("Tomate-Granel");
            brands.add("Tomate-Bulto");
        } if(spinner.equals("Productos Solidos")){
            brands.add("Piedra");
            brands.add("Madera");
            brands.add("Carbon");
            brands.add("Acero");
            brands.add("Tierra");
        } if(spinner.equals("Otros")){
            brands.add("Categoria no Encontrada");
            brands.add("----");
        }
        return brands;

    }

}
