#include <stdio.h>
#include <cstdlib>

struct nodo
{
  int v;
  int p;
  nodo *sig;
};

int V=5,A=12;  // vértices y aristas del grafo
struct nodo *a[5], *z;

void inicializar()
{
  int i,x,y,peso;
  char v1,v2;
  struct nodo *t;
  z=(struct nodo *)malloc(sizeof(struct nodo));
  z->sig=z;
  for (i=0; i<V; i++)
    a[i]=z;
  for (i=0; i<A; i++)
  {
    scanf("%c %c %d\n",&v1,&v2,&peso);
    x=v1-'A'; y=v2-'A';

    t=(struct nodo *)malloc(sizeof(struct nodo));
    t->v=y; t->p=peso; t->sig=a[x]; a[x]=t;

    t=(struct nodo *)malloc(sizeof(struct nodo));
    t->v=x; t->p=peso; t->sig=a[y]; a[y]=t;
  }
}

int main(){
	inicializar();

	return 0;
}
