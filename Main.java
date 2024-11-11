 

class Main{
    public static void main(String args[]){
        //Istanziare uno scaffale
        Scaffale s1 = new Scaffale("5");
        
        //Istanziare due oggetti di classe Libro e aggiungerli allo scaffale
        Libro l1 = new Libro("L'amico immaginario","M.Dicks", 17.05f, 168, "Giunti");
        Libro l2 = new Libro("Guerra e pace","L.Toltsoj", 20.10f, 246, "Feltrinelli");
        Libro l3 = new Libro("Il ritratto di Dorian Gray","O.Wilde", 40.33f, 342, "Mondadori");
        Libro l4 = new Libro("La morte non esiste","S.Allix", 46.77f, 213, "Giunti");
        Libro l5 = new Libro("L'altra verità","A.Merini", 18.78f, 222, "Giunti");
        s1.aggiungi(l1);
        s1.aggiungi(l2);
        s1.aggiungi(l3);
        s1.aggiungi(l4);
        s1.aggiungi(l5);
        //Visualizzare il contenuto dello scaffale
        s1.elencaLibri();
        
        s1.elencaLibri("M.Dicks");
        
        s1.elencaLibri(17.05f,46.77f);
    }
}
