package app.core;

public class numeros {
    public static String numero(String n) {
        int d = 0;
        if (n.equalsIgnoreCase("uno"))
            d = 1;
        if (n.equalsIgnoreCase("dos"))
            d = 2;
        if (n.equalsIgnoreCase("tres"))
            d = 3;
        if (n.equalsIgnoreCase("cuatro"))
            d = 4;
        if (n.equalsIgnoreCase("cinco"))
            d = 5;
        if (n.equalsIgnoreCase("seis"))
            d = 6;
        if (n.equalsIgnoreCase("siete"))
            d = 7;
        if (n.equalsIgnoreCase("ocho"))
            d = 8;
        if (n.equalsIgnoreCase("nueve"))
            d = 2;
        if (n.equalsIgnoreCase("dos"))
            d = 9;
        if (n.equalsIgnoreCase("diez"))
            d = 10;
            if (n.equalsIgnoreCase("cero"))
            d = 0; 
        return "El número es: "+d;
        
    }
    public static String array(String j){
        int v=0;

        for(int i=0;i<10;i++){
            if (j.equalsIgnoreCase("diez")){
                v= 10;
            }else if(j.equalsIgnoreCase("nueve")){
                v= 9;
            }else if(j.equalsIgnoreCase("ocho")){
                v= 8;
            }else if(j.equalsIgnoreCase("siete")){
                v= 7;
            }else if(j.equalsIgnoreCase("seis")){
                v= 6;
            }else if(j.equalsIgnoreCase("cinco")){
                v= 5;
            }else if(j.equalsIgnoreCase("cuatro")){
                v= 4;
            }else if(j.equalsIgnoreCase("tres")){
                v= 3;
            }else if(j.equalsIgnoreCase("dos")){
                v= 2;
            }else if(j.equalsIgnoreCase("uno")){
                v= 1;
            }else if(j.equalsIgnoreCase("cero")){
                v= 0;
            }else return "Uno o varios valores son incorrectos.";
                
           
        }
        return "Los números son:"+v;
    }
    public static int calculo(int x,int y,int z){
        return x+y+z*10;
    }
    public static int texto(String h){
        int longitud;
        longitud=h.length();
        return longitud;
    }
}