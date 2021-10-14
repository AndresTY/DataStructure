#include<stdio.h> 
#define V 6
#define INF 99999 
void printSolution(int dist[][V]); 
void floydWarshall (int graph[][V]) 
{ 
	int dist[V][V], i, j, k; 

	for (i = 0; i < V; i++) 
		for (j = 0; j < V; j++) 
			dist[i][j] = graph[i][j]; 

	for (k = 0; k < V; k++) 
	{ 
		for (i = 0; i < V; i++) 
		{ 
			for (j = 0; j < V; j++) 
			{ 
				if (dist[i][k] + dist[k][j] < dist[i][j]) 
					dist[i][j] = dist[i][k] + dist[k][j]; 
			} 
		} 
	} 

	printSolution(dist); 
} 

void printSolution(int dist[][V]) 
{ 
	for (int i = 0; i < V; i++) 
	{ 
		for (int j = 0; j < V; j++) 
		{ 
			if (dist[i][j] == INF) 
				printf("%7s", "INF"); 
			else
				printf ("%7d", dist[i][j]); 
		} 
		printf("\n"); 
	} 
} 

int main() 
{ 
	int graph[V][V] = { {0, 700, 200, INF,INF,INF}, 
						{700, 0, 300, 200,INF,400}, 
						{200, 300, 0, 700,600,INF}, 
						{INF, 200, 700,0,300,100},
						{INF,INF,600,300,0,500},
						{INF,400,INF,100,500,0}
					}; 
	floydWarshall(graph); 
	return 0; 
} 

