import numpy as np

x=np.zeros((5,5))

x[0][1]=1
x[0][2]=1
x[2][3]=1
x[3][0]=1
x[3][2]=1
x[4][1]=1
x[4][2]=1
x[4][4]=1

print(x)
print(x.reshape(1,25))
