#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed May 13 23:10:43 2020

@Proyect: find the highest milk consumption per capitac
@author: Andrés Santiago Ducuara Velásquez
@Version: 1..0
"""


def FindMax(population , LitersOfMilk):
    indexMax=[]
    if len(population)==len(LitersOfMilk):
        Max = LitersOfMilk[0] / population[0]
        for i in range(1,len(population)):
            if Max<=(LitersOfMilk[i] / population[i]):
                Max = LitersOfMilk[i] / population[i]
        for i in range(len(population)):
            if Max==(LitersOfMilk[i] / population[i]):
                indexMax.append(i)
        return indexMax
    else :
        print("ErrorOfPoblations")

print([98,120,40,135,40],[4606,5167,1880,1351,1879])
print(FindMax([98,120,40,135,40],[4606,5167,1880,1351,1879]))
