public class Arbol{
    class Nodo{
        private Arbol izq, der;
        private Object dato;
        
        public Nodo(){
            this.izq = null;
            this.der = null;
            this.dato = 0; //null
        }
        
        public void setDato(Object dato){
            this.dato = dato;
        }
        
        public void setRamas(){
            this.izq = new Arbol();
            this.der = new Arbol();
        }
        
        public Object getDato(){
            return this.dato;
        }
        
        public Arbol getIzq(){
            return this.izq;
        }
        
        public Arbol getDer(){
            return this.der;
        }
    }
    
    private Nodo raiz;
    
    public Arbol(){
        this.raiz = new Nodo();
    }
    
    public boolean empty(){
        if ((int) this.raiz.getDato() == 0)//(this.raiz == null)
            return true;
        else
            return false;
    }
    
    public void insertar(Object dato){
        if (this.empty() == true){
            this.raiz.setDato(dato);
            this.raiz.setRamas();
        }
        else{
            if ((int) dato < (int) raiz.getDato()){
                Arbol nIzq = this.raiz.getIzq();
                nIzq.insertar(dato);
            }
            else{
                if ((int) dato > (int) raiz.getDato()){
                    Arbol nDer = this.raiz.getDer();
                    nDer.insertar(dato);
                }
            }
        }
    }
    
    public void informarCreciente(){
        if (this.empty() == false){
            this.raiz.getIzq().informarCreciente();
            System.out.print((int) this.raiz.getDato() + ", ");
            this.raiz.getDer().informarCreciente();
        }
    }
    
}