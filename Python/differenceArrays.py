#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon May 18 09:29:45 2020

@proyect: difference of an arrays
@author: Andres Santiago Ducuara Velasquez
@Version: 0.1
"""
        
def iterative(vector,n):
    if n<= len(vector) -1:
        for i in range (n):
            for i in range(len(vector)-1):
                vector[i] = vector[i+1]-vector[i]
            vector.pop()
        return vector
    else:
        print("OrdenError")

def recursion(vector, n , start,end):
    if start == end:
        return vector[start-1]-vector[start]
    else:
        recursion(vector,n,start+1,end)
        vector[start] = vector[start]-vector[start-1]
        return vector

print(iterative([5,6,3,9,-1],1))
print(recursion([5,6,3,9,-1],1,0,4)[1:len([5,6,3,9,-1])])