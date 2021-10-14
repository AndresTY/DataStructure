import pandas as pd
import numpy as np
import networkx as nx
import matplotlib.pyplot as plt

df = pd.read_csv('puntos.csv',index_col=None)
grafo=nx.from_pandas_edgelist(df,source='origen',target='destino',edge_attr='peso')
grafomap=nx.dijkstra_path(grafo, source='a',target='j',weight=True)
print(grafomap)
nx.draw(grafo,with_labels=True)
plt.show()
nx.draw(grafo.subgraph(grafomap),with_labels=True)
plt.show()
