package server;


public class Operations {
    private int num1,num2;
    private int h_suma,h_resta,h_multiplica,h_division,h_exponente,h_raiz;

    public String suma (String num1,String num2){
        int num = Integer.parseInt(num1);
        int nume = Integer.parseInt(num2);
        int suma = num +nume;
        h_suma = h_suma+1;
        return "La suma de "+num1+" + " + num2 + " es: " +(suma);

    }
    public String resta (String num1, String num2){
        int num = Integer.parseInt(num1);
        int nume = Integer.parseInt(num2);
        int resta = num -nume;
        h_resta = h_resta+1;
        return "La resta de "+num1+" - "+num2+" es: " +(resta);
    }
    public String multiplica (String num1, String num2){
        int num = Integer.parseInt(num1);
        int nume = Integer.parseInt(num2);
        int multi = num *nume;
        h_multiplica = h_multiplica+1;
        return "La multiplicacion de "+num1+" * "+num2+" es: " +(multi);
    }
    public String division (String num1, String num2){
        int num = Integer.parseInt(num1);
        int nume = Integer.parseInt(num2);
        int division = num / nume;
        h_division = h_division+1;
        return "La division de "+num1+" / "+num2+" es: " +(division);
    }
    public String exponente (String num1, String num2){
        double num = Double.parseDouble(num1);
        double nume = Double.parseDouble(num2);
        double exponente = Math.pow(num,nume);
        h_exponente = h_exponente+1;
        return "El exponente de "+num1+" elevado a la "+num2+" es: " +(exponente);
    }
    public String raiz (String num1){
        double num = Double.parseDouble(num1);
        double raiz = Math.sqrt(num);
        h_raiz = h_raiz+1;
        return "La raiz de " +num + " es: " +(raiz);
    }


    public int consulta1(){
        return h_suma;
    }
    public int consulta2(){
       return h_resta;
    }
    public int consulta3(){
        return h_multiplica;
    }
    public int consulta4(){
        return h_division;
    }
    public int consulta5(){
        return h_exponente;
    }
    public int consulta6(){
        return h_raiz;
    }


}
