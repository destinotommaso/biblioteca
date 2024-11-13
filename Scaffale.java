 

class Scaffale{
    private String id;
    private Libro[] libri;
    private int nLibri;
    private final int N = 10;
    
    Scaffale(String id){
        this.id = id;
        libri = new Libro[N];
        nLibri = 0;
    }
    
    public boolean aggiungi(Libro l){
        if (nLibri<N){
            libri[nLibri] = l;
            nLibri++;
            l.setCollocazione(this);
            return true;
        }
        return false;
    }
    
    public void elencaLibri(){
        System.out.println("Scaffale: " +  id);
        String s= new String();
        for(int i=0; i < nLibri; i++ ){
            s+= libri[i].toString()+"\n";
            }
            System.out.println(s);
        }
    
    public void elencaLibri(String autore){
        for(int i=0; i<nLibri; i++){
            if(libri[i].getAutore().equals(autore)){
                System.out.println(libri[i]);
            }
        }
    }
    
    public void elencaLibri(float da, float a){
        for(int i=0; i<nLibri; i++){
            if(libri[i].getPrezzo()<a && libri[i].getPrezzo()>da)
                System.out.println(libri[i]);
            }
    }
    public String toString(){
        return String.format("\nid scaffale: %s", id);
    }
}
