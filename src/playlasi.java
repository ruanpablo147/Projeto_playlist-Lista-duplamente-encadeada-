public class playlasi<T> {
    private noduplo<T> inicio;
    private noduplo<T> fim;

    public playlasi(){}

    public  playlasi(noduplo<T> inicio, noduplo<T> fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    public noduplo<T> getInicio() {
        return inicio;
    }

    public void setInicio(noduplo<T> inicio) {
        this.inicio = inicio;
    }

    public noduplo<T> getFim() {
        return fim;
    }

    public void setFim(noduplo<T> fim) {
        this.fim = fim;
    }
    public void exibir() throws Exception{
        System.out.println("LISTA -> ");
        noduplo<T> aux = inicio;
        while(aux != null){
            System.out.println(aux.dado + " -> ");
            aux = aux.proximo;
        }
        System.out.println("NULL\n");
    }
    public int tamanholista()throws Exception{
        noduplo<T> aux = inicio;
        int tamanho = 0;
        while(aux != null){
            tamanho ++;
            aux = aux.proximo;
        }
        return tamanho;
    }
    public void adicionar(T s)throws Exception{
        noduplo<T> novoelemento = new noduplo(s);
        noduplo<T> aux = inicio;
        if(inicio == null){
            novoelemento.proximo = null;
            novoelemento.anterior = null;
            inicio = novoelemento;
            fim = novoelemento;
        }else{
            while(aux.proximo != null){
                if (aux.dado.equals(s)) {
                    throw new Exception("Música repetida");
                }
                aux = aux.proximo;
            }
            novoelemento.proximo = null;
            aux.proximo = novoelemento;
            novoelemento.anterior = aux;
            fim = novoelemento;
        }
    }
    public T removemusica(int i) throws Exception{
        noduplo<T> aux = inicio;
        noduplo<T> lixo = null;

        if(i < 0 || i > tamanholista())
            throw new Exception("indice invalido na lista");
        if(tamanholista() == 0)
                throw new Exception("A lista esta vazia");

        if(i == 0){
            lixo = aux;
            aux = aux.proximo;
            inicio = aux;
        } else {
            int contador = 0;
            while(contador < i){
                aux = aux.proximo;
                contador ++;
            }
            lixo = aux;
            if (aux.anterior != null) {
                aux.anterior.proximo = aux.proximo;
            }
            if (aux.proximo != null) {
                aux.proximo.anterior = aux.anterior;
            }
            if (aux == inicio) {
                inicio = aux.proximo;
            }
            if (aux == fim) {
                fim = aux.anterior;
            }

        }

        return  lixo.dado;
    }

    public T anterior(int posicao) throws Exception {
        if (tamanholista() == 0)
            throw new Exception("A lista está vazia");
        if (posicao <= 0 || posicao > tamanholista())
            throw new Exception("Posição inválida");

        noduplo<T> aux = inicio;
        int contador = 0;


        while (aux != null) {
            if (contador == posicao) {
                if (aux == inicio) {
                    throw new Exception("A primeira música da lista não tem antecessor");
                } else {
                    return aux.anterior.dado;
                }
            }
            aux = aux.proximo;
            contador++;
        }

        throw new Exception("Posição não encontrada");
    }

    public T proximo(int posicao) throws Exception {
        if (tamanholista() == 0)
            throw new Exception("A lista está vazia");
        if (posicao <= 0 || posicao > tamanholista())
            throw new Exception("Posição inválida");

        noduplo<T> aux = inicio;
        int contador = 0;


        while (aux != null) {
            if (contador == posicao) {
                if (aux == fim) {
                    throw new Exception("Esta é a ultima musica da lista");
                } else {
                    return aux.proximo.dado;
                }
            }
            aux = aux.proximo;
            contador++;
        }

        throw new Exception("Posição não encontrada");
    }

    public T buscarmusica(int i) throws Exception {
        if (i < 0 || i >= tamanholista())
            throw new Exception("Índice inválido na lista");

        noduplo<T> aux = inicio;
        int contador = 0;

        while (aux != null) {
            if (contador == i) {
                return aux.dado;
            }
            aux = aux.proximo;
            contador++;
        }

        throw new Exception("Música não encontrada");
    }







}
