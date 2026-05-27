package arvores;


public class ArvoreAVL {

    private Node raiz;

    public ArvoreAVL() {
        raiz = null;
    }

    public Node getRaiz() {
        return raiz;
    }

    public void add(int elemento) {
        Node novo = new Node(elemento);
        add(raiz, novo);
    }
    
    public Node busca(int elemento) {
        Node p = raiz;
        while (p != null) {
            if (p.elemento == elemento) {
                System.out.println("Elemento encontrado");
                return p;
            } else if (p.elemento < elemento) {
                p = p.direita;
            } else {
                p = p.esquerda;
            }
        }
        System.out.println("Elemento não encontrado");
        return null; 
    }

    

    private void add(Node node, Node novo) {
        if (node == null) {
            System.out.println("Inserindo " + novo.elemento + " na raiz");
            raiz = novo;
        } else {
            if (novo.elemento < node.elemento) {
                if (node.esquerda != null) {
                    add(node.esquerda, novo);
                } else {
                    System.out.println("Inserindo " + novo.elemento + " a esquerda de " + node.elemento);
                    node.esquerda = novo;
                    novo.pai = node;
                    verificarBalanceamento(node);
                }
            } else if (novo.elemento > node.elemento) {
                if (node.direita != null) {
                    add(node.direita, novo);
                } else {
                    System.out.println("Inserindo " + novo.elemento + " a direita de " + node.elemento);
                    node.direita = novo;
                    novo.pai = node;
                    verificarBalanceamento(node);
                }
            } else {
                System.out.println("Já existe o elemento na árvore");
            }
        }
    }


    private void verificarBalanceamento(Node atual) {
        setBalanceamento(atual);
        int balanceamento = atual.fatorBalanceamento;
        if (balanceamento == -2) {
            if (altura(atual.esquerda.esquerda) >= altura(atual.esquerda.direita)) {
                atual = rotacaoDireita(atual);
            } else {
                atual = duplaRotacaoEsquerdaDireita(atual);
            }
        } else if (balanceamento == 2) {
            if (altura(atual.direita.direita) >= altura(atual.direita.esquerda)) {
                atual = rotacaoEsquerda(atual);
            } else {
                atual = duplaRotacaoDireitaEsquerda(atual);
            }
        }

        if (atual.pai != null) {
            verificarBalanceamento(atual.pai);
        } else {
            this.raiz = atual;
        }
    }

    private void setBalanceamento(Node node) {
        node.fatorBalanceamento = altura(node.direita) - altura(node.esquerda);
    }

    private int altura(Node atual) {
        if (atual == null) {
            return -1;
        }
        if (atual.esquerda == null && atual.direita == null) {
            return 0;
        } else if (atual.esquerda == null) {
            return 1 + altura(atual.direita);

        } else if (atual.direita == null) {
            return 1 + altura(atual.esquerda);

        } else {
            return 1 + Math.max(altura(atual.esquerda), altura(atual.direita));
        }
    }

    private Node rotacaoEsquerda(Node inicial) {

        Node direita = inicial.direita;
        direita.pai = inicial.pai;

        inicial.direita = direita.esquerda;

        if (inicial.direita != null) {
            inicial.direita.pai = inicial;
        }

        direita.esquerda = inicial;
        inicial.pai = direita;

        if (direita.pai != null) {

            if (direita.pai.direita == inicial) {
                direita.pai.direita = direita;

            } else if (direita.pai.esquerda == inicial) {
                direita.pai.esquerda = direita;
            }
        }

        setBalanceamento(inicial);
        setBalanceamento(direita);

        return direita;
    }

    private Node rotacaoDireita(Node inicial) {

        Node esquerda = inicial.esquerda;
        esquerda.pai = inicial.pai;

        inicial.esquerda = esquerda.direita;

        if (inicial.esquerda != null) {
            inicial.esquerda.pai = inicial;
        }

        esquerda.direita = inicial;
        inicial.pai = esquerda;

        if (esquerda.pai != null) {

            if (esquerda.pai.direita == inicial) {
                esquerda.pai.direita = esquerda;

            } else if (esquerda.pai.esquerda == inicial) {
                esquerda.pai.esquerda = esquerda;
            }
        }

        setBalanceamento(inicial);
        setBalanceamento(esquerda);

        return esquerda;
    }

    private Node duplaRotacaoEsquerdaDireita(Node inicial) {
        inicial.esquerda = rotacaoEsquerda(inicial.esquerda);
        return rotacaoDireita(inicial);
    }

    private Node duplaRotacaoDireitaEsquerda(Node inicial) {
        inicial.direita = rotacaoDireita(inicial.direita);
        return rotacaoEsquerda(inicial);
    }

    public void remove(int elemento) {
        remove(raiz, elemento);
    }

    private void remove(Node atual, int elemento) {
        if (atual != null) {
            if (atual.elemento > elemento) {
                remove(atual.esquerda, elemento);

            } else if (atual.elemento < elemento) {
                remove(atual.direita, elemento);

            } else if (atual.elemento == elemento) {
                removerNoEncontrado(atual);
            }
        }
    }

    private void removerNoEncontrado(Node remover) {
        Node r;
        if (remover.esquerda == null || remover.direita == null) {
            if (remover.pai == null) {
                this.raiz = null;
                remover = null;
                return;
            }
            r = remover;

        } else {
            r = sucessor(remover);
            remover.elemento = r.elemento;
        }

        Node p;
        if (r.esquerda != null) {
            p = r.esquerda;
        } else {
            p = r.direita;
        }

        if (p != null) {
            p.pai = r.pai;
        }

        if (r.pai == null) {
            this.raiz = p;
        } else {
            if (r == r.pai.esquerda) {
                r.pai.esquerda = p;
            } else {
                r.pai.direita = p;
            }
            verificarBalanceamento(r.pai);
        }
        r = null;
    }

    private Node sucessor(Node q) {
        if (q.direita != null) {
            Node r = q.direita;
            while (r.esquerda != null) {
                r = r.esquerda;
            }
            return r;
        } else {
            Node p = q.pai;
            while (p != null && q == p.direita) {
                q = p;
                p = q.pai;
            }
            return p;
        }
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    private void preOrdem(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.elemento + " ");
            preOrdem(raiz.esquerda);
            preOrdem(raiz.direita);
        }
    }

    public void inOrdem() {
        inOrdem(raiz);
    }

    private void inOrdem(Node raiz) {
        if (raiz != null) {
            inOrdem(raiz.esquerda);
            System.out.print(raiz.elemento + " ");
            inOrdem(raiz.direita);
        }
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    private void posOrdem(Node raiz) {
        if (raiz != null) {
            posOrdem(raiz.esquerda);
            posOrdem(raiz.direita);
            System.out.print(raiz.elemento + " ");
        }
    }
}