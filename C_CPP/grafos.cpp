#include <iostream> 
#include <cstring>

using std::cout;
using std::endl;

class Nodo{
	private:
		int vertices;
		Nodo siguiente;
	public:
		Nodo(int dato){
			vertice = dato;
		};
		int getVertice(){
			return vertice;
		}
		void setVertice(int vertice){
			vertices=vertice;
		}
		Nodo getSiguiente(){
			return siguiente;
		}
		void setSiguiente(Nodo nexts){
			siguiente=nexts;
		}
};

class Grafo{
	private:
		Nodo arr[5]=[new Nodo(1),new Nodo(2),new Nodo(3),new Nodo(4),new Nodo(5) ];
	public:
		Grafo(){
		};
		void agregar(int i, int dato){
			if(!arr[i].getSiguiente()){
				arr[i].setSiguiente() = dato;
			}else{
				while(arr[i].getSiguiente()->next != null){
					arr[i].setSiguiente()= arr[i].getSiguiente()->next;
				}
				arr[i].setSiguiente()=dato;
			}
		}
		void listar(){
			for(int i=0, i< 5,i++){
				if(!arr[i].getSiguiente()){
					cout << "NULL"<<endl;
				}else{
					while(arr[i].getSiguiente()){
						arr[i].getSiguiente()->listar();
						if(!arr[i].getSiguiente()->next){
							cout << "NULL";
							arr[i].setSiguiente()=arr[i].getSiguiente() ->next;
						}
					}
				}
				cout << endl << endl;
			}
		}
};

class app{
	Grafo a;
	int z=1;
	while(z==1){
		cin >> x;
		cin >> y;
		a.agregar(x,y);
		
		cin >>z;
	}

	a.listar();
};


