public class Debugger{
    public static void main(String[] args){
        Arbol a = new Arbol();
        //System.out.println(a.empty());
        a.insertar(5);
        a.insertar(7);
        a.insertar(2);
        a.insertar(3);
        a.insertar(6);
        a.informarCreciente();
    }
}
