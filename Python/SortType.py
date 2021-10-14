#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed May 13 09:54:07 2020
@Proyect: Sort Type
@author: Andres Santiago Ducuara Velásquez
@Version: 1.0.1
"""

def Bubble(OrdList):
    for j in range(len(OrdList)-1,0,-1):
        for i in range(j):
            if OrdList[i]>OrdList[i+1]:
                temp = OrdList[i]
                OrdList[i]=OrdList[i+1]
                OrdList[i+1] = temp
    return OrdList
       
def insertion(ordList):
   for i in range(1,len(ordList)):

     value = ordList[i]
     pos = i

     while pos>0 and ordList[pos-1]>value:
         ordList[pos]=ordList[pos-1]
         pos = pos-1

     ordList[pos]=value
   return ordList

def selection(otherList):
    for i in range(len(otherList)-1,0,-1):
        posM=0
        for j in range(1,i):
            if otherList[j]>otherList[posM]:
                posM = j
        temp = otherList[i]
        otherList[i]=otherList[posM]
        otherList[posM]= temp
    return otherList
    
def quickSort(onemorelist):
    left =[]
    center=[]
    right= []
    if len(onemorelist)>1:
        pivot = onemorelist[0]
        for i in onemorelist:
            if i<pivot:
                left.append(i)
            elif i == pivot:
                center.append(i)
            elif i>pivot:
                right.append(i)
        return quickSort(left)+center+quickSort(right)
    else:
        return onemorelist
    
def ordShell(onemoreonelist):
    countSubList=len(onemoreonelist)//2
    while countSubList >0:
        for i in range(countSubList):
            brechin(onemoreonelist,i,countSubList)
        countSubList = countSubList//2
    return onemoreonelist
        
def brechin(lista,inicio,mitad):
    for i in range(inicio+mitad,len(lista),mitad):
        value = lista[i]
        pos = i
        while pos>=mitad and lista[pos-mitad]>value:
            lista[pos]=lista[pos-mitad]
            pos = pos - mitad
        lista[pos]=value
        
def mound(nomorelistpls):
    n = len(nomorelistpls)
    for i in range((int)(n/2-1),0,-1):
        moundsort(nomorelistpls, n, i)
        
    for i in range (n-1,0,-1):
        temp = nomorelistpls[0]
        nomorelistpls[0]=nomorelistpls[i]
        nomorelistpls[i]=temp
        moundsort(nomorelistpls, i ,0)
    return nomorelistpls
        
def moundsort(arr, n, i):
    maxi = i
    l = 2*i +1
    r = 2*i +2
    
    if l<n and arr[l]>arr[maxi]:
        maxi = l
    elif r<n and arr[r]>arr[maxi]:
        maxi = r
    elif maxi != i:
        aux = arr[i]
        arr[i]=arr[maxi]
        arr[i]=aux
        moundsort(arr,n,i)
    
print("Bubble ",Bubble([36,24,10,6,12]))
print("insertion ",insertion([54,26,93,17,77,31,44,55,20]))
print("selection ", selection([4,8,5,1,7]))
print("quickSort ",quickSort([6,7,4,5,8,3]))
print("Shell", ordShell([54,26,93,17,77,31,44,55,20]))
print("mound ",mound([13, 8, 6, 3, 5, 9,14,10]))